package com.seleniumexpress.college;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class MathTeaacher implements Teachers {

	
	public void teach() {
		System.out.println("i am your math teacher");
		System.out.println("my name is roy");
		
	}

}
