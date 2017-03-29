package com.aditya.techgig.patternchallenge;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int num2 = 1;
		int j;
		for(int i=1; i<=num; i++){
			for(j=num; j>num2; j--){
				System.out.print(Character.toString((char)(j+64))+" ");
			}
			System.out.println(Character.toString((char)(j+64)));
			num2++;
		}

	}

}
