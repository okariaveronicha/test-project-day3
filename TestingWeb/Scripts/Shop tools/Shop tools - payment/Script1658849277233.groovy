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

WebUI.click(findTestObject('Object Repository/Shop tools - checkout/a_Dismiss'))

WebUI.click(findTestObject('Object Repository/Shop tools - checkout/a_My Account'))

WebUI.setText(findTestObject('Object Repository/Shop tools - checkout/input__username'), 'user123@phptravels.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Shop tools - checkout/input__password'), 'FGeui0Il9vvLqwyijXFuow==')

WebUI.click(findTestObject('Object Repository/Shop tools - checkout/button_Log in'))

WebUI.click(findTestObject('Object Repository/Shop tools - checkout/span_Cart(2)33.00'))

WebUI.click(findTestObject('Object Repository/Shop tools - checkout/a_Proceed to checkout'))

WebUI.setText(findTestObject('Object Repository/Shop tools - checkout/input__billing_first_name'), 'oka')

WebUI.setText(findTestObject('Object Repository/Shop tools - checkout/input__billing_last_name'), 'ria')

WebUI.click(findTestObject('Object Repository/Shop tools - checkout/span_Indonesia'))

WebUI.click(findTestObject('Object Repository/Shop tools - checkout/span_Indonesia_select2-selection__arrow'))

WebUI.setText(findTestObject('Object Repository/Shop tools - checkout/input__billing_address_1'), 'jalan karet karya')

WebUI.setText(findTestObject('Object Repository/Shop tools - checkout/input__billing_city'), 'jakarta selatan')

WebUI.click(findTestObject('Object Repository/Shop tools - checkout/span_DKI Jakarta_select2-selection__arrow'))
//
//WebUI.setText(findTestObject('Object Repository/Shop tools - checkout/input__billing_postcode'), '12910')
//
//WebUI.setText(findTestObject('Object Repository/Shop tools - checkout/input__billing_phone'), '0812345678902')

WebUI.click(findTestObject('Object Repository/Shop tools - checkout/input_privacy policy_terms'))

WebUI.click(findTestObject('Object Repository/Shop tools - checkout/button_Place order'))
WebUI.scrollToPosition(50, 800)
WebUI.verifyElementVisible(findTestObject('Object Repository/Shop tools - checkout/p_Thank you. Your order has been received'))

