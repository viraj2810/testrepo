package Module1_Login;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Library_File.BaseClass;
import Library_File.UtilityClass;


public class KiteLoginTest extends BaseClass
{
	
	KiteLogin1Page login1;
	KiteLogin2Page login2;
	KiteHomePage home;
	int TestCaseID;
	@BeforeClass
	public void OpenBrowser() throws EncryptedDocumentException, IOException 
	{	//To open browser
		initializeBrowser();
		login1=new KiteLogin1Page(driver);
		login2=new KiteLogin2Page(driver);
		home=new KiteHomePage(driver);
	
	}

	@BeforeMethod
	public void loginToApp() throws EncryptedDocumentException, IOException 
	{	//To enter UN
		login1.inpKiteLogin1PageUsername(UtilityClass.getDataFromPF("UN"));
		//To enter Password
		login1.inpKiteLogin1Pagepassword(UtilityClass.getDataFromPF("PSW"));
		//Click on login button
		login1.clickKiteLogin1PageloginBtn();
		//To Enter PIN
		login2.inpKiteLogin2Pagepin(UtilityClass.getDataFromPF("PIN"));
		//Click on continue button
		login2.clickKiteLogin2PageCntBtn();
	} 
	
	@Test
	public void verifyUserID() throws EncryptedDocumentException, IOException 
	{
		TestCaseID=100;
		String actResult=home.getKiteHomePageUserID();
		String expResult=UtilityClass.getTD(0, 3);
		
		Assert.assertEquals(actResult, expResult,"Failed:Both results are different:");	
	}
	
	@AfterMethod
	public void logotFromApp(ITestResult result) throws IOException 
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			UtilityClass.captureScreenshot(driver, TestCaseID);
		}
		
		home.clickKiteHomePageUserID();
		home.clickKiteHomePagelogoutBtn();
	}
	
	@AfterClass
	public void closeBrowser() throws InterruptedException 
	{
		Thread.sleep(3000);
		driver.close();
		driver=null;
		login1=null;
		login2=null;
		home=null;
	}
}
