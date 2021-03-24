package alex05Quiz1.alex05Quiz1P3;

public class CustomArray {
    private int [] data = new int[1]; // only grows by doubling size, never shrinks
    private int items = 0; // how many elements do you have.

    public int size(){
        return items;
    }

    public boolean addAll(int[] c){
        try{
            for(int i=0;i<c.length;i++){
                add(c[i]);
            }

            return true;
        }
        catch(Exception exc){
            return false;
        }
    }

    public void add(int value){
        //for growing the size of array => array is full
        if (items == data.length){
            growStorage();
        }
        data[items] = value; //basic rule => we put the elements in the first index of array
        items++;
    }

    private void growStorage(){
        int[] newData = new int[data.length * 2];
        for (int i = 0; i< data.length ; i++){
            newData[i] = data[i];
        }
        data = newData; // put the reference to the new array
    }

    public void deleteByIndex(int index){
        if (index >=items || index < 0){
            throw new IndexOutOfBoundsException();
        }

        //shifting the data from right to left
        for (int i= index + 1; i< items ; i++){
            data[i - 1] = data[i];
        }
        items --;

        //you can do the shrink if you like (OPTIONAL)
        if ((double) items / data.length * 100 < 25){
            shrinkStorage();
        }
    }

    public void clear(){
        items = 0;
    }

    private void shrinkStorage(){
        int[] newData = new int[data.length / 2];
        for(int i=0; i< items; i++){
            newData[i] = data[i];
        }
        data = newData;
    }

    public boolean deleteByValue(int value){
        for (int i=0; i< items; i++){
            if (data[i] == value){
                deleteByIndex(i);
                return true;
            }
        }
        return false;
    }

    public void insertValueAtIndex(int index, int value) {
        if (items == data.length) {
            growStorage();
        }
        if (index > items || index < 0) {
            throw new IndexOutOfBoundsException();
        }

        //shift for inserting a new element in the middle
        // 2 3 5 6 7 8 => insert 11 into 3
        for (int i= items -1; i>= index ; i--){ //loop in reverse
            data[i+1] = data[i];
        }

        data[index] = value;
        items++;
    }

    public int get(int index){
        if (index>= items || index < 0 ){
            throw new IndexOutOfBoundsException();
        }
        return data[index]; // O(1)
    }

    public int[] slice(int startIdx, int length){
        if (startIdx < 0 || length < 0 || startIdx + length > items){
            throw new IndexOutOfBoundsException();
        }
        int[] slice = new int[length];
        for (int i= 0 ; i< length; i++){
            slice[i] = data[i + startIdx];
        }
        return slice;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for(int i=0; i< items ; i++){
            builder.append(i==0 ? "": ", ");
            builder.append(data[i]);
        }
        builder.append("]");
        return builder.toString();
    }
}
