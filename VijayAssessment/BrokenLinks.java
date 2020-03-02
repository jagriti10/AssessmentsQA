package Training;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.support.ui.*;
public class BrokenLinks {

	public static void main(String[] args) {
		//setting property for gecko driver
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Vijay.Arora\\eclipse\\geckodriver\\geckodriver.exe");
		
		//initialising object for firefox driver
		WebDriver driver= new FirefoxDriver();
		
		//maximizing window
		driver.manage().window().maximize();
		
		//Initializing 
		String home= "https://www.google.com";
		String url ="";
		HttpURLConnection huc = null;
		int respCode = 200;
		
		//Getting home page url
		driver.get(home);
		
		//defining explicit wait 
		WebDriverWait wait= new WebDriverWait(driver, 60);
		
		//Finding search webelement and sending search
		WebElement search = wait.until(ExpectedConditions.elementToBeClickable(By.name("q")));
		search.sendKeys("qa automation");
		
		//find google search button 
		WebElement searchButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("btnK")));
		searchButton.click();
		
		//collecting all links on the page in a list
		List<WebElement> links = driver.findElements(By.xpath("//h3[@class='LC20lb DKV0Md']/.."));
		
		//iterator for the list to get all the links 
		Iterator <WebElement> it = links.iterator();
		
		//loop for http connection
		while(it.hasNext()) {
			//getting urls in string
			url = it.next().getAttribute("href");
			//System.out.println(url);
			
			//checking if url is empty
			if (url == null||url.isEmpty()) {
				System.out.println("URL is either not configured or it is empty");
				continue;
			}
			try {
				//setting up http connection
				huc = (HttpURLConnection)(new URL(url).openConnection());
				huc.setRequestMethod("HEAD");
				huc.connect();
				
				//getting response code
				respCode = huc.getResponseCode();
				if(respCode >= 400) {
					System.out.println(url+" is a broken link");
				}
				else {
					System.out.println(url+" is a valid link");
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		driver.quit();
	}

}
