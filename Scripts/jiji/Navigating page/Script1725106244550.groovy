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

WebUI.navigateToUrl('https://jiji.ng/')

WebUI.click(findTestObject('Object Repository/Jiji/Page_Free classifieds in Nigeria  Post free_09f8ac/div_Sign in'))

WebUI.click(findTestObject('Object Repository/Jiji/Page_Free classifieds in Nigeria  Post free_09f8ac/span_E-mail or phone'))

WebUI.setText(findTestObject('Object Repository/Jiji/Page_Free classifieds in Nigeria  Post free_09f8ac/input_Email or Phone_fw-input qa-login-field'), 
    'Adamamusa32@yahoo.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Jiji/Page_Free classifieds in Nigeria  Post free_09f8ac/input_Password_fw-input qa-password-field'), 
    '0eCV+Hi88AJuM5ceuvNXwQ==')

WebUI.click(findTestObject('Object Repository/Jiji/Page_Free classifieds in Nigeria  Post free_09f8ac/span_SIGN IN'))

WebUI.click(findTestObject('Object Repository/Jiji/Page_Free classifieds in Nigeria  Post free_09f8ac/a_Vehicles'))

WebUI.click(findTestObject('Object Repository/Jiji/Page_Free classifieds in Nigeria  Post free_09f8ac/li_Trucks  Trailers                       9_a64dbf'))

WebUI.closeBrowser()

