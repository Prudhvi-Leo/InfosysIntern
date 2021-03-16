package com.desktop.allocation.service;

public class DesktopAllocator {
		static int number=0;
		public String allocateDesktopNumber(int rollNumber) {
			number++;
			if(rollNumber%2==0) {
			
				return number+"A";
			}
			else
			{
			
				return number+"B";
			}
		}
}
