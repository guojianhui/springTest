package com.lcy.test.junit;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CaculatorService {
	@Autowired
	private Caculator caculator;
	
	@Before
	public void inti(){
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("annotationBeans.xml");
		this.caculator=(Caculator)applicationContext.getBean("caculator");
	}
	
	@Test
	public void getShopSum(){
		caculator.caculateSum(3, 8);
	}
	
	@Test(expected=Exception.class)
	public void divOperation(){
		caculator.caculateDiv(23, 0);
	}
}
