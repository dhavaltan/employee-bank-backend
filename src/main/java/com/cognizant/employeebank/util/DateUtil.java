package com.cognizant.employeebank.util;

import java.util.Date;

public class DateUtil {
	
	public static boolean isBirthday(Date date1,Date date2) {
		if(date1.getDate() == date2.getDate() && date1.getMonth() == date2.getMonth()) {
			return true;
		}
		return false;
	}

}
