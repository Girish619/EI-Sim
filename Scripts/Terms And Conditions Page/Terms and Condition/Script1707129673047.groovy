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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

String expectedTitle = 'Login to Conflict Resolution'

String expectedSimTitle = "Conflict Resolution"

String expectedTAndCTitleText = "Terms & Conditions"

String expectedUsername = "Username: "+GlobalVariable.username

String expectedSignoutText = "Sign out of ${expectedSimTitle}"

String expectedAgreeConditionText = 'I Agree to the Terms & Conditions'

String expectedProceedBtnText = "Proceed  "

//Validate Title
CustomKeywords.'customKeywords.Validations.validateTitle'(expectedTitle)

//Validate Sim Title
CustomKeywords.'customKeywords.Validations.validateText'(expectedSimTitle, findTestObject('Object Repository/Terms and Condition/Sim_Title_Text'))

//Validate Terms and Conditions Title
CustomKeywords.'customKeywords.Validations.validateText'(expectedTAndCTitleText, findTestObject('Object Repository/Terms and Condition/TAndC_Title_Text'))

//Validate Username
CustomKeywords.'customKeywords.Validations.validateText'(expectedUsername, findTestObject('Object Repository/Terms and Condition/Username'))

//Validate Signout
CustomKeywords.'customKeywords.Validations.validateButtonWithText'(expectedSignoutText, findTestObject('Object Repository/Terms and Condition/Sign_Out'))

//Validate Footer
CustomKeywords.'customKeywords.Validations.validateFooter'()

//Validate I Agree to the Terms and Condition
CustomKeywords.'customKeywords.Validations.validateText'(expectedAgreeConditionText, findTestObject('Object Repository/Terms and Condition/Agree_Check_Box_Text'))

try {
	
	WebUI.verifyElementNotChecked(findTestObject('null'), 10)
	
	WebUI.check(findTestObject('Object Repository/Terms and Condition/Agree_Check_Box_Text'))
	
	}catch(Exception e) {
	
	println "Check Box is already checked"
	
	}
	
//Validate Proceed Button
CustomKeywords.'customKeywords.Validations.validateButtonWithText'(expectedProceedBtnText, findTestObject('Object Repository/Terms and Condition/Proceed_Btn'))
	
WebUI.click(findTestObject('Terms and Condition/Proceed_Btn'))
