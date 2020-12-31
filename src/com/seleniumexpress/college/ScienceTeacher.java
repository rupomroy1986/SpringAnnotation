package com.seleniumexpress.college;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ScienceTeacher implements Teachers {

	
	public void teach() {
		System.out.println("i am your science teacher");
		System.out.println("my name is victor dey");
		
	}

}
