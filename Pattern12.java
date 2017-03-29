package com.aditya.techgig.patternchallenge;

import java.util.Scanner;

public class Pattern12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int num2 = 1;
		for(int i=1; i<=num; i++){
			for(int j=num; j>i; j--){
				System.out.print("  ");
			}		
			int k;
			for(k=1; k<num2; k++){
				System.out.print(k+" ");
			}
			System.out.println(k);
			num2+=2;
		}

	}

}
