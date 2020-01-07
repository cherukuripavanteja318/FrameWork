package com.tm.ScreenPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.tm.Libraries.Weblibrary;

public class Home extends Weblibrary{
	
	//===========Elements section===================
	//Leave menu Field
	@FindBy(xpath = "//a[@id='menu_leave_viewLeaveModule']")
	public static WebElement link_Leave;
	
	@FindBy(xpath = "//a[@id='menu_time_viewTimeModule']")
	public static WebElement link_Time;
	
	@FindBy(xpath = "//a[@id='menu_time_Timesheets']")
	public static WebElement link_TimesSheet;
	
	@FindBy(xpath = "//a[@id='menu_time_viewMyTimesheet']")
	public static WebElement link_myTimeSheet;
	
	@FindBy(xpath = "//a[@id='menu_attendance_Attendance']")
	public static WebElement link_Attendence;

	
	@FindBy(xpath = "//a[@id='menu_attendance_viewMyAttendanceRecord']")
	public static WebElement link_MyRecords;
	
	@FindBy(xpath = "//a[@id='menu_attendance_punchIn']")
	public static WebElement link_punchin_out;
	
	
	@FindBy(xpath = "//a[@id='menu_leave_applyLeave']")
	public static WebElement link_ApplyLeave;
	
	
	
	@FindBy(xpath = "//a[@id='menu_leave_viewMyLeaveList']")
	public static WebElement link_MyLeave;
	
	@FindBy(xpath = "//a[@id='menu_pim_viewMyDetails']")
	public static WebElement link_MyInfo;
	
	//============Methods section==============
	public static void navApplyLeave(){
		boolean status;
		status = moveToElement(link_Leave);
		logEvent(status, "mouse hover to Leave menu is successful", "mouse hover to Leave menu is unsuccessful");
		wait(2);		
		status = clickElement(link_ApplyLeave);	
		logEvent(status, "Apply leave menu link clicked", "Apply leave menu link not clicked");
	}
	
	
	
	public static void navMyLeave(){
		boolean status;
		status = moveToElement(link_Leave);
		logEvent(status, "mouse hover to Leave menu is successful", "mouse hover to Leave menu is unsuccessful");
		wait(2);
		status = clickElement(link_MyLeave);	
		logEvent(status, "MyLeave menu link clicked", "MyLeave menu link not clicked");
	}
	
	public static void navMyInfo(){			
		boolean status = clickElement(link_MyInfo);	
		logEvent(status, "MyInfo menu link clicked", "MyInfo menu link not clicked");		
	}
	
	public static void navMyTimesSheets(){
		boolean status;
		status = moveToElement(link_Time);
		logEvent(status, "mouse hover to Time menu is successful", "mouse hover to Time menu is unsuccessful");
		wait(2);
		status = moveToElement(link_TimesSheet);
		logEvent(status, "mouse hover to TimesSheet is successful", "mouse hover to TimesSheet is unsuccessful");
		wait(2);
		
		status = clickElement(link_myTimeSheet);	
		logEvent(status, "MyTimesSheet link is clicked", "MyTimesSheet link is not clicked");
	}
	
	public static void navMyRecords(){
		boolean status;
		status = moveToElement(link_Time);
		logEvent(status, "mouse hover to Time menu is successful", "mouse hover to Time menu is unsuccessful");
		wait(2);
		status = moveToElement(link_Attendence);
		logEvent(status, "mouse hover to Attendence sub menu is successful", "mouse hover to Attendence sub  menu is unsuccessful");
		wait(2);
		
		status = clickElement(link_MyRecords);	
		logEvent(status, "MyRecords  link is  clicked", "MyRecords  link is not clicked");
	}
	
	public static void navPunchInOut(){
		boolean status;
		status = moveToElement(link_Time);
		logEvent(status, "mouse hover to Time menu is successful", "mouse hover to Time menu is unsuccessful");
		wait(2);
		status = moveToElement(link_Attendence);
		logEvent(status, "mouse hover to Attendence sub menu is successful", "mouse hover to Attendence sub  menu is unsuccessful");
		wait(2);
		
		status = clickElement(link_punchin_out);	
		logEvent(status, "punch in/out  link is  clicked", "punch in/out  link is not clicked");
	}
	

	public static void Logout(){	
		
		
	}
	
	//=====================================

}





