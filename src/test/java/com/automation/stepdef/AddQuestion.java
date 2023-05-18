package com.automation.stepdef;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.automation.base.Base;
import com.automation.framework.Elements;
import com.automation.pages.AddQuestionPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AddQuestion extends Base {
	String codeSnippet = Base.reader.getCodeSnippet();

	AddQuestionPage scenA = new AddQuestionPage();
	Actions action1 = new Actions(driver);

	@Given("^I launch the application$")
	public void i_launch_the_application() throws Throwable {
		Base.driver.get(Base.reader.getUrl());
		Thread.sleep(2000);
		System.out.println("Launch the application");

	}

	@Then("^I enter emailid \"([^\"]*)\"$")
	public void i_enter_emailid_something(String mailid) throws Throwable {
		Thread.sleep(2000);
		Elements.TypeText(AddQuestionPage.enteremailid, mailid);

	}

	@Then("^I click on Next$")
	public void i_click_on_next() throws Throwable {
		Thread.sleep(1000);
		Elements.KeyboardEnter(AddQuestionPage.clickonNext);

	}

	@Then("^I enter password \"([^\"]*)\"$")
	public void i_enter_password_something(String password) throws Throwable {
		Thread.sleep(1000);
		Elements.TypeText(AddQuestionPage.enterpassword, password);

	}

	@Then("^I click on login button$")
	public void i_click_on_login_button() throws Throwable {
		Thread.sleep(2000);
		Elements.click(AddQuestionPage.clickonLogin);

	}

	@Then("^I click on Question$")
	public void i_click_on_question() throws Throwable {
		Thread.sleep(1000);
		Elements.click(AddQuestionPage.CliockonQuestion);

	}

	@Then("^I click on add question$")
	public void i_click_on_add_question() throws Throwable {
		Thread.sleep(1000);
		Elements.click(AddQuestionPage.CliockonAddQuestion);

	}

	@Then("^I click on coding$")
	public void i_click_on_coding() throws Throwable {
		Thread.sleep(1000);
		Elements.click(AddQuestionPage.Clickoncoding);

	}

	@Then("^I click on select and proceed$")
	public void i_click_on_select_and_proceed() throws Throwable {
		Thread.sleep(1000);
		Elements.click(AddQuestionPage.SelcetAndProced);

	}

	@Then("^I select core programming and skill-coding in Assessment$")
	public void i_select_core_programming_and_skillcoding_in_assessment() throws Throwable {
		Thread.sleep(1000);
		Elements.click(AddQuestionPage.ClickonAssementType);
		Thread.sleep(1000);
		Elements.click(AddQuestionPage.SelectCoreProgrammingCoding);

	}

	@Then("^I select MID level in Complexity$")
	public void i_select_mid_level_in_complexity() throws Throwable {
		Thread.sleep(1000);
		Elements.click(AddQuestionPage.ClickonComplexity);
		Thread.sleep(1000);
		Elements.click(AddQuestionPage.SelectMidLevel);

	}

	@Then("^I enter the question \"([^\"]*)\"$")
	public void i_enter_the_question_something(String Question) throws Throwable {
		Thread.sleep(1000);
		Elements.click(AddQuestionPage.EnterQuestion);
		Thread.sleep(1000);
		Elements.TypeText(AddQuestionPage.EnterQuestion, Question);
		Thread.sleep(1000);
		Elements.scrollIntoViewAndClick(AddQuestionPage.EnterProgramInput);

	}

	@Then("^I enter Program Input 1 \"([^\"]*)\"$")
	public void i_enter_program_input_1_something(String programinput) throws Throwable {
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("(//div[@class='view-line'])[1]"));
		action1.moveToElement(element).click().sendKeys(programinput).build().perform();
	}

	@Then("^I enter Program Output 1 \"([^\"]*)\"$")
	public void i_enter_program_output_1_something(String programoutput) throws Throwable {
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("(//div[@class='view-line'])[2]"));
		action1.moveToElement(element).click().sendKeys(programoutput).build().perform();

	}

	@Then("^I enter Sample Input 1 \"([^\"]*)\"$")
	public void i_enter_sample_input_1_something(String sampleinput) throws Throwable {
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("(//div[@class='view-line'])[3]"));
		action1.moveToElement(element).click().sendKeys(sampleinput).build().perform();

	}

	@Then("^I enter Sample Output 1 \"([^\"]*)\"$")
	public void i_enter_sample_output_1_something(String sampleoutput) throws Throwable {
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("(//div[@class='view-line'])[4]"));
		action1.moveToElement(element).click().sendKeys(sampleoutput).build().perform();

	}

	@Then("^I enter Hidden Input 1 \"([^\"]*)\"$")
	public void i_enter_hidden_input_1_something(String Hiddeninput1) throws Throwable {
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("(//div[@class='view-line'])[5]"));
		action1.moveToElement(element).click().sendKeys(Hiddeninput1).build().perform();

	}

	@Then("^I enter Hidden Output 1 \"([^\"]*)\"$")
	public void i_enter_hidden_output_1_something(String Hiddenoutput1) throws Throwable {
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("(//div[@class='view-line'])[6]"));
		action1.moveToElement(element).click().sendKeys(Hiddenoutput1).build().perform();
		Thread.sleep(2000);
		Elements.scrollIntoViewAndClick(AddQuestionPage.AddAnotherHiddenInputAndOut);
	}

	@Then("^I click on Add another Hidden Program Input & Output$")
	public void i_click_on_add_another_hidden_program_input_output() throws Throwable {
		Thread.sleep(2000);
		WebElement element = driver
				.findElement(By.cssSelector("div[class='input-separator'] span[class='d-flex ml-2']"));
		action1.moveToElement(element).click().perform();
		Thread.sleep(3000);

	}

	@Then("^I enter Hidden Input 2 \"([^\"]*)\"$")
	public void i_enter_hidden_input_2_something(String Hiddeninput2) throws Throwable {
		Thread.sleep(4000);
		WebElement element = driver.findElement(By.xpath("(//div[@class='view-line'])[7]"));
		action1.moveToElement(element).click().sendKeys(Hiddeninput2).build().perform();
		Thread.sleep(2000);

	}

	@Then("^I enter Hidden Output 2 \"([^\"]*)\"$")
	public void i_enter_hidden_output_2_something(String Hiddenoutput2) throws Throwable {
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("(//div[@class='view-line'])[8]"));
		action1.moveToElement(element).click().sendKeys(Hiddenoutput2).build().perform();
		Thread.sleep(1000);
		Elements.click(AddQuestionPage.AddAnotherHiddenInputAndOut);
		Thread.sleep(1000);

	}

	@Then("^I enter Hidden Input 3 \"([^\"]*)\"$")
	public void i_enter_hidden_input_3_something(String Hiddeninput3) throws Throwable {
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("(//div[@class='view-line'])[9]"));
		action1.moveToElement(element).click().sendKeys(Hiddeninput3).build().perform();
	}

	@Then("^I enter Hidden Output 3 \"([^\"]*)\"$")
	public void i_enter_hidden_output_3_something(String Hiddenoutput3) throws Throwable {
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("(//div[@class='view-line'])[10]"));
		action1.moveToElement(element).click().sendKeys(Hiddenoutput3).build().perform();
		Thread.sleep(1000);
		Elements.click(AddQuestionPage.AddAnotherHiddenInputAndOut);

	}

	@Then("^I enter Hidden Input 4 \"([^\"]*)\"$")
	public void i_enter_hidden_input_4_something(String Hiddeninput4) throws Throwable {
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("(//div[@class='view-line'])[11]"));
		action1.moveToElement(element).click().sendKeys(Hiddeninput4).build().perform();

	}

	@Then("^I enter Hidden Output 4 \"([^\"]*)\"$")
	public void i_enter_hidden_output_4_something(String Hiddenoutput4) throws Throwable {
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("(//div[@class='view-line'])[12]"));
		action1.moveToElement(element).click().sendKeys(Hiddenoutput4).build().perform();
		Thread.sleep(1000);
		Elements.click(AddQuestionPage.AddAnotherHiddenInputAndOut);
	}

	@Then("^I enter Hidden Input 5 \"([^\"]*)\"$")
	public void i_enter_hidden_input_5_something(String Hiddeninput5) throws Throwable {
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("(//div[@class='view-line'])[13]"));
		action1.moveToElement(element).click().sendKeys(Hiddeninput5).build().perform();
	}

	@Then("^I enter Hidden Output 5 \"([^\"]*)\"$")
	public void i_enter_hidden_output_5_something(String Hiddenoutput5) throws Throwable {
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("(//div[@class='view-line'])[14]"));
		action1.moveToElement(element).click().sendKeys(Hiddenoutput5).build().perform();
		Thread.sleep(1000);

	}

	@Then("^I select JavaScript-Coding in Skill$")
	public void i_select_javascriptcoding_in_skill() throws Throwable {
		Thread.sleep(2000);
		Elements.click(AddQuestionPage.clickonSkill);
		Thread.sleep(2000);
		Elements.click(AddQuestionPage.SelectJavaScript);
		Thread.sleep(4000);

	}

	@Then("^I enter Code Snippet$")
	public void i_enter_code_snippet() throws Throwable {
		Thread.sleep(2000);
		Elements.click(AddQuestionPage.EntercodeSnippet);
		String code = "rl.on('line', (input) => {\n" + "  const n = parseInt(input);\n"
				+ "  const result = fibonacci(n);\n" + "  console.log(result);\n" + "});\n"
				+ "function fibonacci(n) {\n" + "  let memo = {};\n" + "  function fib(n) {\n"
				+ "    // Write code here\n\n" + "    return memo[n];\n" + "  }\n" + "  return fib(n);\n" + "}";

		System.out.println(code);
		WebElement element = driver.findElement(By.xpath("(//div[@class='view-line'])[15]"));
		action1.moveToElement(element).click().sendKeys(code).build().perform();
		Thread.sleep(8000);
		Elements.scrollIntoViewAndClick(AddQuestionPage.EnterExperienceStartsFrom);

	}

    @Then("^I enter Experience From \"([^\"]*)\"$")
    public void i_enter_experience_from_something(String from) throws Throwable {
		Thread.sleep(2000);
		Elements.TypeText(AddQuestionPage.EnterExperienceStartsFrom, from);

	}

    @Then("^I enter Experience To \"([^\"]*)\"$")
    public void i_enter_experience_to_something(String till) throws Throwable {
		Thread.sleep(2000);
		Elements.TypeText(AddQuestionPage.EnterExperience, till);

	}

	@Then("^I enter Est resp time in sec \"([^\"]*)\"$")
	public void i_enter_est_resp_time_in_sec_something(String time) throws Throwable {
		Thread.sleep(4000);
		Elements.TypeText(AddQuestionPage.EnterTimesec, time);

	}

    @Then("^I enter Reference$")
    public void i_enter_reference() throws Throwable {
		Thread.sleep(2000);
		Elements.click(AddQuestionPage.EnterRefernce);
		Thread.sleep(1000);
		String reference = "var readline = require('readline');/n"
				+ " var rl = readline.createInterface(process.stdin, process.stdout);/n"
				+ " /n"
				+ " rl.on('line', (input) => {/n"
				+ "    const n = parseInt(input);/n"
				+ "    const result = fibonacci(n);/n" 
				+ "    console.log(result);/n"
				+ " });/n" 
				+ " /n"
				+ " function fibonacci(n) {/n" 
				+ "    let memo = {};/n"
				+ "    function fib(n) {/n"
				+ "        if (n <= 1) return n;/n"
				+ "        if (n in memo) return memo[n];/n"
				+ "        memo[n] = fib(n-1) + fib(n-2);/n"
				+ "        return memo[n];/n" 
				+ "    }/n"
				+ "    return fib(n);/n"
				+ " }";
		WebElement element = driver.findElement(By.xpath("(//div[@class='rdw-editor-main'])[2]"));
		action1.moveToElement(element).click().sendKeys(reference).build().perform();
		System.out.println(reference);
		Thread.sleep(4000);

	}
    @Then("^I click on Add Question Button$")
    public void i_click_on_add_question_button() throws Throwable {
    	Thread.sleep(2000);
    	Elements.click(AddQuestionPage.AddQuestionButton);
    	}
    }
