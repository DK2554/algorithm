package com.algorithm;

import java.util.Scanner;

public class Recursive {

		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num=scan.nextInt();
		scan.close();
		int sum=factory(num);
		System.out.println(sum);
	}
	public static int factory(int a) {
		if(a<=1) return 1; //백준에서 시간초과 발생 입력이 0부터이기때문이라고함
		else return a*factory(a-1);
	
		
		
	}
}
