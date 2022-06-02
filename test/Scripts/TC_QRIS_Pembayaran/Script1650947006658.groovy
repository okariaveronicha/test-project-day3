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

Mobile.setText(findTestObject('TC_QRIS_Pembayaran/android.widget.EditText - Nomor Ponsel'), '081260385053', 0)

Mobile.setEncryptedText(findTestObject('TC_QRIS_Pembayaran/android.widget.EditText - Kata Sandi'), 'iFGeFYmXIrUb+oh5wcng3A==', 
    0)

Mobile.tap(findTestObject('TC_QRIS_Pembayaran/android.widget.Button - Masuk'), 0)

Mobile.tap(findTestObject('TC_QRIS_Pembayaran/android.widget.LinearLayout'), 0)

Mobile.tap(findTestObject('TC_QRIS_Pembayaran/android.widget.LinearLayout (1)'), 0)

Mobile.tap(findTestObject('TC_QRIS_Pembayaran/android.widget.TextView -  Tambahkan'), 0)

Mobile.tap(findTestObject('TC_QRIS_Pembayaran/android.widget.TextView - Rp 9,500'), 0)

Mobile.tap(findTestObject('TC_QRIS_Pembayaran/android.widget.LinearLayout (2)'), 0)

Mobile.tap(findTestObject('TC_QRIS_Pembayaran/android.widget.Button - Bayar'), 0)

Mobile.tap(findTestObject('TC_QRIS_Pembayaran/android.widget.ScrollView'), 0)

Mobile.tap(findTestObject('TC_QRIS_Pembayaran/android.widget.Button - Laporan QRIS'), 0)

Mobile.verifyElementVisible(findTestObject('TC_QRIS_Pembayaran/android.widget.FrameLayout'), 0)

Mobile.tap(findTestObject('TC_QRIS_Pembayaran/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('TC_QRIS_Pembayaran/android.widget.Button - Uang diterima'), 0)

Mobile.verifyElementVisible(findTestObject('TC_QRIS_Pembayaran/android.widget.LinearLayout (3)'), 0)

Mobile.closeApplication()

