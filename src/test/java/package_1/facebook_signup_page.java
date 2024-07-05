package package_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class facebook_signup_page {
	WebDriver driver;
@BeforeTest
public void beforetest() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/signup");
	driver.manage().window().maximize();
	Thread.sleep(3000);
}
@Test
public void testcase_1() throws InterruptedException {
	driver.findElement(By.name("firstname")).sendKeys("Prashanth");
	Thread.sleep(4000);
	driver.findElement(By.name("lastname")).sendKeys("Murugan");
	driver.findElement(By.name("reg_email__")).sendKeys("sprashanth0804@gmail.com");
	Thread.sleep(3000);
	driver.findElement(By.name("reg_email_confirmation__")).sendKeys("sprashanth0804@gmail.com");
	//driver.findElement(By.cssSelector("#u_0_g_OV")).sendKeys("sprashanth0804@gmail.com");
	driver.findElement(By.id("password_step_input")).sendKeys("Prashanth0804");
	Thread.sleep(4000);
	WebElement dpdwn=driver.findElement(By.cssSelector("#day"));
	Select val_1=new Select(dpdwn);
	val_1.selectByValue("8");
	Thread.sleep(3000);
	WebElement month=driver.findElement(By.id("month"));
	Select val_2=new Select(month);
	val_2.selectByVisibleText("Apr");
	WebElement yr=driver.findElement(By.cssSelector("#year"));
	Select val_3=new Select(yr);
	val_3.selectByValue("1998");
	Thread.sleep(3000);
	List<WebElement> gender=driver.findElements(By.cssSelector("._5k_3"));
	//gender.click();
	String s="Male";
	for(WebElement el:gender)
		{
		if(el.getText().equals(s))
			{
				el.click();
				break;
			}
		}
	driver.findElement(By.name("websubmit")).click();
	}
}
