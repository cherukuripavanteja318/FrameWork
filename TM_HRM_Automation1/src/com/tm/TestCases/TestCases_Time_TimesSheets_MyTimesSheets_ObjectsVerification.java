package com.tm.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.tm.BaseClass.BaseClass;
import com.tm.ScreenPages.Home;
import com.tm.ScreenPages.Login;
import com.tm.ScreenPages.My_Info;
import com.tm.ScreenPages.Qualifications;

public class TestCases_Time_TimesSheets_MyTimesSheets_ObjectsVerification extends BaseClass{
	
	
	@Test
	public void TC18_VerifyObjectsIn_MyTimesSheets() {
			String [] data=ReadRowData(CurrentTestCaseName);
			Login login = PageFactory.initElements(driver, Login.class);
			Home home = PageFactory.initElements(driver, Home.class);
			
			
			//Step 1: Login as a team member
			login.LoginHRM(data[0],data[1]);
			
			//Step 2: Navigate my info  page
			home.navMyTimesSheets();
			
			//Step 3:verify objects in my time sheets page
		
			
			//Step 4: Logout
			//home.Logout();
				
		}


}
