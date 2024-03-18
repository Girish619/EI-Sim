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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys
import org.testng.Assert
import org.testng.Reporter
import org.testng.Reporter as Keys

String expectedTitle = 'Login to @EI'

String expectedWelcomeTitle = 'Welcome!'

String expectedSimsTitle = 'Conflict Resolution'

String expectedEmailLabel = 'Email'

String expectedPasswordLabel = 'Password'

String expectedSignInBtnText = 'SIGN IN  '


WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.Url)

//Validate Title 
CustomKeywords.'customKeywords.customKeywords.Validations.validateTitle'(expectedTitle)

//Validate Welcome! text
CustomKeywords.'customKeywords.customKeywords.Validations.validateText'(expectedWelcomeTitle, findTestObject('Object Repository/Login Page/Welcome_Title_Text'))


//Validate Sim Title
CustomKeywords.'customKeywords.customKeywords.Validations.validateText'(expectedSimsTitle, findTestObject('Object Repository/Login Page/Sim_Logo'))

//Validate Footer
CustomKeywords.'customKeywords.customKeywords.Validations.validateFooter'()

//Validate Email Label
CustomKeywords.'customKeywords.customKeywords.Validations.validateText'(expectedEmailLabel, findTestObject('Object Repository/Login Page/Email_Label'))


//Validate Email text field is accessible
Assert.assertTrue(WebUI.verifyElementVisible(findTestObject('Object Repository/Login Page/Email_TxtField'))) 

WebUI.setText(findTestObject('Login Page/Email_TxtField'), GlobalVariable.username)


//Validate Password Label
CustomKeywords.'customKeywords.customKeywords.Validations.validateText'(expectedPasswordLabel, findTestObject('Object Repository/Login Page/Password_Label'))

// Validate Password text field is accessible
Assert.assertTrue(WebUI.verifyElementVisible(findTestObject('Object Repository/Login Page/Password_TxtField')))

WebUI.setEncryptedText(findTestObject('Login Page/Password_TxtField'), GlobalVariable.password)

//Validate Sign In Button
CustomKeywords.'customKeywords.customKeywords.Validations.validateButtonWithText'(expectedSignInBtnText, findTestObject('Object Repository/Login Page/Login_Btn'))

WebUI.click(findTestObject('Login Page/Login_Btn'))

