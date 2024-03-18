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

String tag
for (int i = 1; i <= findTestData('Data Files/conversation_Flow').getRowNumbers(); i++) {
	String conversation_ID = findTestData('Data Files/conversation_Flow').getValue('conversation_ID', i)
	System.out.println(conversation_ID)
	//checking coversation is mail or not
	if (conversation_ID.contains('mail'))
	{

		tag='@'+findTestData('Data Files/conversation_Flow').getValue('mail_Type', i)

		System.out.println(tag)
		WebUI.callTestCase(findTestCase('RunnerFiles/Mail_RunnerFile'), [('tag'):tag], FailureHandling.STOP_ON_FAILURE)
     }
	//checking call coevrsation and proceed with call responses
	else
	{
		System.out.println('this is call')
		WebUI.click(findTestObject('Object Repository/call_RespondButton'))
		WebUI.callTestCase(findTestCase('Validate_CallsConversations'), [('i'):i], FailureHandling.STOP_ON_FAILURE)
	}
}

