package com.company;

public class Main {

    public static void main(String[] args) {

       // int[] myIntArray = new int[10];
//        myIntArray[3] = 40;
//        System.out.println(myIntArray[3]);
        //can also be any other data type like double, long etc.

//        int[] myIntArray = {1,2,3,4,5,6,7,8,9,10};
//
//        System.out.println(myIntArray[3]);
//        System.out.println(myIntArray[4]);
//        System.out.println(myIntArray[6]);

        //you can set the values with a loop
        int[] myIntArray = new int[5];

        for(int i = 0; i < myIntArray.length; i++) {

            myIntArray[i] = i;
        }

        //then print out the values with a loop
//        for (int j = 0; j < myIntArray.length; j++) {
//            System.out.println(j);
//        }
        printArray(myIntArray);

    }

    public static void printArray(int[] array) {
        for (int j = 0; j < array.length; j++) {
            System.out.println(j);
        }
    }
}
