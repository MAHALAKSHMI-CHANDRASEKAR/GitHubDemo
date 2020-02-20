package GradlePrograms;

import org.testng.annotations.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleGradle{
	@Test
public void Login() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\BLTuser.BLT1206\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.linkedin.com/");
	  driver.manage().window().maximize();
}
}
