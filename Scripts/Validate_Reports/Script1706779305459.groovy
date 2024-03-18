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

WebUI.setText(findTestObject('Object Repository/input_Email_email'), 'eikatalon_30')

WebUI.setEncryptedText(findTestObject('Object Repository/input_Password_password'), '1SjtSZQC0js=')

WebUI.click(findTestObject('Object Repository/button_SIGN IN'))
Thread.sleep(15000);

/*WebUI.click(findTestObject('Object Repository/signout_Dropdown'))
String s=WebUI.getText(findTestObject('Object Repository/username'))
String username=s.substring(4);
System.out.println("username:" +username);
String report_Name="ei_Sim_Report_".concat(username);
System.out.println("Reportname:" +report_Name);
//WebUI.verifyElementPresent('Object Repository/downloadreport_Button', 10)*/

WebElement element = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/downloadreport_Button'), 5)

WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(element))

System.out.println("clicked on download report button");
Thread.sleep(15000);
/*File verify_Reports=new File("C:\\Users\\MounikaVadde\\Katalon Studio\\EI_Katalon\\user_Reports")
File[] all_reports=verify_Reports.listFiles()
int n=all_reports.size();
for (File file : n)
{
	if(file.getName().contains(report_Name))
	{
		System.out.println("Report is downloaded successfully");

	}
}*/
