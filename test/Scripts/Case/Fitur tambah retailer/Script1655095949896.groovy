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

Mobile.setText(findTestObject('Object Repository/Tambah-Retailer/TC_MO_No-tidak-terdaftar/android.widget.EditText - Nomor Ponsel'), '0812345678903',
	0)

Mobile.setEncryptedText(findTestObject('Object Repository/Tambah-Retailer/TC_MO_No-tidak-terdaftar/android.widget.EditText - Kata Sandi'),
	'iFGeFYmXIrUhQZHvW7P22w==', 0)

Mobile.tap(findTestObject('Object Repository/Tambah-Retailer/TC_MO_No-tidak-terdaftar/android.widget.Button - Masuk'), 0)

Mobile.tap(findTestObject('Object Repository/Tambah-Retailer/TC_MO_No-tidak-terdaftar/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/Tambah-Retailer/TC_MO_No-tidak-terdaftar/android.widget.ImageButton'), 0)

'Tambah retailer dengan nomor yang tidak terdaftar'

Mobile.tap(findTestObject('Object Repository/Tambah-Retailer/TC_MO_No-tidak-terdaftar/android.widget.CheckedTextView - Rekanan'), 0)

Mobile.tap(findTestObject('Object Repository/Tambah-Retailer/TC_MO_No-tidak-terdaftar/android.widget.TextView - Retailer'), 0)

Mobile.tap(findTestObject('Object Repository/Tambah-Retailer/TC_MO_No-tidak-terdaftar/android.widget.Button -  Tambah Retailer'), 0)

Mobile.setText(findTestObject('Object Repository/Tambah-Retailer/TC_MO_No-tidak-terdaftar/android.widget.EditText - Cari Nomor'), '081260385054',
	0)

Mobile.tap(findTestObject('Object Repository/Tambah-Retailer/TC_MO_No-tidak-terdaftar/android.widget.Button - Cari'), 0)

Mobile.verifyElementVisible(findTestObject('Tambah-Retailer/TC_MO_No-tidak-terdaftar/android.widget.TextView - Nomor yang anda masukkan belum terdaftar sebagai user Stroberi Kasir'),
	0)

'No HP tidak sesuai format'

Mobile.setText(findTestObject('Object Repository/Tambah-Retailer/TC_MO_No-tidak-sesuai-format/android.widget.EditText - Cari Nomor'), 'Okaria veronicha',
	0)

Mobile.tap(findTestObject('Object Repository/Tambah-Retailer/TC_MO_No-tidak-sesuai-format/android.widget.Button - Cari'), 0)

Mobile.verifyElementVisible(findTestObject('Tambah-Retailer/TC_MO_No-tidak-sesuai-format/android.widget.TextView -  Nomor ponsel hanya boleh angka'),
	0)

'No HP merupakan nomor untuk login aplikasi'

Mobile.setText(findTestObject('Object Repository/Tambah-Retailer/TC_MO_No-login/android.widget.EditText - Cari Nomor'), '0812345678903',
	0)

Mobile.tap(findTestObject('Object Repository/Tambah-Retailer/TC_MO_No-login/android.widget.Button - Cari'), 0)

Mobile.tap(findTestObject('Object Repository/Tambah-Retailer/TC_MO_No-login/android.widget.Button - Tambah'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Tambah-Retailer/TC_MO_No-login/android.view.ViewGroup'), 0)

'No HP diisi dengan karakter spesial'

Mobile.setText(findTestObject('Object Repository/Tambah-Retailer/TC_MO_No-karakter-spesial/android.widget.EditText - Cari Nomor'), '.-081260385053', 0)

Mobile.tap(findTestObject('Object Repository/Tambah-Retailer/TC_MO_No-karakter-spesial/android.widget.Button - Cari'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Tambah-Retailer/TC_MO_No-karakter-spesial/android.widget.TextView -  Nomor ponsel hanya boleh angka'), 0)

'No HP diisi dengan huruf'

Mobile.setText(findTestObject('Object Repository/Tambah-Retailer/TC_MO_No-dengan-huruf/android.widget.EditText - Cari Nomor'), '0812abcde',
	0)

Mobile.tap(findTestObject('Object Repository/Tambah-Retailer/TC_MO_No-dengan-huruf/android.widget.Button - Cari'), 0)

Mobile.verifyElementVisible(findTestObject('Tambah-Retailer/TC_MO_No-dengan-huruf/android.widget.TextView -  Nomor ponsel hanya boleh angka'),
	0)

'No HP diisi dengan spasi'

Mobile.setText(findTestObject('Object Repository/Tambah-Retailer/TC_MO_No-hanya-spasi/android.widget.EditText - Cari Nomor'), ' ', 0)

Mobile.tap(findTestObject('Object Repository/Tambah-Retailer/TC_MO_No-hanya-spasi/android.widget.Button - Cari'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Tambah-Retailer/TC_MO_No-hanya-spasi/android.widget.TextView -  Nomor ponsel hanya boleh angka'),
	0)

'No HP kurang dari 9 angka'

Mobile.setText(findTestObject('Object Repository/Tambah-Retailer/TC_MO_No-min-9/android.widget.EditText - Cari Nomor'), '0812345', 0)

Mobile.tap(findTestObject('Object Repository/Tambah-Retailer/TC_MO_No-min-9/android.widget.Button - Cari'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Tambah-Retailer/TC_MO_No-min-9/android.widget.TextView -  Nomor Ponsel minimal harus 9 digit'),
	0)

'No HP lebih dari 15 angka'

Mobile.setText(findTestObject('Object Repository/Tambah-Retailer/TC_MO_No-maks-15/android.widget.EditText - Cari Nomor'), '08123456789012345', 0)

Mobile.tap(findTestObject('Object Repository/Tambah-Retailer/TC_MO_No-maks-15/android.widget.Button - Cari'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Tambah-Retailer/TC_MO_No-maks-15/android.widget.TextView -  Nomor Ponsel maksimal 15 digit'), 0)

'No HP kosong'

Mobile.setText(findTestObject('Object Repository/Tambah-Retailer/TC_MO_No-tidak-bisa-kosong/android.widget.EditText - Cari Nomor'), '', 0)

Mobile.tap(findTestObject('Object Repository/Tambah-Retailer/TC_MO_No-tidak-bisa-kosong/android.widget.Button - Cari'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Tambah-Retailer/TC_MO_No-tidak-bisa-kosong/android.widget.TextView -  Nomor Ponsel tidak boleh kosong'), 0)

'Normal case'

Mobile.setText(findTestObject('Tambah-Retailer/TC_MO_Tambah-Retailer/android.widget.EditText - Cari Nomor'), '0812345678906', 0)

Mobile.tap(findTestObject('Tambah-Retailer/TC_MO_Tambah-Retailer/android.widget.Button - Cari'), 0)

Mobile.tap(findTestObject('Tambah-Retailer/TC_MO_Tambah-Retailer/android.widget.Button - Tambah'), 0)

Mobile.tap(findTestObject('Tambah-Retailer/TC_MO_Tambah-Retailer/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('Tambah-Retailer/TC_MO_Tambah-Retailer/android.widget.TextView - Kasir Desty 06'), 0)

Mobile.verifyElementVisible(findTestObject('Tambah-Retailer/TC_MO_Tambah-Retailer/android.view.ViewGroup'), 0)

Mobile.tap(findTestObject('Object Repository/Pengurangan stok/TC_MO_Normal-case/android.widget.ImageView back'), 0)

'No HP sudah terdaftar menjadi retailer'

Mobile.tap(findTestObject('Object Repository/Tambah-Retailer/TC_MO_No-sudah-retailer/android.widget.Button -  Tambah Retailer'), 0)

Mobile.setText(findTestObject('Object Repository/Tambah-Retailer/TC_MO_No-sudah-retailer/android.widget.EditText - Cari Nomor'), '081260385053',
	0)

Mobile.tap(findTestObject('Object Repository/Tambah-Retailer/TC_MO_No-sudah-retailer/android.widget.Button - Cari'), 0)

Mobile.tap(findTestObject('Object Repository/Tambah-Retailer/TC_MO_No-sudah-retailer/android.widget.Button - Tambah'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Tambah-Retailer/TC_MO_No-sudah-retailer/android.view.ViewGroup'), 0)

Mobile.closeApplication()
