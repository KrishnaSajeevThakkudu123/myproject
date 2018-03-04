package chrome;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class chromebrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium study\\Chrome\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		driver.get("http://facebook.com");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.findElement(By.id("email")).sendKeys("krishnasajeevr@gmail.com");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.findElement(By.name("pass")).sendKeys("xyzabcdjint1@");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='u_0_5']")).click();
		driver.quit();
		/*System.setProperty("webdriver.ie.driver", "D:\\Selenium study\\IE\\IEDriverServer.exe");
		InternetExplorerDriver driver =new InternetExplorerDriver();
		driver.get("http://google.com");*/
		
		

	}

}
