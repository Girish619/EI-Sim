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
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

String expectedTitle = 'Conflict Resolution | KNOLSKAPE'

String attributeName = 'data-testid'

String musicOnAttributeValue = 'music-icon-enabled'

String musicOffAttributeValue = 'music-icon-disabled'

String expectedLogoutText = 'Logout'

String expectedLogoutMenuText = 'Logout'

String expectedLogoutDescriptionText = 'Are you sure you want to logout?'

String expectedConfirmBtnText = 'Confirm'

String expectedCancelBtnText = 'Cancel'

//Validate Title
CustomKeywords.'customKeywords.Validations.validateTitle'(expectedTitle)

//Validate Logo
WebUI.verifyElementVisible(findTestObject('null'))

//validate Music Button
CustomKeywords.'customKeywords.Validations.validateButton'(findTestObject('Object Repository/Introduction Page/Music_Btn'))

if(WebUI.verifyElementAttributeValue(findTestObject('Object Repository/Introduction Page/Music_Btn'), attributeName, musicOnAttributeValue, 10)) {
	
	WebUI.click(findTestObject('Object Repository/Introduction Page/Music_Btn'))
	
	WebUI.verifyElementAttributeValue(findTestObject('Object Repository/Introduction Page/Music_Btn'), attributeName, musicOffAttributeValue, 10)
		
}else{
	
	WebUI.click(findTestObject('Object Repository/Introduction Page/Music_Btn'))
	
	WebUI.verifyElementAttributeValue(findTestObject('Object Repository/Introduction Page/Music_Btn'), attributeName, musicOnAttributeValue, 10)
	
}

WebUI.click(findTestObject('Object Repository/Introduction Page/Music_Btn'))

//Validate Logout Button
CustomKeywords.'customKeywords.Validations.validateButtonWithText'(expectedLogoutText, findTestObject('Object Repository/Introduction Page/Logout_Btn'))

WebUI.click(findTestObject('Object Repository/Introduction Page/Logout_Btn'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Logout/Logout_Icon'))

CustomKeywords.'customKeywords.Validations.validateText'(expectedLogoutMenuText, findTestObject('Object Repository/Logout/Logout_Heading'))

CustomKeywords.'customKeywords.Validations.validateText'(expectedLogoutDescriptionText, findTestObject('Object Repository/Logout/Logout_Description_Text'))

CustomKeywords.'customKeywords.Validations.validateButtonWithText'(expectedConfirmBtnText, findTestObject('Object Repository/Logout/Logout_Confirm'))

CustomKeywords.'customKeywords.Validations.validateButtonWithText'(expectedCancelBtnText, findTestObject('Object Repository/Logout/Logout_Cancel'))

WebUI.click(findTestObject('Object Repository/Logout/Logout_Cancel'))

//Validate Introduction page Title
CustomKeywords.'customKeywords.Validations.validateText'("Data Files/CR_Introduction", "title", 2, findTestObject('Object Repository/Introduction Page/Intro_Page_Title_Text'))

//Validate Intoduction Description
CustomKeywords.'customKeywords.Validations.validateText'("Data Files/CR_Introduction", "description", 2, findTestObject('Object Repository/Introduction Page/Intro_Page_Description_Text'))

//Validate Previous Button
WebUI.verifyElementVisible(findTestObject('Object Repository/Introduction Page/Intro_Previous_Btn'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Introduction Page/Intro_Previous_Btn'))

//Validate Next Button
CustomKeywords.'customKeywords.Validations.validateButton'(findTestObject('Object Repository/Introduction Page/Intro_Next_Btn'))

WebUI.click(findTestObject('Object Repository/Introduction Page/Intro_Next_Btn'))



