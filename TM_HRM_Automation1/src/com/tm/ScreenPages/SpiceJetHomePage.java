package com.tm.ScreenPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.tm.Libraries.Weblibrary;

public class SpiceJetHomePage extends Weblibrary {
	
	@FindBy(xpath="//table[@class='tblTrip']/tbody/tr/td[2]/input")
	public static WebElement Radio_btn;
	
	@FindBy(xpath="//span[@class='red-arrow-btn']")
	public static WebElement drpdwn_From;
	
	
	@FindBy(xpath="//a[text()=' Ahmedabad (AMD)']")
	public static WebElement drpdwn_From_Ahmedabad;
	
	
	//@FindBy(xpath="//span[@id='ctl00_mainContent_ddl_destinationStation1_CTXTaction']")
	//public static WebElement drpdwn_To;
	
	//@FindBy(xpath="//*[@id="dropdownGroup1"]/div/ul[2]/li[1]/a")
	//public static WebElement drpdwn_To_gova;
	
	@FindBy(xpath="//input[@class='custom_date_pic required picker-first home-date-pick valid']")
	public static WebElement clndr_departDate;
	
	@FindBy(xpath="//table[@class='ui-datepicker-calendar']/tbody/tr[3]/td[6]/a[text()='20']")
	public static WebElement departdate_20;
	
	@FindBy(xpath="//input[@class='custom_date_pic required home-date-pick valid']")
	public static WebElement clndr_returnDate;
	

	@FindBy(xpath="//table[@class='ui-datepicker-calendar']/tbody/tr[4]/td[4]/a[text()='25']")
	public static WebElement returnDate_25;
	  
	@FindBy(xpath="//div[@id='divpaxinfo']")
	public static WebElement passengers;
	
	
	
	public static void SpiceJetHomePageFun(){
		boolean status;
		status = clickElement(Radio_btn);
		logEvent(status, "Radio is button clicked", "Radio is button not clicked");
	
		status = clickElement(drpdwn_From);
		logEvent(status, "From date field is clicked", "From date field is not clicked");
	
		status = clickElement(drpdwn_From_Ahmedabad);
		logEvent(status, "Apply button clicked", "Apply button not clicked");
	
		
	
	}
	

}
