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

//Mobile.setText(findTestObject('Object Repository/Daftar-supplier/android.widget.EditText - Nomor Ponsel'), '081260385053', 
//    0)
//
//Mobile.setEncryptedText(findTestObject('Object Repository/Daftar-supplier/android.widget.EditText - Kata Sandi'), 'iFGeFYmXIrUb+oh5wcng3A==', 
//    0)
//
//Mobile.tap(findTestObject('Object Repository/Daftar-supplier/android.widget.Button - Masuk'), 0)

'Batalkan pesanan'
Mobile.tap(findTestObject('Object Repository/Bayar pesanan/android.widget.TextView - Order'), 0)

Mobile.tap(findTestObject('Object Repository/Bayar pesanan/android.widget.TextView - Daftar Pesanan'), 0)

Mobile.tap(findTestObject('Object Repository/Bayar pesanan/android.widget.TextView - Dalam Proses'), 0)

Mobile.tap(findTestObject('Object Repository/Bayar pesanan/android.widget.TextView - Semua Status Pesanan'), 0)

Mobile.tap(findTestObject('Object Repository/Bayar pesanan/android.widget.CheckedTextView - Belum Dibayar'), 0)

Mobile.tap(findTestObject('Object Repository/Bayar pesanan/android.widget.TextView - Menunggu pembayaran'), 0)

Mobile.tap(findTestObject('Object Repository/Bayar pesanan/android.widget.Button - Batalkan Pesanan'), 0)

Mobile.tap(findTestObject('Object Repository/Bayar pesanan/android.widget.Button - YA'), 0)

Mobile.tap(findTestObject('Object Repository/Bayar pesanan/android.widget.Button - OK'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Bayar pesanan/android.widget.TextView - Dibatalkan'), 0)

Mobile.takeScreenshot('D:\\ss\\screenshot - 3.png')

Mobile.tap(findTestObject('Object Repository/Bayar pesanan/android.widget.ImageView back'), 0)

//Mobile.tap(findTestObject('Object Repository/Bayar pesanan/android.widget.TextView - Order'), 0)
'Bayar pesanan'
Mobile.tap(findTestObject('Object Repository/Bayar pesanan/android.widget.ImageView back'), 0)

Mobile.tap(findTestObject('Object Repository/Bayar pesanan/android.widget.TextView - Daftar Pesanan'), 0)

Mobile.tap(findTestObject('Object Repository/Bayar pesanan/android.widget.TextView - Dalam Proses'), 0)

Mobile.tap(findTestObject('Object Repository/Bayar pesanan/android.widget.TextView - Semua Status Pesanan'), 0)

Mobile.tap(findTestObject('Object Repository/Bayar pesanan/android.widget.CheckedTextView - Belum Dibayar'), 0)

Mobile.tap(findTestObject('Object Repository/Bayar pesanan/android.widget.TextView - Menunggu pembayaran'), 0)

Mobile.tap(findTestObject('Object Repository/Bayar pesanan/android.widget.Button - Bayar'), 0)

Mobile.takeScreenshot('D:\\ss\\screenshot - 4.png', FailureHandling.CONTINUE_ON_FAILURE)

//Thread.sleep(20000)
//Mobile.tap(findTestObject('Object Repository/Bayar pesanan/android.widget.Button - Cek status pembayaran'), 0)

Mobile.tap(findTestObject('Object Repository/Bayar pesanan/android.widget.Button - Cek status pembayaran'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Bayar pesanan/android.widget.Button - Transaksi Baru'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

