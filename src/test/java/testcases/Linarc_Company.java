package testcases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basefiles.base;
import pageObjects.Linarc_Company_Objects;

public class Linarc_Company extends base {

	XSSFWorkbook wb;
	FileInputStream fis;
	XSSFSheet sheet;
	public static Logger Log = LogManager.getLogger(base.class.getName());
	Linarc_Company_Objects obj;

	@BeforeTest
	public void initialize() throws IOException {
		
		driver = initializeDriver();
		driver.get(prop.getProperty("linarcLive"));
	}

	@Test
	public void createCompany() throws InterruptedException, IOException {

		obj= new Linarc_Company_Objects(driver);
		obj.getuname().sendKeys("globaladmin");
		obj.getpassword().sendKeys("1LinarcTester@");
		obj.getsignin().click();

		obj.getaddCompany().click();
		obj.getcompanyName().sendKeys("House of Legends");

		Select a = new Select(obj.getyears());
		a.selectByIndex(2);

		obj.getwebsite().sendKeys("www.HouseofLegends.com");

		obj.getofficeNumber().sendKeys("19593469831");

		WebElement map = obj.getmapLocation();
		map.sendKeys("Mantri Synergy");
		sleep(2000);
		map.sendKeys(Keys.ARROW_DOWN);
		map.sendKeys(Keys.ENTER);
		obj.getconstructionType().click();

		Select b = new Select(obj.getprimaryBusiness());
		b.selectByIndex(0);

		WebElement primary = obj.getspl();
		primary.click();
		sleep(2000);
		obj.getselectSpl().click();

		obj.gettasks().click();

		obj.getselTasks().click();
		obj.getblankClick().click();

		obj.getfirstName().sendKeys("Yogi");
		obj.getlastName().sendKeys("Waran");
		obj.getfirstJob().sendKeys("Owner");
		obj.getfirstNumber().sendKeys("11989551591");
		obj.getfirstEmail().sendKeys("yogi21s@mailinator.com");

		obj.getsecondName().sendKeys("Markson");
		obj.getsecondLastName().sendKeys("Waugh");
		obj.getsecondJob().sendKeys("Admin");
		obj.getsecondNumber().sendKeys("11874874481");
		obj.getsecondEmail().sendKeys("mwaugh52@mailinator.com");

		WebElement state = obj.getlicenseState();
		state.sendKeys("Wash");
		sleep(2000);
		state.sendKeys(Keys.ARROW_DOWN);
		state.sendKeys(Keys.ENTER);
		Select c = new Select(obj.getlicenseType());
		c.selectByIndex(1);

		obj.getlicenseNumber().sendKeys("14622");
		obj.getlicenseExpiry().click();
		obj.getcalanderNavigate().click();
		obj.getselectDate().click();

		obj.getsave().click();
		
		//Waiting for next page to load. Min:4 Max:10
		sleep(10000);
		obj.getinActive().click();
		sleep(4000);
		obj.getupload().click();
		sleep(7000);
		
		//Executes script written using Auto IT to upload sheet file
		Runtime.getRuntime().exec("C:\\Users\\Yogesh\\Documents\\auto.exe");
		
		//Execution of AutoIT might take 6 to 8 seconds, hence sleep.
		sleep(10000);

		fis = new FileInputStream("D:\\employee.xlsx");

		// load the input stream to a workbook object
		// Use XSSF for (.xlsx) excel file and HSSF for (.xls) excel file
		wb = new XSSFWorkbook(fis);

		// get the sheet from the workbook by index
		sheet = wb.getSheet("Sheet1");

		// Count the total number of rows present in the sheet
		int rowcount = sheet.getLastRowNum();
		System.out.println(" Total number of rows present in the sheet : " + rowcount);

		// get column count present in the sheet
		int colcount = sheet.getRow(1).getLastCellNum();
		System.out.println(" Total number of columns present in the sheet : " + colcount);

		List<WebElement> ele = obj.getaccessLevel();

		// get the data from sheet by iterating through cells
		for (int i = 1; i <= rowcount; i++) {

			String str = sheet.getRow(i).getCell(6).getStringCellValue();
			Select s = new Select(ele.get(i - 1));
			s.selectByVisibleText(str);

		}

		obj.getsaveUsers().click();
	
		//Saving of Users takes approx 5 to 7 seconds
		sleep(8000);
		obj.getselectUsers().click();
		sleep(4000);
		obj.getactivateUsers().click();

	}

	// Function for thread sleep (Required for some elements)
	public void sleep(int n) throws InterruptedException {
		Thread.sleep(n);
	}

	@AfterTest
	public void closeObjects() throws IOException {

		// destroying the created object
		obj = null;

		// closing the workbook object
		wb.close();

		// closing the fileInputStream object
		fis.close();
	}

}
