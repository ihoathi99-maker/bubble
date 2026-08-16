import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

// 1. Mở trang thêm tag
// 2. Bỏ trống タグ名, chỉ nhập các field khác
'Bỏ trống trường name'
WebUI.setText(findTestObject('Add Tags/input_Name'), '')

WebUI.setText(findTestObject('Add Tags/input_Slug'), 'test-slug')

WebUI.setText(findTestObject('Add Tags/input_color'), '#FF0000')

WebUI.setText(findTestObject('Add Tags/input_Lable color'), '#000000')

// 3. Bấm nút 保存
WebUI.click(findTestObject('Add Tags/button_Save'))

// 4. Verify hiển thị message lỗi required cho タグ名
WebUI.verifyElementPresent(findTestObject('Add Tags/Message name'), 5)

WebUI.verifyElementText(findTestObject('Add Tags/Message name'), 'タグ名を入力してください。')

// 5. Verify KHÔNG bị redirect (vẫn ở trang thêm tag - lưu thất bại)
WebUI.verifyElementPresent(findTestObject('Add Tags/button_Save'), 3)

WebUI.refresh()

