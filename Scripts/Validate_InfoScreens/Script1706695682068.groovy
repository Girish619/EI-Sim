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

WebUI.click(findTestObject('Object Repository/info_dropdown'))

Thread.sleep(1000);
WebUI.click(findTestObject('null'))

Thread.sleep(1000);
String yourrole_text=WebUI.getText(findTestObject('Object Repository/text_yourrole'))
if(yourrole_text.contains('You have recently joined an experimental cross-functional team (XFT) at Tata Elxsi as a Research Associate.'))
{
	System.out.println("Your role data is displaying as expected");
}
WebElement element = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/close_info'), 10)
WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(element))


WebUI.click(findTestObject('Object Repository/info_dropdown'))
WebUI.click(findTestObject('Object Repository/IntroductionPage/yourteam'))
Thread.sleep(1000);
String yourteam_text=WebUI.getText(findTestObject('Object Repository/orgchart_name'))
if(yourteam_text.equalsIgnoreCase("Your Team"))
{
	System.out.println("'Your Team' text is present in the org chart");
}
boolean ispresent=WebUI.verifyElementVisible(findTestObject('Page_Login/actor_orgchart'))
if(ispresent)
{
	System.out.println("Org chart dispalyed");
	
}
else
{
	System.out.println("Org chart not dispalying");

}
WebElement element = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/close_info'), 10)
WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(element))


