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

WebUI.click(findTestObject('Object Repository/Luma/Forgot password (verify that user can not reset password with invalid Captcha)/Page_Home Page/a_Sign In'))

WebUI.click(findTestObject('Object Repository/Luma/Forgot password (verify that user can not reset password with invalid Captcha)/Page_Customer Login/span_Forgot Your Password'))

WebUI.setText(findTestObject('Object Repository/Luma/Forgot password (verify that user can not reset password with invalid Captcha)/Page_Forgot Your Password/input_Email_email'), 'Adamamusa32@gmail.com')

WebUI.setText(findTestObject('Object Repository/Luma/Forgot password (verify that user can not reset password with invalid Captcha)/Page_Forgot Your Password/input_Please type the letters and numbers b_cf1d96'), 
    '77AM9')

WebUI.click(findTestObject('Object Repository/Luma/Forgot password (verify that user can not reset password with invalid Captcha)/Page_Forgot Your Password/span_Reset My Password'))

WebUI.verifyElementText(findTestObject('Object Repository/Luma/Forgot password (verify that user can not reset password with invalid Captcha)/Page_Customer Login/div_If there is an account associated with _42855a'), 
    'If there is an account associated with Adamamusa32@gmail.com you will receive an email with a link to reset your password.')

WebUI.closeBrowser()

