package com.lcy.test.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JunitTest {
	 private Caculator caculator;
	 
	 @Before
	 public void setCaculator(){
		 this.caculator=new Caculator();
	 }
	 
	 @After
	 public void finishCaculator(){
		 System.out.println("OK");
	 }
	 
	 @Test
	 public void getSum(){
		 caculator.caculateSum(2, 5);
	 }
}
