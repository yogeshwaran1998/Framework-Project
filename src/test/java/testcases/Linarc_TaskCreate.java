package testcases;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basefiles.base;
import pageObjects.Linarc_TasksCreate_Objects;

public class Linarc_TaskCreate extends base {

	@BeforeTest
	public void initialize() throws IOException {

		driver = initializeDriver();
		driver.get(prop.getProperty("linarcLive"));
	}

	@Test
	public void createTasks() throws InterruptedException {

		Linarc_TasksCreate_Objects obj = new Linarc_TasksCreate_Objects(driver);

		obj.username().sendKeys("johnl3883");
		obj.password().sendKeys("1LinarcTester@");
		obj.signin().click();
		obj.projectsDropdown().click();
		obj.projectSelect().click();

		obj.tasksPage().click();
		Thread.sleep(5000);
		obj.addTask().click();
		obj.taskBox().sendKeys("10");
		Thread.sleep(3000);
		obj.taskCategory().click();
		obj.selectTask().click();
		obj.addButton().click();
		Thread.sleep(7000);

//		List<WebElement> tasksCount = driver.findElements(By.xpath("//li[@class='task-list-item list-tasks__item']"));
//
//		for (int i = 0; i < tasksCount.size(); i++) {
//			//WebElement r = tasksCount.get(i);
//
//			String result = tasksCount.get(i).findElement(By.xpath("//a[@class='code']")).getText();
//			System.out.println(result);
//
//			if (result.contains("10700")) {
//				tasksCount.get(i).findElement(By.xpath("//input[@placeholder='MMM - DD - MMM - DD']")).click();
//				String month = driver.findElement(By.xpath("//div[@class='c-title']")).getText();
//
//				if (month.contains("May 2020")) {
//					
//					driver.findElement(By.xpath("//div[contains(@text,'13')]")).click();
//					driver.findElement(By.xpath("//div[contains(@text,'30')]")).click();
//
//				}
//				
//				//break;
//
//			}
//			
//			else {
//				System.out.println("Match not found");
//			}
//			
//		}

		//List<WebElement> tasks = driver.findElements(By.xpath("//li[contains(@class,'task')]"));

//		for(int i=0;i<tasks.size();i++)
//		{
//			WebElement r= tasks.get(i);
//			
//			String result =r.findElement(By.xpath("//a[@class='code']")).getText();
//			System.out.println(result);
//		}

		List<WebElement> element = driver
				.findElements(By.xpath("//ul[@id=-1]  //li[@class='task-list-item list-tasks__item']"));
		List<String> list = new ArrayList<String>();

		for (WebElement ele : element) {

			list.add(ele.getAttribute("id"));
			System.out.println(ele.getAttribute("id")); // for getting id of each element

			// System.out.println(ele.getText()); //for getting text of each element

		}

		
		String last = list.get(list.size() - 1);
	
		
		
		
		
		
		String a="'";
		String x=a+last+a;
		String y="//li[@id=";
		
		x=y+x+"]";
		
		String h="//input[@placeholder='MMM - DD - MMM - DD']";
		
		String g="//input[@id='task-estimate-"+last+"'"+"]";
		
		x=x+h;
		
		System.out.println(x);
		System.out.println(g);
		
		Thread.sleep(5000);
		//WebElement r = driver.findElement(By.id(last));
		//r.findElement(By.xpath("//div[@class='box-assignments taskList']")).click();
		//r.findElement(By.xpath("//input[@placeholder='MMM - DD - MMM - DD']")).click();
		
		
		
		
		Actions ac= new Actions(driver);
		
		ac.moveToElement(driver.findElement(By.xpath(g))).doubleClick().pause(1000).sendKeys("30").sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		
		//WebElement t=driver.findElement(By.cssSelector(last));
		
	
		ac.moveToElement(driver.findElement(By.xpath(x))).click().build().perform();
		Thread.sleep(3000);
		
		
		
		//ac.moveToElement(t.findElement(By.xpath("//input[@placeholder='MMM - DD - MMM - DD']"))).clickAndHold().pause(3000).release().build().perform();
		
		
		
		
		//ac.moveToElement(driver.findElement(By.xpath("//li[@id='-M7H9r-YYU1iZVSQinD4'] //input[@placeholder='MMM - DD - MMM - DD']"))).clickAndHold().pause(3000).release().build().perform();
		String month = driver.findElement(By.xpath("//div[@class='c-title']")).getText();
		
		
		System.out.println(month);

		if (month.contains("May 2020")) {

           	driver.findElement(By.xpath("//div[contains(text(),'14')]")).click();
           	Thread.sleep(2000);
           	ac.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Daliy Job Report')]"))).build().perform();
           	Thread.sleep(2000);
			
           	driver.findElement(By.xpath("//div[contains(text(),'24')]")).click();
			//ac.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'13')]"))).clickAndHold().pause(2000).release().build().perform();
			//ac.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'30')]"))).clickAndHold().pause(2000).release().build().perform();

		}

		// break;

		else {
			System.out.println("Match not found");
		}
		
		
		Thread.sleep(5000);
		
		//li[@id='-M7HOh3G34ce_5x_qYpE']//div[@class='box-assignments taskList']
		
//		ac.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Daliy Job Report')]"))).build().perform();
//		
//		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		Thread.sleep(10000);
		
		
		//driver.findElement(By.xpath("//li[@id='-M7HOh3G34ce_5x_qYpE']//div[@class='box-assignments taskList']")).click();
		
		
		
		
		String m= "//li[@id='"+last+"']"+"//div[@class='box-assignments taskList']";
		System.out.println(m);
		
		
		driver.findElement(By.xpath(m)).click();
		Thread.sleep(2000);
		
		List<WebElement> users=driver.findElements(By.xpath("//li[@class='task-assign__item']"));
		
		for(int i=0; i<users.size();i++)
		{
			users.get(i).click();
			Thread.sleep(1000);
		}

		driver.findElement(By.xpath("//button[@class='btn-default']")).click();
		

	}
}
