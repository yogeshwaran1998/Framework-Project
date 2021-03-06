package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Linarc_Company_Objects {

	public WebDriver driver;

	public Linarc_Company_Objects(WebDriver driver) {
		this.driver = driver;
	}

	By uname = By.id("username");
	By password = By.id("password");
	By signin = By.xpath("//button[contains(text(),'Sign in')]");
	By addCompany = By.xpath("//button[@class='btn btn-dflt btn-middle btn-secondary']");
	By companyName = By.xpath("//input[@id='company-name']");
	By years = By.xpath("//select[@id='years-in-operation']");
	By website = By.xpath("//input[@id='webSite']");
	By officeNumber = By.xpath("//div[@id='office-phone-number']//input[@placeholder='+1 ### ### ####']");
	By mapLocation = By.xpath("//input[@placeholder='Search map for Address']");
	By constructionType = By.xpath("//label[contains(text(),'Commercial')]");
	By primaryBusiness = By.xpath("//select[@id='primary']");
	By spl = By.xpath("//span[@class='multiselect__placeholder']");
	By selectSpl = By.xpath("//span[contains(text(),'Contract Administration')]");
	By tasks = By.xpath("//input[@placeholder='Add Task Categories']");
	By selTasks = By.xpath("//input[@value='WATERPROOFING']");
	By blankClick = By.xpath("//div[@class='content-wrapper']");

	By firstName = By.xpath("//form[3]//div[1]//div[2]//div[1]//input[1]");
	By lastName = By.xpath("//form[3]//div[1]//div[2]//div[2]//input[1]");
	By firstJob = By.xpath("//form[3]//div[1]//div[2]//div[3]//input[1]");
	By firstNumber = By.xpath("//form[3]//div[1]//div[3]//div[1]//div[1]//input[1]");
	By firstEmail = By.xpath("//form[3]//div[1]//div[3]//div[2]//input[1]");

	By secondName = By.xpath("//form[4]//div[1]//div[2]//div[1]//input[1]");
	By secondLastName = By.xpath("//form[4]//div[1]//div[2]//div[2]//input[1]");
	By secondJob = By.xpath("//form[4]//div[1]//div[2]//div[3]//input[1]");
	By secondNumber = By.xpath("//form[4]//div[1]//div[3]//div[1]//div[1]//input[1]");
	By secondEmail = By.xpath("//form[4]//div[1]//div[3]//div[2]//input[1]");

	By licenseState = By.xpath("//input[@id='state']");
	By licenseType = By.xpath("//select[@id='licenseType']");
	By licenseNumber = By.xpath("//input[@id='field-license-number-0']");
	By licenseExpiry = By.xpath("//input[@class='bg-disable-none']");
	By calanderNavigate = By.xpath("//div[@class='flex-wrap flex-wrap-equal']//div[2]//header[1]//span[3]");
	By selectDate = By.xpath("//span[@class='cell day'][contains(text(),'22')]");
	By save = By.xpath("//button[contains(text(),'Save')]");

	By inActive = By.xpath("//a[@class='in-active']");
	By upload = By.xpath("//label[@class='displayField']");
	By accessLevel = By.xpath("//*[@id='choose-accessLevel']");
	By saveUsers = By.xpath("//button[@class='import']");
	By selectUsers = By.xpath("//input[@class='selection']");
	By activateUsers = By.xpath("//button[@class='activate']");

	public WebElement getuname() {
		return driver.findElement(uname);
	}

	public WebElement getpassword() {
		return driver.findElement(password);
	}

	public WebElement getsignin() {
		return driver.findElement(signin);
	}

	public WebElement getaddCompany() {
		return driver.findElement(addCompany);
	}

	public WebElement getcompanyName() {
		return driver.findElement(companyName);
	}

	public WebElement getyears() {
		return driver.findElement(years);
	}

	public WebElement getwebsite() {
		return driver.findElement(website);
	}

	public WebElement getofficeNumber() {
		return driver.findElement(officeNumber);
	}

	public WebElement getmapLocation() {
		return driver.findElement(mapLocation);
	}

	public WebElement getconstructionType() {
		return driver.findElement(constructionType);
	}

	public WebElement getprimaryBusiness() {
		return driver.findElement(primaryBusiness);
	}

	public WebElement getspl() {
		return driver.findElement(spl);
	}

	public WebElement getselectSpl() {
		return driver.findElement(selectSpl);
	}

	public WebElement gettasks() {
		return driver.findElement(tasks);
	}

	public WebElement getselTasks() {
		return driver.findElement(selTasks);
	}

	public WebElement getblankClick() {
		return driver.findElement(blankClick);
	}

	public WebElement getfirstName() {
		return driver.findElement(firstName);
	}

	public WebElement getlastName() {
		return driver.findElement(lastName);
	}

	public WebElement getfirstJob() {
		return driver.findElement(firstJob);
	}

	public WebElement getfirstNumber() {
		return driver.findElement(firstNumber);
	}

	public WebElement getfirstEmail() {
		return driver.findElement(firstEmail);
	}

	public WebElement getsecondName() {
		return driver.findElement(secondName);
	}

	public WebElement getsecondLastName() {
		return driver.findElement(secondLastName);
	}

	public WebElement getsecondJob() {
		return driver.findElement(secondJob);
	}

	public WebElement getsecondNumber() {
		return driver.findElement(secondNumber);
	}

	public WebElement getsecondEmail() {
		return driver.findElement(secondEmail);
	}

	public WebElement getlicenseState() {
		return driver.findElement(licenseState);
	}

	public WebElement getlicenseType() {
		return driver.findElement(licenseType);
	}

	public WebElement getlicenseNumber() {
		return driver.findElement(licenseNumber);
	}

	public WebElement getlicenseExpiry() {
		return driver.findElement(licenseExpiry);
	}

	public WebElement getcalanderNavigate() {
		return driver.findElement(calanderNavigate);
	}

	public WebElement getselectDate() {
		return driver.findElement(selectDate);
	}
	public WebElement getsave() {
		return driver.findElement(save);
	}
	public WebElement getinActive() {
		return driver.findElement(inActive);
	}
	public WebElement getupload() {
		return driver.findElement(upload);
	}
	
	public List<WebElement> getaccessLevel() {
		return driver.findElements(accessLevel);
	}
	
	public WebElement getsaveUsers() {
		return driver.findElement(saveUsers);
	}
	
	public WebElement getselectUsers() {
		return driver.findElement(selectUsers);
	}
	
	public WebElement getactivateUsers() {
		return driver.findElement(activateUsers);
	}
	
	

}
