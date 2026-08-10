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

WebUI.setText(findTestObject('Add Tags/input_Name'), 'Acceptance of Terms By accessing or using Bubble Poker')

WebUI.verifyElementPresent(findTestObject('Add Tags/Message name'), 5)

WebUI.verifyElementText(findTestObject('Add Tags/Message name'), 'タグ名は30文字以内で入力してください。')

WebUI.setText(findTestObject('Add Tags/input_Slug'), 'Acceptance of Terms By accessing or using Bubble Poker (the "Service"), you agree to be bound by these Terms')

WebUI.verifyElementPresent(findTestObject('Add Tags/Message slug'), 5)

WebUI.verifyElementText(findTestObject('Add Tags/Message slug'), 'スラッグは100文字以内で入力してください。')

'Nhập sai định dạng hex'
WebUI.setText(findTestObject('Add Tags/input_color'), '#660')

WebUI.verifyElementPresent(findTestObject('Add Tags/Message empty color'), 5)

WebUI.verifyElementText(findTestObject('Add Tags/Message empty color'), '表示色は有効なカラーコードで入力してください（例: #FF0000）。')

WebUI.setText(findTestObject('Add Tags/input_Lable color'), '#faf')

WebUI.verifyElementPresent(findTestObject('Add Tags/Message empty lable color'), 5)

WebUI.verifyElementText(findTestObject('Add Tags/Message empty lable color'), 'ラベル色は有効なカラーコードで入力してください（例: #000000）。')

WebUI.click(findTestObject('Add Tags/button_Save'))

WebUI.refresh()

