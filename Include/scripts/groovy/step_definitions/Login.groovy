package step_definitions
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When


class Login {

	@Given("User is already in login page")
	public void user_is_already_in_login_page() throws IOException  {
		WebUI.callTestCase(findTestCase('Login Page/Navigate_To_Url'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Title of the page is Login to EI")
	public void title_of_the_page_is_Login_to_CC() throws Exception {
		WebUI.callTestCase(findTestCase('Login Page/Validate_Title'),[:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Login Page/Validate_Sims_Title'),[:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Login Page/Validate_Welcome_Text'),[:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User enters username and password")
	public void User_enters_username_and_password() throws Exception  {
		WebUI.callTestCase(findTestCase('Login Page/Validate_Email_Textbox'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Login Page/Validate_Password_Textbox'), [:], FailureHandling.STOP_ON_FAILURE)
	}


	@Then("User clicks on signin button")
	public void User_clicks_on_signin_button() throws Exception{
		WebUI.callTestCase(findTestCase('Login Page/Validate_SignIn_Btn'), [:], FailureHandling.STOP_ON_FAILURE)
	}
}