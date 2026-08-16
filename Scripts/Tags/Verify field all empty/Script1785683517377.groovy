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

WebUI.click(findTestObject('Add Tags/button_Save'))

WebUI.verifyElementPresent(findTestObject('Add Tags/Message name'), 5)

WebUI.verifyElementText(findTestObject('Add Tags/Message name'), 'タグ名を入力してください。')

WebUI.verifyElementPresent(findTestObject('Add Tags/Message slug'), 5)

WebUI.verifyElementText(findTestObject('Add Tags/Message slug'), 'スラッグを入力してください。')

WebUI.verifyElementPresent(findTestObject('Add Tags/Message empty color'), 5)

WebUI.verifyElementText(findTestObject('Add Tags/Message empty color'), '表示色を入力してください。')

WebUI.verifyElementPresent(findTestObject('Add Tags/Message empty lable color'), 5)

WebUI.verifyElementText(findTestObject('Add Tags/Message empty lable color'), 'ラベル色を入力してください。')

WebUI.refresh(FailureHandling.STOP_ON_FAILURE)

