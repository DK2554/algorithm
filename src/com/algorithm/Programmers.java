package com.algorithm;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Programmers {
 public static void main(String[] args) {
	 int[] arr= {1,1,3,3,0,1,1};
	 int[] anwer=solution(arr);
	 for(int i:anwer) {
		 System.out.print(i);
	 }
 }
 //���� ���ڴ� �Ⱦ�� //���α׷��ӽ� ��ƴ�!!! ���� �ʹ� ���ϴµ�
 public static int[] solution(int []arr) {
     ArrayList<Integer> list=new ArrayList<Integer>();
     int current=10; //0~9���̿� ����
     for(int i=0;i<arr.length;i++){
    	 //�ݺ����� ���ؼ� �ߺ����� ���� ���� list�� ��´�
    	 if(arr[i]!=current) {
    		 list.add(arr[i]);
    		 current=arr[i];
    	 }
     }
     //�迭�� ���̸� ���� �� ����Ʈ�� ������� ����ش�
     
    int[] answer= new int[list.size()];
    for(int j :list) {
    //�ݺ����� ���ؼ� �ش� �迭�� ������� ����Ʈ�� ���� �־��ش�.
    	answer[j]=list.get(j);
    }
     return answer;
 }
 }
 
 

