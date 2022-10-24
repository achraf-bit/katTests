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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://tms.dev.mytower.fr/')

WebUI.setText(findTestObject('Object Repository/Page_Sign in to MyTower/input_Forgotten your password_username'), 'mytower2018+soungsid+chargeur@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign in to MyTower/input_Forgotten your password_password'), 
    'cQlZAR1V2CaThNHrQfGK3Q==')

WebUI.click(findTestObject('Object Repository/Page_Sign in to MyTower/form_Forgotten your password'))

WebUI.click(findTestObject('Object Repository/Page_Sign in to MyTower/input_Forgotten your password_submit pointer'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_MyTower/a_Alertes'), 0)

WebUI.click(findTestObject('Object Repository/Page_MyTower/span_Accueil_sidebar-alert'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_MyTower/span_13 - Demande de cotation'), 0)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_MyTower/span_42 - Renseignement dinformations de fa_66e06c'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_MyTower/input_concat(42 - Renseignement d, , inform_cf2d25'))

WebUI.click(findTestObject('Object Repository/Page_MyTower/span_Se dconnecter_fa fa-home'))

WebUI.closeBrowser()