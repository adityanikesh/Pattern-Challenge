package com.aditya.techgig.patternchallenge;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int num2 = num;
		for(int i=1; i<=num; i++){
			for(int j=1; j<num2; j++){
				System.out.print(i+" ");				
			}
			System.out.print(i);
			num2--;
			System.out.println();
		}

	}

}
