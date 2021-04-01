package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

	public static void main(String[] args) throws Exception {
	 System.setProperty("webdriver.chrome.driver","D:\\seleniumpractice\\chromedriver.exe"); // Chrome browser Loached
	 WebDriver driver=new ChromeDriver(); // Chrome driver Class object
	 driver.get("127.0.0.1//orangehrm-2.6/login.php"); //URL Access 
	}
}
	 
	/* if(driver.getTitle().equals("User Login Page")) //Page Title
	 {
		 System.out.println("Title Macthed");	 
	 }
	 else {   
		 System.out.println("Title not mached excepted title is : "+driver.getTitle());
		 
	 }*/
	 //Login on This Page
	/* driver.findElement(By.name("username")).sendKeys("admin");
	 driver.findElement(By.name("password")).sendKeys("admin");
	 driver.findElement(By.name("submit")).click();
	 Thread.sleep(3000);
	 System.out.println("Login Completed");
	 Thread.sleep(3000); // Timing
	 
	 driver.findElement(By.linkText("Logout")).click();// Logout of This page
	 System.out.println("LogOut comleted");
	 driver.quit();
	 System.out.println("Back of this apllication");*/
	      
	//}

	//}


