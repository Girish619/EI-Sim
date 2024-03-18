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



class Mail {

	int i=WebUI.callTestCase(findTestCase('test_Data1'), [:], FailureHandling.STOP_ON_FAILURE)
	String mail_ID='mail'+i
	@Given("Mail conversation visible on the screen")
	def click_On_Mail() {


		//Validate mail present on the screen
		WebUI.callTestCase(findTestCase('Mails/Mail_ScreenPresence'), [('mail_ID'):mail_ID], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Mail is in unread mode")
	def validate_ReplyButton() {

		//Validate mail subject in bold before open the mail
		//WebUI.callTestCase(findTestCase('Mails/MailText_BeforeClick'), [('mail_ID'):mail_ID], FailureHandling.STOP_ON_FAILURE)

		//Validate the color of the mail before open the mail
		WebUI.callTestCase(findTestCase('Mails/Validate_UnreadMode'), [('mail_ID'):mail_ID], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Click on the mail")
	def clickOn_mailBackButton() {

		WebUI.callTestCase(findTestCase('Mails/ClickOnMail'), [('mail_ID'):mail_ID], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Do the actions for reply and replyall")
	def clickOn_ReplyButton() {
		WebUI.callTestCase(findTestCase('Mails/ClickOnReplyButton'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Mails/ClickOn_MailResponse'), [('mail_ID'):mail_ID], FailureHandling.STOP_ON_FAILURE)
		//WebUI.callTestCase(findTestCase('Mails/Validate_UserResponse'), [('mail_ID'):mail_ID], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Mails/Validate_NewResponse'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Mails/ClickOnBackButton'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Mail is in read mode")
	def readmode_actions() {
		WebUI.callTestCase(findTestCase('Mails/ClickOnBackButton'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Mails/MailText_AfterClick'), [('mail_ID'):mail_ID], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Mails/Validate_ReadMode'), [('mail_ID'):mail_ID], FailureHandling.STOP_ON_FAILURE)
	}
}