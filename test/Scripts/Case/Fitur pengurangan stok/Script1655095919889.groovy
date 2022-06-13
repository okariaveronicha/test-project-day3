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

//Mobile.setText(findTestObject('Object Repository/Pengurangan stok/TC_MO_Supplier/android.widget.EditText - Nomor Ponsel'), 
//    '081260385053', 0)
//
//Mobile.setEncryptedText(findTestObject('Object Repository/Pengurangan stok/TC_MO_Supplier/android.widget.EditText - Kata Sandi'), 
//    'iFGeFYmXIrUb+oh5wcng3A==', 0)
//
//Mobile.tap(findTestObject('Object Repository/Penyesuaian-show-product-ke-retailer/TC_MO_Normal-case/android.widget.Button - Masuk'), 
//    0)
//
'Normal case'
Mobile.tap(findTestObject('Object Repository/Pengurangan stok/TC_MO_Normal-case/android.widget.TextView - Order'), 0)

Mobile.tap(findTestObject('Object Repository/Pengurangan stok/TC_MO_Normal-case/android.widget.TextView - Belanja Produk'), 
    0)

Mobile.tap(findTestObject('Object Repository/Pengurangan stok/TC_MO_Normal-case/android.widget.TextView - Order shop'), 
    0)

Mobile.tap(findTestObject('Object Repository/Pengurangan stok/TC_MO_Normal-case/android.widget.TextView - Tambahkan'), 0)

Mobile.tap(findTestObject('Object Repository/Pengurangan stok/TC_MO_Normal-case/android.view.ViewGroup'), 0)

Mobile.tap(findTestObject('Object Repository/Pengurangan stok/TC_MO_Normal-case/android.widget.Button - Buat Pesanan'), 
    0)

Mobile.tap(findTestObject('Object Repository/Pengurangan stok/TC_MO_Normal-case/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('Object Repository/Pengurangan stok/TC_MO_Normal-case/android.widget.ImageView back'), 0)

Mobile.tap(findTestObject('Object Repository/Pengurangan stok/TC_MO_Normal-case/android.widget.ImageView back'), 0)

'Checkout jumlah produk melebihi stok'
Mobile.tap(findTestObject('Object Repository/Pengurangan stok/TC_MO_Normal-case/android.widget.TextView - Order shop'), 
    0)

Mobile.tap(findTestObject('Object Repository/Pengurangan stok/TC_MO_Lebih-dan-sama-dengan-stok/android.widget.TextView - Tambahkan'), 
    0)

Mobile.setText(findTestObject('Object Repository/Pengurangan stok/TC_MO_Lebih-dan-sama-dengan-stok/android.widget.EditText - 1'), 
    '150', 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Pengurangan stok/TC_MO_Lebih-dan-sama-dengan-stok/android.view.ViewGroup lebih stok'), 
    0)

'Checkout jumlah produk sama dengan stok'
Mobile.tap(findTestObject('Object Repository/Pengurangan stok/TC_MO_Lebih-dan-sama-dengan-stok/android.view.ViewGroup checkout'), 
    0)

Mobile.tap(findTestObject('Object Repository/Pengurangan stok/TC_MO_Lebih-dan-sama-dengan-stok/android.widget.Button - Buat Pesanan'), 
    0)

Mobile.tap(findTestObject('Object Repository/Pengurangan stok/TC_MO_Lebih-dan-sama-dengan-stok/android.widget.Button - OK'), 
    0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Pengurangan stok/TC_MO_Lebih-dan-sama-dengan-stok/android.widget.LinearLayout sama dengan stok'), 
    0)

Mobile.tap(findTestObject('Object Repository/Pengurangan stok/TC_MO_Normal-case/android.widget.ImageView back'), 0)

Mobile.tap(findTestObject('Object Repository/Pengurangan stok/TC_MO_Normal-case/android.widget.ImageView back'), 0)

'Checkout produk dengan stok kosong'
Mobile.tap(findTestObject('Object Repository/Pengurangan stok/TC_MO_Normal-case/android.widget.TextView - Order shop'), 
    0)

//CustomKeywords.'newpackage.scroll.scrollListToElementWithText'('Air')

device_Height = Mobile.getDeviceHeight()

device_Width = Mobile.getDeviceWidth()

int startX = device_Width / 2

int endX = startX

int startY = device_Height * 0.30

int endY = device_Height * 0.80

Mobile.swipe(startX, endY, endX, startY)

//Mobile.scrollToText('Air')

Mobile.verifyElementVisible(findTestObject('Object Repository/Pengurangan stok/TC_MO_Stok-kosong-grosir-batal/android.widget.TextView - Stok Kosong'), 
    0)

'Checkout produk grosir dan batalkan pesanan'
Mobile.scrollToText('Beras Oke')

Mobile.tap(findTestObject('Object Repository/Pengurangan stok/TC_MO_Stok-kosong-grosir-batal/android.widget.TextView - Tambahkan (1)'), 
    0)

Mobile.tap(findTestObject('Object Repository/Pengurangan stok/TC_MO_Lebih-dan-sama-dengan-stok/android.view.ViewGroup checkout'), 
    0)

Mobile.tap(findTestObject('Object Repository/Pengurangan stok/TC_MO_Lebih-dan-sama-dengan-stok/android.widget.Button - Buat Pesanan'), 
    0)

Mobile.tap(findTestObject('Object Repository/Pengurangan stok/TC_MO_Lebih-dan-sama-dengan-stok/android.widget.Button - OK'), 
    0)

//Mobile.tap(findTestObject('Object Repository/Pengurangan stok/TC_MO_Stok-kosong-grosir-batal/android.widget.ImageView back'), 0)
//
//Mobile.tap(findTestObject('Object Repository/Pengurangan stok/TC_MO_Stok-kosong-grosir-batal/android.widget.ImageView back'), 0)
//
//'Batalkan pesanan'
//Mobile.tap(findTestObject('Object Repository/Pengurangan stok/TC_MO_Normal-case/android.widget.TextView - Order shop'), 
//    0)
//
//Mobile.tap(findTestObject('Object Repository/Pengurangan stok/TC_MO_Normal-case/android.widget.TextView - Tambahkan'), 0)
//
//Mobile.tap(findTestObject('Object Repository/Pengurangan stok/TC_MO_Normal-case/android.view.ViewGroup'), 0)
//
//Mobile.tap(findTestObject('Object Repository/Pengurangan stok/TC_MO_Normal-case/android.widget.Button - Buat Pesanan'), 
//    0)
//
//Mobile.tap(findTestObject('Object Repository/Pengurangan stok/TC_MO_Normal-case/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('Object Repository/Pengurangan stok/TC_MO_Stok-kosong-grosir-batal/android.widget.Button - Batalkan pesanan'), 
    0)

Mobile.tap(findTestObject('Object Repository/Pengurangan stok/TC_MO_Stok-kosong-grosir-batal/android.widget.Button - YA'), 
    0)

Mobile.tap(findTestObject('Object Repository/Pengurangan stok/TC_MO_Stok-kosong-grosir-batal/android.widget.Button - TUTUP'), 
    0)

Mobile.tap(findTestObject('Object Repository/Pengurangan stok/TC_MO_Stok-kosong-grosir-batal/android.widget.Button - Batalkan Pesanan (1)'), 
    0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Pengurangan stok/TC_MO_Stok-kosong-grosir-batal/android.view.ViewGroup batal pesanan'), 
    0)

