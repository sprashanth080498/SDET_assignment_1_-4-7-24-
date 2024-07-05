package package_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Date_calender {
WebDriver driver;
@BeforeTest
public void bfr_test() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://demo.automationtesting.in/Datepicker.html");
	driver.manage().window().maximize();
}
@Test
public void testcase_1() throws InterruptedException {
	Thread.sleep(3000);
	driver.findElement(By.cssSelector(".imgdp")).click();
	WebDriverWait wait = new WebDriverWait(driver,30);
	//String actual_date=driver.findElement(By.className("ui-state-default")).getText();
	String actual_month=driver.findElement(By.className("ui-datepicker-month")).getText();
	String actual_year=driver.findElement(By.className("ui-datepicker-year")).getText();
	while(!(actual_month.equals("July")&&actual_year.equals("2024")))
		{
			driver.findElement(By.xpath("//span[@class=\"ui-icon ui-icon-circle-triangle-e\"]")).click();
		}
	Thread.sleep(3000);
	}
@Test
public void testcase2() throws InterruptedException {
	driver.findElement(By.id("datepicker2")).click();
	Thread.sleep(3000);
	WebElement dd1=driver.findElement(By.xpath("//select[@title=\"Change the year\"]"));
	Select year=new Select(dd1);
	year.selectByVisibleText("1998");
	Thread.sleep(3000);
	WebElement dd2=driver.findElement(By.className("datepick-month-year"));
	Select month=new Select(dd2);
	month.selectByVisibleText("April");
}
}