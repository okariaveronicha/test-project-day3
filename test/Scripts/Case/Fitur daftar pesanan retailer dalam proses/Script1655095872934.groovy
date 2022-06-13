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

Mobile.setText(findTestObject('Object Repository/Daftar-supplier/android.widget.EditText - Nomor Ponsel'), '081260385053',
	0)

Mobile.setEncryptedText(findTestObject('Object Repository/Daftar-supplier/android.widget.EditText - Kata Sandi'), 'iFGeFYmXIrUb+oh5wcng3A==',
	0)

Mobile.tap(findTestObject('Object Repository/Daftar-supplier/android.widget.Button - Masuk'), 0)

Mobile.tap(findTestObject('Object Repository/Bayar pesanan/android.widget.TextView - Order'), 0)

Mobile.tap(findTestObject('Object Repository/Daftar pesanan retailer dalam proses/android.widget.TextView - Daftar Pesanan'), 
    0)

Mobile.tap(findTestObject('Object Repository/Daftar pesanan retailer dalam proses/android.widget.TextView - Dalam Proses'), 
    0)

Mobile.tap(findTestObject('Object Repository/Daftar pesanan retailer dalam proses/android.widget.TextView - Semua Status Pesanan'), 
    0)

'Pesanan belum dibayar'

Mobile.tap(findTestObject('Object Repository/Daftar pesanan retailer dalam proses/android.widget.CheckedTextView - Belum Dibayar'), 
    0)

Mobile.tap(findTestObject('Object Repository/Daftar pesanan retailer dalam proses/android.widget.TextView - Menunggu pembayaran'), 
    0)

Mobile.takeScreenshot("C:\\Users\\ASANI\\Pictures\\daftar pesanan retailer\\Screenshot_2022.06.08_13.15.37.322.png")

Mobile.tap(findTestObject('Object Repository/Daftar pesanan retailer dalam proses/android.widget.ImageView'), 0)

'Pesanan dibayar'

Mobile.tap(findTestObject('Object Repository/Daftar pesanan retailer dalam proses/android.widget.TextView - Belum Dibayar'), 
    0)

Mobile.tap(findTestObject('Object Repository/Daftar pesanan retailer dalam proses/android.widget.CheckedTextView - Dibayar'), 
    0)

Mobile.tap(findTestObject('Object Repository/Daftar pesanan retailer dalam proses/android.widget.TextView - Menunggu dikirim'), 
    0)

Mobile.takeScreenshot("C:\\Users\\ASANI\\Pictures\\daftar pesanan retailer\\Screenshot_2022.06.08_13.15.44.770.png")

Mobile.tap(findTestObject('Object Repository/Daftar pesanan retailer dalam proses/android.widget.ImageView (1)'), 0)

'Pesanan dalam pengiriman'

Mobile.tap(findTestObject('Object Repository/Daftar pesanan retailer dalam proses/android.widget.TextView - Dibayar'), 0)

Mobile.tap(findTestObject('Object Repository/Daftar pesanan retailer dalam proses/android.widget.CheckedTextView - Dalam Pengiriman'), 
    0)

Mobile.tap(findTestObject('Object Repository/Daftar pesanan retailer dalam proses/android.widget.TextView - Dalam pengiriman'), 
    0)

Mobile.takeScreenshot("C:\\Users\\ASANI\\Pictures\\daftar pesanan retailer\\Screenshot_2022.06.08_13.15.52.179.png")

Mobile.closeApplication()

