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

WebUI.click(findTestObject('Object Repository/Luma/Search Filter/Page_Home Page/a_Sign In'))

WebUI.setText(findTestObject('Object Repository/Luma/Search Filter/Page_Customer Login/input_Email_loginusername'), 'Adamamusa32@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Luma/Search Filter/Page_Customer Login/input_Password_loginpassword'), 
    '0eCV+Hi88AI+wC1cAJLwsg==')

WebUI.click(findTestObject('Object Repository/Luma/Search Filter/Page_Customer Login/span_Sign In'))

WebUI.setText(findTestObject('Object Repository/Luma/Search Filter/Page_Home Page/input_Search_q'), 'hoodie')

WebUI.click(findTestObject('Object Repository/Luma/Search Filter/Page_Home Page/li_Hoodie21'))

WebUI.setText(findTestObject('Object Repository/Luma/Search Filter/Page_Search results for Hoodie/input_Search_q'), 'Backpack')

WebUI.click(findTestObject('Object Repository/Luma/Search Filter/Page_Search results for Hoodie/button_Search'))

WebUI.doubleClick(findTestObject('Object Repository/Luma/Search Filter/Page_Search results for Backpack/input_Search_q'))

WebUI.setText(findTestObject('Object Repository/Luma/Search Filter/Page_Search results for Backpack/input_Search_q'), 'Bags')

WebUI.click(findTestObject('Object Repository/Luma/Search Filter/Page_Search results for Backpack/button_Search'))

WebUI.doubleClick(findTestObject('Object Repository/Luma/Search Filter/Page_Search results for Bags/input_Search_q'))

WebUI.setText(findTestObject('Object Repository/Luma/Search Filter/Page_Search results for Bags/input_Search_q'), 'Shoes')

WebUI.click(findTestObject('Object Repository/Luma/Search Filter/Page_Search results for Bags/button_Search'))

WebUI.setText(findTestObject('Object Repository/Luma/Search Filter/Page_Search results for Shoes/input_Search_q'), '')

WebUI.closeBrowser()

