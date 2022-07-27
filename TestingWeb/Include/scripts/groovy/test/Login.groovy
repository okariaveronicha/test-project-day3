package test
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



class Login {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I open WebUrl")
	def openWeb() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://www.phptravels.net/')
		WebUI.maximizeWindow()
	}

	@When("I click button login page")
	def buttonLoginPage() {
		WebUI.click(findTestObject('Object Repository/Travels/Page_PHPTRAVELS  Travel Technology Partner _11a09b/a_Login'))
	}

	@And("I fill correct (.*) and (.*)")
	def fillUsrandPass(String username, String password) {
		WebUI.setText(findTestObject('Object Repository/Travels/Page_Login - PHPTRAVELS/input_Email_email'), username)
		WebUI.setEncryptedText(findTestObject('Object Repository/Travels/Page_Login - PHPTRAVELS/input_Password_password'), password)
	}

	@And("I click button login")
	def buttonLogin() {
		WebUI.scrollToPosition(50, 100)
		WebUI.click(findTestObject('Object Repository/Travels/Page_Login - PHPTRAVELS/span_Login'))
	}

	@Then("Login status (.*)")
	def loginSuccess(String status) {
		WebUI.refresh()
		String txtWB = WebUI.getText(findTestObject('Object Repository/Travels/Page_Dashboard - PHPTRAVELS/span_Welcome Back'))
		WebUI.verifyElementText(findTestObject('Travels/Page_Dashboard - PHPTRAVELS/span_Welcome Back'), txtWB)
		println status
	}

	@Then("Login failed (.*)")
	def loginFailed(String statusfailed) {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Travels/required'))
		println statusfailed
	}
}