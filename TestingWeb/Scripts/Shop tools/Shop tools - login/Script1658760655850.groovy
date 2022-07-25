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

WebUI.navigateToUrl('https://shop.demoqa.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Shop tools - login/a_Dismiss'))

WebUI.click(findTestObject('Object Repository/Shop tools - login/a_My Account'))

//WebUI.scrollToElement(findTestObject('Page_My Account  ToolsQA Demo Site/h2_Login'), 0)
WebUI.scrollToPosition(50, 120)
WebUI.setText(findTestObject('Object Repository/Shop tools - login/input__username'), 'okariaveronicha')

WebUI.setEncryptedText(findTestObject('Object Repository/Shop tools - login/input__password'), 'R0HxUDq1D0hmqEmBgkwfdg==')

WebUI.click(findTestObject('Object Repository/Shop tools - login/button_Log in'))

WebUI.verifyElementText(findTestObject('Object Repository/Shop tools - login/h1_My Account'), 'MY ACCOUNT')

WebUI.scrollToPosition(50, 120)

