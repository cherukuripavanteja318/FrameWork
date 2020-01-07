package com.tm.ScreenPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.tm.Libraries.Weblibrary;

public class MyLeave extends Weblibrary {

	@FindBy(xpath = "//a[@class='toggle tiptip']")
	public static WebElement txt_MyLeaveList;

	// ---------------------------------------------From and To dates---------------------------------
	
	// From date text field
	@FindBy(xpath = "//input[@id='calFromDate']")
	public static WebElement EntNEsp_from;

	// To date text field
	@FindBy(xpath = "//input[@id='calToDate']")
	public static WebElement EntNEsp_to;
	
	
	// From date text
	@FindBy(xpath = "//label[text()='From']")
	public static WebElement txt_from;

	// To date text 
	@FindBy(xpath = "//label[text()='To']")
	public static WebElement txt_to;
	
	// From date calander
	@FindBy(xpath = "//label[text()='From']/following::img[1]")
	public static WebElement clndr_from;

	// To date calander 
	@FindBy(xpath = "//label[text()='To']/following::img[1]")
	public static WebElement clndr_to;
	
	
	
	

	// ----------------------------------------check box------------------------------------------------
	int i;
	/*@FindBy(xpath = "//label[text()='All']/following::input["+i+"]")
	public static WebElement checkbox_For_All;*/
 
	// all check box field
	@FindBy(xpath = "//label[text()='All']/following::input[1]")
	public static WebElement checkbox_all;
	
	

	// Rejected check box field
	@FindBy(xpath = "//label[text()='All']/following::input[2]")
	public static WebElement checkbox_rejected;

	// cancelled check box field
	@FindBy(xpath = "//label[text()='All']/following::input[3]")
	public static WebElement checkbox_cancelled;

	// cancelled check box field
	@FindBy(xpath = "//label[text()='All']/following::input[4]")
	public static WebElement checkbox_PendingApproval;

	// cancelled check box field
	@FindBy(xpath = "//label[text()='All']/following::input[5]")
	public static WebElement checkbox_Scheduled;

	// cancelled check box field
	@FindBy(xpath = "//label[text()='All']/following::input[6]")
	public static WebElement checkbox_Taken;

	
	@FindBy(xpath = "//label[text()='Show Leave with Status']")
	public static WebElement checkbox_txt_showLeaveWithStatus;
	
	
	@FindBy(xpath = "//label[text()='All']")
	public static WebElement checkbox_txt_all;

	@FindBy(xpath = "//label[text()='Rejected']")
	public static WebElement checkbox_txt_rejected;

	@FindBy(xpath = "//label[text()='Cancelled']")
	public static WebElement checkbox_txt_cancelled;

	@FindBy(xpath = "//label[text()='Pending Approval']")
	public static WebElement checkbox_txt_PendingApproval;

	@FindBy(xpath = "//label[text()='Scheduled']")
	public static WebElement checkbox_txt_Scheduled;

	@FindBy(xpath = "//label[text()='Taken']")
	public static WebElement checkbox_txt_Taken;

	// -------------------------------------Buttons------------------------------------------------------------
	// Search button
	@FindBy(xpath = "//input[@id='btnSearch']")
	public static WebElement btn_search;

	// Reset button
	@FindBy(xpath = "//input[@id='btnReset']")
	public static WebElement btn_reset;

	@FindBy(xpath = "//input[@id='btnSave']")
	public static WebElement btn_save;

	// ----------------------------------------------table headers-----------------------------------------------
	
	@FindBy(xpath = "//table[@id='resultTable']")
	public static WebElement tbl;

	@FindBy(xpath = "//table[@id='resultTable']/thead/tr/th[1]")
	public static WebElement tbl_hdr_Date;

	@FindBy(xpath = "//table[@id='resultTable']/thead/tr/th[2]")
	public static WebElement tbl_hdr_EmpolyeeName;

	@FindBy(xpath = "//table[@id='resultTable']/thead/tr/th[3]")
	public static WebElement tbl_hdr_LeaveType;

	@FindBy(xpath = "//table[@id='resultTable']/thead/tr/th[4]")
	public static WebElement tbl_hdr_LeaveBalance;

	@FindBy(xpath = "//table[@id='resultTable']/thead/tr/th[5]")
	public static WebElement tbl_hdr_NumberOfDays;

	@FindBy(xpath = "//table[@id='resultTable']/thead/tr/th[6]")
	public static WebElement tbl_hdr_Status;
	
	@FindBy(xpath = "//table[@id='resultTable']/tbody/tr[1]/td[6]")
	public static WebElement tbl_tbdy_Status;
	
	@FindBy(xpath = "//table[@id='resultTable']/thead/tr/th[7]")
	public static WebElement tbl_hdr_Comments;

	@FindBy(xpath = "//table[@id='resultTable']/thead/tr/th[8]")
	public static WebElement tbl_hdr_Actions;

	// ---------------------------------------page navigation buttons-------------------------------------------------


	@FindBy(xpath = "//ul[@class='paging top']/li[2]/a")
	public static WebElement btn_tp_pg_First;

	@FindBy(xpath = "//ul[@class='paging top']/li[10]/a")
	public static WebElement btn_tp_pg_Last;

	@FindBy(xpath = "//ul[@class='paging top']/li[9]/a")
	public static WebElement btn_tp_pg_Next;

	@FindBy(xpath = "//ul[@class='paging top']/li[3]/a")
	public static WebElement btn_tp_pg_Previous;

	@FindBy(xpath = "//ul[@class='paging bottom']/li[2]/a")
	public static WebElement btn_btm_pg_First;

	@FindBy(xpath = "//ul[@class='paging bottom']/li[10]/a")
	public static WebElement btn_btm_pg_Last;

	@FindBy(xpath = "//ul[@class='paging bottom']/li[9]/a")
	public static WebElement btn_btm_pg_Next;

	@FindBy(xpath = "//ul[@class='paging bottom']/li[3]/a")
	public static WebElement btn_btm_pg_Previous;

	@FindBy(xpath = "//a[text()='OrangeHRM, Inc']")
	public static WebElement link_OrangeHRM;

	//------------------------------------------operations------------------------------------------------------
	
	
	public static void VerifyPendingApprovalStstus_MyLeave(String fromdate, String todate) {
		boolean status;
		// enter fromdate
		status = setTextandEscape(EntNEsp_from, fromdate);
		logEvent(status, "User able to select the Fromdate", "User unable to select the Fromdate");

		// enter todate
		status = setTextandEscape(EntNEsp_to, todate);
		logEvent(status, "User able to enter the todate", "User unable to enter the todate");

		// select all check box
		status = clickElement(checkbox_all);
		logEvent(status, "User able to click on save button", "Unable to click on save button");

		// select pendingApproval check box
		status = clickElement(checkbox_PendingApproval);
		logEvent(status, "User able to click on save button", "Unable to click on save button");

		// click on search button
		status = clickElement(btn_search);
		logEvent(status, "User able to click on save button", "Unable to click on save button");
		
		
	}
	
	
	public static void MyLeavePage_ObjectsVerification(String From,String To,String showLeaveWithStatus,String all,String rejected,String cancelled,String PendingApproval,String Scheduled,String Taken,String Date,String EmpolyeeName,String LeaveType,String LeaveBalance,String NumberOfDays,String Status,String Comments,String Actions) {
		boolean status;
		status=isExist(txt_MyLeaveList);
		logEvent(status, "'My leave list' text is displayed successfully", "'My leave list' text is not displayed successfully");
		
		status=isExist(EntNEsp_from);
		logEvent(status, "'From' text box is displayed successfully", "'From' text box is not displayed successfully");
		
		status=isExist(EntNEsp_to);
		logEvent(status, "'To' text box is displayed successfully", "'To' text box is not displayed successfully");
		
		status=isExist(txt_from);
		logEvent(status, "'From' text is displayed successfully", "'From' text is not displayed successfully");
		
		status=isExist(txt_to);
		logEvent(status, "'To' text is displayed successfully", "'To' text is not displayed successfully");
		
		status=isExist(clndr_from);
		logEvent(status, "'From' calander is displayed successfully", "'From' calander is not displayed successfully");
		
		status=isExist(clndr_to);
		logEvent(status, "'To' calander is displayed successfully", "'To' calander is not displayed successfully");
		
		status=isExist(checkbox_all);
		logEvent(status, "'all' check box is displayed successfully", "'all' check box is not displayed successfully");
		
		status=isExist(checkbox_rejected);
		logEvent(status, "'rejected' check box is displayed successfully", "'rejected' check box is not displayed successfully");
		
		status=isExist(checkbox_cancelled);
		logEvent(status, "'Cancelled' check box is displayed successfully", "'Cancelled' check box check box is not displayed successfully");
		
		status=isExist(checkbox_PendingApproval);
		logEvent(status, "'PendingApproval' check box is displayed successfully", "'PendingApproval' check box is not displayed successfully");
		
		status=isExist(checkbox_Scheduled);
		logEvent(status, "'Scheduled' check box  is displayed successfully", "'Scheduled' check box is not displayed successfully");
		
		status=isExist(checkbox_Taken);
		logEvent(status, "'Taken' check box is displayed successfully", "'Taken' check box is not displayed successfully");
		
		status=isExist(checkbox_txt_showLeaveWithStatus);
		logEvent(status, "'showLeaveWithStatus' text is displayed successfully", "'showLeaveWithStatus' text is not displayed successfully");
		
		status=isExist(checkbox_txt_all);
		logEvent(status, "'all' text is displayed successfully", "'all' text is not displayed successfully");
		
		status=isExist(checkbox_txt_rejected);
		logEvent(status, "'rejected' text is displayed successfully", "'rejected' text is not displayed successfully");
		
		status=isExist(checkbox_txt_cancelled);
		logEvent(status, "'cancelled' text is displayed successfully", "'cancelled' text is not displayed successfully");
		
		status=isExist(checkbox_txt_PendingApproval);
		logEvent(status, "'PendingApproval' text is displayed successfully", "'PendingApproval' text is not displayed successfully");
		
		status=isExist(checkbox_txt_Scheduled);
		logEvent(status, "'Scheduled' text is displayed successfully", "'Scheduled' text is not displayed successfully");
		
		status=isExist(checkbox_txt_Taken);
		logEvent(status, "'Taken' text is displayed successfully", "'Taken' text is not displayed successfully");
		
		status=isExist(btn_search);
		logEvent(status, "'search' button is displayed successfully", "'search' button is not displayed successfully");
		
		status=isExist(btn_reset);
		logEvent(status, "'reset' button is displayed successfully", "'reset' button is not displayed successfully");
		
		status=isExist(btn_save);
		logEvent(status, "'save' button is displayed successfully", "'save' button is not displayed successfully");
		
		status=isExist(tbl);
		logEvent(status, "'Table' is displayed successfully", "'Table' is not displayed successfully");
		
		status=isExist(btn_tp_pg_First);
		logEvent(status, "'Top First Nav ' button  is displayed successfully", "'Top First Nav ' button  is not displayed successfully");
		
		status=isExist(btn_tp_pg_Last);
		logEvent(status, "'Top Last Nav ' button  is displayed successfully", "''Top Last Nav ' button is not displayed successfully");
		
		status=isExist(btn_tp_pg_Next);
		logEvent(status, "'Top Next Nav ' button  is displayed successfully", "'Top Next Nav ' button  is not displayed successfully");
		
		status=isExist(btn_tp_pg_Previous);
		logEvent(status, "'Top Previous Nav ' button  is displayed successfully", "'Top Previous Nav ' button  is not displayed successfully");
		
		status=isExist(btn_btm_pg_First);
		logEvent(status, "'Bottom First Nav ' button is displayed successfully", "'Bottom First Nav ' button is not displayed successfully");
		
		status=isExist(btn_btm_pg_Last);
		logEvent(status, "'Bottom Last Nav ' button is displayed successfully", "'Bottom Last Nav ' button is not displayed successfully");
		
		status=isExist(btn_btm_pg_Next);
		logEvent(status, "'Bottom Next Nav ' button is displayed successfully", "'Bottom Next Nav ' button is not displayed successfully");
		
		status=isExist(btn_btm_pg_Previous);
		logEvent(status, "'Bottom Previous Nav ' button is displayed successfully", "'Bottom Previous Nav ' button is not displayed successfully");
	/*
		status=isSameAs(txt_MyLeaveList, "My Leave List");
		logEvent(status, "'My Leave List' text is Same as Reqs", "'My Leave List' text is not Same as Reqs");*/
		
		status=isSameAs(txt_from, From);
		logEvent(status, "'From' text is Same as Reqs", "'From' text is not Same as Reqs");
		
		status=isSameAs(txt_to, To);
		logEvent(status, "'To' text is Same as Reqs", "'To' text is not Same as Reqs");
		
		status=isSameAs(checkbox_txt_showLeaveWithStatus,showLeaveWithStatus);
		logEvent(status, "'showLeaveWithStatus' text is Same as Reqs", "showLeaveWithStatus' text is not Same as Reqs");
		
		status=isSameAs(checkbox_txt_all, all);
		logEvent(status, "'all' text is Same as Reqs", "'all' text is not Same as Reqs");
		
		status=isSameAs(checkbox_txt_rejected, rejected);
		logEvent(status, "'rejected' text is Same as Reqs", "'rejected' text is not Same as Reqs");
		
		status=isSameAs(checkbox_txt_cancelled, cancelled);
		logEvent(status, "'cancelled' text is Same as Reqs", "'cancelled' text is not Same as Reqs");
		
		status=isSameAs(checkbox_txt_PendingApproval, PendingApproval);
		logEvent(status, "'PendingApproval' text is Same as Reqs", "'PendingApproval' text is not Same as Reqs");
		
		status=isSameAs(checkbox_txt_Scheduled, Scheduled);
		logEvent(status, "'Scheduled' text is Same as Reqs", "'Scheduled' text is not Same as Reqs");
		
		status=isSameAs(checkbox_txt_Taken, Taken);
		logEvent(status, "'Taken' text is Same as Reqs", "'Taken' text is not Same as Reqs");
		
		
		status=isSameAs(tbl_hdr_Date, Date);
		logEvent(status, "'Date' text  in table header is Same as Reqs", "'Date' text  in table header  is not Same as Reqs");
		
		status=isSameAs(tbl_hdr_EmpolyeeName, EmpolyeeName);
		logEvent(status, "'EmpolyeeName' text in table header  is Same as Reqs", "'EmpolyeeName' text in table header  is not Same as Reqs");
		
		status=isSameAs(tbl_hdr_LeaveType, LeaveType);
		logEvent(status, "'LeaveType' text in table header  is Same as Reqs", "'LeaveType' text in table header  is not Same as Reqs");
		
		status=isSameAs(tbl_hdr_LeaveBalance, LeaveBalance);
		logEvent(status, "'LeaveBalance' text in table header  is Same as Reqs", "'LeaveBalance' text in table header  is not Same as Reqs");
		
		status=isSameAs(tbl_hdr_NumberOfDays, NumberOfDays);
		logEvent(status, "'NumberOfDays' text in table header  is Same as Reqs", "'NumberOfDays' text in table header  is not Same as Reqs");
		
		status=isSameAs(tbl_hdr_Status, Status);
		logEvent(status, "'Status' text in table header  is Same as Reqs", "'Status' text  in table header  is not Same as Reqs");
		
		status=isSameAs(tbl_hdr_Comments, Comments);
		logEvent(status, "'Comments' text in table header  is Same as Reqs", "'Comments' text in table header is not Same as Reqs");
		
		status=isSameAs(tbl_hdr_Actions, Actions);
		logEvent(status, "'Actions' text in table header is Same as Reqs", "'Actions' text in table header  text is not Same as Reqs");
		
		
		status=isExist(link_OrangeHRM);
		logEvent(status, "'Orange HRM'link is displayed successfully", "'Orange HRM'link is not displayed successfully");
		
	}
	
	public static void VerifyCheckBoxes() {
		boolean status;
		for (int i = 1; i < 7; i++) {
			driver.findElement(By.xpath("//label[text()='All']/following::input[" + i + "]")).click();
			wait(3);
			
			status=clickElement(btn_search);
			//logEvent(status, "'Taken' text is Same as Reqs", "'Taken' text is not Same as Reqs");
			wait(2);
		}
		
		
		/*boolean status;
		status=selectAllElements(checkbox_For_All, Startvalue, EndValue);
		logEvent(status, "'My leave list' text is displayed successfully", "'My leave list' text is not displayed successfully");
			*/
		
	
	}
	
	public static boolean reusableMethodForCheckBoxes() {
		String a[]={"Rejected","Cancelled","Pending Approval","Scheduled","Taken"};
		List<WebElement> checkBoxPath;
		/*checkBoxPath.add(checkbox_rejected);
		checkBoxPath.add(checkbox_cancelled);
		checkBoxPath.add(checkbox_PendingApproval);
		checkBoxPath.add(checkbox_Scheduled);
		checkBoxPath.add(checkbox_Taken);*/
		
		boolean status = false;
		try {
			for (int i =0; i <5; i++) {
			   /*WebElement all= driver.findElement(By.xpath("label[text()='All']/following::input[1]"));
			   status=clickElement(all);
			   logEvent(status, "'All' check box is selected successfully", "'All' check box is not selected successfully");*/
				
				status=clickElement(checkbox_all);
				logEvent(status, "'All' check box is clicked successfully", "'All' check box is not clicked successfully");
				wait(2);
				
				/*
				driver.findElement(By.xpath("label[text()='All']/following::input["+i+"]")).click();
				System.out.println("check box is clicked successfully");
				*/
				//status=clickElement(checkBoxPath.get(i).getText());
				logEvent(status, "'search' button is clicked successfully", "search button is not clicked successfully");
				wait(2);
				
				status=clickElement(btn_search);
				logEvent(status, "'search' button is clicked successfully", "search button is not clicked successfully");
				wait(2);
				
				status=isSameAs(tbl_tbdy_Status, a[i-2]);
				logEvent(status, "search button is clicked successfully", "search button is not clicked successfully");
				
			}
		} catch (Exception e) {
			status = false;
		}

		return status;
	}
			
}
