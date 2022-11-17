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

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.verifyElementPresent(findTestObject('HomePage/MakeAppointment'), 0)

WebUI.verifyElementPresent(findTestObject('HomePage/Toggle Menu'), 0)

WebUI.click(findTestObject('HomePage/Toggle Menu'))

WebUI.click(findTestObject('HomePage/TombolMenuLogin'))

WebUI.verifyElementPresent(findTestObject('Login/iUsername'), 0)

WebUI.verifyElementPresent(findTestObject('Login/iPassword'), 0)

WebUI.setText(findTestObject('Login/iUsername'), 'John Doe')

WebUI.setText(findTestObject('Login/iPassword'), 'ThisIsNotAPassword')

WebUI.click(findTestObject('Login/button_Login'))

WebUI.verifyElementPresent(findTestObject('Page_BookAppointment/button_BookAppointment'), 0)

WebUI.click(findTestObject('Done Appointment History/input_Apply for hospital readmission_hospital_readmission'))

WebUI.click(findTestObject('Page_BookAppointment/input_date'))

WebUI.click(findTestObject('Page_BookAppointment/Bulan_Tahun/td_31'))

WebUI.setText(findTestObject('Page_BookAppointment/Input Komentar'), 'test1234')

WebUI.click(findTestObject('Page_BookAppointment/button_BookAppointment'))

WebUI.verifyElementPresent(findTestObject('Done Appointment History/Appointment Konfirmasi'), 0)

WebUI.verifyElementPresent(findTestObject('Done Appointment History/p_testing1234'), 0)

WebUI.click(findTestObject('Done Appointment History/Toogle Menu'))

WebUI.click(findTestObject('Done Appointment History/a_History'))

WebUI.verifyElementPresent(findTestObject('Done Appointment History/History'), 0)

WebUI.verifyElementPresent(findTestObject('Done Appointment History/p_testing1234'), 0)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Done Appointment History/Toogle Menu'))

WebUI.click(findTestObject('Done Appointment History/a_Logout'))

