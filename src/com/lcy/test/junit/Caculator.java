package com.lcy.test.junit;

import org.springframework.stereotype.Component;

@Component
public class Caculator { 
	
	public void caculateSum(int price,int num){
		int sum=price*num;
		System.out.println(sum);
	}
	
	public void caculateDiv(int a,int b){
		int result=a/b;
		System.out.println(result);
	}
}
