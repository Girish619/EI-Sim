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



	WebUI.click(findTestObject('Object Repository/Mails/mail_replyallbutton'))
	System.out.println("clicked on replyall button");
	WebUI.click(findTestObject('Object Repository/Mails/addPeople_button'))
	System.out.println("clicked on add people button");
	WebElement element = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/Mails/actor_addPeople'), 10)
	WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(element))
	
	System.out.println("clicked on actor 1");
	Thread.sleep(2000);
	WebElement element1 = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/Mails/add_button'), 10)
	WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(element1))
	
	
	System.out.println("Clicked on add button after selecting actor");
	Thread.sleep(2000);
	WebElement element2 = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/Mails/cc_addPeople'), 10)
	WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(element2))
	
	System.out.println("Clicked on cc add people");
	Thread.sleep(2000);
	WebElement element3 = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/Mails/actor_addPeople_cc'), 10)
	WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(element3))
	
	System.out.println("Clicked on cc actor");
	Thread.sleep(2000);
	WebElement element4 = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/Mails/add_button'), 10)
	WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(element4))
	
	System.out.println("Clicked on cc add button");

