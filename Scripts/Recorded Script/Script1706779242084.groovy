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
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebElement as WebElement

WebUI.openBrowser('')

WebUI.navigateToUrl('https://accounts.knolskape.com/user/login?service=eis&variant=default&type=1&continue=https%3A%2F%2Faccounts.knolskape.com%2Fv1%2Foauth%2Fauthorize%3Fservice%3Deis%26type%3D1%26demostorylineid%3D1%26client_id%3Deis%26response_type%3Dcode%26variant%3Ddefault%26scope%3Dopenid+offline_access%26state%3DeyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhZnRlclVybCI6Imh0dHBzOi8vYXBwLWVpcy5rbm9sc2thcGUuY29tLyIsImlhdCI6MTcwNTA1NTUxMn0.Ja7yhk_pbl_NboVsvRsG1si7I-Pn45LgB1BkSeKbXGE%26variant%3Ddefault&demostorylineid=1')

WebUI.setText(findTestObject('Object Repository/input_Email_email'), 'ei_katalon_32')

WebUI.setEncryptedText(findTestObject('Object Repository/input_Password_password'), 'eJ3NDSvHe48=')

WebUI.click(findTestObject('Object Repository/button_SIGN IN'))

WebUI.click(findTestObject('Object Repository/span_I Agree to the Terms  Conditions'))

WebUI.click(findTestObject('Object Repository/button_Proceed'))

WebUI.click(findTestObject('Object Repository/IntroductionPage/Tell me more_btn'))

WebUI.click(findTestObject('Object Repository/Recorded_Locators/svg_Objectives_StyledIcon-sc-ofa7kd-0 kLzWwD'))

WebUI.click(findTestObject('Object Repository/path'))

WebUI.click(findTestObject('Object Repository/span_Start Simulation'))

/*WebUI.click(findTestObject('Object Repository/button_Next'))

WebUI.click(findTestObject('Object Repository/button_Next'))

WebUI.click(findTestObject('Object Repository/button_Next'))

WebUI.click(findTestObject('Object Repository/button_Next'))

WebUI.click(findTestObject('Object Repository/button_Next'))

WebUI.click(findTestObject('Object Repository/button_Next'))

WebUI.click(findTestObject('Object Repository/button_Next'))*/
for (int i = 0; i <= 7; i++) {
    WebUI.click(findTestObject('Object Repository/button_Next'))
}

WebElement element = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/mail1'), 30)

WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(element))

WebUI.click(findTestObject('Object Repository/button_Close'))

WebUI.click(findTestObject('Object Repository/Recorded_Locators/svg_Sent_StyledIcon-sc-ofa7kd-0 hbUILT'))

WebUI.click(findTestObject('Object Repository/mail2'))

WebUI.click(findTestObject('Object Repository/Recorded_Locators/img_Just Now_StyledImage-sc-ey4zx9-0 hydiME'))

WebUI.click(findTestObject('Object Repository/Recorded_Locators/article_HiSharon,I understand you are disap_602182'))

WebUI.click(findTestObject('Object Repository/span_Send'))

WebUI.click(findTestObject('Object Repository/Recorded_Locators/span_1 New Response'))

WebUI.click(findTestObject('Object Repository/Recorded_Locators/span_Conversations'))

WebUI.click(findTestObject('Object Repository/Recorded_Locators/div_Ira KnolowitzPotential Client Partnersh_f6d5d1'))

WebUI.click(findTestObject('Object Repository/span_Reply'))

WebUI.click(findTestObject('Object Repository/Recorded_Locators/article_Dear Ira,We regret whatever transpi_05f098'))

WebUI.click(findTestObject('Object Repository/div_Send'))

WebUI.click(findTestObject('Object Repository/Recorded_Locators/span_1 New Response'))

WebUI.click(findTestObject('Object Repository/Recorded_Locators/article_mail_49030'))

WebUI.click(findTestObject('Object Repository/Recorded_Locators/span_Conversations'))

WebUI.click(findTestObject('Object Repository/span_Respond Now'))

WebUI.click(findTestObject('Object Repository/Recorded_Locators/article_Mike, although I understand your di_86841c'))

//WebElement ele = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/span_SEND (1)'), 30)
//WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(ele))
WebUI.click(findTestObject('Object Repository/span_SEND (1)'))

WebUI.click(findTestObject('Object Repository/Recorded_Locators/article_I completely empathize with you but_2b2902'))

WebUI.click(findTestObject('Object Repository/span_SEND (1)'))

//WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(ele))
WebUI.click(findTestObject('Object Repository/Recorded_Locators/article_Glen, I think you may be over-react_0aae37'))

WebUI.click(findTestObject('Object Repository/span_SEND (1)'))

WebUI.click(findTestObject('Object Repository/Recorded_Locators/article_Hmmm. It seems like you are overthi_695f7c'))

WebUI.click(findTestObject('Object Repository/span_SEND (1)'))

WebUI.waitForElementClickable(findTestObject('span_Close'), 10)

//WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(ele))
WebUI.click(findTestObject('Object Repository/span_Close'))

WebUI.click(findTestObject('Object Repository/div_Respond Now'))

WebUI.click(findTestObject('Object Repository/Recorded_Locators/article_You lookexhausted, Jenna. Your work_1a1287'))

WebUI.click(findTestObject('Object Repository/span_SEND (1)'))

WebUI.waitForElementClickable(findTestObject('span_Close'), 10)

//WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(ele))
WebUI.click(findTestObject('Object Repository/span_Close'))

WebUI.click(findTestObject('Object Repository/Recorded_Locators/span_Hi Em, I hope you are doing well. I am_c7ed5e'))

WebUI.click(findTestObject('Object Repository/span_Reply'))

WebUI.click(findTestObject('Object Repository/Recorded_Locators/article_MonicaYou must understand that I am_4a3b0c'))

WebUI.doubleClick(findTestObject('Object Repository/Recorded_Locators/div_Monica Jones-Account ExecutiveTo EmeryJ_aec599'))
WebUI.click(findTestObject('Object Repository/span_Send'))

WebUI.click(findTestObject('Object Repository/Recorded_Locators/span_1 New Response'))

//WebUI.click(findTestObject('Object Repository/Recorded_Locators/span_Conversations'))

WebUI.click(findTestObject('Object Repository/span_Respond Now'))

WebUI.click(findTestObject('Object Repository/Recorded_Locators/article_I understand your anger but even if_7ca012'))

WebUI.click(findTestObject('Object Repository/span_SEND (1)'))

//WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(ele))
WebUI.waitForElementClickable(findTestObject('span_Close'), 10)

WebUI.click(findTestObject('Object Repository/span_Close'))

WebUI.click(findTestObject('Object Repository/Recorded_Locators/span_Hi Em, One of the top talents of your _2421d8'))

WebUI.click(findTestObject('Object Repository/Recorded_Locators/span_Conversations'))

WebUI.click(findTestObject('Object Repository/span_Respond Now'))

WebUI.click(findTestObject('Object Repository/Recorded_Locators/article_Travis, it is very unlike you tobe _4dd560'))

WebUI.click(findTestObject('Object Repository/span_SEND (1)'))

//WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(ele))
WebUI.click(findTestObject('Object Repository/Recorded_Locators/article_We are there foryou.Let me know if _a6a11e'))

WebUI.click(findTestObject('Object Repository/span_SEND (1)'))

//WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(ele))
WebUI.waitForElementClickable(findTestObject('span_Close'), 10)

WebUI.click(findTestObject('Object Repository/span_Close'))

WebUI.click(findTestObject('Object Repository/div_Respond Now'))

WebUI.click(findTestObject('Object Repository/Recorded_Locators/article_Monica, you are lacking in confiden_eaf87f'))

WebUI.click(findTestObject('Object Repository/span_SEND (1)'))

//WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(ele))
WebUI.waitForElementClickable(findTestObject('span_Close'), 10)

WebUI.click(findTestObject('Object Repository/span_Close'))

WebUI.click(findTestObject('Object Repository/Recorded_Locators/div_Delilah GonzalezSales Representative Ne_d12a5e'))

WebUI.click(findTestObject('Object Repository/span_Reply'))

WebUI.click(findTestObject('Object Repository/Recorded_Locators/article_Del,I think you are stressing out o_4cd843'))

WebUI.click(findTestObject('Object Repository/div_Send'))

WebUI.click(findTestObject('Object Repository/Recorded_Locators/span_1 New Response'))

WebUI.click(findTestObject('Object Repository/Recorded_Locators/span_Conversations'))

WebUI.click(findTestObject('Object Repository/div_Respond Now'))

WebUI.click(findTestObject('Object Repository/Recorded_Locators/article_There is most definitely a possibil_9a0d29'))

WebUI.click(findTestObject('Object Repository/span_SEND (1)'))

//WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(ele))
WebUI.click(findTestObject('Object Repository/Recorded_Locators/article_Based on the projects,you can decid_0bbccc'))

WebUI.click(findTestObject('Object Repository/span_SEND (1)'))

WebUI.click(findTestObject('Object Repository/Recorded_Locators/article_I am surprised to see such a lukewa_d8e33b'))

WebUI.click(findTestObject('Object Repository/Recorded_Locators/div_Click SEND after choosing your response_100c43'))

WebUI.click(findTestObject('Object Repository/span_SEND (1)'))

WebUI.waitForElementClickable(findTestObject('span_Close'), 10)

WebUI.click(findTestObject('Object Repository/span_Close'))

WebUI.click(findTestObject('Object Repository/Recorded_Locators/span_Hi Em, Hope this is a good time Just w_72ac82'))

WebUI.click(findTestObject('Object Repository/span_Reply'))

WebUI.click(findTestObject('Object Repository/span_Add People'))

WebUI.click(findTestObject('Object Repository/Recorded_Locators/span_Ira Knolowitz'))

WebUI.click(findTestObject('Object Repository/span_Add'))

WebUI.click(findTestObject('Object Repository/span_Add People'))

WebUI.click(findTestObject('Object Repository/Recorded_Locators/span_Delilah Gonzalez'))

WebUI.click(findTestObject('Object Repository/span_Add'))

WebUI.click(findTestObject('Object Repository/Recorded_Locators/article_Travis,I genuinely apologize for no_eabe68'))

WebUI.click(findTestObject('Object Repository/span_Send'))

WebUI.click(findTestObject('Object Repository/Recorded_Locators/span_1 New Response'))

WebUI.click(findTestObject('Object Repository/Recorded_Locators/span_Conversations'))

WebUI.click(findTestObject('Object Repository/Recorded_Locators/span_Delay in project timelines'))

WebUI.click(findTestObject('Object Repository/span_Reply'))

WebUI.click(findTestObject('Object Repository/Recorded_Locators/article_Hi River, Thanks for reaching out. _df8f94'))

WebUI.click(findTestObject('Object Repository/div_Send'))

WebUI.click(findTestObject('Object Repository/Recorded_Locators/span_1 New Response'))

WebUI.click(findTestObject('Object Repository/Recorded_Locators/span_Conversations'))

WebUI.click(findTestObject('Object Repository/Recorded_Locators/span_Am very concerned'))

WebUI.click(findTestObject('Object Repository/span_Reply'))

WebUI.click(findTestObject('Object Repository/Recorded_Locators/article_Mike,I am not denying that its goin_11108c'))

WebUI.click(findTestObject('Object Repository/span_Send'))

WebUI.click(findTestObject('Object Repository/Recorded_Locators/span_1 New Response'))

WebUI.click(findTestObject('Object Repository/Recorded_Locators/span_Conversations'))

WebUI.click(findTestObject('Object Repository/Recorded_Locators/span_Heads up'))

WebUI.click(findTestObject('Object Repository/Recorded_Locators/img_Just Now_StyledImage-sc-ey4zx9-0 hydiME'))

WebUI.click(findTestObject('Object Repository/Recorded_Locators/article_Sharon,Oh I am so sorry to hear thi_fadcfe'))

WebUI.click(findTestObject('Object Repository/span_Send'))

WebUI.click(findTestObject('Object Repository/Recorded_Locators/span_1 New Response'))

WebUI.click(findTestObject('Object Repository/Recorded_Locators/span_Conversations'))

WebUI.click(findTestObject('Object Repository/span_Respond Now'))

WebUI.click(findTestObject('Object Repository/Recorded_Locators/article_I understand your predicament but Z_5781c6'))

WebUI.click(findTestObject('Object Repository/span_SEND (1)'))

WebUI.waitForElementClickable(findTestObject('span_Close'), 10)

WebUI.click(findTestObject('Object Repository/span_Close'))

WebUI.click(findTestObject('Object Repository/span_Respond Now'))

WebUI.click(findTestObject('Object Repository/Recorded_Locators/article_Do you have the time to work on thi_c3090b'))

WebUI.click(findTestObject('Object Repository/span_SEND (1)'))

WebUI.click(findTestObject('Object Repository/Recorded_Locators/article_Use Mike instead. He needs to know _525cf8'))

WebUI.click(findTestObject('Object Repository/span_SEND (1)'))

WebUI.waitForElementClickable(findTestObject('span_Close'), 10)

WebUI.click(findTestObject('Object Repository/span_Close'))

WebUI.click(findTestObject('Object Repository/span_End Simulation'))

