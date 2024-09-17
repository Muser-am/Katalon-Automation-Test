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

WebUI.navigateToUrl('https://qastudent-development.ogtlprojects.com/')

WebUI.click(findTestObject('Object Repository/CRUD/Create student/Page_Student CRUD/a_Student Management'))

WebUI.click(findTestObject('Object Repository/CRUD/Create student/Page_Student CRUD/a_Create Student'))

WebUI.setText(findTestObject('Object Repository/CRUD/Create student/Page_Student CRUD/input_First Name_first_name'), 'Musa')

WebUI.setText(findTestObject('Object Repository/CRUD/Create student/Page_Student CRUD/input_Last Name_last_name'), 'Adama')

WebUI.setText(findTestObject('Object Repository/CRUD/Create student/Page_Student CRUD/input_Code_reg_no'), '6625')

WebUI.click(findTestObject('Object Repository/CRUD/Create student/Page_Student CRUD/button_Create Student'))

WebUI.closeBrowser()

