package jeevan;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class reg {

	private static ChromeDriver driver;

	public static void main(String[] args)throws Exception {
		
		// TODO Auto-generated method stub
		System.out.print("Hello");
	       System.setProperty("webdriver.chrome.driver","C:\\Users\\dugana.santoshini\\Downloads\\chromedriver_win32\\chromedriver.exe");
	       driver =new ChromeDriver();
	       driver.get("https://www.jeevansathi.com");
        driver.manage().window().maximize();
	       driver.findElement(By.id("loginTopNavBar")).click();
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       driver.findElement(By.id("loginRegistration")).click();
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       WebElement email=driver.findElement(By.xpath("//*[@id=\"email_value\"]"));
	       email.click();
	       Random randomGenerator = new Random();  
	       int randomInt = randomGenerator.nextInt(1000);  
	       email.sendKeys("username"+ randomInt +"@gmail.com");
	       WebElement phone=driver.findElement(By.xpath("//*[@id=\"phone_box\"]"));
	       phone.click();
	      phone.sendKeys("9912665767");
	       WebElement password=driver.findElement(By.xpath("//*[@id=\"password_value\"]"));
	       password.click();
	       Random randomGenerator2 = new Random();  
	       int randomInt2 = randomGenerator2.nextInt(1000);  
	       password.sendKeys("username"+ randomInt2);
	       driver.findElement(By.id("cpf_box")).click();
	       WebElement profile=driver.findElement(By.id("li_cpf4"));
	       profile.click();
	       driver.findElement(By.id("regPage1Submit")).click();
	       WebElement name=driver.findElement(By.id("name_value"));
	       name.click();
	       Random randomGenerator3 = new Random();  
	       int randomInt3 = randomGenerator3.nextInt(1000);  
	       name.sendKeys("username " + "username");
	       WebElement date=driver.findElement(By.id("dob_selector"));
	       date.click();
	       driver.findElement(By.id("dateli3")).click();
	       driver.findElement(By.id("month_value")).click();
           driver.findElement(By.id("monthli3")).click();
	       driver.findElement(By.id("yearli2000")).click();
	       
	       driver.findElement(By.xpath(" //*[@id=\"mtongue-inputBox_set\"]")).click();
	       driver.findElement(By.id("mtongue_0")).click();
	       
	       driver.findElement(By.xpath("//*[@id=\"religion-inputBox_set\"]")).click();
	       driver.findElement(By.id("religion_0")).click();
	       
	       driver.findElement(By.xpath("//*[@id=\"caste-inputBox_set\"]")).click();
	       driver.findElement(By.id("caste_17")).click();

 
	       driver.findElement(By.id("caste_no_bar")).click();
	       
	      // driver.findElement(By.xpath("//*[@id=\"subcaste-inputBox_set\"]")).click(); 
	       //driver.findElement(By.id("caste_131")).click();


	       
	       driver.findElement(By.id("manglik_label")).click();

	       driver.findElement(By.id("li_manglik0")).click();

	       driver.findElement(By.id("horoscopeMatch_selector")).click();
	       driver.findElement(By.id("li_horoscopeMatch1")).click();
	      // hor.sendKeys(Keys.CONTROL+"\t");
	      // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      // driver.findElement(By.id("mstatus_box")).click();

           //marital status selection
	     //  driver.findElement(By.id("mstatus_0")).click();
	       
	       //driver.findElement(By.xpath("//div[@id='mstatus_box']")).click();
	       driver.findElement(By.id("mstatus_label")).click();
	      
	       driver.findElement(By.id("mstatus_0")).click();
	       
	       
	       driver.findElement(By.xpath("//*[@id=\"height_box\"]")).click();
	       driver.findElement(By.id("height_10")).click();
	       
	       driver.findElement(By.xpath("//*[@id=\"regPage2Submit\"]")).click();
	       
	       driver.findElement(By.id("countryReg-inputBox_set")).click();
	       driver.findElement(By.id("countryReg_0")).click();
	       
	       driver.findElement(By.id("stateReg-inputBox_set")).click();
	       driver.findElement(By.id("stateReg_1")).click();
	       
	       driver.findElement(By.id("cityReg-inputBox_set")).click();
	       driver.findElement(By.id("cityReg_12")).click();

	       driver.findElement(By.id("hdegree-inputBox_set")).click();
	       driver.findElement(By.id("hdegree_0")).click();
	       
	       driver.findElement(By.id("employed_in-inputBox_set")).click();
	       driver.findElement(By.id("employed_in_0")).click();
	       
	       driver.findElement(By.id("occupation-inputBox_set")).click();
	       driver.findElement(By.id("occupation_2")).click();
	       
	       driver.findElement(By.id("income_box")).click();
	       driver.findElement(By.id("income_2")).click();


	       driver.findElement(By.id("aboutme_box")).click();
	       driver.findElement(By.id("aboutme_value")).sendKeys("Friendly / Personable and my goal is become a dancerFriendly / Personable and my goal is become a dancerFriendly / Personable and my goal is become a dancer");
	       
	       
	       driver.findElement(By.id("regPage3Submit")).click();
	       
	      // driver.findElement(By.id("aboutme_box")).click();


	       driver.findElement(By.id("familyType_box")).click();
	       driver.findElement(By.id("li_familyType1")).click();
	       
	       
	       driver.findElement(By.id("fatherOccupation_box")).click();
	       driver.findElement(By.id("fatherOccupation_2")).click();

	       driver.findElement(By.id("motherOccupation_box")).click();
	       driver.findElement(By.id("motherOccupation_7")).click();
	       
	       driver.findElement(By.id("brother_box")).click();
	       driver.findElement(By.id("li_brother1")).click();
	       
	       
	       driver.findElement(By.id("sister_box")).click();
	       driver.findElement(By.id("li_sister0")).click();

	       driver.findElement(By.id("familyState_box")).click();
	       driver.findElement(By.id("familyState_1")).click();
	       
	       driver.findElement(By.id("familyCity_label")).click();
	       driver.findElement(By.id("familyCity_3")).click();

	       driver.findElement(By.id("address_label")).click();
	       driver.findElement(By.id("address_value")).sendKeys("ABCCCCCC STREET");

	       
	       driver.findElement(By.id("aboutfamily_label")).click();
	       driver.findElement(By.id("aboutfamily_value")).sendKeys("ABCCCCCC vcscjbshchbjbc");
	       
	       
	       driver.findElement(By.id("skipPage4")).click();
	       
	       driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[7]/div[1]/div")).click();

	      
	       
	       
	       
	        
	       

	}

}
