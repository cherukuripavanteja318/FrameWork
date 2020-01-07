package com.tm.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.tm.BaseClass.BaseClass;
import com.tm.ScreenPages.ApplyLeave;
import com.tm.ScreenPages.Home;
import com.tm.ScreenPages.Login;
import com.tm.ScreenPages.MyLeave;

public class TestCase_Leave_MyLeave extends BaseClass{
	
	@Test(enabled=false)
	public void TC102_MyLeave() {
		String [] data=ReadRowData(CurrentTestCaseName);
		Login login = PageFactory.initElements(driver, Login.class);
		Home home = PageFactory.initElements(driver, Home.class);
		MyLeave myleave=PageFactory.initElements(driver, MyLeave.class);
				
		//Step 1: Login as a team member
		login.LoginHRM(data[0],data[1]);
		
		//Step 2: Navigate My Leave page
		home.navMyLeave();
		
		//Step 3: Enter leave details and click save
		myleave.VerifyPendingApprovalStstus_MyLeave(data[2],data[3]);
		
		//Step 6: Logout
		home.Logout();
			
	}
	
	@Test(enabled=false)
	public void TC102_MyLeavePageObjectsVerification() {
		String [] data=ReadRowData(CurrentTestCaseName);
		Login login = PageFactory.initElements(driver, Login.class);
		Home home = PageFactory.initElements(driver, Home.class);
		MyLeave myleave=PageFactory.initElements(driver, MyLeave.class);
				
		//Step 1: Login as a team member
		login.LoginHRM(data[0],data[1]);
		
		//Step 2: Navigate My Leave page
		home.navMyLeave();
		
		//Step 3: MyLeave page Objects Verification
		myleave.MyLeavePage_ObjectsVerification(data[2], data[3], data[4], data[5],data[6], data[7], data[8], data[9], data[10], data[11], data[12], data[13], data[14], data[15], data[16], data[17], data[18]);
		
		//Step 6: Logout
		home.Logout();
			
	}
	
	@Test
	public void TC102_MyLeavePageCheckBoxFunctionality() {
		String [] data=ReadRowData(CurrentTestCaseName);
		Login login = PageFactory.initElements(driver, Login.class);
		Home home = PageFactory.initElements(driver, Home.class);
		MyLeave myleave=PageFactory.initElements(driver, MyLeave.class);
		
		//log in
		login.LoginHRM("user02","TM1234");
		//nav My leave page
		home.navMyLeave();
		//my leave page check box verification
		myleave.reusableMethodForCheckBoxes();
		//log out
		
	}

}
