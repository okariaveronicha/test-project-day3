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

//Mobile.setText(findTestObject('Object Repository/Bulk-Upload-Retailer/TC_MO_No-hp-kosong/android.widget.EditText - Nomor Ponsel'), '0812345678903', 0)
//
//Mobile.setEncryptedText(findTestObject('Bulk-Upload-Retailer/TC_MO_No-hp-kosong/android.widget.EditText - Kata Sandi'),
//	'iFGeFYmXIrUhQZHvW7P22w==', 0)
//
//Mobile.tap(findTestObject('Bulk-Upload-Retailer/TC_MO_No-hp-kosong/android.widget.Button - Masuk'), 0)
//
//Mobile.tap(findTestObject('Bulk-Upload-Retailer/TC_MO_No-hp-kosong/android.widget.ImageView'), 0)
//
//Mobile.tap(findTestObject('Bulk-Upload-Retailer/TC_MO_No-hp-kosong/android.widget.ImageButton'), 0)
//
//Mobile.tap(findTestObject('Bulk-Upload-Retailer/TC_MO_No-hp-kosong/android.widget.CheckedTextView - Rekanan'),
//	0)
//
//Mobile.tap(findTestObject('Bulk-Upload-Retailer/TC_MO_No-hp-kosong/android.widget.TextView - Retailer'),
//	0)
//
//Mobile.tap(findTestObject('Bulk-Upload-Retailer/TC_MO_No-hp-kosong/android.widget.Button -  Tambah Retailer'),
//	0)
//
//Mobile.tap(findTestObject('Bulk-Upload-Retailer/TC_MO_No-hp-kosong/android.widget.TextView - Tambah Massal'),
//	0)

Mobile.tap(findTestObject('Bulk-Upload-Retailer/TC_MO_No-hp-kosong/android.widget.Button - Pilih File'),
	0)

Mobile.tap(findTestObject('Object Repository/Bulk-Upload-Retailer/TC_MO_No-hp-kosong/android.widget.TextView - no hp kosong.xlsx'),
	0)

Mobile.tap(findTestObject('Bulk-Upload-Retailer/TC_MO_No-hp-kosong/android.widget.Button - Upload'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Bulk-Upload-Retailer/TC_MO_No-hp-kosong/android.widget.TextView - Nomor Ponsel Kolom harus terisi'),
	0)

Mobile.closeApplication()