package com.seleniumexpress.college;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages="com.seleniumexpress.college")
@PropertySource("classpath:college-info-practise.properties")
public class CollegeConfig {
	
	
	
	/*//********************another approach for creating bean*******************
	@Bean(name={"rupom","soma"})
	public College collegeBean() //here bean id is same as that of collegeBean
	{
		College college=new College();
		return college;
		
	}*//***************************another approach of creating bean*****************************
	
	
	
	
	
	
	
	
	
	//*****************constructor injection********************
	@Bean
	public Principal principalBean()
	{
		Principal principal=new Principal();
		return principal;
		
	}
	
	
	@Bean
	public College collegeBean() //here bean id is same as that of collegeBean
	{
		College college=new College(principalBean());//constructor injection
		return college;
		
	}
	//using constructor injection
*/  //********************constructor injection**************************************************************
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//*********************setter injection**************************************************
	/*@Bean
	public College collegeBean() //here bean id is same as that of collegeBean
	{
		College college=new College();//constructor injection
		college.setPrincipal(principalBean());
		college.setTeacher(mathTeacherBean());
		return college;
	}
	
	
	@Bean
	public Principal principalBean()
	{
		Principal principal=new Principal();
		return principal;
		
	}
	
@Bean
	public Teachers mathTeacherBean() 
	{
		return new MathTeaacher();
	}*/
	//***********************************setter injection****************************************

}
