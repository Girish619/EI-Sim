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

/*for (int i = 1; i <= findTestData('Data Files/conversation_Flow').getRowNumbers(); i++) {
	String present_Conversation = findTestData('Data Files/conversation_Flow').getValue('conversation_ID', i)


	if(present_Conversation.equals(mail_ID))
	{
        String mail_Subject = findTestData('Data Files/conversation_Flow').getValue('mail_Subject', i)*/

        String mail_Subject=CustomKeywords.'customKeywords.Validations.mailSubject'(mail_ID)
        System.out.println(mail_Subject)
		TestObject tObj = findTestObject('Object Repository/Mails/mailxpath')
		
		String xpath = tObj.findProperty("xpath").value
		
		String mail_Locator=String.format(xpath,mail_Subject)
		
		TestObject mail_Xpath = new TestObject(mail_Locator)

		mail_Xpath.addProperty('xpath', ConditionType.EQUALS, mail_Locator)

		WebElement element = WebUiCommonHelper.findWebElement(mail_Xpath, 30)

		WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(element))

		//below user click on close button which is present in first mail
		if (mail_ID.equals('mail1')) {
			
			String expectedCloseBtnText='Close'
			//Validate Close Button
			CustomKeywords.'customKeywords.Validations.validateButtonWithText'(expectedCloseBtnText, findTestObject('Object Repository/Mails/button_Close'))
			
			WebUI.verifyElementVisible(findTestObject('Object Repository/Mails/button_Close'))
			
			WebUI.click(findTestObject('Object Repository/Mails/button_Close'))
		}
