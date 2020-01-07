package com.tm.TestCases;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.tm.BaseClass.BaseClass;
import com.tm.ScreenPages.Home;
import com.tm.ScreenPages.Login;
import com.tm.ScreenPages.ReusableClass;

public class TestCases_MyLeave_TableHeaderVerification extends BaseClass {

	@Test
	public  void TC318_TableHeaders_Verification() throws InterruptedException{
		String [] data=ReadRowData(CurrentTestCaseName);
		Login login = PageFactory.initElements(driver, Login.class);
		Home home = PageFactory.initElements(driver, Home.class);
		//ReusableClass ru=PageFactory.initElements(driver, ReusableClass.class);
		//log in to application 
		login.LoginHRM(data[0],data[1]);
		
		//nav to MyLeave page
		home.navMyLeave();
		wait(2);
		
		//verifying the headers
		//ru.headerVerification();
		
		//logout app
		home.Logout();
	}

}
