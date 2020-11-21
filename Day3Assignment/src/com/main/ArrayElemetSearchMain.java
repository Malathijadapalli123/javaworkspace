package com.main;

import java.util.Scanner;

import com.pojo.ArrayElementSearch;

public class ArrayElemetSearchMain {

	public static void main(String[] args) {
		ArrayElementSearch search = new ArrayElementSearch();
		int arr[] = new int[10];
		int element;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the elements of an array : ");
		for (int i = 0; i < 10; i++) {
			arr[i] = scanner.nextInt();
		}
		System.out.println("Enter the search element : ");
		element = scanner.nextInt();
		search.getSearchElement(arr, element);

	}

}
