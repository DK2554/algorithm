package com.algorithm;
import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
        if(n==1){
            System.out.println(1);
        }else{
                int index1=0;//시작할때 초기값
		        int index2=1;//시작시 초기값
		        int index3=0;//마지막 index를 기억할 변수
		for(int i=1; i<n;i++) {
			index3=index1+index2;
			index1=index2;
			index2=index3;
		    }
          System.out.println(index3);
		 }
	
      
	}

}
