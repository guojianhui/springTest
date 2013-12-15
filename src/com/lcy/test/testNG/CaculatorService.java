package com.lcy.test.testNG;
   
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test; 

public class CaculatorService {
	 
	private Caculator caculator;
	@BeforeMethod
	public void inti(){
		System.out.println("初始化");
		 this.caculator=new Caculator();
	} 
	@DataProvider(name="firstData")
	public Object[][] createObject(){
		return new Object[][]{new Object[]{23,5}};
	}
	
	@Test(dataProvider="firstData")
	public void getSum(int input, int num){
		caculator.caculateSum(input, num);
	}
}
