package Training;

import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.support.ui.*;

public class JeevanAssessment {

	public static void main(String[] args) throws Exception{
		//initializing driver properties
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Vijay.Arora\\eclipse\\geckodriver\\geckodriver.exe");
		
		//intializing object for gecko driver
		WebDriver driver = new FirefoxDriver();
		
		//maximizing window
		driver.manage().window().maximize();
		
		//getting link
		String homePage = "https://www.jeevansathi.com/";
		driver.get(homePage);
		
		//initializing explicit wait 
		WebDriverWait wait = new WebDriverWait(driver, 60);
		
		//finding login and clicking it 
		wait.until(ExpectedConditions.elementToBeClickable(By.id("loginTopNavBar"))).click();
		
		//validating login button
		String loginStatus = driver.getCurrentUrl();
		if(loginStatus.equalsIgnoreCase(loginStatus))
			System.out.println("Login Button is verified");
		
		//finding register free button and clicking it 
		wait.until(ExpectedConditions.elementToBeClickable(By.id("loginRegistration"))).click();
		
		//validating register free button
		String registerStatus = driver.getCurrentUrl();
		if(registerStatus.equalsIgnoreCase(registerStatus))
			System.out.println("Register Free Button is verified");
		
		//entering email
		WebElement email = wait.until(ExpectedConditions.elementToBeClickable(By.id("email_value")));
		email.click();
		//generating random emails and sending 
		Random randomGenerator = new Random();  
		int randomInt = randomGenerator.nextInt(100000); 
		email.sendKeys("qa.automation"+randomInt+"@gmail.com");
		
		//validating email
		String emailStatus = email.getAttribute("value");
		if(emailStatus.equalsIgnoreCase(emailStatus))
			System.out.println(emailStatus+" is verified");
		
		//finding and clicking mobile number
		wait.until(ExpectedConditions.elementToBeClickable(By.id("phone_box"))).click();
		
		//entering mobile number
		WebElement mobileValue = wait.until(ExpectedConditions.elementToBeClickable(By.id("mobile_value")));		
		mobileValue.sendKeys("9555392943");
		
		//validating phone number
		String phoneStatus = mobileValue.getAttribute("value");
		if(phoneStatus.equalsIgnoreCase(phoneStatus))
			System.out.println(phoneStatus+" is verified");
		
		//finding and entering password 
		WebElement password = wait.until(ExpectedConditions.elementToBeClickable(By.id("password_value")));
		password.click();
		password.sendKeys("Vijay@test");
		
		//validating password
		String passwordStatus = password.getAttribute("value");
		if(passwordStatus.equalsIgnoreCase(passwordStatus))
			System.out.println(passwordStatus+" is verified");
		
		//finding profile
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpf_box"))).click();
		
		//creating profile for Self 
		WebElement profileSelf = wait.until(ExpectedConditions.elementToBeClickable(By.id("li_cpf0")));
		profileSelf.click();
		
		//validating selected profile
		String profileStatus = profileSelf.getText();
		if(profileStatus.equalsIgnoreCase(profileStatus))
			System.out.println(profileStatus+" profile is verified");
		
		//finding gender
		wait.until(ExpectedConditions.elementToBeClickable(By.id("gender_box"))).click();
		
		//clicking gender male
		WebElement genderMale = wait.until(ExpectedConditions.elementToBeClickable(By.id("li_gender0")));
		genderMale.click();
		
		//validating selected gender
		String genderStatus = genderMale.getText();
		if(genderStatus.equalsIgnoreCase(genderStatus))
			System.out.println(genderStatus+" gender is verified");
		
		//clicking on registerme
		wait.until(ExpectedConditions.elementToBeClickable(By.id("regPage1Submit"))).click();
		
		//validating registerme button
		String registerMeStatus = driver.getCurrentUrl();
		if(registerMeStatus.equalsIgnoreCase(registerMeStatus))
			System.out.println("Register Me Button is verified");
		
		//find groom name
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='name_box']"))).click();
		
		Thread.sleep(3000);
		
		//sending data to groom name 
		WebElement groomName = wait.until(ExpectedConditions.elementToBeClickable(By.id("name_value")));
		groomName.sendKeys("Aayush Gupta");
		
		//date of birth element 
		wait.until(ExpectedConditions.elementToBeClickable(By.id("dob_box"))).click();
		
		//clicking and selecting date
		wait.until(ExpectedConditions.elementToBeClickable(By.id("dateli3"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("monthli1"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("yearli1995"))).click();
		
		//finding mother tongue box 
		wait.until(ExpectedConditions.elementToBeClickable(By.id("mtongue_box"))).click();
		
		//selecting mother tongue
		wait.until(ExpectedConditions.elementToBeClickable(By.id("mtongue_0"))).click();
		
		//religion box selection
		wait.until(ExpectedConditions.elementToBeClickable(By.id("religion-inputBox_set"))).click();
		
		//selecting religion
		wait.until(ExpectedConditions.elementToBeClickable(By.id("religion_0"))).click();
		
		//selecting caste box
		wait.until(ExpectedConditions.elementToBeClickable(By.id("caste-inputBox_set"))).click();

		//clicking on caste option
		wait.until(ExpectedConditions.elementToBeClickable(By.id("caste_7"))).click();
		
		//manglik box selection
		wait.until(ExpectedConditions.elementToBeClickable(By.id("manglik_box"))).click();
		
		//selecting option of manglik
		wait.until(ExpectedConditions.elementToBeClickable(By.id("li_manglik0"))).click();
		
		//selecting horoscope box
		wait.until(ExpectedConditions.elementToBeClickable(By.id("horoscopeMatch_box"))).click();
		
		//selecting horoscope option
		wait.until(ExpectedConditions.elementToBeClickable(By.id("li_horoscopeMatch1"))).click();
		
		//marital status box
		wait.until(ExpectedConditions.elementToBeClickable(By.id("mstatus_box"))).click();
		
		//marital status selection
		wait.until(ExpectedConditions.elementToBeClickable(By.id("mstatus_0"))).click();
		
		//selecting height box
		wait.until(ExpectedConditions.elementToBeClickable(By.id("height_box"))).click();
		
		//selecting height
		wait.until(ExpectedConditions.elementToBeClickable(By.id("height_25"))).click();
		
		//clicking on continue button
		wait.until(ExpectedConditions.elementToBeClickable(By.id("regPage2Submit"))).click();
		
		//validating continue button
		String continueStatus = driver.getCurrentUrl();
		if(registerMeStatus.equalsIgnoreCase(continueStatus))
			System.out.println("Continue Button is verified");
		
		//country box on step 3
		wait.until(ExpectedConditions.elementToBeClickable(By.id("countryReg-inputBox_set"))).click();
		
		//selecting country as india
		wait.until(ExpectedConditions.elementToBeClickable(By.id("countryReg_0"))).click();
		
		Thread.sleep(3000);
		
		//state box on step 3
		wait.until(ExpectedConditions.elementToBeClickable(By.id("stateReg_box"))).click();
				
		//selecting state as haryana
		wait.until(ExpectedConditions.elementToBeClickable(By.id("stateReg_11"))).click();
		
		//city box on step 3
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cityReg_box"))).click();
				
		//selecting city as faridabad
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cityReg_4"))).click();
		
		//pin box on step 3
		wait.until(ExpectedConditions.elementToBeClickable(By.id("pin_box"))).click();
				
		//selecting pincode
		wait.until(ExpectedConditions.elementToBeClickable(By.id("pin_value"))).sendKeys("121001");
		
		// highest degree box
		wait.until(ExpectedConditions.elementToBeClickable(By.id("hdegree_box"))).click();
		
		//highest degree selection
		wait.until(ExpectedConditions.elementToBeClickable(By.id("hdegree_0"))).click();
		
		//employed box
		wait.until(ExpectedConditions.elementToBeClickable(By.id("employed_in-inputBox_set"))).click();
		
		//selecting employment
		wait.until(ExpectedConditions.elementToBeClickable(By.id("employed_in_0"))).click();
		
		//occupation box
		wait.until(ExpectedConditions.elementToBeClickable(By.id("occupation-inputBox_set"))).click();
		
		//selecting occupation
		wait.until(ExpectedConditions.elementToBeClickable(By.id("occupation_57"))).click();
				
		//annual income box
		wait.until(ExpectedConditions.elementToBeClickable(By.id("income_box"))).click();
		
		//selecting income
		wait.until(ExpectedConditions.elementToBeClickable(By.id("income_5"))).click();
		
		//about me box 
		wait.until(ExpectedConditions.elementToBeClickable(By.id("aboutme_box"))).click();
		
		//about me 
		wait.until(ExpectedConditions.elementToBeClickable(By.id("aboutme_value"))).sendKeys("lo r em 50. ad ah shh d s af  fj ds fhj fd sh bfs d h f ds fv fj h fd sf ds fd sf d s fs df fs df dsf ds dsf ds fds f ds fd sf ds sfd fds d sf d dfd sf s df d sdsf f gf gf gf  gf g f g f  g f  f g  gfg fg f fgk");
		
		Thread.sleep(5000);
		
		//clicking on submit button 
		wait.until(ExpectedConditions.elementToBeClickable(By.id("regPage3Submit"))).click();
		

		//validating submit button
		String submitStatus = driver.getCurrentUrl();
		if(submitStatus.equalsIgnoreCase(submitStatus))
			System.out.println("Submit Button is verified");
		
		//family type box 
		wait.until(ExpectedConditions.elementToBeClickable(By.id("familyType_box"))).click();
		
		//selecting family type
		wait.until(ExpectedConditions.elementToBeClickable(By.id("li_familyType1"))).click();
		
		//father's occupation box
		wait.until(ExpectedConditions.elementToBeClickable(By.id("fatherOccupation_box"))).click();
		
		//selecting father's occupation
		wait.until(ExpectedConditions.elementToBeClickable(By.id("fatherOccupation_2"))).click();
		
		//mother's occupation box
		wait.until(ExpectedConditions.elementToBeClickable(By.id("motherOccupation_box"))).click();
		
		//selecting mother's occupation
		wait.until(ExpectedConditions.elementToBeClickable(By.id("motherOccupation_1"))).click();
		
		//brother box
		wait.until(ExpectedConditions.elementToBeClickable(By.id("brother_box"))).click();
		
		//selecting brother info
		wait.until(ExpectedConditions.elementToBeClickable(By.id("li_brother1"))).click();
		
		//sister box
		wait.until(ExpectedConditions.elementToBeClickable(By.id("sister_box"))).click();
		
		//selecting sister info
		wait.until(ExpectedConditions.elementToBeClickable(By.id("li_sister1"))).click();
		
		//family living in box 
		wait.until(ExpectedConditions.elementToBeClickable(By.id("familyState-inputBox_set"))).click();		
		
		//family selected place
		wait.until(ExpectedConditions.elementToBeClickable(By.id("familyState_11"))).click();	
		
		//family city 
		wait.until(ExpectedConditions.elementToBeClickable(By.id("familyCity-inputBox_set"))).click();		
		
		//family selected place
		wait.until(ExpectedConditions.elementToBeClickable(By.id("familyCity_4"))).click();	
		
		//contact address box
		wait.until(ExpectedConditions.elementToBeClickable(By.id("address_box"))).click();	
		
		//contact address
		wait.until(ExpectedConditions.elementToBeClickable(By.id("address_value"))).sendKeys("df df df dd fd ffd  fd ffdf df dfd  fd  df df d fd fd ffdfd ff df df dd fd ff d");
		
		//about family
		WebElement aboutfam = wait.until(ExpectedConditions.elementToBeClickable(By.id("aboutfamily_value"))); 
		aboutfam.click();
		aboutfam.sendKeys("das sada dsa dsd sd d sadds d dsd d sd  sa dsa  dsa d sd s ds d sad  dsa d sa da d ad  da sd ");
		
		//add to profile button
		wait.until(ExpectedConditions.elementToBeClickable(By.id("regPage1Submit"))).click();
		
		//logout button cursp fontreg color5 mt6
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='cursp fontreg color5 mt6']"))).click();
		
	}

}
