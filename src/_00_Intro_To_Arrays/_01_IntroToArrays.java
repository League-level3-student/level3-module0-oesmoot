package _00_Intro_To_Arrays;

import java.util.Random;

public class _01_IntroToArrays {
    public static void main(String[] args) {
        // 1. declare and Initialize an array 5 Strings
    	String[] glubtubbis = new String[5];
    	
    	glubtubbis[0] = "glubtubbis";
    	glubtubbis[1] = "glubtubbis2";
    	glubtubbis[2] = "glubtubbis3(me!)";
    	glubtubbis[3] = "glubtubbis4";
    	glubtubbis[4] = "glubtubbis5";
        // 2. print the third element in the array
    	System.out.println(glubtubbis[2]);
        // 3. set the third element to a different value
    	glubtubbis[2] = "glubtubbis3(not me?)";
        // 4. print the third element again
    	System.out.println(glubtubbis[2]);
        // 5. use a for loop to set all the elements in the array to a string
        //    of your choice
    	for(int i = 0; i< glubtubbis.length; i++) {
    		glubtubbis[i] = "WE ARE UNITED";
    	}
        // 6. use a for loop to print all the values in the array
        //    BE SURE TO USE THE ARRAY'S length VARIABLE
    	for(int i = 0; i<glubtubbis.length; i++) {
    		System.out.println(glubtubbis[i]);
    	}
        // 7. make an array of 50 integers
    	int[] ints = new int[50];
        // 8. use a for loop to make every value of the integer array a random
        //    number
    	Random ran = new Random();
    	for(int i = 0; i<ints.length;i++) {
    		ints[i] = ran.nextInt(10000);
    	}
        // 9. without printing the entire array, print only the smallest number
        //    on the array
    	int smallestNumber = 10000;
    	for(int i = 0; i<ints.length;i++) {
    		if(ints[i] < smallestNumber) {
    			smallestNumber = ints[i];
    		}
    	}
    	System.out.println(smallestNumber);
        // 10 print the entire array to see if step 8 was correct
    	for(Integer i:ints) {
    		System.out.println(i);
    	}
        // 11. print the largest number in the array.
    	int largestNumber = 0;
    	for(Integer i:ints) {
    		if(i> largestNumber) {
    			largestNumber = i;
    		}
    	}
    	System.out.println(largestNumber);
        // 12. print only the last element in the array
    	System.out.println(ints[49]);
    }
}
