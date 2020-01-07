package com.tm.ScreenPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.tm.Libraries.Weblibrary;

public class Qualifications extends Weblibrary {

	// add button in Qualifications page
	@FindBy(xpath = "//input[@id='addWorkExperience']")
	public static WebElement btn_add;

	// company textbox in Qualifications_work Experience
	@FindBy(xpath = "//input[@id='experience_employer']")
	public static WebElement Edt_company;

	// job title text box in Qualifications page
	@FindBy(xpath = "//input[@id='experience_jobtitle']")
	public static WebElement Edt_jobtitle;

	// from date text box in Qualifications page
	@FindBy(xpath = "//input[@id='experience_from_date']")
	public static WebElement drpdwn_fromdate;

	// to date text box in Qualifications page
	@FindBy(xpath = "//input[@id='experience_to_date']")
	public static WebElement drpdwn_todate;

	// to date text box in Qualifications page
	@FindBy(xpath = "//textarea[@id='experience_comments']")
	public static WebElement Edt_comments;

	// to date text box in Qualifications page
	@FindBy(xpath = "//input[@id='btnWorkExpSave']")
	public static WebElement btn_save;

	// to date text box in Qualifications page
	@FindBy(xpath = "//input[@id='btnWorkExpCancel']")
	public static WebElement btn_cancel;

	public static void AddExperice_Qualifications(String comapany, String jobtitle, String fromdate, String todate) {
		boolean status;
		// to click on add button
		status = clickElement(btn_add);
		logEvent(status, "User able to click on Add button", "Unable to click on Add button");

		// enter company name in company text box
		status = setText(Edt_company, comapany);
		logEvent(status, "User able to enter company name", "Unable to enter company name");

		// enter job title in Job title text box
		status = setText(Edt_jobtitle, jobtitle);
		logEvent(status, "User able to enter jobtitle", "Unable to enter jobtitle");

		// enter fromdate
		status = setTextandEscape(drpdwn_fromdate, fromdate);
		logEvent(status, "User able to select the Fromdate", "User unable to select the Fromdate");

		// enter todate
		status = setTextandEscape(drpdwn_todate, todate);
		logEvent(status, "User able to enter the todate", "User unable to enter the todate");

		// click on save button
		status = clickElement(btn_save);
		logEvent(status, "User able to click on save button", "Unable to click on save button");

	}
}
