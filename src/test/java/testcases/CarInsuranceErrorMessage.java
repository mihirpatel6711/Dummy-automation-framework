package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Pages.CarInsurancePage;
import base.TestBase;
import util.ReadExcel;

public class CarInsuranceErrorMessage extends TestBase{

	public CarInsuranceErrorMessage() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	CarInsurancePage car = new CarInsurancePage();
	 String userDir = System.getProperty("user.dir");
    String filePath = userDir + "\\src\\test\\java\\resources\\CarInsurance.xlsx";
	
	@BeforeClass
	public void setup()throws Exception {
		invokeBrowser();
		driver.navigate().to("https://www.policybazaar.com/");
		
	}	 
	
	@Test(priority=1)
	public void clickcarbutton() {
		logger = report.createTest("Car Insurance Test");
		logger.log(Status.PASS, "TestCase Passed");
		logger.log(Status.INFO, "Clicking Car Icon");
		car.carbutton();
		
	}
	@Test(priority=2)
	public void proceed() {
		car.clickandproceed();
		logger.log(Status.PASS, "TestCase Passed");
		logger.log(Status.INFO, "Clicking Proceed Button");
		
	}
	
    @Test(priority=3)
    public void city() {
    	car.selectcity();
    	logger.log(Status.PASS, "TestCase Passed");
		logger.log(Status.INFO, "Selecting the city");
		
    }
    @Test(priority=4)
    public void carbrand() throws InterruptedException {
    	car.selectcarbrand();
    	logger.log(Status.PASS, "TestCase Passed");
		logger.log(Status.INFO, "Selecting the carbrand");
    }
    @Test(priority=5)
    public void carmodel() {
    	car.selectmodel();
    	logger.log(Status.PASS, "TestCase Passed");
		logger.log(Status.INFO, "Selecting the carmodel");

    }






}

