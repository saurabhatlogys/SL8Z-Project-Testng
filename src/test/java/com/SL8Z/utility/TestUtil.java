package com.SL8Z.utility;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

import com.SL8Z.base.TestBase;

public class TestUtil extends TestBase{
	

	
public static void sleep(int intSeconds){
		
		try{
			Thread.sleep(1000*intSeconds);
			
		}catch(Exception e){
			
			e.printStackTrace();
		}
	}
	
	
	public static void SL8Z_Homepage(){
		
		try{
			 driver.navigate().to(config.getProperty("testSiteURL"));
			 Reporter.log("Navigated to QA Server");
				
		}catch(Exception e){
			
			e.printStackTrace();
			Assert.fail("This script is failing");
		}
	}
		
		public static void Login(){
			
			try{
				  //Click on Login Link
				  TestUtil.click("Lnk_Login");
				  Reporter.log("Clicked on Login Link");
				  //Logged as Client
				  TestUtil.setText("Txt_Username", config.getProperty("Username"));
				  TestUtil.setText("Txt_Password", config.getProperty("Password"));
				  TestUtil.click("btn_Submit");
				  Reporter.log("Clicked on submit button");
					
			}catch(Exception e){
				
				e.printStackTrace();
				Assert.fail("This script is failing");
			}
	}

		public static void Create_New_Search(String PositionTitle)
		{
			  //Click on Job Posting
			  TestUtil.click("btn_job_posting");
			  Reporter.log("Clicked on job posting button");
			  //Basic Information Tab
			  TestUtil.click("tab_basic_information");
			  Reporter.log("Clicked on Basic Information Tab");
			  // Position Title
			  TestUtil.setText("Txt_Position_Title",PositionTitle);
			  Reporter.log("Entered Postion Title");
			  // Position Metro Area
			  TestUtil.setText("Txt_Position_Metro_Area","Bangalore");
			  TestUtil.sleep(2);
			  driver.findElement(By.xpath("//input[@id='location_metro_area']")).sendKeys(Keys.DOWN);
			  // Reports to
			  TestUtil.setText("Txt_Reports_To", "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Ae");
			  Reporter.log("Entered Reports to");
			  // Internal ID
			  TestUtil.setText("Txt_Internal_Id", "098765432112");
			  Reporter.log("Entered Internal ID");
			  //New role
			  TestUtil.selectValueInDropDown("Select_New_Role", "Yes");
			  Reporter.log("Selected new role");
			  //Reason for the Position
			  TestUtil.setText("Txt_Reason_For_Position", "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor");
			  Reporter.log("Entered Reason for the Position");
			  //Job Details Tab
			  TestUtil.click("tab_job_details");
			  Reporter.log("Clicked on Job Details Tab");
			  //Function category
			  TestUtil.selectValueInDropDown("Select_Function_Category", "Technology");
			  Reporter.log("Entered Function category");
			  //Position Summary
			  driver.switchTo().frame("position_summary_ifr");
			  driver.switchTo().activeElement().sendKeys(config.getProperty("Postion_Summary"));
			  driver.switchTo().defaultContent();
			  Reporter.log("Entered Position Summary");
			  //Duties and Responsibilities
			  driver.switchTo().frame("duties_responsibilities_ifr");
			  driver.switchTo().activeElement().sendKeys(config.getProperty("Position_Duties_Responsibilities"));
			  driver.switchTo().defaultContent();
			  Reporter.log("Entered Duties and Responsibilities");
			  //Position Requirements
			  driver.switchTo().frame("position_requirements_ifr");
			  driver.switchTo().activeElement().sendKeys(config.getProperty("Requirements"));
			  driver.switchTo().defaultContent();
			  Reporter.log("Entered Position Requirements"); 
			  //Candidate Calibration Tab
			  TestUtil.click("tab_Candidate_Calibration");
			  Reporter.log("Clicked on Candidate Calibration Tab");
			  //Ideal candidate profile
			  driver.switchTo().frame("ideal_candidate_profile_ifr");
			  driver.switchTo().activeElement().sendKeys(config.getProperty("Ideal_Candidate_profile"));
			  driver.switchTo().defaultContent();
			  Reporter.log("Entered Ideal candidate profile");
			  //Target Companies
			  driver.findElement(By.xpath("//input[@id='targetCompany_1']")).sendKeys(config.getProperty("Target_Company"));
			  Reporter.log("Entered Target Company");
			  driver.findElement(By.xpath("//span/button")).click();
			  driver.findElement(By.xpath("//input[@id='targetCompany_2']")).sendKeys(config.getProperty("Target_Company"));
			  Reporter.log("Entered Target Company 1");
			  driver.findElement(By.xpath("//span/button")).click();
			  driver.findElement(By.xpath("//input[@id='targetCompany_3']")).sendKeys(config.getProperty("Target_Company"));
			  Reporter.log("Entered Target Company 2");
			  //Do not Contact Companies
			  driver.findElement(By.xpath("//input[@id='doNotContactCompany_1']")).sendKeys(config.getProperty("Target_Company"));
			  Reporter.log("Entered Do not Contact Company");
			  driver.findElement(By.xpath("//fieldset[3]/div/div/div/span/button")).click();
			  driver.findElement(By.xpath("//input[@id='doNotContactCompany_2']")).sendKeys(config.getProperty("Target_Company"));
			  Reporter.log("Entered Do not Contact Company 1");
			  driver.findElement(By.xpath("//fieldset[3]/div/div/div/span/button")).click();
			  driver.findElement(By.xpath("//input[@id='doNotContactCompany_3']")).sendKeys(config.getProperty("Target_Company"));
			  Reporter.log("Entered Do not Contact Company 2");
			  //Corporate Culture Tab
			  driver.findElement(By.xpath("//a[@id='ui-id-5']")).click();
			  Reporter.log("Clicked on Corporate Culture Tab");
			  // Corporate Culture and Team Fit
			  Select Corporate_Culture=new Select(driver.findElement(By.xpath("//select[@id='corporation_culture']")));
			  Corporate_Culture.selectByVisibleText("Dependable–focus on process, slow to change");
			  Reporter.log("Selected Corporate Culture and Team Fit");
			  //Detail culture description
			  driver.switchTo().frame("unique_corporation_aspects_ifr");
			  driver.switchTo().activeElement().sendKeys(config.getProperty("Corporate_Culture_Description"));
			  driver.switchTo().defaultContent();
			  Reporter.log("Entered Detail culture description"); 
			  //Hiring Manager information
			  driver.switchTo().frame("hiring_manager_info_ifr");
			  driver.switchTo().activeElement().sendKeys(config.getProperty("Hiring_Manager_information"));
			  driver.switchTo().defaultContent();
			  Reporter.log("Entered Hiring Manager information");
			  //Selling Points Tab
			  driver.findElement(By.xpath("//a[@id='ui-id-6']")).click();
			  Reporter.log("Clicked on Selling Points Tab");
			  // Selling Points
			  driver.findElement(By.xpath("//input[@id='sellingPoint_1']")).sendKeys(config.getProperty("Selling_Point"));
			  Reporter.log("Entered Selling Point 1");
			  driver.findElement(By.xpath("//input[@id='sellingPoint_2']")).sendKeys(config.getProperty("Selling_Point"));
			  Reporter.log("Entered Selling Point 2");
			  driver.findElement(By.xpath("//input[@id='sellingPoint_3']")).sendKeys(config.getProperty("Selling_Point"));
			  Reporter.log("Entered Selling Point 3");
			  driver.findElement(By.xpath("//fieldset/div/div/span/button")).click();
			  driver.findElement(By.xpath("//input[@id='sellingPoint_4']")).sendKeys(config.getProperty("Selling_Point"));
			  Reporter.log("Entered Selling Point 4");
			  driver.findElement(By.xpath("//fieldset/div/div/span/button")).click();
			  driver.findElement(By.xpath("//input[@id='sellingPoint_5']")).sendKeys(config.getProperty("Selling_Point")); 
			  Reporter.log("Entered Selling Point 5");
			  //Comments
			  driver.switchTo().frame("comments_ifr");
			  driver.switchTo().activeElement().sendKeys(config.getProperty("Comments"));
			  driver.switchTo().defaultContent();
			  Reporter.log("Entered Comments/Other Information");
			  //Compensation Tab 
			  driver.findElement(By.xpath("//a[@id='ui-id-7']")).click();
			  Reporter.log("Clicked on Compensation Tab"); 
			  //Min Base salary
			  driver.findElement(By.xpath("//input[@id='min_base_salary']")).sendKeys(config.getProperty("MinSal"));
			  Reporter.log("Entered Min Base salary");
		      //Max Base salary
			  driver.findElement(By.xpath("//input[@id='max_base_salary']")).sendKeys(config.getProperty("MaxSal"));
			  Reporter.log("Entered Max Base salary"); 
			  //Bonus %
			  driver.findElement(By.xpath("//input[@id='bonus_percentage']")).sendKeys(config.getProperty("Bonus"));
			  Reporter.log("Entered Bonus %");
			  //Other compensation details
			  driver.findElement(By.xpath("//textarea[@id='other_company_info']")).sendKeys(config.getProperty("Other_Comp_Info"));
			  Reporter.log("Entered Other compensation details");
			  //Health Insurace
			  driver.findElement(By.xpath("//textarea[@id='health_insurance']")).sendKeys(config.getProperty("Other_Comp_Info"));
			  Reporter.log("Entered Health Insurace Details");
			  //Other benefit details
			  driver.findElement(By.xpath("//textarea[@id='other_benefit_info']")).sendKeys(config.getProperty("Other_Comp_Info"));
			  Reporter.log("Entered Other benefit details");
			  // Set Your Fee Tab
			  driver.findElement(By.xpath("//a[@id='ui-id-8']")).click();
			  Reporter.log("Clicked on Set Your Fee Tab");
			  driver.findElement(By.xpath("//input[@id='placement_fees']")).sendKeys(config.getProperty("Placement_Fee"));
			  //Activate Search Tab
			  driver.findElement(By.xpath("//a[@id='ui-id-9']")).click();
			  Reporter.log("Clicked on Activate Search Tab");
			  driver.findElement(By.xpath("//div[3]/div/div/span/button")).click();
			  Reporter.log("Clicked on Activate Search Button");
			  TestUtil.sleep(2);
			  driver.findElement(By.xpath("//div[5]/div/form/div/div[2]/div[2]/div/span/button")).click();
			  TestUtil.sleep(4);
		}
	
	
	public static boolean isSkip(String testCase){
		
		for(int i=2; i<=datatable.getRowCount("Test Cases"); i++){
			
			if(datatable.getCellData("Test Cases", "Test Cases", i).equalsIgnoreCase(testCase)){
				
				if(datatable.getCellData("Test Cases", "Runmode", i).equalsIgnoreCase("Y")){
					
					return false;
					
				}else{
					
					return true;
				}
				
			}else{
				
				continue;
			}
		}
		
		return true;
	}
	
	
	
	
	public static boolean isElementPresent(String xpathKey){
		
		try{
			WebElement webElement = getObject(xpathKey);
			if(!(webElement == null)){
				
				return true;
				
			}else{
				
				return false;
			}
			
		}catch(Exception e){
			
			e.printStackTrace();
			return false;
		}
	}
	
	
	
	
	
	public static boolean click(String xpathKey){
		
		try{
			boolean blnElementPresent;
			
			// Check the element currently present or not 
			blnElementPresent = isElementPresent(xpathKey);
			
			if((blnElementPresent==true)){
				
				getObject(xpathKey).click();
				return true;
				
			}else{
				
				return false;
			}
			
			
		}catch(Exception e){
			
			e.printStackTrace();
			return false;
		}
	}
		
		
	
	public static boolean setText(String xpathKey, String value){
		
		try{
			boolean blnElementPresent;
            blnElementPresent = isElementPresent(xpathKey);
            if(blnElementPresent==true){
            	
            	//If this element is a text entry element, this will clear the value
                getObject(xpathKey).clear();
                //Typing into an element, which may set its value
                getObject(xpathKey).sendKeys(value);                          
                return true;
                
            }else{
            	
            	return false;
            }
			
		}catch(Exception e){
			
			e.printStackTrace();
			return false;
		}
	}
	
	
	
	
	
	public static boolean isTextPresent(String value){
		
		sleep(1);
	    return driver.getPageSource().contains(value);
	}
	
	
public static boolean selectValueInDropDown(String xpathKey, String value){
		
		try{
			Select element = new Select(getObject(xpathKey));
			element.selectByVisibleText(value);
			return true;
			
		}catch(Exception e){
			
			e.printStackTrace();
			return false;
		}
	}
	
public static Object[][] getData(String sheetName){
	
	// return and read test data from excel
	int rows = datatable.getRowCount(sheetName)-1;
	if(rows <=0){
		
		Object[][] testData = new Object[1][0];
		return testData;
	}
	
	rows = datatable.getRowCount(sheetName);
	int cols = datatable.getColumnCount(sheetName);
	
	Object data[][] = new Object[rows-1][cols];
	
	for(int rowNum=2; rowNum<=rows; rowNum++){
		
		for(int colNum=0; colNum<cols; colNum++){
			
			data[rowNum-2][colNum] = datatable.getCellData(sheetName, colNum, rowNum);
		}
	}
	
	return data;
}
	
}

