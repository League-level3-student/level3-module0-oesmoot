package _01_Simple_Array_Algorithms;

import java.util.Random;

public class MoreArrayFun {
    //1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		String[] strings = {"a", "b", "c", "d", "e"};
		//printStringArray(strings);
		//printBackwardsArray(strings);
		//printEveryOther(strings);
		printRandomArray(strings);
	}

    //2. Write a method that takes an array of Strings and prints all the Strings in the array.
	static void printStringArray(String[] array) {
		for(int i = 0; i< array.length; i++) {
			System.out.println(array[i]);
		}
	}


    //3. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in reverse order.
	static void printBackwardsArray(String[] array) {
		for(int i = array.length -1; i>=0; i--) {
			System.out.println(array[i]);
		}
	}


    //4. Write a method that takes an array of Strings and prints every other String in the array.
	static void printEveryOther(String[] array) {
		for(int i =0; i< array.length; i++) {
			if(i%2 ==0) {
				System.out.println(array[i]);
			}
		}
	}

    //5. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in a completely random order. Almost every run of the program should result in a different order.
	static void printRandomArray(String[] array) {
		boolean[] hasBeenPrinted = new boolean[array.length];
		Random ran = new Random();
		for(int i=0; i< array.length; i++) {
			int rand = ran.nextInt(array.length);
			while(hasBeenPrinted[rand] == true) {
				rand = ran.nextInt(array.length);
			}
			System.out.println(array[rand]);
			hasBeenPrinted[rand] = true;
		}
	}

}
