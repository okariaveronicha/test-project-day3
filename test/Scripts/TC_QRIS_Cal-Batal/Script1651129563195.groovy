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

Mobile.startExistingApplication('id.co.bri.stroberikasir')

Mobile.setText(findTestObject('Object Repository/New Folder/TC_QRIS_Cal-Batal/android.widget.EditText - Nomor Ponsel'), '081260385053', 
    0)

Mobile.setEncryptedText(findTestObject('Object Repository/New Folder/TC_QRIS_Cal-Batal/android.widget.EditText - Kata Sandi'), 'iFGeFYmXIrUb+oh5wcng3A==', 
    0)

Mobile.tap(findTestObject('Object Repository/New Folder/TC_QRIS_Cal-Batal/android.widget.Button - Masuk'), 0)

Mobile.tap(findTestObject('New Folder/TC_QRIS_Cal-Batal/android.widget.TextView - CatatTransaksi'), 0)

Mobile.tap(findTestObject('TC_QRIS_Cal-Batal/android.widget.TextView - Kalkulator'), 0)

Mobile.tap(findTestObject('New Folder/TC_QRIS_Cal-Batal/android.widget.TextView - Buah'), 0)

Mobile.tap(findTestObject('New Folder/TC_QRIS_Cal-Batal/android.widget.TextView - 5'), 0)

Mobile.tap(findTestObject('New Folder/TC_QRIS_Cal-Batal/android.widget.TextView - 00'), 0)

Mobile.tap(findTestObject('New Folder/TC_QRIS_Cal-Batal/android.widget.TextView - 00'), 0)

Mobile.tap(findTestObject('New Folder/TC_QRIS_Cal-Batal/android.widget.TextView - add'), 0)

Mobile.tap(findTestObject('New Folder/TC_QRIS_Cal-Batal/android.widget.TextView - Daging'), 0)

Mobile.tap(findTestObject('New Folder/TC_QRIS_Cal-Batal/android.widget.TextView - 1'), 0)

Mobile.tap(findTestObject('New Folder/TC_QRIS_Cal-Batal/android.widget.TextView - 0'), 0)

Mobile.tap(findTestObject('New Folder/TC_QRIS_Cal-Batal/android.widget.TextView - 00'), 0)

Mobile.tap(findTestObject('New Folder/TC_QRIS_Cal-Batal/android.widget.TextView - 00'), 0)

Mobile.tap(findTestObject('New Folder/TC_QRIS_Cal-Batal/android.widget.TextView - equals'), 0)

Mobile.tap(findTestObject('New Folder/TC_QRIS_Cal-Batal/android.widget.Button - Bayar Rp 150,000'), 0)

Mobile.tap(findTestObject('New Folder/TC_QRIS_Cal-Batal/android.widget.LinearLayout'), 0)

Mobile.tap(findTestObject('New Folder/TC_QRIS_Cal-Batal/android.widget.Button - Batalkan Transaksi'), 0)

Mobile.verifyElementVisible(findTestObject('New Folder/TC_QRIS_Cal-Batal/android.widget.LinearLayout (1)'), 0)

Mobile.closeApplication()

