package com.naven.testRun;	

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	
        Vehicles obj = (Vehicles)context.getBean("vehicle");
        obj.drive();
    }
}
