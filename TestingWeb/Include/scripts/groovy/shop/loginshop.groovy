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



class loginshop {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@And("user fill correct email (.*) and password (.*)")
	def fillEmailandPassword(String user, String pass) {
		WebUI.scrollToPosition(50, 300)
		WebUI.setText(findTestObject('Object Repository/Shop tools - login/input__username'), user)
		WebUI.setEncryptedText(findTestObject('Object Repository/Shop tools - login/input__password'), pass)
	}
	
	@And("user click login button")
	def clickLogin() {
		WebUI.click(findTestObject('Object Repository/Shop tools - login/button_Log in'))
	}

	@Then("verify login success (.*)")
	def verifyLogin(String verifying) {
		WebUI.getText(findTestObject('Shop tools - login/h1_My Account'))
		WebUI.verifyElementText(findTestObject('Object Repository/Shop tools - login/h1_My Account'), 'MY ACCOUNT')
		WebUI.scrollToPosition(50, 500)
		println verifying
	}
}