package seleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_Verify {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\seleniumpractice\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.seleniumbymahesh.com/HMS/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.name("submit")).click();
		Thread.sleep(3000);
		System.out.println("Login Completed");
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout Completed");
		driver.quit();
		
		
	

	}

}
