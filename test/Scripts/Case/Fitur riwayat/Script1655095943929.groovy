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

Mobile.setText(findTestObject('Object Repository/Riwayat/TC_MO_Normal case/android.widget.EditText - Nomor Ponsel'), '0812345678903', 0)

Mobile.setEncryptedText(findTestObject('Object Repository/Riwayat/TC_MO_Normal case/android.widget.EditText - Kata Sandi'), 'iFGeFYmXIrUhQZHvW7P22w==', 0)

Mobile.tap(findTestObject('Object Repository/Riwayat/TC_MO_Normal case/android.widget.Button - Masuk'), 0)

Mobile.tap(findTestObject('Object Repository/Riwayat/TC_MO_Normal case/android.widget.ImageView'), 0)

'Normal case'

Mobile.tap(findTestObject('Object Repository/Hapus-Retailer/TC_MO_Batal-hapus/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/Riwayat/TC_MO_Normal case/android.widget.CheckedTextView - Pesanan'), 0)

Mobile.tap(findTestObject('Object Repository/Riwayat/TC_MO_Normal case/android.widget.TextView - Riwayat'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Riwayat/TC_MO_Normal case/android.widget.LinearLayout capture'), 0)

'Filter awal lebih dari tanggal sekarang'

Mobile.tap(findTestObject('Object Repository/Riwayat/TC_MO_Filter-tanggal/android.widget.LinearLayout date-start'), 0)

//Mobile.tap(findTestObject('Object Repository/Riwayat/TC_MO_Filter-tanggal/android.view.View - 30'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Riwayat/TC_MO_Filter-tanggal/android.widget.Button - OK'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Riwayat/TC_MO_Filter-tanggal/android.widget.LinearLayout'), 0)

'Filter akhir lebih dari tanggal sekarang'

Mobile.tap(findTestObject('Object Repository/Riwayat/TC_MO_Filter-tanggal/android.widget.LinearLayout date-end'), 0)

//Mobile.tap(findTestObject('Object Repository/Riwayat/TC_MO_Filter-tanggal/android.view.View - 30'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Riwayat/TC_MO_Filter-tanggal/android.widget.Button - OK'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Riwayat/TC_MO_Filter-tanggal/android.widget.LinearLayout'), 0)

'Filter awal kurang dari tanggal sekarang'

Mobile.tap(findTestObject('Object Repository/Riwayat/TC_MO_Filter-tanggal/android.widget.LinearLayout date-start'), 0)

Mobile.tap(findTestObject('Object Repository/Riwayat/TC_MO_Filter-tanggal/android.widget.ImageButton bln sebelumnya'), 0)

Mobile.tap(findTestObject('Object Repository/Riwayat/TC_MO_Filter-tanggal/android.view.View - 3'), 0)

Mobile.tap(findTestObject('Object Repository/Riwayat/TC_MO_Filter-tanggal/android.widget.Button - OK'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Riwayat/TC_MO_Filter-tanggal/android.widget.TextView - Pesanan'), 0)

'Filter akhir kurang dari tanggal sekarang'

Mobile.tap(findTestObject('Object Repository/Riwayat/TC_MO_Filter-tanggal/android.widget.LinearLayout date-end'), 0)

Mobile.tap(findTestObject('Object Repository/Riwayat/TC_MO_Filter-tanggal/android.widget.ImageButton bln sebelumnya'), 0)

Mobile.tap(findTestObject('Object Repository/Riwayat/TC_MO_Filter-tanggal/android.view.View - 30'), 0)

Mobile.tap(findTestObject('Object Repository/Riwayat/TC_MO_Filter-tanggal/android.widget.Button - OK'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Riwayat/TC_MO_Filter-tanggal/android.widget.TextView - Pesanan'), 0)

'Detail riwayat pesanan selesai'

Mobile.tap(findTestObject('Object Repository/Riwayat/TC_MO_Status riwayat/android.widget.TextView - Semua Status Pesanan'), 0)

Mobile.tap(findTestObject('Object Repository/Riwayat/TC_MO_Status riwayat/android.widget.CheckedTextView - Selesai'), 0)

Mobile.tap(findTestObject('Object Repository/Riwayat/TC_MO_Detail riwayat pesanan/android.widget.LinearLayout'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Riwayat/TC_MO_Detail riwayat pesanan/android.widget.TextView - Selesai'), 0)

Mobile.tap(findTestObject('Object Repository/Riwayat/TC_MO_Detail riwayat pesanan/android.widget.ImageView back'), 0)

'Detail riwayat pesanan ditolak'

Mobile.tap(findTestObject('Object Repository/Riwayat/TC_MO_Status riwayat/android.widget.TextView - Selesai'), 0)

Mobile.tap(findTestObject('Object Repository/Riwayat/TC_MO_Status riwayat/android.widget.CheckedTextView - Ditolak'), 0)

Mobile.tap(findTestObject('Object Repository/Riwayat/TC_MO_Detail riwayat pesanan/android.widget.LinearLayout'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Riwayat/TC_MO_Detail riwayat pesanan/android.widget.TextView - Pesanan ditolak'), 0)

Mobile.tap(findTestObject('Object Repository/Riwayat/TC_MO_Detail riwayat pesanan/android.widget.ImageView back'), 0)

'Detail riwayat pesanan dibatalkan'

Mobile.tap(findTestObject('Object Repository/Riwayat/TC_MO_Status riwayat/android.widget.TextView - Ditolak'), 0)

Mobile.tap(findTestObject('Object Repository/Riwayat/TC_MO_Status riwayat/android.widget.CheckedTextView - Dibatalkan'), 0)

Mobile.tap(findTestObject('Object Repository/Riwayat/TC_MO_Detail riwayat pesanan/android.widget.LinearLayout'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Riwayat/TC_MO_Detail riwayat pesanan/android.widget.TextView - Dibatalkan'), 0)

Mobile.tap(findTestObject('Object Repository/Riwayat/TC_MO_Detail riwayat pesanan/android.widget.ImageView back'), 0)

'Detail riwayat pesanan dihapus'

Mobile.tap(findTestObject('Object Repository/Riwayat/TC_MO_Status riwayat/android.widget.TextView - Dibatalkan'), 0)

Mobile.tap(findTestObject('Object Repository/Riwayat/TC_MO_Status riwayat/android.widget.CheckedTextView - Dihapus'), 0)

Mobile.tap(findTestObject('Object Repository/Riwayat/TC_MO_Detail riwayat pesanan/android.widget.LinearLayout'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Riwayat/TC_MO_Detail riwayat pesanan/android.widget.TextView - Dihapus'), 0)

Mobile.tap(findTestObject('Object Repository/Riwayat/TC_MO_Detail riwayat pesanan/android.widget.ImageView back'), 0)

'Detail riwayat pesanan gagal'

Mobile.tap(findTestObject('Object Repository/Riwayat/TC_MO_Status riwayat/android.widget.TextView - Dihapus'), 0)

Mobile.tap(findTestObject('Object Repository/Riwayat/TC_MO_Status riwayat/android.widget.CheckedTextView - Gagal'), 0)

Mobile.tap(findTestObject('Object Repository/Riwayat/TC_MO_Detail riwayat pesanan/android.widget.LinearLayout'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Riwayat/TC_MO_Detail riwayat pesanan/android.widget.TextView - Gagal'), 0)

Mobile.closeApplication()
