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
import org.apache.commons.lang3.StringUtils;
/*String s
String str = "Hi {{actors.player.nickName}} ,Welcome to HSS! We are excited to have you on board as the Executive Vice President of Sales. You will be leading a team of 6 people whose unique skillsets have helped HSS reach the pinnacle of success in the past. We have been looking for a unifying force to help the team work together with renewed vigour. As a leader of the team, we hope that you will be able to energize the team and turn things around for the better. A lot is riding on you! All the best! Warm Regards,{{actors.actor_1.nickName}}";
String[] splited = str.split(" ");
HashMap hm = new HashMap();
for(int i=0; i<=splited.size()-1;i++) {

	String result = StringUtils.substringBetween(splited[i],"{{","}}");

	if(result!=null){
		
		hm.put(result,"em");
		System.out.println(result);
		s=str.replace('{{'+result+'}}',hm.get(result))
		
	}
	System.out.println(s)
	}*/

String s, val, str
for (int i = 1; i <= findTestData('Data Files/Conversations').getRowNumbers(); i++) {
	String present_Conversation = findTestData('Data Files/Conversations').getValue('ConversationID', i)
	if(present_Conversation.equals("EI1")) {
		mailSubject = findTestData('Data Files/Conversations').getValue('Body_EN', i)
String[] splited = mailSubject.split(" ");
 HashMap<String, String> hm = new HashMap<>();
        // Define the pattern to match words starting with "{{" and ending with "}}"
        Pattern pattern = Pattern.compile("\\{\\{.*?}}");
        Matcher matcher = pattern.matcher(mailSubject);
        // Iterate over the matched patterns
        while (matcher.find()) {
            String result = StringUtils.substringBetween(matcher.group(), "{{", "}}");
            if (result != null) {
				if(result.equals("actors.player.nickName"))
				{
					val='em'
				}
				if(result.equals("actors.actor_1.nickName"))
					{
						val='mou'
					}
                hm.put(result,val);
                System.out.println(result);
                str = mailSubject.replace("{{" + result + "}}", hm.get(result));
				
            }
          }
		  	}
	
	System.out.println(str);
	}