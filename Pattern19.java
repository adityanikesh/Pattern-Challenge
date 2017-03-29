package com.aditya.techgig.patternchallenge;

import java.util.Scanner;

public class Pattern19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int num2 = num*2-1;
		for(int i=1; i<=num; i++){			
			for(int k=1; k<i; k++){
				System.out.print("  ");				
			}
			int j;
			for(j=1; j<num2; j++){
				System.out.print(Character.toString((char)(num+65-i))+" ");
			}
			System.out.println(Character.toString((char)(num+65-i)));
			num2-=2;
		}


	}

}
