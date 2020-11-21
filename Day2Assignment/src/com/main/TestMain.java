package com.main;

/*
 * 5. Create class named as ‘a’ and create a sub class ‘b’. 
 * Which is extends from class ‘a’. And use these classes in ‘inherit’ class.
 */
import java.util.Scanner;

import com.service.B;

public class TestMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		B emp = new B();
		emp.empDetails();
		emp.employeeAddress();
		scanner = null;

	}

}
