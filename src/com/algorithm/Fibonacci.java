package com.algorithm;
import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
        if(n==1){
            System.out.println(1);
        }else{
                int index1=0;//�����Ҷ� �ʱⰪ
		        int index2=1;//���۽� �ʱⰪ
		        int index3=0;//������ index�� ����� ����
		for(int i=1; i<n;i++) {
			index3=index1+index2;
			index1=index2;
			index2=index3;
		    }
          System.out.println(index3);
		 }
	
      
	}

}
