package com.quantum.steps;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.JavascriptExecutor;

import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.step.QAFTestStepProvider;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebElement;
import com.quantum.utils.DeviceUtils;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

@QAFTestStepProvider
public class selendroidStepDefs {
	
	@When("^I verify page$")
	public void verify_Homepage() throws Throwable {
		
      QAFExtendedWebElement ButtonIcon= new QAFExtendedWebElement("icon.folder1");
      ButtonIcon.click();

	}
	
//	@QAFTestStep(description="I Enter {0} username")
	@When("^I Enter \"([^\"]*)\" username$")
	public void enterUsername(String username) throws Throwable {
		
       new QAFExtendedWebElement("Username_text_feild").sendKeys(username);
      
	}
	
//	@QAFTestStep(description="I Enter emailID {0}")
	@When("^I Enter emailID \"([^\"]*)\"$")
	public void Enter_EmailID(String emailID) throws Throwable {
		
      new QAFExtendedWebElement("email_text_field").sendKeys(emailID);
	}
	
	@When("^I Enter password \"([^\"]*)\"$")
	public void password(String password) throws Throwable {
		
      new QAFExtendedWebElement("password_text_field").sendKeys(password);
	}
	
	@When("^I fetch name$")
	public String getName() throws Throwable {
		String text=new QAFExtendedWebElement("name").getAttribute("text");
		
     return text;
	}
	
	@When("^I validate name \"([^\"]*)\"$")
	public void validateName(String Name) throws Throwable {
		
	
	assertEquals(Name, getName());
  //   return text;
	}
	@And("Enter password \"([^\"]*)\"$")
	public void enterPassword(String Password){
		
		 QAFExtendedWebElement ButtonIcon= new QAFExtendedWebElement("icon.folder1");
		
//		JavascriptExecutor js = (JavascriptExecutor) DeviceUtils.getQAFDriver();
//		js.executeScript("arguments[0].click();", ButtonIcon);
	
		new QAFExtendedWebElement("password_text_field").sendKeys(Password);
	}

}
