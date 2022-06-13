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

Mobile.setText(findTestObject('Object Repository/Bulk-Upload-Retailer/TC_MO_Nama-dengan-angka/android.widget.EditText - Nomor Ponsel'), 
    '0812345678903', 0)

Mobile.setEncryptedText(findTestObject('Bulk-Upload-Retailer/TC_MO_Nama-dengan-angka/android.widget.EditText - Kata Sandi'), 
    'iFGeFYmXIrUhQZHvW7P22w==', 0)

Mobile.tap(findTestObject('Bulk-Upload-Retailer/TC_MO_Nama-dengan-angka/android.widget.Button - Masuk'), 0)

Mobile.tap(findTestObject('Bulk-Upload-Retailer/TC_MO_Nama-dengan-angka/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Bulk-Upload-Retailer/TC_MO_Nama-dengan-angka/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Bulk-Upload-Retailer/TC_MO_Nama-dengan-angka/android.widget.CheckedTextView - Rekanan'), 0)

Mobile.tap(findTestObject('Bulk-Upload-Retailer/TC_MO_Nama-dengan-angka/android.widget.TextView - Retailer'), 0)

Mobile.tap(findTestObject('Bulk-Upload-Retailer/TC_MO_Nama-dengan-angka/android.widget.Button -  Tambah Retailer'), 0)

Mobile.tap(findTestObject('Bulk-Upload-Retailer/TC_MO_Nama-dengan-angka/android.widget.TextView - Tambah Massal'), 0)

'Nama diisi dengan angka'
Mobile.tap(findTestObject('Bulk-Upload-Retailer/TC_MO_Nama-dengan-angka/android.widget.Button - Pilih File'), 0)

Mobile.tap(findTestObject('Object Repository/Bulk-Upload-Retailer/TC_MO_Nama-dengan-angka/android.widget.TextView'), 0)

Mobile.tap(findTestObject('Object Repository/Bulk-Upload-Retailer/TC_MO_Nama-dengan-angka/android.widget.TextView - nama angka.xlsx'), 
    0)

Mobile.tap(findTestObject('Bulk-Upload-Retailer/TC_MO_Nama-dengan-angka/android.widget.Button - Upload'), 0)

Mobile.takeScreenshot("C:\\Users\\ASANI\\Pictures\\bulk\\Screenshot_2022.06.07_13.41.10.562.png")

'Nama diisi dengan karakter spesial'
Mobile.tap(findTestObject('Bulk-Upload-Retailer/TC_MO_Nama-dengan-karakter-spesial/android.widget.Button - Pilih File'), 
    0)

Mobile.tap(findTestObject('Object Repository/Bulk-Upload-Retailer/TC_MO_Nama-dengan-karakter-spesial/android.widget.TextView'), 
    0)

Mobile.tap(findTestObject('Object Repository/Bulk-Upload-Retailer/TC_MO_Nama-dengan-karakter-spesial/android.widget.TextView - nama karakter spesial.xlsx'), 
    0)

Mobile.tap(findTestObject('Bulk-Upload-Retailer/TC_MO_Nama-dengan-karakter-spesial/android.widget.Button - Upload'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Bulk-Upload-Retailer/TC_MO_Nama-dengan-karakter-spesial/android.webkit.WebView'), 
    0)

Mobile.takeScreenshot("C:\\Users\\ASANI\\Pictures\\bulk\\Screenshot_2022.06.07_13.41.15.896.png")

'Nama diisi dengan spasi'
Mobile.tap(findTestObject('Bulk-Upload-Retailer/TC_MO_Nama-hanya-spasi/android.widget.Button - Pilih File'), 0)

Mobile.tap(findTestObject('Object Repository/Bulk-Upload-Retailer/TC_MO_Nama-hanya-spasi/android.widget.TextView'), 0)

Mobile.tap(findTestObject('Object Repository/Bulk-Upload-Retailer/TC_MO_Nama-hanya-spasi/android.widget.TextView - nama spasi.xlsx'), 
    0)

Mobile.tap(findTestObject('Bulk-Upload-Retailer/TC_MO_Nama-hanya-spasi/android.widget.Button - Upload'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Bulk-Upload-Retailer/TC_MO_Nama-hanya-spasi/android.widget.TextView - Nama Panjang karakter tidak boleh kurang dari 3 karakter dan melebihi 50 karakter'), 
    0)

Mobile.takeScreenshot("C:\\Users\\ASANI\\Pictures\\bulk\\Screenshot_2022.06.07_13.41.22.782.png")

'Nama tidak diisi'
Mobile.tap(findTestObject('Bulk-Upload-Retailer/TC_MO_Nama-kosong/android.widget.Button - Pilih File'), 0)

Mobile.tap(findTestObject('Object Repository/Bulk-Upload-Retailer/TC_MO_Nama-kosong/android.widget.TextView'), 0)

Mobile.tap(findTestObject('Object Repository/Bulk-Upload-Retailer/TC_MO_Nama-kosong/android.widget.TextView - nama kosong.xlsx'), 
    0)

Mobile.tap(findTestObject('Bulk-Upload-Retailer/TC_MO_Nama-kosong/android.widget.Button - Upload'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Bulk-Upload-Retailer/TC_MO_Nama-kosong/android.widget.TextView - Nama Kolom harus terisi'), 
    0)

Mobile.takeScreenshot("C:\\Users\\ASANI\\Pictures\\bulk\\Screenshot_2022.06.07_13.41.32.081.png")

'Nama kurang dari 3 karakter'
Mobile.tap(findTestObject('Bulk-Upload-Retailer/TC_MO_Nama-kurang-3-karakter/android.widget.Button - Pilih File'), 0)

Mobile.tap(findTestObject('Object Repository/Bulk-Upload-Retailer/TC_MO_Nama-kurang-3-karakter/android.widget.TextView'), 
    0)

Mobile.tap(findTestObject('Object Repository/Bulk-Upload-Retailer/TC_MO_Nama-kurang-3-karakter/android.widget.TextView - nama kurang 3.xlsx'), 
    0)

Mobile.tap(findTestObject('Bulk-Upload-Retailer/TC_MO_Nama-kurang-3-karakter/android.widget.Button - Upload'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Bulk-Upload-Retailer/TC_MO_Nama-kurang-3-karakter/android.widget.TextView - Nama Panjang karakter tidak boleh kurang dari 3 karakter dan melebihi 50 karakter'), 
    0)

'Nama lebih dari 50 karakter'
Mobile.tap(findTestObject('Bulk-Upload-Retailer/TC_MO_Nama-lebih-50-karakter/android.widget.Button - Pilih File'), 0)

Mobile.tap(findTestObject('Object Repository/Bulk-Upload-Retailer/TC_MO_Nama-lebih-50-karakter/android.widget.TextView'), 
    0)

Mobile.tap(findTestObject('Object Repository/Bulk-Upload-Retailer/TC_MO_Nama-lebih-50-karakter/android.widget.TextView - nama lebih 50.xlsx'), 
    0)

Mobile.tap(findTestObject('Bulk-Upload-Retailer/TC_MO_Nama-lebih-50-karakter/android.widget.Button - Upload'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Bulk-Upload-Retailer/TC_MO_Nama-lebih-50-karakter/android.widget.TextView - Nama Panjang karakter tidak boleh kurang dari 3 karakter dan melebihi 50 karakter'), 
    0)

'Nama tidak sesuai'
Mobile.tap(findTestObject('Bulk-Upload-Retailer/TC_MO_Nama-tidak-sesuai/android.widget.Button - Pilih File'), 0)

Mobile.tap(findTestObject('Object Repository/Bulk-Upload-Retailer/TC_MO_Nama-tidak-sesuai/android.widget.TextView'), 0)

Mobile.callTestCase(findTestCase('Test case/Scroll'), [:])

Mobile.tap(findTestObject('Object Repository/Bulk-Upload-Retailer/TC_MO_Nama-tidak-sesuai/android.widget.TextView - nama tidak sesuai.xlsx'), 
    0)

Mobile.tap(findTestObject('Bulk-Upload-Retailer/TC_MO_Nama-tidak-sesuai/android.widget.Button - Upload'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Bulk-Upload-Retailer/TC_MO_Nama-kosong/android.widget.TextView - Nama Kolom harus terisi'), 
    0)

Mobile.takeScreenshot("C:\\Users\\ASANI\\Pictures\\bulk\\Screenshot_2022.06.07_13.42.04.747.png")

'Format salah'
Mobile.tap(findTestObject('Object Repository/Bulk-Upload-Retailer/TC_MO_Format-file-salah/android.widget.Button - Pilih File'), 
    0)

Mobile.callTestCase(findTestCase('Test case/Scroll'), [:])

Mobile.tap(findTestObject('Object Repository/Bulk-Upload-Retailer/TC_MO_Format-file-salah/android.widget.TextView - Screenshot_2022.04.26_13.38.23.155.png'), 
    0)

Mobile.verifyElementVisible(findTestObject('Bulk-Upload-Retailer/TC_MO_Format-file-salah/android.view.ViewGroup'), 0)

'No hp diisi dengan karakter spesial'

Mobile.tap(findTestObject('Bulk-Upload-Retailer/TC_MO_No-hp-dengan-karakter-spesial/android.widget.Button - Pilih File'),
	0)

Mobile.callTestCase(findTestCase('Test case/Scroll'), [:])

Mobile.tap(findTestObject('Bulk-Upload-Retailer/TC_MO_No-hp-dengan-karakter-spesial/android.widget.TextView - no hp karakter spesial.xlsx'),
	0)

Mobile.tap(findTestObject('Bulk-Upload-Retailer/TC_MO_No-hp-dengan-karakter-spesial/android.widget.Button - Upload'), 0)

Mobile.verifyElementVisible(findTestObject('Bulk-Upload-Retailer/TC_MO_No-hp-dengan-karakter-spesial/android.widget.TextView - Nomor Ponsel  tidak sesuai format (81260385053)'),
	0)

Mobile.takeScreenshot("C:\\Users\\ASANI\\Pictures\\bulk\\Screenshot_2022.06.07_13.42.13.646.png")

'No hp kurang dari 9 angka'

Mobile.tap(findTestObject('Bulk-Upload-Retailer/TC_MO_No-hp-kurang-9-angka/android.widget.Button - Pilih File'),
	0)

Mobile.callTestCase(findTestCase('Test case/Scroll'), [:])

Mobile.tap(findTestObject('Object Repository/Bulk-Upload-Retailer/TC_MO_No-hp-kurang-9-angka/android.widget.TextView - no hp kurang 9.xlsx'),
	0)

Mobile.tap(findTestObject('Bulk-Upload-Retailer/TC_MO_No-hp-kurang-9-angka/android.widget.Button - Upload'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Bulk-Upload-Retailer/TC_MO_No-hp-kurang-9-angka/android.widget.TextView - Nomor Ponsel Panjang number tidak boleh kurang dari 9 dan melebihi 15 digit'),
	0)

Mobile.takeScreenshot("C:\\Users\\ASANI\\Pictures\\bulk\\Screenshot_2022.06.07_13.42.22.364.png")

'No hp lebih dari 15 angka'

Mobile.tap(findTestObject('Bulk-Upload-Retailer/TC_MO_No-hp-lebih-15-angka/android.widget.Button - Pilih File'),
	0)

Mobile.callTestCase(findTestCase('Test case/Scroll'), [:])

Mobile.tap(findTestObject('Object Repository/Bulk-Upload-Retailer/TC_MO_No-hp-lebih-15-angka/android.widget.TextView - no hp lebih 15.xlsx'),
	0)

Mobile.tap(findTestObject('Bulk-Upload-Retailer/TC_MO_No-hp-lebih-15-angka/android.widget.Button - Upload'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Bulk-Upload-Retailer/TC_MO_No-hp-lebih-15-angka/android.widget.TextView - Nomor Ponsel Panjang number tidak boleh kurang dari 9 dan melebihi 15 digit'),
	0)

Mobile.takeScreenshot("C:\\Users\\ASANI\\Pictures\\bulk\\Screenshot_2022.06.07_13.42.32.531.png")

'No hp mengandung huruf'

Mobile.tap(findTestObject('Bulk-Upload-Retailer/TC_MO_No-hp-mengandung-huruf/android.widget.Button - Pilih File'),
	0)

Mobile.callTestCase(findTestCase('Test case/Scroll'), [:])

Mobile.tap(findTestObject('Object Repository/Bulk-Upload-Retailer/TC_MO_No-hp-mengandung-huruf/android.widget.TextView - no hp huruf.xlsx'),
	0)

Mobile.tap(findTestObject('Bulk-Upload-Retailer/TC_MO_No-hp-kosong/android.widget.Button - Upload'), 0)

//Mobile.verifyElementVisible(findTestObject('Object Repository/Bulk-Upload-Retailer/TC_MO_No-hp-mengandung-huruf/android.widget.TextView - Nomor Ponsel Kolom harus numerik'),
//	0)

'No hp mengandung spasi'

Mobile.tap(findTestObject('Bulk-Upload-Retailer/TC_MO_No-hp-mengandung-spasi/android.widget.Button - Pilih File'),
	0)

Mobile.callTestCase(findTestCase('Test case/Scroll'), [:])

Mobile.tap(findTestObject('Object Repository/Bulk-Upload-Retailer/TC_MO_No-hp-mengandung-spasi/android.widget.TextView - no hp spasi.xlsx'),
	0)

Mobile.tap(findTestObject('Bulk-Upload-Retailer/TC_MO_No-hp-mengandung-spasi/android.widget.Button - Upload'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Bulk-Upload-Retailer/TC_MO_No-hp-mengandung-spasi/android.widget.TextView - Nomor Ponsel Kolom harus numerik'),
	0)

Mobile.takeScreenshot("C:\\Users\\ASANI\\Pictures\\bulk\\Screenshot_2022.06.07_13.43.06.514.png")

'No hp tidak sesuai format'

Mobile.tap(findTestObject('Bulk-Upload-Retailer/TC_MO_No-hp-tidak-sesuai-format/android.widget.Button - Pilih File'),
	0)

Mobile.callTestCase(findTestCase('Test case/Scroll'), [:])

Mobile.tap(findTestObject('Object Repository/Bulk-Upload-Retailer/TC_MO_No-hp-tidak-sesuai-format/android.widget.TextView - no hp tidak sesuai format.xlsx'),
	0)

Mobile.tap(findTestObject('Bulk-Upload-Retailer/TC_MO_No-hp-tidak-sesuai-format/android.widget.Button - Upload'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Bulk-Upload-Retailer/TC_MO_No-hp-tidak-sesuai-format/android.widget.TextView - Nomor Ponsel  tidak sesuai format (738268329926)'),
	0)

Mobile.takeScreenshot("C:\\Users\\ASANI\\Pictures\\bulk\\Screenshot_2022.06.07_13.43.13.314.png")

'No hp tidak terdaftar'

Mobile.tap(findTestObject('Bulk-Upload-Retailer/TC_MO_No-hp-tidak-terdaftar/android.widget.Button - Pilih File'),
	0)

Mobile.callTestCase(findTestCase('Test case/Scroll'), [:])

Mobile.tap(findTestObject('Object Repository/Bulk-Upload-Retailer/TC_MO_No-hp-tidak-terdaftar/android.widget.TextView - no hp tidak terdaftar.xlsx'),
	0)

Mobile.tap(findTestObject('Bulk-Upload-Retailer/TC_MO_No-hp-tidak-terdaftar/android.widget.Button - Upload'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Bulk-Upload-Retailer/TC_MO_No-hp-tidak-terdaftar/android.widget.TextView - Retailer tidak terdaftar  081260385048  Okaria Veronicha'),
	0)

Mobile.takeScreenshot("C:\\Users\\ASANI\\Pictures\\bulk\\Screenshot_2022.06.07_13.43.20.414.png")

'Alamat toko hanya spasi'

Mobile.tap(findTestObject('Object Repository/Bulk-Upload-Retailer/TC_MO_Alamat-toko-hanya-spasi/android.widget.Button - Pilih File'),
	0)

Mobile.tap(findTestObject('Object Repository/Bulk-Upload-Retailer/TC_MO_Alamat-toko-hanya-spasi/android.widget.TextView - alamat spasi.xlsx'),
	0)

Mobile.tap(findTestObject('Object Repository/Bulk-Upload-Retailer/TC_MO_Alamat-toko-hanya-spasi/android.widget.Button - Upload'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Bulk-Upload-Retailer/TC_MO_Alamat-toko-hanya-spasi/android.widget.TextView - Alamat Toko  tidak sesuai'),
	0)

Mobile.takeScreenshot("C:\\Users\\ASANI\\Pictures\\bulk\\Screenshot_2022.06.07_13.43.30.717.png")

'Alamat toko kurang dari 1 karakter'

Mobile.tap(findTestObject('Object Repository/Bulk-Upload-Retailer/TC_MO_Alamat-toko-kurang-1-karakter/android.widget.Button - Pilih File'),
	0)

Mobile.tap(findTestObject('Object Repository/Bulk-Upload-Retailer/TC_MO_Alamat-toko-kurang-1-karakter/android.widget.TextView - alamat kurang 1.xlsx'),
	0)

Mobile.tap(findTestObject('Object Repository/Bulk-Upload-Retailer/TC_MO_Alamat-toko-kurang-1-karakter/android.widget.Button - Upload'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Bulk-Upload-Retailer/TC_MO_Alamat-toko-kurang-1-karakter/android.widget.TextView - Alamat Toko  a tidak sesuai'),
	0)

'Alamat toko lebih dari 200 karakter'

Mobile.tap(findTestObject('Object Repository/Bulk-Upload-Retailer/TC_MO_Alamat-toko-lebih-200-karakter/android.widget.Button - Pilih File'),
	0)

Mobile.tap(findTestObject('Object Repository/Bulk-Upload-Retailer/TC_MO_Alamat-toko-lebih-200-karakter/android.widget.TextView - alamat lebih 200.xlsx'),
	0)

Mobile.tap(findTestObject('Object Repository/Bulk-Upload-Retailer/TC_MO_Alamat-toko-lebih-200-karakter/android.widget.Button - Upload'), 0)

//Mobile.verifyElementVisible(findTestObject('Object Repository/Bulk-Upload-Retailer/TC_MO_Alamat-toko-lebih-200-karakter/android.widget.TextView - Alamat Toko Panjang karakter tidak boleh kurang dari 1 karakter dan melebihi 200 karakter'),
//	0)

Mobile.takeScreenshot("C:\\Users\\ASANI\\Pictures\\bulk\\Screenshot_2022.06.07_13.43.45.513.png")

'Tambah retailer'

Mobile.tap(findTestObject('Object Repository/Bulk-Upload-Retailer/TC_MO_Tambah-retailer-mass/android.widget.Button - Pilih File'),
	0)

Mobile.tap(findTestObject('Object Repository/Bulk-Upload-Retailer/TC_MO_Nama-tidak-sesuai/android.widget.TextView'), 0)

Mobile.callTestCase(findTestCase('Test case/Scroll'), [:])

Mobile.tap(findTestObject('Bulk-Upload-Retailer/TC_MO_Tambah-retailer-mass/android.widget.TextView - Stroberi_Kasir_mass_upload_retailer.xlsx'),
	0)

Mobile.tap(findTestObject('Bulk-Upload-Retailer/TC_MO_Tambah-retailer-mass/android.widget.Button - Upload'), 0)

Mobile.tap(findTestObject('Bulk-Upload-Retailer/TC_MO_Tambah-retailer-mass/android.widget.Button - OK'), 0)

Mobile.verifyElementVisible(findTestObject('Bulk-Upload-Retailer/TC_MO_Tambah-retailer-mass/androidx.recyclerview.widget.RecyclerView'),
	0)

Mobile.takeScreenshot("C:\\Users\\ASANI\\Pictures\\bulk\\Screenshot_2022.06.07_13.43.57.495.png")

Mobile.closeApplication()