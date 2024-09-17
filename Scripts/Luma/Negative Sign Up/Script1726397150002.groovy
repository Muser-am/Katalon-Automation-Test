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

WebUI.click(findTestObject('Object Repository/Jiji/Page_Home Page/a_Create an Account'))

WebUI.setText(findTestObject('Object Repository/Jiji/Page_Create New Customer Account/input_First Name_firstname'), 'Musa')

WebUI.setText(findTestObject('Object Repository/Jiji/Page_Create New Customer Account/input_Last Name_lastname'), 'Adama')

WebUI.click(findTestObject('Object Repository/Jiji/Page_Create New Customer Account/input_Sign Up for Newsletter_assistance_all_2faa73'))

WebUI.setText(findTestObject('Object Repository/Jiji/Page_Create New Customer Account/input_Email_email'), 'Adamamusa32@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Jiji/Page_Create New Customer Account/input_Password_password'), '0eCV+Hi88AI+wC1cAJLwsg==')

WebUI.setEncryptedText(findTestObject('Object Repository/Jiji/Page_Create New Customer Account/input_Confirm Password_password_confirmation'), 
    '0eCV+Hi88AI+wC1cAJLwsg==')

WebUI.click(findTestObject('Object Repository/Jiji/Page_Create New Customer Account/input_Confirm Password_show-password'))

WebUI.click(findTestObject('Object Repository/Jiji/Page_Create New Customer Account/span_Create an Account'))

WebUI.verifyElementText(findTestObject('Object Repository/Jiji/Page_Create New Customer Account/div_There is already an account with this e_062fb5'), 
    'There is already an account with this email address. If you are sure that it is your email address, click here to get your password and access your account.')

WebUI.closeBrowser()

