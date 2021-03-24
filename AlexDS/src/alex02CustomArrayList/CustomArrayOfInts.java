package alex02CustomArrayList;

public class CustomArrayOfInts
{
    // Define constant and variables
    final int defaultInt = -2147483648;
    private int[] data = new int[1];
    private int size=0;

    // Define constructors (Overloading)
    public CustomArrayOfInts(){
        size=0;
        data[0] = defaultInt;
    }
    public CustomArrayOfInts(int input){
        size=1;
        data=new int[2];
        data[0]=input;
        data[1]=defaultInt;
    }
    public CustomArrayOfInts(int[] inputArray){
        size = inputArray.length;
        data = new int[(int)Math.pow(2,size)];
        for(int i=0;i<data.length;i++){
            data[i]=i<inputArray.length? inputArray[i]:defaultInt;
        }
    }

    // Define getter
    public int[] getData(){
        return data;
    }

    // Define setter
    // Caution: Defined Leading elements by Initialization or Add
    // .........V.S. Undefined Trailing elements with defaultInt value
    public void setData(int[] inData){
        data = inData;
    }

    // Add (basic)
    public void add(int value){
        int[] temp = new int[data.length*2];
        for(int i=0;i<data.length;i++){
            temp[i]=data[i];
            temp[data.length+i]=defaultInt;
        }
        data = temp;
        for(int j=0;j<data.length;j++){
            if (data[j]==defaultInt){
                data[j]=value;
                size=size();
                break;
            }
        }
    }

    // Add (Overloading)
    public void add(int[] valueArray){
        for(int i=0;i<valueArray.length;i++){
            add(valueArray[i]);
        }
    }

    // Delete by value
    public boolean deleteByValue(int value){
        if (value == defaultInt){
            try {
                throw new IllegalArgumentException();
            }
            catch(Exception exc){
                System.out.println("Index entered is out of boundary!");
            }
        }
        for(int i=0;i<size;i++){
            if(data[i]==value){
                for(int j=i;j<size;j++) {
                    data[j]=data[j+1];
                }
                    size=size();
                    return true;
            }
        }
        return false;
    }


    // Delete by index
    public void deleteByIndex(int index){
        if (index<0 || index>=size()){
            try {
                throw new IllegalArgumentException();
            }
            catch(Exception exc){
                System.out.println("Index entered is out of boundary!");
            }
        }
        int sizeTemp = size();
        for(int i=index;i<sizeTemp;i++){
            data[i]=data[i+1];
        }
        size=size();
    }

    // Insert Value At Index
    public void insertValueAtIndex(int value, int index){
        try {
            int temp1,temp2;
            int[] temp = new int[data.length * 2];
            for (int i=0; i<temp.length; i++) {
                if(i<index)temp[i]=data[i];
                else if(i==index){
                    temp[i]=value;
                }
                else if(i<=size){
                    temp[i]=data[i-1];
                }
                else {
                    temp[i]=defaultInt;
                }

                }
                data = temp;
                size = size();
            }

        catch(IndexOutOfBoundsException exc){
            System.out.println("Index Out Of Boundary!");
        }
    }

    //
    public void clear(){
        data = new int[1];
        data[0]=defaultInt;
        size = size();
    }

    //
    public int get(int index) throws Exception {
        try {
            return data[index];
        }
        catch(IndexOutOfBoundsException exc){
            System.out.println(exc.getMessage());
        }
        return defaultInt;
    }

    //
    public int[] getSlice(int startIdx, int length){
        try{
            int[] temp = new int[length];
            for(int i=startIdx; i<startIdx+length;i++){
                temp[i-startIdx]=data[i];
            }
            return temp;
        }
        catch(IndexOutOfBoundsException exc){
            System.out.println("Index Out of Boundary");
        }
        return null;
    }

    public int size() {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == defaultInt) {return i;}
        }
        return data.length;
    }

    // ToString method override
    @Override
    public String toString(){
        String out = "[";
        for(int i=0;i<size();i++){
            out += (data[i]+ (i==size()-1?"]":", "));
        }
        return out;
    }
}



