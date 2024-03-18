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

String expectedTitle = 'EI | KNOLSKAPE'

//Validate Title
CustomKeywords.'customKeywords.Validations.validateTitle'(expectedTitle)

//Validate Logo
WebUI.verifyElementVisible(findTestObject('Object Repository/IntroductionPage/EI_Logo'))

//Validate org img1
WebUI.verifyElementVisible(findTestObject('Object Repository/IntroductionPage/OrgPage_Img1'))

//Validate org img2
WebUI.verifyElementVisible(findTestObject('Object Repository/IntroductionPage/OrgPage_Img2'))

//Validate org img3
WebUI.verifyElementVisible(findTestObject('Object Repository/IntroductionPage/OrgPage_Img3'))


//Validate Logout Button
CustomKeywords.'customKeywords.Validations.validateButtonWithText'(expectedLogoutText, findTestObject('Object Repository/Introduction Page/Logout_Btn'))

WebUI.click(findTestObject('Object Repository/IntroductionPage/Logout_Btn'))

WebUI.verifyElementVisible(findTestObject('Object Repository/SignOut/Logout_Icon'))


CustomKeywords.'customKeywords.Validations.validateText'(expectedLogoutMenuText, findTestObject('Object Repository/SignOut/Logout_Heading'))

CustomKeywords.'customKeywords.Validations.validateText'(expectedLogoutDescriptionText, findTestObject('Object Repository/SignOut/Logout_Description_Text'))

CustomKeywords.'customKeywords.Validations.validateButtonWithText'(expectedConfirmBtnText, findTestObject('Object Repository/SignOut/Logout_Confirm'))

CustomKeywords.'customKeywords.Validations.validateButtonWithText'(expectedCancelBtnText, findTestObject('Object Repository/SignOut/Logout_Cancel'))

WebUI.click(findTestObject('Object Repository/SignOut/Logout_Cancel'))

//Validate Organization page Title
CustomKeywords.'customKeywords.Validations.validateText'("Data Files/EI_Introduction", "title", 1, findTestObject('Object Repository/Introduction Page/organization_Text'))

//Validate Organization Description
CustomKeywords.'customKeywords.Validations.validateText'("Data Files/EI_Introduction", "description", 1, findTestObject('Object Repository/Introduction Page/Intro_Page_Description_Text'))

//Validate 'Tell me more' Button
CustomKeywords.'customKeywords.Validations.validateButton'(findTestObject('Object Repository/Introduction Page/Tell me more_btn'))

WebUI.click(findTestObject('Object Repository/Introduction Page/Tell me more_btn'))
