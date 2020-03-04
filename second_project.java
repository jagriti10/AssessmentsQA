package second;

import java.awt.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class second_project {

	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pradeep.kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jeevansathi.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver, 20);
		
		//ACCOUNT DETAILS
		
		
		driver.findElement(By.id("register_button")).click();
		
		String expectedurl="https://www.jeevansathi.com/profile/registration_new.php?source=gnb_mini";
		String currenturl=driver.getCurrentUrl();
		if(expectedurl.equalsIgnoreCase(currenturl)) {
			System.out.println("Redirected to the Account Details Page");
		}
		else {
			System.out.println("Redirecting went wrong");
		}
		
		Random RG = new Random();  
		int Rnumber=RG.nextInt(1000);
		
		String currentheader1=driver.findElement(By.xpath("//*[@id=\"mainRegContent\"]/div[2]/div/div[1]")).getText();
		String expectedheader1="Welcome! Let's start your partner search with this Sign up.";
		if(expectedheader1.equalsIgnoreCase(currentheader1)) {
			System.out.println("Header Matched");
		}
		else {
			System.out.println("Header does not match");
		}
		
		driver.findElement(By.id("email_value")).click();
		driver.findElement(By.id("email_value")).sendKeys("something"+Rnumber+"@gmail.com");
		String email = driver.findElement(By.id("email_value")).getAttribute("value");
		System.out.println("**********************************"+email+"***************************");
		
		driver.findElement(By.xpath("//*[@id=\"phone_box\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"mobile_value\"]")).sendKeys("7511546235");
		String mobile= driver.findElement(By.id("mobile_value")).getAttribute("value");
		System.out.println("**********************************"+mobile+"***************************");
		
		driver.findElement(By.xpath("//*[@id=\"password_value\"]")).click();
		driver.findElement(By.id("password_value")).sendKeys("password@1");
		
		driver.findElement(By.xpath("//*[@id=\"cpf_box\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"li_cpf0\"]")).click();
		String cpf=driver.findElement(By.xpath("//*[@id=\"li_cpf0\"]")).getText();
		System.out.println("Creating Profile for "+cpf);
		
		driver.findElement(By.xpath("//*[@id=\"gender_label\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"li_gender0\"]")).click();
		String gender=driver.findElement(By.id("li_gender0")).getText();
		System.out.println("Your gender is "+gender);
		
		driver.findElement(By.xpath("//*[@id=\"regPage1Submit\"]")).click();
		
		//PROFILE DETAILS
		
//		expectedurl="https://www.jeevansathi.com/register/page2#register";
//		currenturl=driver.getCurrentUrl();
//		System.out.println(currenturl);
//		if(expectedurl.equalsIgnoreCase(currenturl)) {
//			System.out.println("Redirected to the Profile Details Page");
//		}
//		else {
//			System.out.println("Redirecting went wrong");
//		}
		
		String currentheader2=driver.findElement(By.xpath("/html/body/div[2]/div[5]/div[2]/div[1]/div[1]")).getText();
		String expectedheader2="Hi! You are joining the Best Matchmaking Experience.";
		System.out.println(currentheader2);
		if(expectedheader2.equalsIgnoreCase(currentheader2)) {
			System.out.println("Header Matched");
		}
		else {
			System.out.println("Header does not match");
		}
		
		driver.findElement(By.xpath("//*[@id=\"name_label\"]")).click();
		driver.findElement(By.id("name_value")).sendKeys("Pradeep Kumar");
		String name = driver.findElement(By.id("name_value")).getAttribute("value");
		System.out.println("The entered name is "+name);
		
		driver.findElement(By.xpath("//*[@id=\"dob_box\"]")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("dateli14"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("monthli11"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("yearli1998"))).click();
		String date = driver.findElement(By.id("date_value")).getAttribute("value");
		String month = driver.findElement(By.id("month_value")).getAttribute("value");
		String year = driver.findElement(By.id("year_value")).getAttribute("value");
		System.out.println("Your Date of Birth is "+date+"-"+month+"-"+year);
				
		WebElement mtongue=driver.findElement(By.xpath("//*[@id=\"mtongue-inputBox_set\"]"));
		mtongue.click();
		mtongue.sendKeys("Tel");
		mtongue.sendKeys(Keys.ENTER);
		String mlang = driver.findElement(By.xpath("//*[@id=\"mtongue-inputBox_set\"]")).getAttribute("value");
		System.out.println("Your mother language is "+mlang);

		WebElement religion=driver.findElement(By.xpath("//*[@id=\"religion-inputBox_set\"]"));
		religion.click();
		religion.sendKeys("Hindu");
		religion.sendKeys(Keys.ENTER);
		String reli = driver.findElement(By.xpath("//*[@id=\"religion-inputBox_set\"]")).getAttribute("value");
		System.out.println("Your religion is "+reli);
		
		WebElement caste=driver.findElement(By.xpath("//*[@id=\"caste-inputBox_set\"]"));
		caste.click();
		caste.sendKeys("Padmashali");
		caste.sendKeys(Keys.ENTER);
		String cast = driver.findElement(By.xpath("//*[@id=\"caste-inputBox_set\"]")).getAttribute("value");
		System.out.println("Your caste is "+cast);
		
		WebElement subcaste=driver.findElement(By.xpath("//*[@id=\"subcaste-inputBox_set\"]"));
		subcaste.click();
		subcaste.sendKeys("Kar");
		subcaste.sendKeys(Keys.ENTER);
		String scaste = driver.findElement(By.xpath("//*[@id=\"subcaste-inputBox_set\"]")).getAttribute("value");
		System.out.println("Your subcaste is "+scaste);
		
		driver.findElement(By.xpath("//*[@id=\"manglik_box\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"li_manglik1\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"horoscopeMatch_box\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"li_horoscopeMatch1\"]")).click();
		String horo=driver.findElement(By.id("li_horoscopeMatch1")).getText();
		System.out.println("Horoscope Matching is "+horo);
		
		driver.findElement(By.xpath("//*[@id=\"mstatus_box\"]")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("mstatus_0"))).click();
		String mstatus = driver.findElement(By.xpath("//*[@id=\"mstatus_box\"]")).getText();
		System.out.println("You have selected for "+mstatus);
		
		driver.findElement(By.xpath("//*[@id=\"height_box\"]")).click();
		driver.findElement(By.id("height_31")).click();
		String height = driver.findElement(By.xpath("//*[@id=\"height_box\"]")).getText();
		System.out.println("This is your "+height);
//		height=driver.findElement(By.id("height_31")).getText();
//		System.out.println("Your height is "+height);
		
		driver.findElement(By.id("regPage2Submit")).click();
		

		//CAREER DETAILS
		
		String currentheader3=driver.findElement(By.xpath("//*[@id=\"mainRegContent\"]/div[2]/div/div[5]")).getText();
		String expectedheader3="Great! You are about to complete your Jeevansathi profile.";
		System.out.println(currentheader3);
		if(expectedheader3.equalsIgnoreCase(currentheader3)) {
			System.out.println("Header Matched");
		}
		else {
			System.out.println("Header does not match");
		}
		
		WebElement country=driver.findElement(By.xpath("//*[@id=\"countryReg-inputBox_set\"]"));
		country.click();
		country.sendKeys("India");
		country.sendKeys(Keys.ENTER);

		WebElement state=driver.findElement(By.xpath("//*[@id=\"stateReg-inputBox_set\"]"));
		state.click();
		state.sendKeys("Andhra");
		state.sendKeys(Keys.ENTER);

		WebElement city=driver.findElement(By.xpath("//*[@id=\"cityReg-inputBox_set\"]"));
		city.click();
		city.sendKeys("Vis");
		city.sendKeys(Keys.ENTER);
		
		WebElement degree=driver.findElement(By.xpath("//*[@id=\"hdegree-inputBox_set\"]"));
		degree.click();
		degree.sendKeys("btech");
		degree.sendKeys(Keys.ENTER);
		
		WebElement employed=driver.findElement(By.xpath("//*[@id=\"employed_in-inputBox_set\"]"));
		employed.click();
		employed.sendKeys("private");
		employed.sendKeys(Keys.ENTER);

		WebElement occupation=driver.findElement(By.xpath("//*[@id=\"occupation-inputBox_set\"]"));
		occupation.click();
		occupation.sendKeys("quality");
		occupation.sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//*[@id=\"income_box\"]")).click();
		driver.findElement(By.id("income_5")).click();
		
		driver.findElement(By.id("aboutme_box")).sendKeys("I am a good boy I am a good boy I am a good boy I am a good boy I am a good boy I am a good boy I am a good boy I am a good boy I am a good boy I am a good boy I am a good boy I am a good boy I am a good boy I am a good boy I am a good boy I am a good boy I am a good boy I am a good boy I am a good boy I am a good boy I am a good boy I am a good boy I am a good boy I am a good boy I am a good boy I am a good boy ");
		
		driver.findElement(By.id("regPage3Submit")).click();
		
		
		//FAMILY DETAILS
		
		String currentheader4=driver.findElement(By.xpath("//*[@id=\"mainRegContent\"]/div[2]/div[1]/div[1]")).getText();
		String expectedheader4="We would love to know about your family.";
		System.out.println(currentheader4);
		if(expectedheader4.equalsIgnoreCase(currentheader4)) {
			System.out.println("Header Matched");
		}
		else {
			System.out.println("Header does not match");
		}
		
		driver.findElement(By.id("familyType_box")).click();
		driver.findElement(By.id("li_familyType1")).click();
		
		driver.findElement(By.id("fatherOccupation_box")).click();
		driver.findElement(By.id("fatherOccupation_2")).click();
		
		driver.findElement(By.id("motherOccupation_box")).click();
		driver.findElement(By.id("motherOccupation_1")).click();
		
		driver.findElement(By.id("brother_box")).click();
		driver.findElement(By.id("li_brother1")).click();
		driver.findElement(By.id("li_other_brother0")).click();
		
		driver.findElement(By.id("sister_box")).click();
		driver.findElement(By.id("li_sister0")).click();
		
		driver.findElement(By.xpath("//*[@id=\"familyState-inputBox_set\"]")).click();
		driver.findElement(By.id("familyState_1")).click();
		
		WebElement fcity = driver.findElement(By.xpath("//*[@id=\"familyCity-inputBox_set\"]"));
		fcity.click();
		fcity.sendKeys("Vis");
		fcity.sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//*[@id=\"address_value\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"address_value\"]")).sendKeys("Some address should be mentioned");
		
		driver.findElement(By.id("aboutfamily_box")).sendKeys("I have a very good family");
		
		driver.findElement(By.xpath("//*[@id=\"regPage1Submit\"]")).click();
		
		
		//FINAL PAGE
		
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[7]/div[1]/div")).click();
		
		
		

	}

}
