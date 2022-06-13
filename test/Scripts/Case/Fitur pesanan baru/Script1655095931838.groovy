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

Mobile.setText(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Pesanan-baru/android.widget.EditText - Nomor Ponsel'), 
    '0812345678903', 0)

'pesanan baru'
Mobile.setEncryptedText(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Pesanan-baru/android.widget.EditText - Kata Sandi'), 
    'iFGeFYmXIrUhQZHvW7P22w==', 0)

Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Pesanan-baru/android.widget.Button - Masuk'), 0)

Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Pesanan-baru/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Pesanan-baru/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Pesanan-baru/android.widget.CheckedTextView - Pesanan'), 
    0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Pesanan-baru/android.widget.TextView - Pesanan'), 
    0)

'Detail pesanan'
Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Detail-pesanan/android.widget.LinearLayout'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Detail-pesanan/android.widget.TextView - Detail Pesanan'), 
    0)

Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Detail-pesanan/android.widget.ImageView back'), 0)

'Filter tanggal'
Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Filter-tanggal-pesanan/android.widget.LinearLayout date-start'), 
    0)

Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Filter-tanggal-pesanan/android.view.View - 10'), 0)

Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Filter-tanggal-pesanan/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Filter-tanggal-pesanan/android.widget.LinearLayout date-end'), 
    0)

Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Filter-tanggal-pesanan/android.view.View - 19'), 0)

Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Filter-tanggal-pesanan/android.widget.Button - OK'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Filter-tanggal-pesanan/android.widget.TextView - Pesanan'), 
    0)

'Filter tanggal awal kurang dari tanggal sekarang'
Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Filter-tgl-awal-kurang-tgl-sekarang/android.widget.LinearLayout date-start'), 
    0)

Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Filter-tgl-awal-kurang-tgl-sekarang/android.view.View - 10'), 
    0)

Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Filter-tgl-awal-kurang-tgl-sekarang/android.widget.Button - OK'), 
    0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Filter-tgl-awal-kurang-tgl-sekarang/android.widget.TextView - Pesanan'), 
    0)

'Filter tanggal akhir kurang dari tanggal sekarang'
Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Filter-tgl-akhir-kurang-tgl-sekarang/android.widget.LinearLayout date-end'), 
    0)

Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Filter-tgl-akhir-kurang-tgl-sekarang/android.view.View - 10'), 
    0)

Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Filter-tgl-akhir-kurang-tgl-sekarang/android.widget.Button - OK'), 
    0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Filter-tgl-akhir-kurang-tgl-sekarang/android.widget.TextView - Pesanan'), 
    0)

'Filter tanggal awal lewat tanggal sekarang'
Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Filter-tgl-awal-lewat-tgl-sekarang/android.widget.LinearLayout date-start'), 
    0)

Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Filter-tgl-awal-lewat-tgl-sekarang/android.view.View - 24'), 
    0)

Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Filter-tgl-awal-lewat-tgl-sekarang/android.widget.Button - OK'), 
    0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Filter-tgl-awal-lewat-tgl-sekarang/android.widget.TextView - Pesanan'), 
    0)

'Filter tanggal akhir lewat tanggal sekarang'
Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Filter-tgl-akhir-lewat-tgl-sekarang/android.widget.LinearLayout date-end'), 
    0)

Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Filter-tgl-akhir-lewat-tgl-sekarang/android.view.View - 24'), 
    0)

Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Filter-tgl-akhir-lewat-tgl-sekarang/android.widget.Button - OK'), 
    0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Filter-tgl-akhir-lewat-tgl-sekarang/android.widget.TextView - Pesanan'), 
    0)

'Tolak pesanan dengan alasan kosong'
Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Filter-tanggal-pesanan/android.widget.LinearLayout date-start'), 
    0)

Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Filter-tanggal-pesanan/android.view.View - 10'), 0)

Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Filter-tanggal-pesanan/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Filter-tanggal-pesanan/android.widget.LinearLayout date-end'), 
    0)

Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Filter-tanggal-pesanan/android.view.View - 19'), 0)

Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Filter-tanggal-pesanan/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Alasan-tolak-kosong/android.widget.LinearLayout'), 0)

Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Alasan-tolak-kosong/android.widget.Button - Tolak Pesanan'), 
    0)

Mobile.setText(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Alasan-tolak-kosong/android.widget.EditText - Masalah produk pesanan'), 
    '', 0)

Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Alasan-tolak-kosong/android.widget.Button - Kirim'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Alasan-tolak-kosong/android.widget.TextView -  Alasan tolak pesanan tidak boleh kosong'), 
    0)

'Tolak pesanan dengan alasan lebih dari 200 karakter'
Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Alasan-tolak-lebih-200-karakter/android.widget.ImageView cancel'), 
    0)

Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Alasan-tolak-lebih-200-karakter/android.widget.Button - Tolak Pesanan'), 
    0)

Mobile.setText(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Alasan-tolak-lebih-200-karakter/android.widget.EditText - Masalah produk pesanan'), 
    'alasan tolak pesanan stok tidak tersedia, jarak terlalu jauh, lainnya, dan lain-lain alasan tolak pesanan stok tidak tersedia, jarak terlalu jauh, lainnya, dan lain-lain alasan tolak pesanan stok tidak tersedia', 
    0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Alasan-tolak-lebih-200-karakter/android.view.ViewGroup'), 
    0)

Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Alasan-tolak-lebih-200-karakter/android.widget.ImageView cancel'), 
    0)

'Alasan tolak pesanan berupa karakter spesial'
Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Alasan-tolak-karakter-spesial/android.widget.Button - Tolak Pesanan'), 
    0)

Mobile.setText(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Alasan-tolak-karakter-spesial/android.widget.EditText - Masalah produk pesanan'), 
    '%$#@$^&', 0)

Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Alasan-tolak-karakter-khusus/android.widget.Button - Kirim'), 
    0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Alasan-tolak-karakter-spesial/android.widget.TextView - Catatan tidak sesuai'), 
    0)

Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Alasan-tolak-lebih-200-karakter/android.widget.ImageView cancel'), 
    0)

'Alasan tolak pesanan berupa karakter khusus'
Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Alasan-tolak-karakter-khusus/android.widget.Button - Tolak Pesanan'), 
    0)

Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Alasan-tolak-karakter-khusus/android.widget.Spinner'), 0)

Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Alasan-tolak-karakter-khusus/android.widget.CheckedTextView - Jarak terlalu jauh'), 
    0)

Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Alasan-tolak-karakter-khusus/android.widget.CheckedTextView - Lainnya'), 
    0)

Mobile.setText(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Alasan-tolak-karakter-khusus/android.widget.EditText - Masalah produk pesanan'), 
    ':.-,/()', 0)

Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Alasan-tolak-karakter-khusus/android.widget.Button - Kirim'), 
    0)

Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Alasan-tolak-karakter-khusus/android.widget.Button - OK'), 
    0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Alasan-tolak-karakter-khusus/android.widget.TextView - Detail Pesanan'), 
    0)

Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Detail-pesanan/android.widget.ImageView back'), 0)

Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Detail-pesanan/android.widget.ImageButton back home'), 0)

'Alasan tolak pesanan hanya spasi'
Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Alasan-tolak-hanya-spasi/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Alasan-tolak-hanya-spasi/android.widget.CheckedTextView - Pesanan'), 
    0)

Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Alasan-tolak-hanya-spasi/android.widget.LinearLayout'), 
    0)

Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Alasan-tolak-hanya-spasi/android.widget.Button - Tolak Pesanan'), 
    0)

Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Alasan-tolak-hanya-spasi/android.widget.Spinner'), 0)

Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Alasan-tolak-hanya-spasi/android.widget.CheckedTextView - Lainnya'), 
    0)

Mobile.setText(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Alasan-tolak-hanya-spasi/android.widget.EditText - Masalah produk pesanan'), 
    ' ', 0)

Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Alasan-tolak-hanya-spasi/android.widget.Button - Kirim'), 
    0)

Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Alasan-tolak-hanya-spasi/android.widget.Button - OK'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Alasan-tolak-hanya-spasi/android.widget.TextView - Detail Pesanan'), 
    0)

Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Detail-pesanan/android.widget.ImageView back'), 0)

Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Detail-pesanan/android.widget.ImageButton back home'), 0)

'Alasan tolak pesanan berupa angka'
Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Alasan-tolak-angka/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Alasan-tolak-angka/android.widget.CheckedTextView - Pesanan'), 
    0)

Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Alasan-tolak-angka/android.widget.LinearLayout'), 0)

Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Alasan-tolak-angka/android.widget.Button - Tolak Pesanan'), 
    0)

Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Alasan-tolak-angka/android.widget.Spinner'), 0)

Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Tolak-pesanan/android.widget.CheckedTextView - Jarak terlalu jauh'), 
    0)

Mobile.setText(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Alasan-tolak-angka/android.widget.CheckedTextView - Lainnya'), 
    '31072000', 0)

Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Alasan-tolak-angka/android.widget.Button - Kirim'), 0)

Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Alasan-tolak-angka/android.widget.Button - OK'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Alasan-tolak-angka/android.widget.TextView - Detail Pesanan'), 
    0)

Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Detail-pesanan/android.widget.ImageView back'), 0)

Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Detail-pesanan/android.widget.ImageButton back home'), 0)

'Terima pesanan saat retailer dihapus'
Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Terima-pesanan-retailer-dihapus/android.widget.ImageButton'), 
    0)

Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Terima-pesanan-retailer-dihapus/android.widget.CheckedTextView - Pesanan'), 
    0)

Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Terima-pesanan-retailer-dihapus/android.widget.TextView - Riwayat'), 
    0)

Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Terima-pesanan-retailer-dihapus/android.widget.LinearLayout'), 
    0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Terima-pesanan-retailer-dihapus/android.widget.TextView - Detail Pesanan'), 
    0)

Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Detail-pesanan/android.widget.ImageView back'), 0)

Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Detail-pesanan/android.widget.ImageButton back home'), 0)

'Tolak pesanan saat retailer dihapus'
Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Tolak-pesanan-retailer-dihapus/android.widget.ImageButton'), 
    0)

Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Tolak-pesanan-retailer-dihapus/android.widget.CheckedTextView - Pesanan'), 
    0)

Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Tolak-pesanan-retailer-dihapus/android.widget.TextView - Riwayat'), 
    0)

Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Tolak-pesanan-retailer-dihapus/android.widget.LinearLayout'), 
    0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Tolak-pesanan-retailer-dihapus/android.widget.TextView - Detail Pesanan'), 
    0)

Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Detail-pesanan/android.widget.ImageView back'), 0)

Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Detail-pesanan/android.widget.ImageButton back home'), 0)

'Terima pesanan saat retailer ditambahkan kembali'
Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Terima-pesanan-retailer-kembali/android.widget.ImageButton'), 
    0)

Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Terima-pesanan-retailer-kembali/android.widget.CheckedTextView - Pesanan'), 
    0)

Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Terima-pesanan-retailer-kembali/android.widget.TextView - Riwayat'), 
    0)

Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Terima-pesanan-retailer-kembali/android.widget.LinearLayout'), 
    0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Terima-pesanan-retailer-kembali/android.widget.TextView - Detail Pesanan'), 
    0)

Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Detail-pesanan/android.widget.ImageView back'), 0)

Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Detail-pesanan/android.widget.ImageButton back home'), 0)

'Tolak pesanan saat retailer ditambahkan kembali'
Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Tolak-pesanan-retailer-kembali/android.widget.ImageButton'), 
    0)

Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Tolak-pesanan-retailer-kembali/android.widget.CheckedTextView - Pesanan'), 
    0)

Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Tolak-pesanan-retailer-kembali/android.widget.TextView - Riwayat'), 
    0)

Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Tolak-pesanan-retailer-kembali/android.widget.LinearLayout'), 
    0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Tolak-pesanan-retailer-kembali/android.widget.TextView - Detail Pesanan'), 
    0)

Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Detail-pesanan/android.widget.ImageView back'), 0)

Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Detail-pesanan/android.widget.ImageButton back home'), 0)

'Tolak Pesanan'
Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Tolak-pesanan/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Tolak-pesanan/android.widget.CheckedTextView - Pesanan'), 
    0)

Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Tolak-pesanan/android.widget.LinearLayout'), 0)

Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Tolak-pesanan/android.widget.Button - Tolak Pesanan'), 0)

Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Tolak-pesanan/android.widget.Spinner'), 0)

Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Tolak-pesanan/android.widget.CheckedTextView - Jarak terlalu jauh'), 
    0)

Mobile.setText(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Tolak-pesanan/android.widget.EditText - Masalah produk pesanan'), 
    'Menemukan retailer yang lebih dekat.', 0)

Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Tolak-pesanan/android.widget.Button - Kirim'), 0)

Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Tolak-pesanan/android.widget.Button - OK'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Tolak-pesanan/android.widget.TextView - Detail Pesanan'), 
    0)

Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Detail-pesanan/android.widget.ImageView back'), 0)

Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Detail-pesanan/android.widget.ImageButton back home'), 0)

'Terima Pesanan'
Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Terima-pesanan/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Terima-pesanan/android.widget.CheckedTextView - Pesanan'), 
    0)

Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Terima-pesanan/android.widget.LinearLayout'), 0)

Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Terima-pesanan/android.widget.Button - Terima Pesanan'), 
    0)

Mobile.tap(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Terima-pesanan/android.widget.Button - OK'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Pesanan-Baru/TC_MO_Terima-pesanan/android.widget.TextView - Detail Pesanan'), 
    0)

Mobile.closeApplication()

