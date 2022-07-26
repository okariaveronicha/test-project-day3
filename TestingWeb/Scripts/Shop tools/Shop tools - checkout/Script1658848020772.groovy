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

WebUI.scrollToPosition(50, 200)

WebUI.setText(findTestObject('Object Repository/Shop tools - checkout/input__username'), 'user123@phptravels.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Shop tools - checkout/input__password'), 'FGeui0Il9vvLqwyijXFuow==')

WebUI.click(findTestObject('Object Repository/Shop tools - checkout/button_Log in'))

WebUI.click(findTestObject('Object Repository/Shop tools - checkout/span_ToolsQA Demo Site'))

WebUI.scrollToPosition(50, 250)

WebUI.click(findTestObject('Object Repository/Shop tools - checkout/a_pink drop shoulder oversized t shirt'))

WebUI.scrollToPosition(50, 800)

WebUI.selectOptionByValue(findTestObject('Object Repository/Shop tools - checkout/select_Choose an optionPink'), 'pink', 
    true)

WebUI.click(findTestObject('Object Repository/Shop tools - checkout/select_Choose an option363738'))

WebUI.click(findTestObject('Object Repository/Shop tools - checkout/36'))

WebUI.click(findTestObject('Object Repository/Shop tools - checkout/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/Shop tools - checkout/span_T-shirt'))

WebUI.scrollToPosition(50, 250)

WebUI.click(findTestObject('Object Repository/Shop tools - checkout/a_black lux graphic t-shirt'))

WebUI.scrollToPosition(50, 800)

WebUI.selectOptionByValue(findTestObject('Object Repository/Shop tools - checkout/select_Choose an optionBlack'), 'black', 
    true)

WebUI.click(findTestObject('Object Repository/Shop tools - checkout/select_Choose an option323436'))

WebUI.click(findTestObject('Object Repository/Shop tools - checkout/34'))

WebUI.click(findTestObject('Object Repository/Shop tools - checkout/button_Add to cart (1)'))

WebUI.click(findTestObject('Object Repository/Shop tools - checkout/span_Cart(2)33.00'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Shop tools - checkout/form_ProductNamePriceQuantityTotal         _a62139'))
WebUI.scrollToPosition(50, 800)


