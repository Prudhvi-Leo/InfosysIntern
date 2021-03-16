package com.infy.timeallocation.service;

public class TimeAllocator {
	public String allocateTimeSlot(String desktopNumber) {
		if(desktopNumber.charAt(1)=='A')
			return "9:00 am";
			else
			return "1:00";
	}
}
