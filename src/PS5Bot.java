import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PS5Bot {
	
	// ONLY CHANGE THINGS FROM THIS COMMENT TILL THE NEXT "END COMMENT"
	public static String email = "example@gmail.com"; // Your email for smythstoys website
	
	public static String password = "thisshouldbeyourpassword"; // Your password for smythstoys website
	
	public static String cvv = "333"; // cvv of your credit/ debit card
	
	public static String chromeDriverDirectory = "C:\\Users\\Raj\\workspace\\PS5Bot\\libs\\chromedriver1.exe"; //directory of your chrome driver.
	
	// THIS IS THE NEXT END COMMENT.
	
	
	
	
	public static String SmythToysPS5Link = "https://www.smythstoys.com/uk/en-gb/video-games-and-tablets/playstation-5/playstation-5-consoles/playstation-5-console/p/191259";	

	public static String SmythToysOtherTorLink = "https://www.smythstoys.com/uk/en-gb/toys/construction-and-cars/imaginext/imaginext-toys-only-at-smyths-toys/imaginext-remote-control-transforming-batbot/p/144036";
	
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", chromeDriverDirectory);
			
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.navigate().to("https://www.smythstoys.com/uk/en-gb/login");
		
		driver.findElement(By.xpath("/html/body/div[5]/section/div/div/div[1]/div/div/div/form/div[2]/div/div[1]/div/input")).sendKeys(email);
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/div[5]/section/div/div/div[1]/div/div/div/form/div[2]/div/div[2]/div/input")).sendKeys(password);
	
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/div[5]/section/div/div/div[1]/div/div/div/form/div[2]/div/div[5]/div[1]/button")).submit();
		
		driver.navigate().to(SmythToysOtherTorLink);
		
		driver.findElement(By.xpath("/html/body/div[5]/section/div/div/div[2]/div[1]/div[5]/div/div/div/div[2]/form/button")).click();;
	
		driver.navigate().to("https://www.smythstoys.com/uk/en-gb/cart");

		driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/div[2]/div/div[3]/div[2]/div[5]/div/div/button")).click();

		driver.findElement(By.xpath("/html/body/div[5]/section/div/div/div[2]/div/div/div/div/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[4]/div/div/div[1]/div[1]/input")).sendKeys(cvv);
		
		driver.findElement(By.xpath("/html/body/div[5]/section/div/div/div[2]/div/div/div/div/div[1]/div[3]/div/div/label[1]")).click();
		
		driver.findElement(By.xpath("/html/body/div[5]/section/div/div/div[2]/div/div/div/div/div[3]/div/div/button)")).click();
	}

}
