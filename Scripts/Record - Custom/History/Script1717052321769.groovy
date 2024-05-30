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

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.click(findTestObject('Object Repository/Record/i_CURA Healthcare_fa fa-bars'))

WebUI.click(findTestObject('Object Repository/Record/a_Login'))

WebUI.setText(findTestObject('Object Repository/Record/input_Username_username'), GlobalVariable.Username)

WebUI.setText(findTestObject('Object Repository/Record/input_Password_password'), GlobalVariable.Password)

WebUI.click(findTestObject('Object Repository/Record/button_Login'))

WebUI.click(findTestObject('Object Repository/Record/a_CURA Healthcare_menu-toggle'))

WebUI.click(findTestObject('Object Repository/Record/a_History'))

WebUI.click(findTestObject('Object Repository/Record/a_Go to Homepage'))

WebUI.click(findTestObject('Object Repository/Record/a_Make Appointment'))

WebUI.click(findTestObject('Object Repository/Record/label_Apply for hospital readmission'))

WebUI.click(findTestObject('Object Repository/Record/span_Visit Date (Required)_glyphicon glyphi_cada34'))

WebUI.click(findTestObject('Object Repository/Record/td_31'))

WebUI.click(findTestObject('Object Repository/Record/button_Book Appointment'))

WebUI.click(findTestObject('Object Repository/Record/i_CURA Healthcare_fa fa-bars'))

WebUI.click(findTestObject('Object Repository/Record/a_History'))

WebUI.takeScreenshot()

WebUI.closeBrowser()
