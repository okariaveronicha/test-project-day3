package shop
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

import org.apache.commons.lang.RandomStringUtils as RandStr

class registershop {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("user open web")
	def openWebUrl() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://shop.demoqa.com/')
		WebUI.maximizeWindow()
	}

	@When("user click my account button")
	def clickMyAccount() {
		WebUI.click(findTestObject('Object Repository/Shop tools - register/a_Dismiss'))
		WebUI.click(findTestObject('Object Repository/Shop tools - register/a_My Account'))
	}
	
	def randomNum = RandStr.randomNumeric(2)
	
	@And("user fill username account")
	def fillUsername() {
		WebUI.scrollToPosition(50, 150)
		WebUI.setText(findTestObject('Object Repository/Shop tools - register/input__username'), 'okaria' + randomNum)
	}
	
	def rndNum = RandStr.randomNumeric(2)
	
	@And("user fill email")
	def fillEmail() {
		WebUI.setText(findTestObject('Object Repository/Shop tools - register/input__email'), 'okaria' + rndNum + '@gmail.com')
	}
	
	@And("user fill password account")
	def fillPassword() {
		WebUI.setEncryptedText(findTestObject('Object Repository/Shop tools - register/input__password'), 'R0HxUDq1D0hmqEmBgkwfdg==')
	}
	
	@And("user click register button")
	def clickRegister() {
		WebUI.click(findTestObject('Object Repository/Shop tools - register/button_Register'))
	}

	@Then("verify register success (.*)")
	def verifyRegister(String verify) {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Shop tools - register/form_Username or Email AddressPassword Remember Me'))
		println verify
	}
}