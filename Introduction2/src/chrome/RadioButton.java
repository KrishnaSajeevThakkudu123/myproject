package chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium study\\Chrome\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://spicejet.com");
	    driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).click();
	    System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
	
		
		
	}

}
