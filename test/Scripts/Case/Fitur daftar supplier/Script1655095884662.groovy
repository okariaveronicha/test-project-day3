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

'Daftar supplier'
Mobile.tap(findTestObject('Object Repository/Daftar-supplier/android.widget.TextView - Order'), 0)

Mobile.tap(findTestObject('Object Repository/Daftar-supplier/android.widget.TextView - Belanja Produk'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Daftar-supplier/android.widget.TextView - Pilih Supplier'), 0)

'Hapus supplier'
Mobile.tap(findTestObject('Object Repository/Daftar-supplier/android.widget.Button - Hapus'), 0)

Mobile.tap(findTestObject('Object Repository/Daftar-supplier/android.widget.Button - Ya, hapus'), 0)

Mobile.tap(findTestObject('Object Repository/Daftar-supplier/android.widget.Button - OK'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Daftar-supplier/android.widget.TextView - Pilih Supplier'), 0)

'Batal hapus supplier'
Mobile.tap(findTestObject('Object Repository/Daftar-supplier/android.widget.Button - Hapus'), 0)

Mobile.tap(findTestObject('Object Repository/Daftar-supplier/android.widget.Button - Batal'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Daftar-supplier/android.widget.TextView - Pilih Supplier'), 0)

Mobile.closeApplication()

