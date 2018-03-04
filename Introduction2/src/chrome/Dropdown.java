package chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium study\\Chrome\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://spicejet.com");
		
		/*driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath(".//*[@id='dropdownGroup1']/div/ul[2]/li[3]/a")).click();
		driver.findElement(By.xpath("(//a[@value='DEL'])[2]")).click();*/
		
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).isSelected());
		driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).click();
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).isSelected());
		
		
		
		
		
		//Selecting no of adults
		/*Select s= new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		s.selectByValue("2");
		s.selectByIndex(5);
		s.selectByVisibleText("4 Adults");*/
		
	}

}
