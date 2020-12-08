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
 //같은 숫자는 싫어요 //프로그래머스 어렵다!!! ㄷㄷ 너무 못하는디
 public static int[] solution(int []arr) {
     ArrayList<Integer> list=new ArrayList<Integer>();
     int current=10; //0~9사이에 숫자
     for(int i=0;i<arr.length;i++){
    	 //반복문을 통해서 중복되지 않은 값을 list에 담는다
    	 if(arr[i]!=current) {
    		 list.add(arr[i]);
    		 current=arr[i];
    	 }
     }
     //배열의 길이를 값이 들어간 리스트의 사이즈로 잡아준다
     
    int[] answer= new int[list.size()];
    for(int j :list) {
    //반복문을 통해서 해당 배열에 순서대로 리스트의 값을 넣어준다.
    	answer[j]=list.get(j);
    }
     return answer;
 }
 }
 
 

