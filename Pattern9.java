package com.aditya.techgig.patternchallenge;

import java.util.Scanner;

public class Pattern9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int num2=1;
		int num3=num;
		for(int i=1; i<=num; i++){
			for(int j=1; j<num2; j++){
				System.out.print("  ");
			}
			int k;
			for(k=1; k<num3; k++){
				System.out.print(k+" ");
			}
			System.out.println(k);
			num2++;
			num3--;
		}

	}

}
