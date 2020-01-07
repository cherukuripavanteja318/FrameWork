package com.tm.ScreenPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.tm.Libraries.Weblibrary;

public class MyTimesSheets extends Weblibrary{
	@FindBy(xpath = "//div[@class='top']/h3")
	public static WebElement txt_TimesSheetForWeek;
	
	@FindBy(xpath = "//select[@id='startDates']")
	public static WebElement dpdwn_TmeSheetFrwk;
	
	@FindBy(xpath = "//a[@id='btnAddTimesheet']")
	public static WebElement link_addTimeSheet;
	
	@FindBy(xpath = "//table[@class='table']")
	public static WebElement tbl_Table;
	
	@FindBy(xpath = "//th[@id='activityColumn']")
	public static WebElement tbl_header_ActivityName;
	
	@FindBy(xpath = "//th[@id='activityColumn']")
	public static WebElement tbl_header_;
	
	
	@FindBy(xpath = "//div[@class='bottom']/em")
	public static WebElement txt_status;
	
	

}
