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

int no_Reponces = Integer.parseInt(findTestData('Data Files/conversation_Flow').getValue('no.of_call_Resposes',i))

		for (int j = 1; j <= no_Reponces; j++) {
			String reseponse_Num = 'call_Response' + j

			String user_ResponseText = findTestData('Data Files/conversation_Flow').getValue(reseponse_Num, i)

			String callResponse_Xpath = ('//article[contains(text(),"' + user_ResponseText) + '")]'

			TestObject call_Xpath = new TestObject(callResponse_Xpath)

			call_Xpath.addProperty('xpath', ConditionType.EQUALS, callResponse_Xpath)

			WebElement e = WebUiCommonHelper.findWebElement(call_Xpath, 30)

			WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(e))

			WebUI.click(findTestObject('Object Repository/call_SendButton'))
		}

		WebUI.click(findTestObject('Object Repository/call_CloseButton'))
		WebUI.callTestCase(findTestCase('Validate_GreatPopup'), [:], FailureHandling.STOP_ON_FAILURE)