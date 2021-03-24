package alex02CustomArrayList;

import org.junit.Assert;

public class Alex02FakeArrayListLab {
    static final int defaultInt = -2147483648;

    public static void main(String[] args) throws Exception {
        TestConstructor();
        TestAdd();
        TestDeleteByIndex();
        TestDeleteByValue();


        // quick test:  get(index), InsertValueAtIndex, clear, getSlice
        int[] initialArrayY = new int[]{9000,9001,9002,9003,9004,9005,9006};
        CustomArrayOfInts al1 = new CustomArrayOfInts(initialArrayY);
        int x = al1.get(0);
        System.out.println(x);
        al1.insertValueAtIndex(8888,2);
        System.out.println(al1.toString());
        for(int temp : al1.getSlice(3,3)){
            System.out.print(temp + ">>>>");
        }
        al1.clear();
        System.out.println("\n"+al1.size() + " ---" + al1.getData().length);




    }



    public static void TestDeleteByValue(){
        int[] initialArrayV = new int[]{90,91,92,93,94,88,95,96};
        int indexRandomV =(int)(Math.random()*initialArrayV.length);
        int intRandom = initialArrayV[indexRandomV];
        try {
            CustomArrayOfInts al = new CustomArrayOfInts(initialArrayV);
            al.deleteByValue(intRandom);
            for(int i=0;i<al.getData().length;i++){
                if(i<indexRandomV){Assert.assertEquals(initialArrayV[i],al.getData()[i]);}
                else if(i<initialArrayV.length-1){
                    Assert.assertEquals(initialArrayV[i+1],al.getData()[i]);
                }
                else
                {
                    Assert.assertEquals(defaultInt,al.getData()[i]);
                }
            }
            System.out.println("Testing Delete by Value >>>>> Succeeded!");
        }
        catch(AssertionError exc){
            System.out.println("Testing Delete by Value >>>>> Failed!");
            System.out.println(exc.getMessage());
        }
    }


    public static void TestDeleteByIndex(){
        int[] initialArray = new int[]{90,91,92,93,94,88,95,96};
        int indexRandom = (int)(Math.random()*initialArray.length);
        try {
            CustomArrayOfInts al = new CustomArrayOfInts(initialArray);
            al.deleteByIndex(indexRandom);
            int tempSize = al.getData().length;
            int tempSizeValid = al.size();
            Assert.assertEquals(initialArray.length-1,al.size());
            for(int i=0;i<tempSize;i++){
                if(i<indexRandom){
                    Assert.assertEquals(initialArray[i],al.getData()[i]);
                }
                else if(i<tempSizeValid){
                    Assert.assertEquals(initialArray[i+1],al.getData()[i]);
                }
                else{
                    Assert.assertEquals(defaultInt,al.getData()[i]);
                }
            }

            System.out.println("Testing Delete By Index >>>>> Succeeded!");
            System.out.println(al.toString());
        }
        catch(AssertionError exc){
            System.out.println("Testing Delete By Index > Failed!");
            System.out.println(exc.getMessage());
        }
    }


    public static void TestAdd(){
        // Initialize with an int[], Add an int[] and then add an int
        int[] initialArr = new int[]{6201,6202,6203,6024};
        int[] addArr = new int[]{5000,5001,5002,5003};
        int addInt = 3001;

        try{
            CustomArrayOfInts arr = new CustomArrayOfInts(initialArr);
            arr.add(addArr);
            arr.add(addInt);
            int sizeExpected = (int)Math.pow(2,(initialArr.length+addArr.length+1));
            Assert.assertEquals(sizeExpected,arr.getData().length);
            for(int i=0;i<arr.getData().length;i++){
                if(i<initialArr.length){Assert.assertEquals(initialArr[i],arr.getData()[i]);}
                else if (i<initialArr.length+addArr.length){Assert.assertEquals(addArr[i-initialArr.length],arr.getData()[i]);}
                else if (i==initialArr.length+addArr.length){
                    Assert.assertEquals(addInt,arr.getData()[i]);
                    }
                else {
                    Assert.assertEquals(defaultInt,arr.getData()[i]);
                }
            }
            System.out.println("Testing Add method   >>>>>>>> Succeeded!");
        }
        catch(AssertionError exc){
            System.out.println("Testing Add(Overloading)   >>>>>>>> Failed!");
            System.out.println(exc.getMessage());
        }
    }


    public static void TestConstructor(){
        // Testing Constructor (without initializer)
        int sizeExpectedEmpty = 1;
        try {
            CustomArrayOfInts al = new CustomArrayOfInts();
            Assert.assertEquals(sizeExpectedEmpty,al.getData().length);
            Assert.assertEquals(defaultInt,al.getData()[0]);
        }
        catch(AssertionError exc){
            System.out.println("Testing Constructor (No initializer) >>>>>>>>>>>> Failed!");
            System.out.println(exc.getMessage());
        }

        // Test constructor(with int value initializer)
        int sizeExpectedInt = 2;
        int initialData = 8001;
        try {
            CustomArrayOfInts al = new CustomArrayOfInts(initialData);
            Assert.assertEquals(sizeExpectedInt,al.getData().length);
            Assert.assertEquals(initialData,al.getData()[0]);
            Assert.assertEquals(defaultInt,al.getData()[1]);
        }
        catch(AssertionError exc){
            System.out.println("Testing Constructor (Int as Initializer) >>>>>>>> Failed!");
            System.out.println(exc.getMessage());
        }

        // Test constructor(int[] arrInt)
        int[] initialArray = new int[]{9000,9001,9002,9003};
        int sizeExpectedArr = (int)Math.pow(2,initialArray.length);
        try {
            CustomArrayOfInts al = new CustomArrayOfInts(initialArray);
            Assert.assertEquals(sizeExpectedArr,al.getData().length);
            for(int i=0;i<sizeExpectedArr;i++) {
                if(i<initialArray.length){Assert.assertEquals(initialArray[i], al.getData()[i]);}
                else {
                    Assert.assertEquals(defaultInt, al.getData()[i]);}
            }
        }
        catch(AssertionError exc){
            System.out.println("Testing Constructor (IntArray[] as Initializer) > Failed!");
            System.out.println(exc.getMessage());
        }
        System.out.println("Testing Constructors >>>>>>>> Succeeded!");


    }
}
