import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.By as By
import org.openqa.selenium.By.ByXPath as ByXPath
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebElement as WebElement

WebUI.openBrowser('')

WebUI.navigateToUrl('https://staging-eis-webapp.knolskape.io')

WebUI.setText(findTestObject('Object Repository/input_Email_email'), 'eikatalon_34')

WebUI.setEncryptedText(findTestObject('Object Repository/input_Password_password'), '1SjtSZQC0js=')

WebUI.click(findTestObject('Object Repository/button_SIGN IN'))

WebUI.click(findTestObject('Object Repository/span_I Agree to the Terms  Conditions'))

WebUI.click(findTestObject('Object Repository/button_Proceed'))

WebUI.click(findTestObject('Object Repository/IntroductionPage/Tell me more_btn'))

WebUI.click(findTestObject('Object Repository/Recorded_Locators/svg_Objectives_StyledIcon-sc-ofa7kd-0 kLzWwD'))

WebUI.click(findTestObject('Object Repository/path'))

WebUI.click(findTestObject('Object Repository/span_Start Simulation'))

for (int i = 0; i <= 7; i++) {
	WebUI.click(findTestObject('Object Repository/button_Next'))
}

for (int i = 1; i <= findTestData('Data Files/conversation_Flow').getRowNumbers(); i++) {
	String conversation_ID = findTestData('Data Files/conversation_Flow').getValue('conversation_ID', i)

	//checking coversation is mail or not
	if (conversation_ID.contains('mail')) {
		String mail_Subject = findTestData('Data Files/conversation_Flow').getValue('mail_Subject', i)

		String mail_Locator = ('(//span[contains(.,"' + mail_Subject) + '")])[1]'

		TestObject mail_Xpath = new TestObject(mail_Locator)

		mail_Xpath.addProperty('xpath', ConditionType.EQUALS, mail_Locator)

		WebElement element = WebUiCommonHelper.findWebElement(mail_Xpath, 30)

		WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(element))

		//below user click on close button which is present in first mail
		if (conversation_ID.equals('mail1')) {
			WebUI.click(findTestObject('Object Repository/button_Close'))
		}

		WebUI.callTestCase(findTestCase('Mails/Validate_ReplyButton'), [('i'):i], FailureHandling.STOP_ON_FAILURE)

	
		WebUI.callTestCase(findTestCase('Validate_GreatPopup'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Validate_NewResponse'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject('Object Repository/mail_BackButton'))
	}

	//checking call coevrsation and proceed with call responses
	if (conversation_ID.contains('call')) {
		WebUI.click(findTestObject('Object Repository/call_RespondButton'))
		WebUI.callTestCase(findTestCase('Validate_CallsConversations'), [('i'):i], FailureHandling.STOP_ON_FAILURE)
			}
}

WebUI.callTestCase(findTestCase('Validate_EndSimulationPopup'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('Validate_Reports'), [:], FailureHandling.STOP_ON_FAILURE)
