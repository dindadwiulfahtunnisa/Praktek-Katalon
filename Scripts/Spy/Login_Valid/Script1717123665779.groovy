import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import java.net.http.WebSocket

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
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.entity.global.GlobalVariableEntity

import internal.GlobalVariable
import io.netty.handler.traffic.GlobalTrafficShapingHandler

import org.openqa.selenium.Keys as Keys


//Login Valid

'Membuka Web Browser'
WebUI.openBrowser('')
WebUI.maximizeWindow()

'Menampilkan Halaman Web - CURA Health Care'
WebUI.navigateToUrl(GlobalVariable.URL)
WebUI.takeScreenshot()

'Klik Menu Toggle'
WebUI.click(findTestObject('Object Repository/Spy/a_CURA Healthcare_menu-toggle'))

'Pilih dan Klik Menu Login'
WebUI.focus(findTestObject('Object Repository/Spy/a_Login'))
WebUI.takeScreenshot()
WebUI.click(findTestObject('Object Repository/Spy/a_Login'))

'Input Username dan Password'
WebUI.setText(findTestObject('Object Repository/Spy/input_Username_username'), GlobalVariable.Username)
WebUI.setText(findTestObject('Object Repository/Spy/input_Password_password'), GlobalVariable.Password)
WebUI.takeScreenshot()

'Klik Button Login'
WebUI.click(findTestObject('Object Repository/Spy/button_Login'))

//Verifikasi berhasil login
if (WebUI.verifyElementVisible(findTestObject('Object Repository/Spy/h2_Make Appointment')))
{
	println('Login Berhasil')
	'Tampilan Login Berhasil'
}
else
{
	println('Tidak Berhasil Login')
	'Tampilan Tidak Berhasil Login'
}
WebUI.takeScreenshot()
	

WebUI.delay(GlobalVariable.Waiting)
WebUI.closeBrowser()










