package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.base.Base;

public class AddQuestionPage {

	public AddQuestionPage() {

		PageFactory.initElements(Base.driver, this);

	}

	@FindBy(xpath = "//input[@id='login-email-input']")
	public static WebElement enteremailid;

	@FindBy(xpath = "//input[@id='login-password-input']")
	public static WebElement enterpassword;

	@FindBy(xpath = "//button[@id='login']")
	public static WebElement clickonLogin;
	
	@FindBy(xpath = "//button[@id='login']")
	public static WebElement clickonNext;
	
	@FindBy(xpath = "//a[@id='questionIcon']//*[local-name()='svg']")
	public static WebElement CliockonQuestion;

	@FindBy(xpath = "//button[normalize-space()='Add Question']")
	public static WebElement CliockonAddQuestion;

	@FindBy(xpath = "//div[@class='ant-modal-content']//div[3]")
	public static WebElement Clickoncoding;

	@FindBy(xpath = "//button[@class='ant-btn ant-btn-primary ml-3']")
	public static WebElement SelcetAndProced;

	@FindBy(xpath = "//div[@heading='Assessment']//div[@class='ant-select-selector']")
	public static WebElement ClickonAssementType;

	@FindBy(xpath = "//div[contains(text(),'Core Programming Skill - CODING')]")
	public static WebElement SelectCoreProgrammingCoding;

	@FindBy(xpath = "//div[@heading='Complexity']//div[@class='ant-select-selector']")
	public static WebElement ClickonComplexity;

	@FindBy(xpath = "//div[@class='ant-select-item-option-content'][normalize-space()='MID']")
	public static WebElement SelectMidLevel;

	@FindBy(xpath = "//div[@class='notranslate public-DraftEditor-content']")
	public static WebElement EnterQuestion;

	@FindBy(xpath = "(//div[@class='view-line'])[1]")
	public static WebElement EnterProgramInput;

	@FindBy(xpath = "(//div[@class='view-line'])[2]")
	public static WebElement EnterProgramOutput;

	@FindBy(xpath = "(//div[@class='view-line'])[3]")
	public static WebElement EnterSampleInput;

	@FindBy(xpath = "(//div[@class='view-line'])[4]")
	public static WebElement EnterSampleOutput;

	@FindBy(xpath = "(//div[@class='view-line'])[5]")
	public static WebElement EnterHiddenInput1;

	@FindBy(xpath = "(//div[@class='view-line'])[6]")
	public static WebElement EnterHiddenOutput1;

	@FindBy(xpath = "(//*[name()='svg'][@id='add-line'])[1]")
	public static WebElement AddAnotherHiddenInputAndOut;

	@FindBy(xpath = "(//div[@class='view-line'])[7]")
	public static WebElement EnterHiddenInput2;

	@FindBy(xpath = "(//div[@class='view-line'])[8]")
	public static WebElement EnterHiddenOutput2;

	@FindBy(xpath = "(//div[@class='view-line'])[9]")
	public static WebElement EnterHiddenInput3;

	@FindBy(xpath = "(//div[@class='view-line'])[10]")
	public static WebElement EnterHiddenOutput3;

	@FindBy(xpath = "(//div[@class='view-line'])[11]")
	public static WebElement EnterHiddenInput4;

	@FindBy(xpath = "(//div[@class='view-line'])[12]")
	public static WebElement EnterHiddenOutput4;

	@FindBy(xpath = "(//div[@class='view-line'])[13]")
	public static WebElement EnterHiddenInput5;

	@FindBy(xpath = "(//div[@class='view-line'])[14]")
	public static WebElement EnterHiddenOutput5;

	@FindBy(xpath = "(//div[@class='ant-select-selector'])[3]")
	public static WebElement clickonSkill;

	@FindBy(xpath = "(//div[@class='ant-select-item-option-content'])[14]")
	public static WebElement SelectJavaScript;

	@FindBy(xpath = "(//div[@class='view-line'])[15]")
	public static WebElement EntercodeSnippet;

	@FindBy(xpath = "(//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng'])[3]")
	public static WebElement EnterExperienceStartsFrom;

	@FindBy(xpath = "(//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng'])[4]")
	public static WebElement EnterExperience;

	@FindBy(xpath = "(//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng'])[5]")
	public static WebElement EnterTimesec;

	@FindBy(xpath = "(//div[@class='rdw-editor-main'])[2]")
	public static WebElement EnterRefernce;
	
	@FindBy(xpath = "//button[@class='ant-btn ant-btn-primary ml-3']")
	public static WebElement AddQuestionButton;


}
