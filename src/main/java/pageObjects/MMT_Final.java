package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MMT_Final {

	public WebDriver driver;

	public MMT_Final(WebDriver driver) {
		this.driver = driver;
	}

	By addAdults = By.xpath("//a[@class='font14 LatoBold text-uppercase paddLR15']");
	By firstName = By.xpath("//input[@placeholder='First & Middle Name']");
	By lastName = By.xpath("//input[@placeholder='Last Name']");
	By gender = By.xpath("//div[contains(@class,'collapse in')]//label[1]");
	By mobileNumber = By.xpath("//input[contains(@placeholder,'Mobile No')]");
	By email = By.xpath("//input[contains(@placeholder,'Email')]");
	By lastContinue = By.xpath("//button[contains(@class,'ack-cta btn fli_primary_btn text-uppercase')]");
	By skipNext = By.xpath("//a[@id='ancillary-secondary']");
	By continueAnyway = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/p[3]/a");

	public WebElement getaddAdults() {
		return driver.findElement(addAdults);
	}

	public WebElement getfirstName() {
		return driver.findElement(firstName);
	}

	public WebElement getlastName() {
		return driver.findElement(lastName);
	}

	public WebElement getgender() {
		return driver.findElement(gender);
	}

	public WebElement getmobileNumber() {
		return driver.findElement(mobileNumber);
	}

	public WebElement getemail() {
		return driver.findElement(email);
	}

	public WebElement getlastContinue() {
		return driver.findElement(lastContinue);
	}
	
	public WebElement getskipNext() {
		return driver.findElement(skipNext);
	}
	
	public WebElement getcontinueAnyway() {
		return driver.findElement(continueAnyway);
	}


}
