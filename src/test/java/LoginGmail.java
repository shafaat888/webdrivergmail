import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginGmail {
	public static WebDriver driver;
@BeforeTest
public void setup()
{
	 System.setProperty("webdriver.gecko.driver","E:\\GitHub\\WebdriverGmail\\geckodriver.exe" );
	 driver=new FirefoxDriver();
	 driver.get("https://gmail.com//");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
}
@Test
public void Login() throws InterruptedException
{
	driver.findElement(By.id("identifierId")).sendKeys("ershafaat@gmail.com");
	driver.findElement(By.id("identifierNext")).click();
	Thread.sleep(4000);
	driver.findElement(By.id("password")).sendKeys("shafi_FORu65");
}
@AfterTest
public void teardown()
{
	driver.quit();
}
}
