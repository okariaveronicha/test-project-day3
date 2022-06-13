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

Mobile.setText(findTestObject('Object Repository/Login/android.widget.EditText - Nomor Ponsel'), '0812345678903', 0)

Mobile.setEncryptedText(findTestObject('Object Repository/Login/android.widget.EditText - Kata Sandi'), 'iFGeFYmXIrUhQZHvW7P22w==', 0)

Mobile.tap(findTestObject('Object Repository/Login/android.widget.Button - Masuk'), 0)

Mobile.tap(findTestObject('Object Repository/Login/android.widget.ImageView'), 0)

'Daftar transaksi di tab harian'

Mobile.tap(findTestObject('Object Repository/Laporan-transaksi/TC_MO_Harian/android.widget.TextView - Laporan'), 0)

Mobile.tap(findTestObject('Object Repository/Laporan-transaksi/TC_MO_Harian/android.widget.TextView - Harian'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Laporan-transaksi/TC_MO_Harian/android.widget.LinearLayout laporan-hari-ini'), 0)

'Filter tanggal awal kurang dari tanggal akhir'

Mobile.tap(findTestObject('Object Repository/Laporan-transaksi/TC_MO_Harian/android.widget.LinearLayout date-start'), 0)

Mobile.tap(findTestObject('Object Repository/Riwayat/TC_MO_Filter-tanggal/android.widget.ImageButton bln sebelumnya'), 0)

Mobile.tap(findTestObject('Object Repository/Laporan-transaksi/TC_MO_Harian/android.view.View - 9'), 0)

Mobile.tap(findTestObject('Object Repository/Laporan-transaksi/TC_MO_Harian/android.widget.Button - OKE'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Laporan-transaksi/TC_MO_Harian/android.widget.LinearLayout laporan-9-mei'), 0)

'Jika produk memiliki harga grosir'

Mobile.tap(findTestObject('Object Repository/Laporan-transaksi/TC_MO_Harian/android.widget.TextView - Harian'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Laporan-transaksi/TC_MO_Harian/android.widget.LinearLayout laporan-hari-ini'), 0)

'Jika produk memiliki harga diskon'

Mobile.tap(findTestObject('Object Repository/Laporan-transaksi/TC_MO_Harian/android.widget.TextView - Harian'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Laporan-transaksi/TC_MO_Harian/android.widget.LinearLayout laporan-hari-ini'), 0)

'Jika belanja lebih dari 1 produk'

Mobile.tap(findTestObject('Object Repository/Laporan-transaksi/TC_MO_Harian/android.widget.TextView - Harian'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Laporan-transaksi/TC_MO_Harian/android.widget.LinearLayout laporan-hari-ini'), 0)

'Jika belanja lebih dari 1 produk dan lebih dari 1 qty'

Mobile.tap(findTestObject('Object Repository/Laporan-transaksi/TC_MO_Harian/android.widget.TextView - Harian'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Laporan-transaksi/TC_MO_Harian/android.widget.LinearLayout laporan-hari-ini'), 0)

'Daftar transaksi di tab bulanan'

Mobile.tap(findTestObject('Object Repository/Laporan-transaksi/TC_MO_Bulanan/android.widget.TextView - Bulanan'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Laporan-transaksi/TC_MO_Bulanan/android.widget.LinearLayout laporan-bulan'), 0)

'Filter bulan melewati bulan sekarang'

Mobile.tap(findTestObject('Object Repository/Laporan-transaksi/TC_MO_Bulanan/android.widget.TextView - Januari 2022'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Laporan-transaksi/TC_MO_Bulanan/android.widget.ListView list bulan'), 0)

'Filter bulan saat ini'

Mobile.tap(findTestObject('Object Repository/Laporan-transaksi/TC_MO_Bulanan/android.widget.CheckedTextView - Mei 2022'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Laporan-transaksi/TC_MO_Bulanan/android.widget.LinearLayout laporan-bulan'), 0)

'Daftar transaksi di tab tahunan'

Mobile.tap(findTestObject('Object Repository/Laporan-transaksi/TC_MO_Tahunan/android.widget.TextView - Tahunan'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Laporan-transaksi/TC_MO_Tahunan/android.widget.LinearLayout laporan-tahunan'), 0)

'Filter tahun lebih dari tahun sekarang'

Mobile.tap(findTestObject('Object Repository/Laporan-transaksi/TC_MO_Tahunan/android.widget.TextView - 2022'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Laporan-transaksi/TC_MO_Tahunan/android.widget.ListView list tahun'), 0)

'Filter tahun kurang dari tahun sekarang'

Mobile.tap(findTestObject('Object Repository/Laporan-transaksi/TC_MO_Tahunan/android.widget.CheckedTextView - 2021'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Laporan-transaksi/TC_MO_Tahunan/android.widget.LinearLayout laporan-tahunan'), 0)

Mobile.closeApplication()