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

Mobile.setText(findTestObject('Object Repository/Penyesuaian-show-product-ke-retailer/TC_MO_Normal-case/android.widget.EditText - Nomor Ponsel'), '0812345678903', 0)

Mobile.setEncryptedText(findTestObject('Object Repository/Penyesuaian-show-product-ke-retailer/TC_MO_Normal-case/android.widget.EditText - Kata Sandi'), 'iFGeFYmXIrUhQZHvW7P22w==', 0)

Mobile.tap(findTestObject('Object Repository/Penyesuaian-show-product-ke-retailer/TC_MO_Normal-case/android.widget.Button - Masuk'), 0)

Mobile.tap(findTestObject('Object Repository/Penyesuaian-show-product-ke-retailer/TC_MO_Normal-case/android.widget.ImageView'), 0)

'Unchecklist semua product'

Mobile.tap(findTestObject('Object Repository/Penyesuaian-show-product-ke-retailer/TC_MO_Normal-case/android.widget.TextView - Kelola Produk'), 0)

Mobile.tap(findTestObject('Object Repository/Penyesuaian-show-product-ke-retailer/TC_MO_Normal-case/android.widget.TextView - Edit'), 0)

Mobile.tap(findTestObject('Object Repository/Penyesuaian-show-product-ke-retailer/TC_MO_Normal-case/android.widget.CheckBox all'), 0)

Mobile.tap(findTestObject('Object Repository/Penyesuaian-show-product-ke-retailer/TC_MO_Normal-case/android.widget.TextView - Simpan'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Penyesuaian-show-product-ke-retailer/TC_MO_Checkbox/android.view.ViewGroup'), 0)

Mobile.takeScreenshot("C:\\Users\\ASANI\\Pictures\\penyesuaian show\\Screenshot_2022.06.08_13.27.11.219.png")

'Checklist >1 product'

Mobile.tap(findTestObject('Object Repository/Penyesuaian-show-product-ke-retailer/TC_MO_Normal-case/android.widget.TextView - Edit'), 0)

Mobile.tap(findTestObject('Object Repository/Penyesuaian-show-product-ke-retailer/TC_MO_Checkbox/android.widget.CheckBox obat'), 0)

Mobile.tap(findTestObject('Object Repository/Penyesuaian-show-product-ke-retailer/TC_MO_Checkbox/android.widget.CheckBox air'), 0)

Mobile.tap(findTestObject('Object Repository/Penyesuaian-show-product-ke-retailer/TC_MO_Normal-case/android.widget.TextView - Simpan'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Penyesuaian-show-product-ke-retailer/TC_MO_Checkbox/android.view.ViewGroup'), 0)

Mobile.takeScreenshot("C:\\Users\\ASANI\\Pictures\\penyesuaian show\\Screenshot_2022.06.08_13.28.51.651.png")

'Checklist semua product'

Mobile.tap(findTestObject('Object Repository/Penyesuaian-show-product-ke-retailer/TC_MO_Normal-case/android.widget.TextView - Edit'), 0)

Mobile.tap(findTestObject('Object Repository/Penyesuaian-show-product-ke-retailer/TC_MO_Normal-case/android.widget.CheckBox all'), 0)

Mobile.tap(findTestObject('Object Repository/Penyesuaian-show-product-ke-retailer/TC_MO_Normal-case/android.widget.TextView - Simpan'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Penyesuaian-show-product-ke-retailer/TC_MO_Checkbox/android.view.ViewGroup'), 0)

Mobile.takeScreenshot("C:\\Users\\ASANI\\Pictures\\penyesuaian show\\Screenshot_2022.06.08_13.25.46.335.png")

Mobile.closeApplication()