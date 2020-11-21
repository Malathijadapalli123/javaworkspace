package com.main;

import java.util.Arrays;
import java.util.Scanner;

import com.pojo.ArraySorting;

/*
 * 3.	write a Java program to sort an integer array of 10 elements in ascending.
 */
public class ArraySortingMain {

	public static void main(String[] args) {
		ArraySorting array = new ArraySorting();
		int  arr[]= new int[10];
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the elements of an array : ");
		for (int i = 0; i < 10; i++) {
			arr[i] = s.nextInt();
		}
		int[] arr1 = array.getSortArray(arr);

		System.out.println("The array elements after sorting are : ");
		System.out.println(Arrays.toString(arr1));
		s = null;

	}

}
