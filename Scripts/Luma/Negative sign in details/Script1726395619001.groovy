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

WebUI.navigateToUrl('https://magento-demo.mageplaza.com/default/')

WebUI.click(findTestObject('Object Repository/Jiji/Page_Home Page/a_Sign In'))

WebUI.setText(findTestObject('Object Repository/Jiji/Page_Customer Login/input_Email_loginusername'), 'Musaadama23@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Jiji/Page_Customer Login/input_Password_loginpassword'), '0eCV+Hi88AI+wC1cAJLwsg==')

WebUI.click(findTestObject('Object Repository/Jiji/Page_Customer Login/input_Password_show-password'))

WebUI.click(findTestObject('Object Repository/Jiji/Page_Customer Login/span_Sign In'))

WebUI.setText(findTestObject('Object Repository/Jiji/Page_Customer Login/input_Email_loginusername'), 'Adamamusa32@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Jiji/Page_Customer Login/input_Password_loginpassword'), 'PDt2Bqt0Bnw=')

WebUI.click(findTestObject('Object Repository/Jiji/Page_Customer Login/input_Password_show-password'))

WebUI.click(findTestObject('Object Repository/Jiji/Page_Customer Login/span_Sign In'))

WebUI.closeBrowser()

