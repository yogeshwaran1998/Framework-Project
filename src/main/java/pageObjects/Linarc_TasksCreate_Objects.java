package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Linarc_TasksCreate_Objects {

	public WebDriver driver;

	public Linarc_TasksCreate_Objects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	WebElement username;

	@FindBy(id = "password")
	WebElement password;

	@FindBy(xpath = "//button[contains(text(),'Sign in')]")
	WebElement signin;

	@FindBy(xpath = "//div[@class='multiselect form-select is-transparent']//div[@class='multiselect__select']")
	WebElement projectsDropdown;

	@FindBy(xpath = "//span[contains(text(),'Aquas Towers')]")
	WebElement projectSelect;

	@FindBy(xpath = "//span[contains(text(),'Tasks')]")
	WebElement tasksPage;

	@FindBy(xpath = "//button[@class='btn-add-task']")
	WebElement addTask;

	@FindBy(xpath = "//input[@placeholder='Enter Task code (eg: 01)']")
	WebElement taskBox;

	@FindBy(xpath = "//li[contains(text(),'10 Waterproofing')]")
	WebElement taskCategory;

	@FindBy(xpath = "//strong[contains(text(),'10600')]")
	WebElement selectTask;

	@FindBy(xpath = "//button[@class='btn-default']")
	WebElement addButton;

	@FindBy(xpath = "//button[@class='btn-add-task']")
	WebElement addTask2;

	@FindBy(xpath = "//input[@placeholder='Enter Task code (eg: 01)']")
	WebElement taskBox2;

	@FindBy(xpath = "//li[contains(text(),'10 Waterproofing')]")
	WebElement taskCategory2;

	@FindBy(xpath = "//strong[contains(text(),'10700')]")
	WebElement selectTask2;

	@FindBy(xpath = "//button[@class='btn-default']")
	WebElement addButton2;

	@FindBy(xpath = "//button[@class='btn-add-task']")
	WebElement addTask3;

	@FindBy(xpath = "//input[@placeholder='Enter Task code (eg: 01)']")
	WebElement taskBox3;

	@FindBy(xpath = "//li[contains(text(),'10 Waterproofing')]")
	WebElement taskCategory3;

	@FindBy(xpath = "//strong[contains(text(),'10400')]")
	WebElement selectTask3;

	@FindBy(xpath = "//button[@class='btn-default']")
	WebElement addButton3;

	public WebElement username() {
		return username;
	}

	public WebElement password() {
		return password;
	}

	public WebElement signin() {
		return signin;
	}

	public WebElement projectsDropdown() {
		return projectsDropdown;
	}

	public WebElement projectSelect() {
		return projectSelect;
	}

	public WebElement tasksPage() {
		return tasksPage;
	}

	public WebElement addTask() {
		return addTask;
	}

	public WebElement taskBox() {
		return taskBox;
	}

	public WebElement taskCategory() {
		return taskCategory;
	}

	public WebElement selectTask() {
		return selectTask;
	}

	public WebElement addButton() {
		return addButton;
	}

	public WebElement addTask2() {
		return addTask2;
	}

	public WebElement taskBox2() {
		return taskBox2;
	}

	public WebElement taskCategory2() {
		return taskCategory2;
	}

	public WebElement selectTask2() {
		return selectTask2;
	}

	public WebElement addButton2() {
		return addButton2;
	}

	public WebElement addTask3() {
		return addTask3;
	}

	public WebElement taskBox3() {
		return taskBox3;
	}

	public WebElement taskCategory3() {
		return taskCategory3;
	}

	public WebElement selectTask3() {
		return selectTask3;
	}

	public WebElement addButton3() {
		return addButton3;
	}
}
