package com.aditya.techgig.patternchallenge;

import java.util.Scanner;

public class Pattern14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int num2 = 1;
		for(int i=1; i<=num; i++){
			for(int j=num; j>i; j--){
				System.out.print("  ");
			}	
			int k;
			for(k=num2; k>1; k--){
				System.out.print(Character.toString((char)(k+64))+" ");
			}
			System.out.print(Character.toString((char)(k+64)));
			int c;
			for(c=1; c<num2; c++){
				System.out.print(" "+Character.toString((char)(c+65)));
			}
			System.out.println();
			num2++;
		}

	}

}
