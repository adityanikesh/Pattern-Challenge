package com.aditya.techgig.patternchallenge;

import java.util.Scanner;

public class Pattern20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int num2 = num*2-1;
		int num3 = num;
		for(int i=1; i<=num; i++){			
			for(int k=1; k<i; k++){
				System.out.print("  ");				
			}
			int j;
			for(j=1; j<num2; j++){
				System.out.print(Character.toString((char)(num3+65))+" ");
			}
			System.out.println(Character.toString((char)(num3+65)));
			num2-=2;
			num3-=2;
		}

	}

}
