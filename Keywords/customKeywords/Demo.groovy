package customKeywords
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import java.util.regex.Matcher;
import java.util.regex.Pattern

import com.google.api.client.repackaged.org.apache.commons.codec.binary.StringUtils
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

import com.kms.katalon.core.annotation.Keyword

class Demo {
	private String V;
	static int i=0;
	@Keyword
	public mail_conversationID() {
		i++;
		return i;
	}

	@Keyword
	public mailResponse(String mail_ID) {
		String mail_Response
		for (int i = 1; i <= findTestData('Data Files/conversation_Flow').getRowNumbers(); i++) {
			String present_Conversation = findTestData('Data Files/conversation_Flow').getValue('conversation_ID', i)
			if(present_Conversation.equals(mail_ID)) {


				mail_Response = findTestData('Data Files/conversation_Flow').getValue('mail_Response', i)

				System.out.println(mail_Response);
			}
			break;
		}
	}

	@Keyword
	public Actor_Labels(String Key) {
		TestData testData = findTestData('Data Files/ActorLables');

		// Initialize result variable
		String result = "";

		// Flag to track if the label is found
		boolean labelFound = false;

		// Iterate through the test data
		for (int i = 1; i <= testData.getRowNumbers(); i++) {
			String label = testData.getValue('Label', i);
			if (label.equals(Key)) {
				V = testData.getValue('Text_EN', i);
				result = V;
				labelFound = true; // Set flag to true
				break; // Exit the loop
			}
		}

		// Check if label was not found and handle accordingly
		if (!labelFound) {
			System.out.println("Label '" + Key + "' not found.");
		}
		return V;
	}

	@Keyword
	public getV(String mail) {
		String mailSubject
		String s, val, str
		for (int i = 1; i <= findTestData('Data Files/Conversations').getRowNumbers(); i++) {
			String present_Conversation = findTestData('Data Files/Conversations').getValue('ConversationID', i);
			if(present_Conversation.equals("EI1")) {
				mailSubject = findTestData('Data Files/Conversations').getValue('Body_EN', i);

				String[] splited = mailSubject.split(" ");
				HashMap<String, String> hm = new HashMap<>();
				// Define the pattern to match words starting with "{{" and ending with "}}"
				Pattern pattern = Pattern.compile("\\{\\{.*?}}");
				Matcher matcher = pattern.matcher(mailSubject);
				// Iterate over the matched patterns
				while (matcher.find()) {
					String result = StringUtils.substringBetween(matcher.group(), "{{", "}}");
					if (result != null) {
						//String val = ""; // Initialize val variable
						val=CustomKeywords.'customKeywords.Demo.Actor_Labels'(result)
						hm.put(result, val);
						System.out.println(result);
						mailSubject = mailSubject.replace("{{" + result + "}}", hm.get(result)); // Update mailSubject with replaced value
					}
				}
				System.out.println(mailSubject); // Print the updated mailSubject
				break; // Exit the loop after processing one row
			}
		}
		return(mailSubject)
	}
}

