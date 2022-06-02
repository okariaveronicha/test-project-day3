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

Mobile.setText(findTestObject('New Folder/TC_MO_Batalkan-Pesanan/android.widget.EditText - Nomor Ponsel'), '081260385053', 0)

Mobile.setEncryptedText(findTestObject('New Folder/TC_MO_Batalkan-Pesanan/android.widget.EditText - Kata Sandi'), 'iFGeFYmXIrUb+oh5wcng3A==', 
    0)

Mobile.tap(findTestObject('New Folder/TC_MO_Batalkan-Pesanan/android.widget.Button - Masuk'), 0)

Mobile.tap(findTestObject('New Folder/TC_MO_Batalkan-Pesanan/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('New Folder/TC_MO_Batalkan-Pesanan/android.widget.TextView - Belanja Produk'), 0)

Mobile.tap(findTestObject('New Folder/TC_MO_Batalkan-Pesanan/android.widget.LinearLayout'), 0)

Mobile.tap(findTestObject('New Folder/TC_MO_Batalkan-Pesanan/android.widget.TextView - Tambahkan'), 0)

Mobile.tap(findTestObject('New Folder/TC_MO_Batalkan-Pesanan/android.view.ViewGroup'), 0)

Mobile.tap(findTestObject('New Folder/TC_MO_Batalkan-Pesanan/android.widget.Button - Buat Pesanan'), 0)

Mobile.tap(findTestObject('New Folder/TC_MO_Batalkan-Pesanan/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('New Folder/TC_MO_Batalkan-Pesanan/android.widget.Button - Batalkan pesanan'), 0)

Mobile.tap(findTestObject('New Folder/TC_MO_Batalkan-Pesanan/android.widget.Button - YA'), 0)

Mobile.tap(findTestObject('New Folder/TC_MO_Batalkan-Pesanan/android.widget.Button - TUTUP'), 0)

Mobile.tap(findTestObject('New Folder/TC_MO_Batalkan-Pesanan/android.widget.Button - Batalkan Pesanan (1)'), 0)

Mobile.tap(findTestObject('New Folder/TC_MO_Batalkan-Pesanan/android.widget.ImageView (1)'), 0)

Mobile.tap(findTestObject('New Folder/TC_MO_Batalkan-Pesanan/android.widget.ImageButton'), 0)

Mobile.closeApplication()

