package com.seleniumexpress.college;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		//ApplicationContext context= new AnnotationConfigApplicationContext(CollegeConfig.class);
		//just to avoid the warning message.
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(CollegeConfig.class);

		
		    College college      =context.getBean("college", College.class);
		    System.out.println("the college object created by spring is:" +college);
		    college.test();
		    context.close();
		    
		    
		
	}

}
