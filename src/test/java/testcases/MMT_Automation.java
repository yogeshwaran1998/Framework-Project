package testcases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basefiles.base;
import pageObjects.MMT_Booking;
import pageObjects.MMT_Final;
import pageObjects.MMT_Home;

public class MMT_Automation extends base {
	

	public static Logger Log = LogManager.getLogger(base.class.getName());

	@BeforeTest
	public void initialize() throws IOException {

		driver = initializeDriver();

		driver.get(prop.getProperty("mmturl"));

	}

	@Test(priority = 1)
	public void bookflight() throws InterruptedException {
		
		
		try {
		
		}
		
		catch(Exception e){
			
		}

		MMT_Home mh = new MMT_Home(driver);
		MMT_Booking mb = new MMT_Booking(driver);
		MMT_Final md = new MMT_Final(driver);
		mh.getfrom().click();
		sleep();
		Actions ac = new Actions(driver);
		ac.moveToElement(mh.getfromCity()).click().pause(2000).sendKeys("goa").pause(2000).build().perform();
		sleep();
		mh.getdesiredFromCity().click();
		ac.moveToElement(mh.gettoCity()).click().pause(2000).sendKeys("maa").pause(2000).build().perform();
		sleep();
		mh.getdesiredToCity().click();
		sleep();
		mh.getnextMonth().click();
		sleep();
		mh.getdepartureDate().click();
		sleep();
		mh.getonreturn().click();
		sleep();
		mh.getreturnDate().click();
		sleep();
		mh.getflightType().click();
		sleep();
		mh.getadultsCount().click();
		sleep();
		mh.getapplyButton().click();
		sleep();
		mh.getsearchButton().click();
		Thread.sleep(7000);

		mb.getstops().click();
		sleep();
		mb.getsort().click();
		sleep();
		mb.getsortPrice().click();
		Thread.sleep(4000);

		WebElement element = mb.getdepartureFlight();
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);

		sleep();
		mb.getreturnFlight().click();
		sleep();
		mb.getbookButton().click();
		sleep();
	
		//String winHandleBefore = driver.getWindowHandle();
		driver.getWindowHandle();

		// Perform the click operation that opens new window
		
		mb.getcontinueButton().click();

		// Switch to new window opened
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}

		// Perform the actions on new window
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		
		Boolean isPresent = driver.findElements(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div[1]/div[3]/div/div[3]/label[2]/span[2]")).size()>0;
		System.out.println(isPresent);
		
		if(isPresent)
		{
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div[1]/div[3]/div/div[3]/label[2]/span[2]")).click();
			Thread.sleep(4000);
		}
		
		mb.getfinalContinue().click();
		
		Thread.sleep(6000);
		
		md.getaddAdults().click();
		
		md.getfirstName().sendKeys("Yogesh");
		md.getlastName().sendKeys("Waran");
		md.getgender().click();
		
		md.getmobileNumber().sendKeys("8124534654");
		md.getemail().sendKeys("yogi@mailinator.com");
		md.getlastContinue().click();
		
		Thread.sleep(8000);
		
		//md.getskipNext().click();
		
		ac.moveToElement(md.getskipNext()).doubleClick().build().perform();
		md.getcontinueAnyway().click();

	}

	public void sleep() throws InterruptedException {
		Thread.sleep(3000);
	}

	@Test(priority = 2)
	public void afterTest() {

		Assert.assertTrue(true);

	}

	@Test(priority = 3)
	public void finalTest() {

		Assert.assertTrue(true);

	}

}
