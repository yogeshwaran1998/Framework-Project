package testcases;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import basefiles.base;
import pageObjects.Linarc_TasksCreate_Objects;

public class Linarc_TaskCreate_QA2 extends base {
	
	ExtentReports extent;

	@BeforeTest
	public void initialize() throws IOException {

		driver = initializeDriver();
		driver.get(prop.getProperty("linarcLive"));
		String path=System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter= new ExtentSparkReporter(path);
		reporter.config().setReportName("Linarc Tasks Creation");
		reporter.config().setDocumentTitle("Test Results");
		
		extent= new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Yogesh");
	}

	@Test
	public void createTasks() throws InterruptedException {
		
		extent.createTest("Tasks Creation");

		Linarc_TasksCreate_Objects obj = new Linarc_TasksCreate_Objects(driver);

		obj.username().sendKeys("johnl3883");
		obj.password().sendKeys("1LinarcTester@");
		obj.signin().click();
		obj.projectsDropdown().click();
		obj.projectSelect().click();

		obj.tasksPage().click();
		Thread.sleep(5000);
		List<String> list1 = new ArrayList<String>();
		List<WebElement> element = driver
				.findElements(By.xpath("//ul[@id=-1]  //li[@class='task-list-item list-tasks__item']"));

		for (WebElement ele : element) {

			list1.add(ele.getAttribute("id"));
			System.out.println(ele.getAttribute("id")); // for getting id of each element

		}
		int b = list1.size();
		Thread.sleep(3000);
		obj.addTask().click();
		obj.taskBox().sendKeys("10");
		Thread.sleep(2000);
		obj.taskCategory().click();
		obj.selectTask().click();
		obj.addButton().click();

		Thread.sleep(3000);
		obj.addTask2().click();
		obj.taskBox2().sendKeys("10");
		Thread.sleep(2000);
		obj.taskCategory2().click();
		obj.selectTask2().click();
		obj.addButton2().click();

		Thread.sleep(3000);
		obj.addTask3().click();
		obj.taskBox3().sendKeys("10");
		Thread.sleep(2000);
		obj.taskCategory3().click();
		obj.selectTask3().click();
		obj.addButton3().click();
		Thread.sleep(2000);

		List<String> list2 = new ArrayList<String>();
		List<WebElement> element2 = driver
				.findElements(By.xpath("//ul[@id=-1]  //li[@class='task-list-item list-tasks__item']"));

		for (WebElement ele : element2) {

			list2.add(ele.getAttribute("id"));
			System.out.println(ele.getAttribute("id")); // for getting id of each element

		}
		int c = list2.size();

		int n = c - b;

		for (int j = 1; j <= n; j++) {

			String last = list2.get(list2.size() - j);

			String a = "'";
			String x = a + last + a;
			String y = "//li[@id=";

			x = y + x + "]";

			String h = "//input[@placeholder='MMM - DD - MMM - DD']";

			String g = "//input[@id='task-estimate-" + last + "'" + "]";

			x = x + h;

			System.out.println(x);
			System.out.println(g);

			Thread.sleep(5000);

			Actions ac = new Actions(driver);

			// input[@id='task-labor--M7IIsvhrIbIsTT2DgQj']

			String e = "//input[@id='task-labor-" + last + "']";

			ac.moveToElement(driver.findElement(By.xpath(e))).doubleClick().pause(1000).sendKeys("50000")
					.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(2000);

			ac.moveToElement(driver.findElement(By.xpath(g))).doubleClick().pause(1000).sendKeys("30")
					.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(2000);

			ac.moveToElement(driver.findElement(By.xpath(x))).click().build().perform();
			Thread.sleep(3000);

			String month = driver.findElement(By.xpath("//div[@class='c-title']")).getText();

			System.out.println(month);

			LocalDate today = LocalDate.now();

			int day = today.getDayOfMonth();

			String todayDate = "//div[contains(text(),'" + day + "')]";

			if (month.contains("2020")) {

				driver.findElement(By.xpath(todayDate)).click();
				Thread.sleep(2000);
				Thread.sleep(1000);
				ac.moveToElement(driver.findElement(By.xpath("//div[@class='c-arrow-layout'][2]"))).click().pause(1000).click().build().perform();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//div[contains(text(),'24')]")).click();

			}

			else {
				System.out.println("Match not found");
			}

			Thread.sleep(5000);

			driver.navigate().refresh();

			Thread.sleep(10000);

			String m = "//li[@id='" + last + "']" + "//div[@class='box-assignments taskList']";
			System.out.println(m);

			driver.findElement(By.xpath(m)).click();
			Thread.sleep(2000);

			List<WebElement> users = driver.findElements(By.xpath("//li[@class='task-assign__item']"));

			for (int i = 0; i < users.size(); i++) {
				users.get(i).click();
				Thread.sleep(1000);
			}

			driver.findElement(By.xpath("//button[@class='btn-default']")).click();
			
			extent.flush();

		}

	}
}
