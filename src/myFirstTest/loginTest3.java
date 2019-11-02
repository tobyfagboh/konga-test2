package myFirstTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginTest3 {

	public static void main(String[] args) {
	   	 
	   	 //setting the property of your test
	   	 System.setProperty("webdriver.chrome.driver","C:\\SummitechTest\\loopmi-java\\src\\test\\resources\\executables\\chromedriver.exe");
	   	 
	   	 //Creating an instance of driver, to launch browser
	   	 WebDriver browser = new ChromeDriver();
	   	 
	   	 //to open the faacebook login page
	   	 browser.get("https://www.facebook.com/");
	    
	   	 //to maximize the browser
	   	 browser.manage().window().maximize();
	   	 
	   	 //to check the actual url is displayed
	   	 System.out.println(browser  .getTitle());
	   	 
	   	 //to write email into email field
	   	 browser.findElement(By.name("email")).sendKeys("youremail@gmail.com");
	   	 
	   	 //to write password into the password field
	   	 browser.findElement(By.id("pass")).sendKeys("yourPassword");
	   	 
	   	 //to click the login button
	   	 browser.findElement(By.id("u_0_4")).click();
	   	 
	   	 //to close the browser 44444
	   	 browser.close();
	   


	}

}
