package alex07Hashmap;

public class CustomHashMap {
    private class Container{
        String key;
        String value;
        Container next;
    }

    private Container[] hashtable = new Container[5];
    private int arraySize =5;
    private int totalItems=0;

    public int getSize(){
        return arraySize;
    }

    public int getTotalItems(){
        return totalItems;
    }

    public void growSize(){

        int newSize = arraySize + 1;
        while(!isPrime(newSize)){
            newSize++;
        }
        arraySize = newSize;
    }

    // Helper Class
    private boolean isPrime(int input){
        if (input <=1) {
            return false;
        }
        else{
            for (int i = 2; i <= Math.sqrt(input); i++) {
                if(input % i ==0) return false;
            }
            return true;}
    }

}
