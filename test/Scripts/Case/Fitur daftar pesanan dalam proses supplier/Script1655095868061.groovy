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

Mobile.setText(findTestObject('Object Repository/Daftar-Pesanan-Dalam-Proses-supplier/TC_MO_Normal-case/android.widget.EditText - Nomor Ponsel'),
	'0812345678903', 0)

Mobile.setEncryptedText(findTestObject('Object Repository/Daftar-Pesanan-Dalam-Proses-supplier/TC_MO_Normal-case/android.widget.EditText - Kata Sandi'),
	'iFGeFYmXIrUhQZHvW7P22w==', 0)

Mobile.tap(findTestObject('Object Repository/Daftar-Pesanan-Dalam-Proses-supplier/TC_MO_Normal-case/android.widget.Button - Masuk'), 0)

Mobile.tap(findTestObject('Object Repository/Daftar-Pesanan-Dalam-Proses-supplier/TC_MO_Normal-case/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/Daftar-Pesanan-Dalam-Proses-supplier/TC_MO_Normal-case/android.widget.ImageButton burger'), 0)

'Normal case'

Mobile.tap(findTestObject('Object Repository/Daftar-Pesanan-Dalam-Proses-supplier/TC_MO_Normal-case/android.widget.CheckedTextView - Pesanan'), 0)

Mobile.tap(findTestObject('Object Repository/Daftar-Pesanan-Dalam-Proses-supplier/TC_MO_Normal-case/android.widget.TextView - Dalam Proses'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Daftar-Pesanan-Dalam-Proses-supplier/TC_MO_Normal-case/androidx.recyclerview.widget.RecyclerView'), 0)

'Filter tanggal'

Mobile.tap(findTestObject('Object Repository/Daftar-Pesanan-Dalam-Proses-supplier/TC_MO_Filter-tanggal/android.widget.LinearLayout date-start'), 0)

Mobile.tap(findTestObject('Object Repository/Daftar-Pesanan-Dalam-Proses-supplier/TC_MO_Filter-tanggal/android.view.View - 23'), 0)

Mobile.tap(findTestObject('Object Repository/Daftar-Pesanan-Dalam-Proses-supplier/TC_MO_Filter-tanggal/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('Object Repository/Daftar-Pesanan-Dalam-Proses-supplier/TC_MO_Filter-tanggal/android.widget.LinearLayout date-end'), 0)

Mobile.tap(findTestObject('Object Repository/Daftar-Pesanan-Dalam-Proses-supplier/TC_MO_Filter-tanggal/android.view.View - 23'), 0)

Mobile.tap(findTestObject('Object Repository/Daftar-Pesanan-Dalam-Proses-supplier/TC_MO_Filter-tanggal/android.widget.Button - OK'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Daftar-Pesanan-Dalam-Proses-supplier/TC_MO_Filter-tanggal/androidx.recyclerview.widget.RecyclerView'), 0)

'Filter awal kurang dari tanggal sekarang'

Mobile.tap(findTestObject('Object Repository/Daftar-Pesanan-Dalam-Proses-supplier/TC_MO_Filter-tanggal/android.widget.LinearLayout date-start'), 0)

Mobile.tap(findTestObject('Object Repository/Daftar-Pesanan-Dalam-Proses-supplier/TC_MO_Filter-tanggal/android.view.View - 3'), 0)

Mobile.tap(findTestObject('Object Repository/Daftar-Pesanan-Dalam-Proses-supplier/TC_MO_Filter-tanggal/android.widget.Button - OK'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Daftar-Pesanan-Dalam-Proses-supplier/TC_MO_Filter-tanggal/androidx.recyclerview.widget.RecyclerView'), 0)

'Filter awal lebih dari tanggal sekarang'

Mobile.tap(findTestObject('Object Repository/Daftar-Pesanan-Dalam-Proses-supplier/TC_MO_Filter-tanggal/android.widget.LinearLayout date-start'), 0)

Mobile.tap(findTestObject('Object Repository/Daftar-Pesanan-Dalam-Proses-supplier/TC_MO_Filter-tanggal/android.view.View - 30'), 0)

Mobile.tap(findTestObject('Object Repository/Daftar-Pesanan-Dalam-Proses-supplier/TC_MO_Filter-tanggal/android.widget.Button - OK'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Daftar-Pesanan-Dalam-Proses-supplier/TC_MO_Filter-tanggal/androidx.recyclerview.widget.RecyclerView'), 0)

'Filter akhir kurang dari tanggal sekarang'

Mobile.tap(findTestObject('Object Repository/Daftar-Pesanan-Dalam-Proses-supplier/TC_MO_Filter-tanggal/android.widget.LinearLayout date-end'), 0)

Mobile.tap(findTestObject('Object Repository/Daftar-Pesanan-Dalam-Proses-supplier/TC_MO_Filter-tanggal/android.view.View - 3'), 0)

Mobile.tap(findTestObject('Object Repository/Daftar-Pesanan-Dalam-Proses-supplier/TC_MO_Filter-tanggal/android.widget.Button - OK'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Daftar-Pesanan-Dalam-Proses-supplier/TC_MO_Filter-tanggal/androidx.recyclerview.widget.RecyclerView'), 0)

'Filter akhir lebih dari tanggal sekarang'

Mobile.tap(findTestObject('Object Repository/Daftar-Pesanan-Dalam-Proses-supplier/TC_MO_Filter-tanggal/android.widget.LinearLayout date-end'), 0)

Mobile.tap(findTestObject('Object Repository/Daftar-Pesanan-Dalam-Proses-supplier/TC_MO_Filter-tanggal/android.view.View - 30'), 0)

Mobile.tap(findTestObject('Object Repository/Daftar-Pesanan-Dalam-Proses-supplier/TC_MO_Filter-tanggal/android.widget.Button - OK'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Daftar-Pesanan-Dalam-Proses-supplier/TC_MO_Filter-tanggal/androidx.recyclerview.widget.RecyclerView'), 0)

'Detail status pesanan menunggu pembayaran'

Mobile.tap(findTestObject('Object Repository/Daftar-Pesanan-Dalam-Proses-supplier/TC_MO_Filter-tanggal/android.widget.LinearLayout date-start'), 0)

Mobile.tap(findTestObject('Object Repository/Daftar-Pesanan-Dalam-Proses-supplier/TC_MO_Filter-tanggal/android.view.View - 23'), 0)

Mobile.tap(findTestObject('Object Repository/Daftar-Pesanan-Dalam-Proses-supplier/TC_MO_Filter-tanggal/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('Object Repository/Daftar-Pesanan-Dalam-Proses-supplier/TC_MO_Filter-tanggal/android.widget.LinearLayout date-end'), 0)

Mobile.tap(findTestObject('Object Repository/Daftar-Pesanan-Dalam-Proses-supplier/TC_MO_Filter-tanggal/android.view.View - 23'), 0)

Mobile.tap(findTestObject('Object Repository/Daftar-Pesanan-Dalam-Proses-supplier/TC_MO_Filter-tanggal/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('Object Repository/Daftar-Pesanan-Dalam-Proses-supplier/TC_MO_Filter-pesanan-dalam-status/android.widget.TextView - Semua Status Pesanan'), 0)

Mobile.tap(findTestObject('Object Repository/Daftar-Pesanan-Dalam-Proses-supplier/TC_MO_Detail-pesanan-belum-bayar/android.widget.CheckedTextView - Belum Dibayar'), 0)

Mobile.tap(findTestObject('Object Repository/Daftar-Pesanan-Dalam-Proses-supplier/TC_MO_Detail-pesanan-belum-bayar/android.widget.LinearLayout pesanan'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Daftar-Pesanan-Dalam-Proses-supplier/TC_MO_Detail-pesanan-belum-bayar/android.widget.TextView - Detail Pesanan'), 0)

'Kirim pesanan sebelum dibayar'

Mobile.tap(findTestObject('Object Repository/Daftar-Pesanan-Dalam-Proses-supplier/TC_MO_Detail-pesanan-belum-bayar/android.widget.LinearLayout pesanan'), 0)

Mobile.tap(findTestObject('Object Repository/Daftar-Pesanan-Dalam-Proses-supplier/TC_MO_Kirim-pesanan-belum-dibayar/android.widget.Button - Kirim Pesanan'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Daftar-Pesanan-Dalam-Proses-supplier/TC_MO_Kirim-pesanan-belum-dibayar/android.widget.TextView - Detail Pesanan'), 0)

Mobile.tap(findTestObject('Object Repository/Daftar-Pesanan-Dalam-Proses-supplier/TC_MO_Detail-pesanan-belum-bayar/android.widget.ImageView back'), 0)

'Detail status pesanan telah dibayar'

Mobile.tap(findTestObject('Object Repository/Daftar-Pesanan-Dalam-Proses-supplier/TC_MO_Filter-pesanan-dalam-status/android.widget.TextView - Semua Status Pesanan'), 0)

Mobile.tap(findTestObject('Object Repository/Daftar-Pesanan-Dalam-Proses-supplier/TC_MO_Detail-pesanan-telah-dibayar/android.widget.CheckedTextView - Dibayar'), 0)

Mobile.tap(findTestObject('Object Repository/Daftar-Pesanan-Dalam-Proses-supplier/TC_MO_Detail-pesanan-telah-dibayar/android.widget.LinearLayout'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Daftar-Pesanan-Dalam-Proses-supplier/TC_MO_Detail-pesanan-telah-dibayar/android.widget.TextView - Detail Pesanan'), 0)

'Kirim pesanan setelah dibayar'

Mobile.tap(findTestObject('Object Repository/Daftar-Pesanan-Dalam-Proses-supplier/TC_MO_Kirim-pesanan-sudah-dibayar/android.widget.Button - Kirim Pesanan'), 0)

Mobile.tap(findTestObject('Object Repository/Daftar-Pesanan-Dalam-Proses-supplier/TC_MO_Kirim-pesanan-sudah-dibayar/android.widget.Button - OK'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Daftar-Pesanan-Dalam-Proses-supplier/TC_MO_Kirim-pesanan-sudah-dibayar/android.widget.TextView - Detail Pesanan'), 0)

Mobile.tap(findTestObject('Object Repository/Daftar-Pesanan-Dalam-Proses-supplier/TC_MO_Detail-pesanan-belum-bayar/android.widget.ImageView back'), 0)

'Hapus pesanan'

Mobile.tap(findTestObject('Object Repository/Daftar-Pesanan-Dalam-Proses-supplier/TC_MO_Detail-pesanan-telah-dibayar/android.widget.LinearLayout'), 0)

Mobile.tap(findTestObject('Object Repository/Daftar-Pesanan-Dalam-Proses-supplier/TC_MO_Hapus-pesanan/android.widget.Button - Hapus Pesanan'), 0)

Mobile.tap(findTestObject('Object Repository/Daftar-Pesanan-Dalam-Proses-supplier/TC_MO_Hapus-pesanan/android.widget.Button - YA'), 0)

Mobile.tap(findTestObject('Object Repository/Daftar-Pesanan-Dalam-Proses-supplier/TC_MO_Hapus-pesanan/android.widget.Button - OK'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Daftar-Pesanan-Dalam-Proses-supplier/TC_MO_Hapus-pesanan/android.widget.TextView - Detail Pesanan'), 0)

Mobile.tap(findTestObject('Object Repository/Daftar-Pesanan-Dalam-Proses-supplier/TC_MO_Detail-pesanan-belum-bayar/android.widget.ImageView back'), 0)

'Detail status pesanan dalam pengiriman'

Mobile.tap(findTestObject('Object Repository/Daftar-Pesanan-Dalam-Proses-supplier/TC_MO_Detail-pesanan-telah-dibayar/android.widget.TextView - Semua Status Pesanan'), 0)

Mobile.tap(findTestObject('Object Repository/Daftar-Pesanan-Dalam-Proses-supplier/TC_MO_Detail-pesanan-dalam-pengiriman/android.widget.CheckedTextView - Dalam Pengiriman'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Daftar-Pesanan-Dalam-Proses-supplier/TC_MO_Detail-pesanan-dalam-pengiriman/android.widget.TextView - Detail Pesanan'), 0)

Mobile.tap(findTestObject('Object Repository/Daftar-Pesanan-Dalam-Proses-supplier/TC_MO_Detail-pesanan-belum-bayar/android.widget.ImageView back'), 0)

Mobile.closeApplication()