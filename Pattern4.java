package com.aditya.techgig.patternchallenge;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int num2 = num;
		char j;
		for(int i=1; i<=num; i++){
			for(j=1; j<num2; j++){
				System.out.print(Character.toString((char)(j+64))+" ");
			}
			System.out.println(Character.toString((char)(j+64)));
			num2--;
		}
	}

}
