package com.tm.ScreenPages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.tm.Libraries.Weblibrary;

public class ReusableClass extends Weblibrary{
	
	public void headerVerification(){
		boolean status;
		
		String [] data={"Date", "Employee Name", "Leave Type", "Leave Balance (Days)", "Number of Days", "Status","Comments", "Actions" };
		ArrayList<String> list = new ArrayList<String>();
		List<WebElement> column = driver.findElements(By.xpath("//table[@id='resultTable']/thead/tr/th"));
		int columncunt = column.size();
		  
		//System.out.println("No of columns in the table :" + columncunt);

		for (int i = 1; i <= columncunt; i++) {
			WebElement header = driver.findElement(By.xpath("//table[@id='resultTable']/thead/tr/th[" + i + "]"));
			String b = header.getText();
			list.add(b);
			if (data[i-1].equals(list.get(i - 1)))
				System.out.println("both " +"'"+ data[i-1] +"'"+ " in our req  and " +"'"+ list.get(i - 1) +"'"+" in table are same");
			else
				System.out.println("both "+ "'"+ data[i-1] +"'"+ " in our req and "+"'" + list.get(i - 1) +"'"+ " in table are not same");

		}	
		
	}
	
	
	

}
