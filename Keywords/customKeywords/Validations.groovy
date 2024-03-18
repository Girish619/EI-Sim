package customKeywords
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import customExceptions.UserDefined
import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.testng.Assert
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


class Validations {

	KeywordLogger log = new KeywordLogger()

	KeywordUtil keyUtil = new KeywordUtil()

	@Keyword
	def validateTitle(String expectedTitle) {

		String actualTitle = WebUI.getWindowTitle()

		//		assert actualTitle.contains(expectedTitle) : log.logError("Actual Title: \""+actualTitle+"\" is not matching with Expected Title: \""+expectedTitle+"\"")

		if(actualTitle==expectedTitle) {

			keyUtil.logInfo("Actual Title: \""+actualTitle+"\" is matching with Expected Title: \""+expectedTitle+"\"")
		}else if(actualTitle.contains(expectedTitle)) {

			keyUtil.logInfo("Actual Title: \""+actualTitle+"\" contains Expected Title: \""+expectedTitle+"\"")
		}else {

			log.logError("Actual Title: \""+actualTitle+"\" is not matching with Expected Title: \""+expectedTitle+"\"")

			throw new UserDefined("Login page is not displaying, Please recheck the url")
		}

		keyUtil.markPassed("Title validated Successfully")
	}

	@Keyword
	def validateText(String expectedText, String actualText) {

		assert actualText == expectedText : log.logError("Actual Text: \""+actualText+"\" is not matching with Expected Text: \""+expectedText+"\"")

		keyUtil.logInfo("Actual Text: \""+actualText+"\" is matching with Expected Text: \""+expectedText+"\"")

		keyUtil.markPassed("Text validated Successfully")
	}

	@Keyword
	def validateText(String expectedText, TestObject to) {

		String actualText = WebUI.getText(to)

		//		assert actualText == expectedText : log.logError("Actual Text: \""+actualText+"\" is not matching with Expected Text: \""+expectedText+"\"")

		if(WebUI.verifyElementText(to, expectedText)) {
			keyUtil.logInfo("Actual Text: \""+actualText+"\" is matching with Expected Text: \""+expectedText+"\"")
		}else {
			log.logError("Actual Text: \""+actualText+"\" is not matching with Expected Text: \""+expectedText+"\"")
		}

		Assert.assertTrue(WebUI.verifyElementVisible(to))

		keyUtil.markPassed("Text validated Successfully")
	}

	@Keyword
	def validateText(String dataFileId, String columnName, int rowNumber, TestObject to) {

		String expectedText = findTestData(dataFileId).getValue(columnName, rowNumber)

		String actualText = WebUI.getText(to)

		//		assert actualText == expectedText : log.logError("Actual Text: \""+actualText+"\" is not matching with Expected Text: \""+expectedText+"\"")

		if(WebUI.verifyElementText(to, expectedText)) {
			keyUtil.logInfo("Actual Text: \""+actualText+"\" is matching with Expected Text: \""+expectedText+"\"")
		}else {
			log.logError("Actual Text: \""+actualText+"\" is not matching with Expected Text: \""+expectedText+"\"")
		}

		Assert.assertTrue(WebUI.verifyElementVisible(to))

		keyUtil.markPassed("Text validated Successfully")
	}

	@Keyword
	def validateFooter() {

		String expectedSimsTitle = 'Conflict Resolution'

		String expectedFooter = expectedSimsTitle+'| To experience is to learn | KNOLSKAPE © 2024'

		//Validate Footer
		String actualFooter = WebUI.getText(findTestObject('Object Repository/Login Page/Footer/Sim_Title')) + WebUI.getText(findTestObject('Object Repository/Login Page/Footer/Copy_Right'))

		assert actualFooter == expectedFooter : log.logError("Actual Footer Text: \""+actualFooter+"\" is not matching with Expected Footer Text: \""+expectedFooter+"\"")

		keyUtil.logInfo("Actual Footer Text: \""+actualFooter+"\" is matching with Expected Footer Text: \""+expectedFooter+"\"")

		WebUI.verifyElementVisible(findTestObject('Object Repository/Login Page/Footer/Sim_Title'))

		WebUI.verifyElementVisible(findTestObject('Object Repository/Login Page/Footer/Copy_Right'))

		WebUI.verifyElementClickable(findTestObject('Object Repository/Login Page/Footer/Knolskape_Link'))

		keyUtil.markPassed("Footer validated Successfully")
	}

	@Keyword
	def validateButtonWithText(String expectedText, TestObject to) {

		String actualText = WebUI.getText(to)

		//		assert actualText == expectedText : log.logError("Actual Text: \""+actualText+"\" is not matching with Expected Text: \""+expectedText+"\"")

		if(WebUI.verifyElementText(to, expectedText)) {
			keyUtil.logInfo("Actual Text: \""+actualText+"\" is matching with Expected Text: \""+expectedText+"\"")
		}else {
			log.logError("Actual Text: \""+actualText+"\" is not matching with Expected Text: \""+expectedText+"\"")
		}

		Assert.assertTrue(WebUI.verifyElementVisible(to))

		Assert.assertTrue(WebUI.verifyElementClickable(to))

		keyUtil.markPassed("Button validated Successfully")
	}

	@Keyword
	def validateButton(TestObject to) {

		WebUI.verifyElementVisible(to)

		WebUI.verifyElementClickable(to)

		keyUtil.markPassed("Button validated Successfully")
	}

	@Keyword
	def mailResponse(String mail_ID) {
		String mail_Response
		for (int i = 1; i <= findTestData('Data Files/conversation_Flow').getRowNumbers(); i++) {
			String present_Conversation = findTestData('Data Files/conversation_Flow').getValue('conversation_ID', i)
			if(present_Conversation.equals(mail_ID)) {


				mail_Response = findTestData('Data Files/conversation_Flow').getValue('mail_Response', i)
				//System.out.println(mail_Response);
				break;
			}
		}
		return mail_Response;
	}

	@Keyword
	def mailSubject(String mail_ID) {
		String mailSubject
		for (int i = 1; i <= findTestData('Data Files/conversation_Flow').getRowNumbers(); i++) {
			String present_Conversation = findTestData('Data Files/conversation_Flow').getValue('conversation_ID', i)
			if(present_Conversation.equals(mail_ID)) {
				mailSubject = findTestData('Data Files/conversation_Flow').getValue('mail_Subject', i)
				break;
			}
		}
		return mailSubject;
	}

	@Keyword
	def elementPresence(String to) {
		TestObject Obj = findTestObject(to)

		List<WebElement> buttonPresent = WebUI.findWebElements(Obj, 10)


		int m = buttonPresent.size()

		if (m >= 1) {

			WebUI.verifyElementVisible(to)

			WebUI.click(to)
		}
	}

	@Keyword
	def reply_mailcount(String mail_ID) {
		int count=0
		for(int i=1;i<=findTestData('Data Files/conversation_Flow').getRowNumbers();i++) {
			String mail_response=findTestData('Data Files/conversation_Flow').getValue('mail_Response', i)
			if(mail_response!="") {
				count++
			}
			return count;
		}
	}

	@Keyword
	def conversationcount(int actualcount, int expectedcount) {
		if(actualcount==expectedcount) {
			keyUtil.logInfo("Actual Text: \""+actualcount+"\" is matching with Expected Text: \""+expectedcount+"\"")
		}else {
			log.logError("Actual Text: \""+actualcount+"\" is not matching with Expected Text: \""+expectedcount+"\"")
		}
	}

	@Keyword
	def validateTextCSSWeight(String expectedText, TestObject to) {
		TestObject Obj = findTestObject('Object Repository/call_RespondButton')

		List<WebElement> buttonPresent = WebUI.findWebElements(Obj, 10)


		int m = buttonPresent.size()

		if (m==null) {

			String actualText = WebUI.getCSSValue(to, 'font-weight')

			//		assert actualText == expectedText : log.logError("Actual Text: \""+actualText+"\" is not matching with Expected Text: \""+expectedText+"\"")

			if(WebUI.verifyElementText(to, expectedText)) {
				keyUtil.logInfo("Actual Text: \""+actualText+"\" is matching with Expected Text: \""+expectedText+"\"")
			}else {
				log.logError("Actual Text: \""+actualText+"\" is not matching with Expected Text: \""+expectedText+"\"")
			}

			Assert.assertTrue(WebUI.verifyElementVisible(to))

			keyUtil.markPassed("Text validated Successfully")
		}
	}
	@Keyword
	def validateTextCSSColor(String expectedText, TestObject to) {
		TestObject Obj = findTestObject('Object Repository/call_RespondButton')

		List<WebElement> buttonPresent = WebUI.findWebElements(Obj, 10)


		int m = buttonPresent.size()

		if (m==null) {

			String actualText = WebUI.getCSSValue(to, 'color')

			//		assert actualText == expectedText : log.logError("Actual Text: \""+actualText+"\" is not matching with Expected Text: \""+expectedText+"\"")

			if(WebUI.verifyElementText(to, expectedText)) {
				keyUtil.logInfo("Actual Text: \""+actualText+"\" is matching with Expected Text: \""+expectedText+"\"")
			}else {
				log.logError("Actual Text: \""+actualText+"\" is not matching with Expected Text: \""+expectedText+"\"")
			}

			Assert.assertTrue(WebUI.verifyElementVisible(to))

			keyUtil.markPassed("Text validated Successfully")
		}
	}
}
