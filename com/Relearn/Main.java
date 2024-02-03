package com.Relearn;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int[] myIntArray = new int[10];
        myIntArray[1] = 1;
        myIntArray[0] = 45;
        myIntArray[5] = 50;

        double[] myDoubleArray = new double[10];
        myDoubleArray[2] = 3.5;

        System.out.println(myDoubleArray[2]);

        //Anonymous array initialiser
        int[] firstTen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("first element = " + firstTen[0]);
        int arrayLength = firstTen.length;
        System.out.println("length of the array = " + arrayLength);
        System.out.println("last element = " + (firstTen[arrayLength - 1]));

        //this throws an error... because we can't use the anonymous version of the initialiser unless in a declaration statement
//        int[] newArray;
//        newArray = {5, 4, 3, 2, 1};

        int[] newArray;
        newArray = new int[] {5, 4, 3, 2, 1};

        for (int i =0; i <= newArray.length - 1; i++){
            System.out.printf("array at %d = %d %n", i, newArray[i]);
        }
        System.out.println("--".repeat(15));
        //Assigning value to an array using a loop
        int[] anotherNewArray = new int[5];

        for (int i  = 0; i <= anotherNewArray.length - 1; i++){
            anotherNewArray[i] = newArray.length - i;
        }
        System.out.println();
        for (int i =0; i <= anotherNewArray.length - 1; i++){
            System.out.printf("array at %d = %d  %n", i, anotherNewArray[i]);
        }
        System.out.println("--".repeat(15));
        //Enhanced for loop / for each loop
        for(int element : anotherNewArray){
            System.out.printf("%d ", element);
        }
        System.out.println();
        System.out.println("--".repeat(15));

        //trying to print out an array with jus the Print statement
        System.out.print(anotherNewArray);
        System.out.println("  -  Int array (I), hexadecimal hashcode (@...)");

        //Arrays.toString() method -> useful if you just want to print out the elements of an array
        System.out.println("--".repeat(15));
        System.out.println(Arrays.toString(anotherNewArray));

        //Checking if an array is really an Object type
        System.out.println("--".repeat(15));
        Object objectVariable = anotherNewArray;
        if (objectVariable instanceof int[])
            System.out.println("objectVariable is an int[], and arrays inherit from 'Object'");

        System.out.println("--".repeat(15));

        //we can also create an array of objects...
        Object[] objectArray = new Object[3];
        objectArray[0] = "Hello"; // -> String
        objectArray[1] = new StringBuilder("World"); // -> StringBuilder
        objectArray[2] = '!'; // -> char

        //This is not best practice when creating an array of different classes though... but it's good to point out.



    }


}
