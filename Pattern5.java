package com.aditya.techgig.patternchallenge;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();		
		int num2 = 1;
		for(int i=1; i<=num; i++){
			int j;
			for(j=num; j>num2; j--){
				System.out.print(j+" ");
			}
			System.out.println(j);
			num2++;
		}
	}
}
