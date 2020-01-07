package com.tm.ScreenPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.tm.Libraries.Weblibrary;

public class My_Info extends Weblibrary {

	@FindBy(xpath = "//a[text()='Personal Details']")
	public static WebElement link_personalDetails;

	@FindBy(xpath = "//a[text()='Contact Details']")
	public static WebElement link_ContactDetails;

	@FindBy(xpath = "//a[text()='Emergency Contacts']")
	public static WebElement link_EmergencyContacts;

	@FindBy(xpath = "//a[text()='Dependents']")
	public static WebElement link_Dependents;

	@FindBy(xpath = "//a[text()='Immigration']")
	public static WebElement link_Immigration;

	@FindBy(xpath = "//a[text()='Job']")
	public static WebElement link_Job;

	@FindBy(xpath = "//a[text()='Salary']")
	public static WebElement link_Salary;

	@FindBy(xpath = "//a[text()='Report-to']")
	public static WebElement link_Reportto;

	@FindBy(xpath = "//a[text()='Qualifications']")
	public static WebElement link_Qualifications;

	@FindBy(xpath = "//a[text()='Memberships']")
	public static WebElement link_Memberships;

	// click on personalDetails link
	public static void click_personalDetails() {
		boolean status;
		status = clickElement(link_personalDetails);
		logEvent(status, "personalDetails link clicked", "personalDetails link not clicked");
	}

	// click on EmergencyContacts link
	public static void click_EmergencyContacts() {
		boolean status;
		status = clickElement(link_EmergencyContacts);
		logEvent(status, "EmergencyContacts link clicked", "EmergencyContacts link not clicked");
	}

	// click on Dependents link
	public static void click_Dependents() {
		boolean status;
		status = clickElement(link_Dependents);
		logEvent(status, "Dependents link clicked", "Dependents link not clicked");
	}

	// click on Immigration
	public static void click_Immigration() {
		boolean status;
		status = clickElement(link_Immigration);
		logEvent(status, "Immigration link clicked", "Immigration link not clicked");
	}

	// click on Job
		public static void click_Job() {
			boolean status;
			status = clickElement(link_Job);
			logEvent(status, "Job link clicked", "Job link not clicked");
		}

		// click on Salary
		public static void click_Salary() {
			boolean status;
			status = clickElement(link_Salary);
			logEvent(status, "Salary link clicked", "Salary link not clicked");
		}

		// click on Reportto
		public static void click_Reportto() {
			boolean status;
			status = clickElement(link_Reportto);
			logEvent(status, "Reportto link clicked", "Reportto link not clicked");
		}

		// click on Qualifications
		public static void click_Qualifications() {
			boolean status;
			status = clickElement(link_Qualifications);
			logEvent(status, "Qualifications link clicked", "Qualifications link not clicked");
		}

		// click on Memberships
		public static void click_Memberships() {
			boolean status;
			status = clickElement(link_Memberships);
			logEvent(status, "Memberships link clicked", "Memberships link not clicked");
		}

}
