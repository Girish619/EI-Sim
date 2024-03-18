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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://accounts.knolskape.com/user/login?service=eis&variant=default&type=1&continue=https%3A%2F%2Faccounts.knolskape.com%2Fv1%2Foauth%2Fauthorize%3Fservice%3Deis%26type%3D1%26demostorylineid%3D1%26client_id%3Deis%26response_type%3Dcode%26variant%3Ddefault%26scope%3Dopenid+offline_access%26state%3DeyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZnRlclVybCI6Imh0dHBzOi8vYXBwLWVpcy5rbm9sc2thcGUuY29tLyIsImlhdCI6MTcwNTA1NTUxMn0.Ja7yhk_pbl_NboVsvRsG1si7I-Pn45LgB1BkSeKbXGE%26variant%3Ddefault&demostorylineid=1')

WebUI.setText(findTestObject('Object Repository/input_Email_email'), 'ei_katalon_32')

WebUI.setEncryptedText(findTestObject('Object Repository/input_Password_password'), 'eJ3NDSvHe48=')

WebUI.click(findTestObject('Object Repository/button_SIGN IN'))
