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
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.By as By
import org.openqa.selenium.By.ByXPath as ByXPath
import org.openqa.selenium.Keys
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.remote.server.handler.WebDriverHandler as WebElement


/*for (int i = 1; i <= findTestData('Data Files/conversation_Flow').getRowNumbers(); i++) {
 String present_Conversation = findTestData('Data Files/conversation_Flow').getValue('conversation_ID', i)
 if(present_Conversation.equals(mail_ID))
 {
 String mail_Response = findTestData('Data Files/conversation_Flow').getValue('mail_Response', i)*/

String mailReply=CustomKeywords.'customKeywords.Validations.mailResponse'(mail_ID)

TestObject tObj = findTestObject('Object Repository/Mails/mailxpath')

String xpath = tObj.findProperty("xpath").value

String mail_Reply=String.format(xpath,mailReply)

TestObject mail_User_Reply = new TestObject(mail_Reply)

mail_User_Reply.addProperty('xpath', ConditionType.EQUALS, mail_Reply)

//Verify user response present on the screen
WebUI.verifyElementVisible(mail_User_Reply)

//Click on usre response
WebUI.click(mail_User_Reply)

//Click on send button
WebUI.callTestCase(findTestCase('Mails/ClickOn_SendButton'), [:], FailureHandling.STOP_ON_FAILURE)

Thread.sleep(2000)
//Verify user response present on the screen
WebUI.verifyElementVisible(mail_User_Reply)
