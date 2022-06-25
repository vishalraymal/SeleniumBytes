package com.rahulshetty.demo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
	public static void main(String[] args) {
		
		SimpleDateFormat sdf= new SimpleDateFormat("dd-MM-yyy HH:mm:ss");
		Date dt= new Date();
		
		// current time
		System.out.println(dt.toString());
		
		// format date
		
		String currentDate = sdf.format(dt);
		System.out.println("Todays Date in require format: "+currentDate);
		
		
	}

}
