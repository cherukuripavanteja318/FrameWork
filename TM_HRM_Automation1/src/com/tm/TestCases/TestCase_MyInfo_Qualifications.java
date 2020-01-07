package com.tm.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.sun.jna.platform.unix.X11.XClientMessageEvent.Data;
import com.tm.BaseClass.BaseClass;
import com.tm.Libraries.Weblibrary;
import com.tm.ScreenPages.ApplyLeave;
import com.tm.ScreenPages.Home;
import com.tm.ScreenPages.Login;
import com.tm.ScreenPages.My_Info;
import com.tm.ScreenPages.Qualifications;



public class TestCase_MyInfo_Qualifications extends BaseClass {
	

@Test
public void TC1_MyInfo_Qualifications_Experience() {
		String [] data=ReadRowData(CurrentTestCaseName);
		Login login = PageFactory.initElements(driver, Login.class);
		Home home = PageFactory.initElements(driver, Home.class);
		My_Info myinfo=	 PageFactory.initElements(driver, My_Info.class);	
		Qualifications qualifications=PageFactory.initElements(driver, Qualifications.class);
		
		
		//Step 1: Login as a team member
		login.LoginHRM(data[0],data[1]);
		
		//Step 2: Navigate my info  page
		home.navMyInfo();
		
		//Step 3: click on qualifications link
		myinfo.click_Qualifications();
		
		//Step 4: Qualifications_add work experience
		qualifications.AddExperice_Qualifications(data[2],data[3],data[4],data[5]);
		
		//Step 6: Logout
		home.Logout();
			
	}

}
