package com.aditya.techgig.patternchallenge;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int num2 = 1;
		for(int i=1; i<=num; i++){
			for(int j=1; j<num2; j++){
				System.out.print("  ");
			}
			for(int k=num; k>num2; k--){
				System.out.print("* ");
			}
			System.out.println("*");
			num2++;
		}

	}

}
