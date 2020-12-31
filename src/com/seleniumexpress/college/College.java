package com.seleniumexpress.college;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/*@Component("collegebean")
public class College {
	
	public void test()
	{
		System.out.println("testing the calling methods");
	}*/
	
	
//another way without providing the bean name,
	
/*@Component
public class College {
	
	public void test()
	{
		System.out.println("testing the calling methods");
	}*/
	






@Component
public class College {
	
	@Value("${College.Name}")
   private String collegename;
   
   /*//*****************i will create setter method to avoid null output for college name****************
   
 
   @Required
   //@Value("${College.Name}")  

	public void setCollegename(String collegename) {
	this.collegename = collegename;
}
	   //*****************i will create setter method to avoid null output for college name****************
*/
	

	@Autowired
	private Principal principal; //here principal is the class
	
	
    @Autowired
    @Qualifier("mathTeaacher")
	private Teachers teacher; //here teacher is the interface
	
	
    
    
    
    /*//********************8constructor injection*************************
		public College(Principal principal) {
			this.principal = principal;
		}*/
	//*********************constructor injection**************************
	
	
	//********************setter injection******************
	/*public void setPrincipal(Principal principal) {
		this.principal = principal;
		System.out.println("setting the principal method");
	}
	
	
	public void setTeacher(Teachers teacher) {
		this.teacher = teacher;
	}
	
	
	

public void setCollegename(String collegename) {
		this.collegename = collegename;
	}*/
	
	//*************setter injection**************************************





public void test()
	
	{
		principal.principalInfo();
		teacher.teach();
		System.out.println("my college name is:"+ " " +collegename);
		System.out.println("learning testing at the older age");
	}
	
	
	//******************autowire before the setter method**************************

	@Autowired
public void setTeacher(Teachers teacher) {
		this.teacher = teacher;
	}
//setter injection
	@Autowired
	//if we write the autowired before the depency, we dont require setter method.
	
 public void setPrincipal(Principal principal) {
		this.principal = principal;
		System.out.println("set principal method");
	}
	
	//*******************autowire before the setter method**********************************
	

}
