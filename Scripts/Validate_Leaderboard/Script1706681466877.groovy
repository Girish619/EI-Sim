import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.logging.KeywordLogger
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

KeywordLogger reporter=new KeywordLogger()


final double obj1_score= Double.parseDouble(WebUI.getText(findTestObject('Object Repository/obj1_Score')));
final double obj2_score=Double.parseDouble(WebUI.getText(findTestObject('Object Repository/obj2_Score')))
System.out.println("obj1_score:" +obj1_score);
System.out.println("obj2_score:" +obj2_score);
WebUI.click(findTestObject('Object Repository/leaderboard'));
System.out.println("leaderboard clicked");

// ----validating username displayed as "you" on leaderboard

String user_text=WebUI.getText(findTestObject('Object Repository/user_leaderboard'))

if(user_text.equals("You"))
{
	reporter.logInfo("User entry is found in leaderboard")
	System.out.println("User entry is found in leaderboard");
}

//----validating user status on leaderboard
String leaderboard_status=WebUI.getText(findTestObject('Object Repository/leaderboard_status'))
if(leaderboard_status.equals("COMPLETED"))
{
	System.out.println("User status is displayed as 'COMPLETED'");
	
}

//----validating object scores on leaderboard popup and dashboard screen

double leaderboard_obj1= Double.parseDouble(WebUI.getText(findTestObject('Object Repository/leaderboard_obj1')))

double leaderboard_obj2= Double.parseDouble(WebUI.getText(findTestObject('leaderboard_obj2')))
if(obj1_score==leaderboard_obj1 && obj2_score==leaderboard_obj2)
{
	System.out.println("leaderboard scores are matching with the scores on the dashboard");
}
WebUI.click(findTestObject('Object Repository/leaderboard_close'))
System.out.println("Leaderboard popup closed");
