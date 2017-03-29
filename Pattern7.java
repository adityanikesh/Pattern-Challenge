package com.aditya.techgig.patternchallenge;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int num2 = num;
		int i, j, c;
		for(i=1; i<=num;i++){
			for(j=1; j<num2; j++){
				System.out.print("  ");
			}
			for(c=1;c<i;c++){				
				System.out.print(c+" ");
			}
			num2--;
			System.out.println(c);
		}
	}
}
