package com.aditya.techgig.patternchallenge;

import java.util.Scanner;

public class Pattern10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int num2 = 1;
		for(int i=1; i<=num; i++){			
			for(int k=i; k<num; k++){
				System.out.print("  ");				
			}
			for(int j=1; j<num2; j++){
				System.out.print("* ");
			}
			System.out.println("*");
			num2+=2;
		}
	}
}
