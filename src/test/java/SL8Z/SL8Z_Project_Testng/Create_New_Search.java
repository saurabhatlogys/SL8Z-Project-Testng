package SL8Z.SL8Z_Project_Testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Create_New_Search {
	
	WebDriver driver;
	Select selectBox;
	Select selectBox1;
	String Postion_Summary = "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. Donec pede justo, fringilla vel, aliquet nec, vulputate eget, arcu. In enim justo, rhoncus ut, imperdiet a, venenatis vitae, justo. Nullam dictum felis eu pede mollis pretium. Integer tincidunt. Cras dapibus. Vivamus elementum semper nisi. Aenean vulputate eleifend tellus. Aenean leo ligula, porttitor eu, consequat vitae, eleifend ac, enim. Aliquam lorem ante, dapibus in, viverra quis, feugiat a, tellus. Phasellus viverra nulla ut metus varius laoreet. Quisque rutrum. Aenean imperdiet. Etiam ultricies nisi vel augue. Curabitur ullamcorper ultricies nisi. Nam eget dui. Etiam rhoncus. Maecenas tempus, tellus eget condimentum rhoncus, sem quam semper libero, sit amet adipiscing sem neque sed ipsum. Nam quam nunc, blandit vel, luctus pulvinar, hendrerit id, lorem. Maecenas nec odio et ante tincidunt tempus. Donec vitae sapien ut libero venenatis faucibus. Nullam quis ante. Etiam sit amet orci eget eros faucibus tincidunt. Duis leo. Sed fringilla mauris sit amet nibh. Donec sodales sagittis magna. Sed consequat, leo eget bibendum sodales, augue velit cursus nunc, quis gravida magna mi a libero. Fusce vulputate eleifend sapien. Vestibulum purus quam, scelerisque ut, mollis sed, nonummy id, metus. Nullam accumsan lorem in dui. Cras ultricies mi eu turpis hendrerit fringilla. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; In ac dui quis mi consectetuer lacinia. Nam pretium turpis et arcu. Duis arcu tortor, suscipit eget, imperdiet nec, imperdiet iaculis, ipsum. Sed aliquam ultrices mauris. Integer ante arcu, accumsan a, consectetuer eget, posuere ut, mauris. Praesent adipiscing. Phasellus ullamcorper ipsum rutrum nunc. Nunc nonummy metus. Vestib";
    String Position_Duties_Responsibilities = "Far far away, behind the word mountains, e of blind text by the name of Lorem Ipsum decided to leave for the far World of Grammar.  and again. lia. It is a paradisematic country, in which roasted parts of sentences fly into your mouth. Even the all-powerful Pointing has no control about the blind texts it is an almost unorthographic life One day however a small line of blind text by the name of Lorem Ipsum decided to leave for the far World of Grammar. The Big Oxmox advised her not to do so, because there were thousands of bad Commas, wild Question Marks and devious Semikoli, but the Little Blind Text didn’t listen. She packed her seven versalia, put her initial into the belt and made herself on the way. When she reached the first hills of the Italic Mountains, she had a last view back on the skyline of her hometown Bookmarksgrove, the headline of Alphabet Village and the subline of her own road, the Line Lane. Pityful a rethoric question ran over her cheek, then she continued her way. On her way she met a copy. The copy wa";
    String Requirements= "Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts. Separated they live in Bookmarksgrove right at the coast of the Semantics, a large language ocean. A small river named Duden flows by their place and supplies it with the necessary regelialia. It is a paradisematic country, in which roasted parts of sentences fly into your mouth. Even the all-powerful Pointing has no control about the blind texts it is an almost unorthographic life One day however a small line of blind text by the name of Lorem Ipsum decided to leave for the far World of Grammar. The Big Oxmox advised her not to do so, because there were thousands of bad Commas, wild Question Marks and devious Semikoli, but the Little Blind Text didn’t listen. She packed her seven versalia, put her initial into the belt and made herself on the way. When she reached the first hills of the Italic Mountains, she had a last view back on the skyline of her hometown Bookmarksgrove, the headline of Alphabet Village and the subline of her own road, the Line Lane. Pityful a rethoric question ran over her cheek, then she continued her way. On her way she met a copy. The copy warned the Little Blind Text, that where it came from it would have been rewritten a thousand times and everything that was left from its origin would be the word and and the Little Blind Text should turn around and return to its own, safe country. But nothing the copy said could convince her and so it didn’t take long until a few insidious Copy Writers ambushed her, made her drunk with Longe and Parole and dragged her into their agency, where they abused her for their projects again and again. And if she hasn’t been rewritten, then they are still using her. Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts. Separated they live in Bookmarksgrove right at the coast of the Semantics, a large language ocean. A small river named Duden flows by their place and supplies it with the necessary regelialia. It is a paradisematic country, in which roasted parts of sentences fly into your mouth. Even the all-powerful Pointing has no control about the blind texts it is an almost unorthographic life One day however a small line of blind text by the name of Lorem Ipsum decided to leave for the far World of Grammar. ";
    String Ideal_Candidate_profile="But I must explain to you how all this mistaken idea of denouncing pleasure and praising pain was born and I will give you a complete account of the system, and expound the actual teachings of the great explorer of the truth, the master-builder of human happiness. No one rejects, dislikes, or avoids pleasure itself, because it is pleasure, but because those who do not know how to pursue pleasure rationally encounter consequences that are extremely painful. Nor again is there anyone who loves or pursues or desires to obtain pain of itself, because it is pain, but because occasionally circumstances occur in which toil and pain can procure him some great pleasure. To take a trivial example, which of us ever undertakes laborious physical exercise, except to obtain some advantage from it? But who has any right to find fault with a man who chooses to enjoy a pleasure that has no annoying consequences, or one who avoids a pain that produces no resultant pleasure? On the other hand, we denounce with righteous indignation and dislike men who are so beguiled and demoralized by the charms of pleasure of the moment, so blinded by desire, that they cannot foresee the pain and trouble that are bound to ensue; and equal blame belongs to those who fail in their duty through weakness of will, which is the same as saying through shrinking from toil and pain. These cases are perfectly simple and easy to distinguish. In a free hour, when our power of choice is untrammelled and when nothing prevents our being able to do what we like best, every pleasure is to be welcomed and every pain avoided. But in certain circumstances and owing to the claims of duty or the obligations of business it will frequently occur that pleasures have to be repudiated and annoyances accepted. The wise man therefore always holds in these matters to this principle of selection: he rejects pleasures to secure other greater pleasures, or else he endures pains to avoid worse pains. But I must explain to you how all this mistaken idea of denouncing pleasure and praising pain was born and I will give you a complete account of the system, and expound the actual teachings of the great explorer of the truth, the master-builder of human happiness. No one rejects, dislikes, or avoids pleasure itself, because it is pleasure, but because those who do not know how to pursue pleasure rationally encounter consequences that are extremely painful. Nor again is there anyone who loves or pursues or desires to obtain pai";
    String Target_Company="But I must explain to you how all this mistak";
    String Corporate_Culture_Description="But I must explain to you how all this mistaken idea of denouncing pleasure and praising pain was born and I will give you a complete account of the system, and expound the actual teachings of the great explorer of the truth, the master-builder of human happiness. No one rejects, dislikes, or avoids pleasure itself, because it is pleasure, but because those who do not know how to pursue pleasure rationally encounter consequences that are extremely painful. Nor again is there anyone who loves or pursues or desires to obtain pain of itself, because it is pain, but because occasionally circumstances occur in which toil and pain can procure him some great pleasure. To take a trivial example, which of us ever undertakes laborious physical exercise, except to obtain some advantage from it? But who has any right to find fault with a man who chooses to enjoy a pleasure that has no annoying consequences, or one who avoids a pain that produces no resultant pleasure? On the other hand, we denounce with righteous indignation and dislike men who are so beguiled and demoralized by the charms of pleasure of the moment, so blinded by desire, that they cannot foresee the pain and trouble that are bound to ensue; and equal blame belongs to those who fail in their duty through weakness of will, which is the same as saying through shrinking from toil and pain. These cases are perfectly simple and easy to distinguish. In a free hour, when our power of choice is untrammelled and when nothing preve";
    String Hiring_Manager_information="But I must explain to you how all this mistaken idea of denouncing pleasure and praising pain was born and I will give you a complete account of the system, and expound the actual teachings of the great explorer of the truth, the master-builder of human happiness. No one rejects, dislikes, or avoids pleasure itself, because it is pleasure, but because those who do not know how to pursue pleasure rationally encounter consequences that are extremely painful. Nor again is there anyone who loves or pursues or desires to obtain pain of itself, because it is pain, but because occasionally circumstances occur in which toil and pain can procure him some great pleasure. To take a trivial example, which of us ever undertakes laborious physical exercise, except to obtain some advantage from it? But who has any right to find fault with a man who chooses to enjoy a pleasure that has no annoying consequences, or one who avoids a pain that produces no resultant pleasure? On the other hand, we denounce with righteous indignation and dislike men who are so beguiled and demoralized by the charms of pleasure of the moment, so blinded by desire, that they cannot foresee the pain and trouble that are bound to ensue; and equal blame belongs to those who fail in their duty through weakness of will, which is the same as saying through shrinking from toil and pain. These cases are perfectly simple and easy to distinguish. In a free hour, when our power of choice is untrammelled and when nothing preve";
    String Selling_Point="But I must explain to you how all this mistaken idea of denouncing pleasure and praising pain was born and I will give you a complete accoun";
    String Comments="But I must explain to you how all this mistaken idea of denouncing pleasure and praising pain was born and I will give you a complete account of the system, and expound the actual teachings of the great explorer of the truth, the master-builder of human happiness. No one rejects, dislikes, or avoids pleasure itself, because it is pleasure, but because those who do not know how to pursue pleasure rationally encounter consequences that are extremely painful. Nor again is there anyone who loves or pursues or desires to obtain pain of itself, because it is pain, but because occasionally circumstances occur in which toil and pain can procure him some great pleasure. To take a trivial example, which of us ever undertakes laborious physical exerci";
    String MinSal="1234567890";
    String MaxSal="9876543210";
    String Bonus="100";
    String Other_Comp_Info="But I must explain to you how all this mistaken idea of denouncing pleasure and praising pain was born and I will give you a complete account of the system, and expound the actual teachings of the great explorer of the truth, the master-builder of human happiness. No one rejects, dislikes, or avoids pleasure itself, because it is pleasure, but because those who do not know how to pursue pleasure rationally encounter consequences that are extremely painful. Nor again is there anyone who loves or.";
    String Placement_Fee="24000";
    @Test
      public void Login() {
	  try
	  {
	  //Click on Login Link
	  driver.findElement(By.xpath("//div[@id='top-elements']/div[4]/div/div/a/span")).click();
	  Reporter.log("Clicked on Login Link");
	  //Logged as Client
	  driver.findElement(By.xpath("//input[@id='email']")).sendKeys("saurabh@atlogys.com");
	  driver.findElement(By.xpath("//input[@id='password']")).sendKeys("qatester");
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  Reporter.log("Clicked on submit button");
	  //Click on Job Posting
	  driver.findElement(By.xpath("//button[@type='button']")).click();
	  Reporter.log("Clicked on job posting button");
	  //Tab 2nd
	  driver.findElement(By.xpath("//a[@id='ui-id-2']")).click();
	  Reporter.log("Clicked on Basic Information Tab");
	  // Position Title
	  driver.findElement(By.xpath("//input[@id='title']")).sendKeys("Test Automated Post 10");
	  Reporter.log("Entered Postion Title");
	  // Position Metro Area 
	  //driver.findElement(By.xpath("//input[@id='location_metro_area']")).sendKeys("ban");
	  Thread.sleep(8000);
	  driver.findElement(By.xpath("//input[@id='location_metro_area']")).click();
	  // Reports to
	  driver.findElement(By.xpath("	//input[@id='reports_to']")).sendKeys("Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Ae");
	  Reporter.log("Entered Reports to");
	  // Internal ID
	  driver.findElement(By.xpath(" //input[@id='internal_id']")).sendKeys("098765432112");
	  Reporter.log("Entered Internal ID");
	  //New role
	  selectBox = new Select(driver.findElement(By.xpath("//select[@id='new_role']")));
	  driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
	  selectBox.selectByVisibleText("Yes");
	  Reporter.log("Selected new role");
	  //Reason for the Position
	  driver.findElement(By.xpath("//input[@id='reason_for_opening']")).sendKeys("Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor");
	  Reporter.log("Entered Reason for the Position");
	  //Job Details Tab
	  driver.findElement(By.xpath("//a[@id='ui-id-3']")).click();
	  Reporter.log("Clicked on Job Details Tab");
	  //Function category
	  selectBox1 = new Select(driver.findElement(By.xpath("//select[@id='function_category']")));
	  selectBox1.selectByVisibleText("Technology");
	  Reporter.log("Entered Function category"); 
	  Thread.sleep(3000);
	  //Position Summary
	  driver.switchTo().frame("position_summary_ifr");
	  driver.switchTo().activeElement().sendKeys(Postion_Summary);
	  driver.switchTo().defaultContent();
	  Reporter.log("Entered Position Summary");
	  //Duties and Responsibilities
	  driver.switchTo().frame("duties_responsibilities_ifr");
	  driver.switchTo().activeElement().sendKeys(Position_Duties_Responsibilities);
	  driver.switchTo().defaultContent();
	  Reporter.log("Entered Duties and Responsibilities");
	  //Position Requirements
	  driver.switchTo().frame("position_requirements_ifr");
	  driver.switchTo().activeElement().sendKeys(Requirements);
	  driver.switchTo().defaultContent();
	  Reporter.log("Entered Position Requirements"); 
	  //Candidate Calibration Tab
	  driver.findElement(By.xpath("//a[@id='ui-id-4']")).click();
	  Reporter.log("Clicked on Candidate Calibration Tab");
	  //Ideal candidate profile
	  driver.switchTo().frame("ideal_candidate_profile_ifr");
	  driver.switchTo().activeElement().sendKeys(Ideal_Candidate_profile);
	  driver.switchTo().defaultContent();
	  Reporter.log("Entered Ideal candidate profile");
	  //Target Companies
	  driver.findElement(By.xpath("//input[@id='targetCompany_1']")).sendKeys(Target_Company);
	  Reporter.log("Entered Target Company");
	  driver.findElement(By.xpath("//span/button")).click();
	  driver.findElement(By.xpath("//input[@id='targetCompany_2']")).sendKeys(Target_Company);
	  Reporter.log("Entered Target Company 1");
	  driver.findElement(By.xpath("//span/button")).click();
	  driver.findElement(By.xpath("//input[@id='targetCompany_3']")).sendKeys(Target_Company);
	  Reporter.log("Entered Target Company 2");
	  //Do not Contact Companies
	  driver.findElement(By.xpath("//input[@id='doNotContactCompany_1']")).sendKeys(Target_Company);
	  Reporter.log("Entered Do not Contact Company");
	  driver.findElement(By.xpath("//fieldset[3]/div/div/div/span/button")).click();
	  driver.findElement(By.xpath("//input[@id='doNotContactCompany_2']")).sendKeys(Target_Company);
	  Reporter.log("Entered Do not Contact Company 1");
	  driver.findElement(By.xpath("//fieldset[3]/div/div/div/span/button")).click();
	  driver.findElement(By.xpath("//input[@id='doNotContactCompany_3']")).sendKeys(Target_Company);
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
	  driver.switchTo().activeElement().sendKeys(Corporate_Culture_Description);
	  driver.switchTo().defaultContent();
	  Reporter.log("Entered Detail culture description"); 
	  //Hiring Manager information
	  driver.switchTo().frame("hiring_manager_info_ifr");
	  driver.switchTo().activeElement().sendKeys(Hiring_Manager_information);
	  driver.switchTo().defaultContent();
	  Reporter.log("Entered Hiring Manager information");
	  //Selling Points Tab
	  driver.findElement(By.xpath("//a[@id='ui-id-6']")).click();
	  Reporter.log("Clicked on Selling Points Tab");
	  // Selling Points
	  driver.findElement(By.xpath("//input[@id='sellingPoint_1']")).sendKeys(Selling_Point);
	  Reporter.log("Entered Selling Point 1");
	  driver.findElement(By.xpath("//input[@id='sellingPoint_2']")).sendKeys(Selling_Point);
	  Reporter.log("Entered Selling Point 2");
	  driver.findElement(By.xpath("//input[@id='sellingPoint_3']")).sendKeys(Selling_Point);
	  Reporter.log("Entered Selling Point 3");
	  driver.findElement(By.xpath("//fieldset/div/div/span/button")).click();
	  driver.findElement(By.xpath("//input[@id='sellingPoint_4']")).sendKeys(Selling_Point);
	  Reporter.log("Entered Selling Point 4");
	  driver.findElement(By.xpath("//fieldset/div/div/span/button")).click();
	  driver.findElement(By.xpath("//input[@id='sellingPoint_5']")).sendKeys(Selling_Point); 
	  Reporter.log("Entered Selling Point 5");
	  //Comments
	  driver.switchTo().frame("comments_ifr");
	  driver.switchTo().activeElement().sendKeys(Comments);
	  driver.switchTo().defaultContent();
	  Reporter.log("Entered Comments/Other Information");
	  //Compensation Tab 
	  driver.findElement(By.xpath("//a[@id='ui-id-7']")).click();
	  Reporter.log("Clicked on Compensation Tab"); 
	  //Min Base salary
	  driver.findElement(By.xpath("//input[@id='min_base_salary']")).sendKeys(MinSal);
	  Reporter.log("Entered Min Base salary");
      //Max Base salary
	  driver.findElement(By.xpath("//input[@id='max_base_salary']")).sendKeys(MaxSal);
	  Reporter.log("Entered Max Base salary"); 
	  //Bonus %
	  driver.findElement(By.xpath("//input[@id='bonus_percentage']")).sendKeys(Bonus);
	  Reporter.log("Entered Bonus %");
	  //Other compensation details
	  driver.findElement(By.xpath("//textarea[@id='other_company_info']")).sendKeys(Other_Comp_Info);
	  Reporter.log("Entered Other compensation details");
	  //Health Insurace
	  driver.findElement(By.xpath("//textarea[@id='health_insurance']")).sendKeys(Other_Comp_Info);
	  Reporter.log("Entered Health Insurace Details");
	  //Other benefit details
	  driver.findElement(By.xpath("//textarea[@id='other_benefit_info']")).sendKeys(Other_Comp_Info);
	  Reporter.log("Entered Other benefit details");
	  // Set Your Fee Tab
	  driver.findElement(By.xpath("//a[@id='ui-id-8']")).click();
	  Reporter.log("Clicked on Set Your Fee Tab");
	  driver.findElement(By.xpath("//input[@id='placement_fees']")).sendKeys(Placement_Fee);
	  //Activate Search Tab
	  driver.findElement(By.xpath("//a[@id='ui-id-9']")).click();
	  Reporter.log("Clicked on Activate Search Tab");
	  driver.findElement(By.xpath("//div[3]/div/div/span/button")).click();
	  Reporter.log("Clicked on Activate Search Button"); 
	  Thread.sleep(8000);
	  }
  
	  catch(Exception ex)
	  {
		  
	  }
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chrome\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.navigate().to("http://ec2-54-237-74-229.compute-1.amazonaws.com");
	  Reporter.log("Navigated to QA Server");
  }

  @AfterTest
  public void afterTest() {
	  driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	  driver.close();
  }

}
