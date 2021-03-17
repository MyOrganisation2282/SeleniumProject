package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Velocity\\Java setup\\Slenium standalone file\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.javatpoint.com/html-vs-xml");
		Thread.sleep(4000);
		
		 File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 String path = "C:\\Velocity\\Selenium Sreenshot\\javatpoint.png";
		 File destination=new File(path);
		 FileHandler.copy(source, destination);
		 

	}

}
