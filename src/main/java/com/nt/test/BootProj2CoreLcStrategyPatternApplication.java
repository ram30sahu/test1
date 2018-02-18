package com.nt.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.nt.beans.Flipkart;

@SpringBootApplication
@ComponentScan(basePackages="com.nt.beans")
public class BootProj2CoreLcStrategyPatternApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext=null;
		Flipkart flipkart=null;
		applicationContext=SpringApplication.run(BootProj2CoreLcStrategyPatternApplication.class, args);
        //get bean
		flipkart=applicationContext.getBean("flipkart",Flipkart.class);
	   System.out.println(flipkart.Shopping(new String[]{"pant","shirt"}));
	
	}

}
