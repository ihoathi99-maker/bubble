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

// 1. Mở trang thêm tag
// 2. Bỏ trống タグ名, chỉ nhập các field khác
WebUI.setText(findTestObject('Add Tags/input_Name'), 'Tag 168')

WebUI.setText(findTestObject('Add Tags/input_Slug'), 'test-slug')

'Bỏ trống trường color'
WebUI.setText(findTestObject('Add Tags/input_color'), '')

WebUI.setText(findTestObject('Add Tags/input_Lable color'), '#000000')

// 3. Bấm nút 保存
WebUI.click(findTestObject('Add Tags/button_Save'))

// 4. Verify hiển thị message lỗi required cho タグ名
WebUI.verifyElementPresent(findTestObject('Add Tags/Message empty color'), 5)

WebUI.verifyElementText(findTestObject('Add Tags/Message empty color'), '表示色を入力してください。')

// 5. Verify KHÔNG bị redirect (vẫn ở trang thêm tag - lưu thất bại)
WebUI.verifyElementPresent(findTestObject('Add Tags/button_Save'), 3)

WebUI.refresh()

