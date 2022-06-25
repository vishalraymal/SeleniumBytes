package com.rahulshetty.demo;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalenderClassDemo {

	
	public static void main(String[] args) {
		
	    Calendar cal=Calendar.getInstance();
	    SimpleDateFormat sdf= new SimpleDateFormat("M/d/yyyy HH:mm:ss");
	    String currentTime = sdf.format(cal.getTime());
	    System.out.println("Current time : "+ currentTime);
	    int todayDay = cal.get(Calendar.DAY_OF_MONTH);
	    System.out.println("Todays DAY: "+todayDay);
	    
	    
	    
	    
	    
	}
}
