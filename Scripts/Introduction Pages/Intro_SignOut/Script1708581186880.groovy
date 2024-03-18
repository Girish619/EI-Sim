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


String expectedLogoutText = 'Sign out'

String expectedLogoutMenuText = 'Are you sure you want to sign out?'

String expectedLogoutDescriptionText = ' You can sign back into the simulation anytime you want and resume from the'
 

String expectedConfirmBtnText = 'Yes,sign out'

String expectedCancelBtnText = 'Cancel'


//Validate Logout Button
CustomKeywords.'customKeywords.Validations.validateButtonWithText'(expectedLogoutText, findTestObject('Object Repository/Introduction Page/Logout_Btn'))

WebUI.click(findTestObject('Object Repository/IntroductionPage/Logout_Btn'))

WebUI.verifyElementVisible(findTestObject('Object Repository/SignOut/Logout_Icon'))

CustomKeywords.'customKeywords.Validations.validateText'(expectedLogoutMenuText, findTestObject('Object Repository/SignOut/Logout_Heading'))

CustomKeywords.'customKeywords.Validations.validateText'(expectedLogoutDescriptionText, findTestObject('Object Repository/SignOut/Logout_Description_Text'))

CustomKeywords.'customKeywords.Validations.validateButtonWithText'(expectedConfirmBtnText, findTestObject('Object Repository/SignOut/Logout_Confirm'))

CustomKeywords.'customKeywords.Validations.validateButtonWithText'(expectedCancelBtnText, findTestObject('Object Repository/SignOut/Logout_Cancel'))

WebUI.click(findTestObject('Object Repository/SignOut/Logout_Cancel'))

