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
import java.util.Random as Random

Mobile.startExistingApplication('id.co.bri.stroberikasir')

//Mobile.callTestCase(findTestCase('Case/Login retailer'), [:], FailureHandling.STOP_ON_FAILURE)
//Mobile.setText(findTestObject('Object Repository/Login/android.widget.EditText - Nomor Ponsel'), '0812345678906', 0)
//
//Mobile.setEncryptedText(findTestObject('Object Repository/Login/android.widget.EditText - Kata Sandi'), 'iFGeFYmXIrUhQZHvW7P22w==', 0)
//
//Mobile.tap(findTestObject('Object Repository/Login/android.widget.Button - Masuk'), 0)
//
//Mobile.tap(findTestObject('Object Repository/Buka tutup kas/android.widget.Button - Tutup Kas'), 0)

Random rnd = new Random()
randomNumber =  (1000000 + rnd.nextInt(9999999))

Mobile.setText(findTestObject('Object Repository/Buka tutup kas/android.widget.EditText - Masukkan saldo kas tunai disini'), String.valueOf(randomNumber), 0)

Mobile.tap(findTestObject('Object Repository/Buka tutup kas/android.widget.Button - Buka Kas'), 0)

Mobile.tap(findTestObject('Object Repository/Login/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/Buka tutup kas/android.widget.Button - Ok'), 0)

Mobile.closeApplication()