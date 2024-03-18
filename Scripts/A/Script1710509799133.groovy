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

TestData testData = findTestData('Data Files/ActorLables');
    
    // Initialize result variable
    String result = "";
    
    // Flag to track if the label is found
    boolean labelFound = false;
    
    // Iterate through the test data
    for (int i = 1; i <= testData.getRowNumbers(); i++) {
        String label = testData.getValue('Label', i);
        if (label.equals("actors.player.nickName")) {
            String V = testData.getValue('Text_EN', i);
            result = V;
            labelFound = true; // Set flag to true
            break; // Exit the loop
        }
    }
    
    // Check if label was not found and handle accordingly
    if (!labelFound) {
        System.out.println("Label 'actors.player.nickName' not found.");
    }
    return result;
