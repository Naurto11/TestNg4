package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass {

	public LoginPojo() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(className = "col-md-6 text-primary p-l-0 p-t-5 dochead-left")

	private WebElement newPage;

	public WebElement getNewPage() {
		return newPage;
	}

	@FindAll({
		
		@FindBy(xpath="//a[@ng-click='fnProfileMenu()']"),
		@FindBy(xpath="//a[@style='font-style: normal;']"),
		@FindBy(xpath="//a[@class='btn btn-success collapsed']")
	})
	
	private WebElement btnclk;;

	

	public WebElement getBtnclk() {
		return btnclk;
	}

	@FindBys({

			@FindBy(xpath = "//div[@class='swal-title']"),
			@FindBy(xpath = "//div[text()='Please enter Username & password']") })

	private WebElement novalue;

	public WebElement getNovalue() {
		return novalue;
	}

	public WebElement getWrongId() {
		return wrongId;
	}

	@FindBys({

			@FindBy(xpath = "//div[@class='swal-title']"), @FindBy(xpath = "//div[text()='Invalid User']") })

	private WebElement wrongId;

	@FindBys({

			@FindBy(xpath = "//div[@class='swal-title']"), @FindBy(xpath = "//div[text()='Please enter Username']") })

	private WebElement errorNotfy;

	@FindBys({

			@FindBy(xpath = "//button[@class='swal-button swal-button--confirm']"),
			@FindBy(xpath = "//button[text()='OK']") })

	private WebElement clkNotfyBtn;

	public WebElement getErrorNotfy() {
		return errorNotfy;
	}

	public WebElement getClkNotfyBtn() {
		return clkNotfyBtn;
	}

	@FindAll({

			@FindBy(xpath = "(//input[@type='text'])[1]"),
			@FindBy(xpath = "(//input[@aria-label='Text input with dropdown button'])[1]"),
			@FindBy(xpath = "//input[@class='form-control form-control-line col-md-8 m-t-20 ng-valid ng-touched ng-dirty ng-valid-parse ng-empty']")

	})

	private WebElement userid;

	@FindAll({

			@FindBy(xpath = "//input[@ng-model='Password']"),
			@FindBy(xpath = "//input[@class='form-control form-control-line col-md-8 ng-pristine ng-valid ng-empty ng-touched']"),
			@FindBy(xpath = "(//input[@type='password'])[1]")

	})
	private WebElement password;

	@FindAll({

			@FindBy(xpath = "//a[text()='Log In']"),
			@FindBy(xpath = "(//a[@class='btn btn-md btn-successcal col-lg-3 pull-right ng-binding'])[1]"),
			@FindBy(xpath = "//a[@ng-click='login();']") })

	private WebElement pressBtn;

	public WebElement getUserid() {
		return userid;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getPressBtn() {
		return pressBtn;
	}
	
	
}
