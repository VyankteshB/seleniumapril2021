package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_011 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","E:\\chrome80\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//test case step
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(300);
		System.out.println("Login Completed");
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout Completed");
		driver.quit();
		

	}

}
