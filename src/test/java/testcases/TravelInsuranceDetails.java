package testcases;

import org.testng.annotations.BeforeClass;

import com.aventstack.extentreports.Status;

import java.io.IOException;

import org.testng.annotations.*;

import Pages.HomePage;
import Pages.TravelInsurancePage;
import base.TestBase;
import util.ReadExcel;

public class TravelInsuranceDetails extends TestBase {
    public TravelInsuranceDetails() throws Exception {
        super();
        // TODO Auto-generated constructor stub
    }
    TravelInsurancePage travel = new TravelInsurancePage();
    HomePage home = new HomePage();
    ReadExcel re = new ReadExcel();
     String userDir = System.getProperty("user.dir");
    String filePath = userDir + "\\src\\test\\java\\resources\\TravelInsurance.xlsx";
    @BeforeClass
   
    public void setup()throws Exception {
        invokeBrowser();
        driver.navigate().to("https://www.policybazaar.com/");
       
    }    
    @Test(priority=1)
    public void opentravelinsurancepage() throws InterruptedException {
        home.clickTravelInsurance();
    }
   
   
    @Test(priority=2)
    public void student() throws Exception {
        travel.clickStudent();
        logger = report.createTest("Travel Insurance Test");
        logger.log(Status.PASS, "TestCase Passed");
        logger.log(Status.INFO, "Clicking student tab");
    }
    @Test(priority=3)
    public void dest() throws IOException {
        travel.Destination(re.readexcel(0,filePath ,0));
        logger.log(Status.PASS, "TestCase Passed");
        logger.log(Status.INFO, "Filling Destination");
    }
    @Test(priority=4)
    public void age() throws IOException {
        travel.traveller(re.readexcel(0, filePath, 1),re.readexcel(0, filePath, 2));
        logger.log(Status.PASS, "TestCase Passed");
        logger.log(Status.INFO, "Filling Age");
    }
    @Test(priority=5)
    public void start() throws InterruptedException {
        travel.startdate();
        logger.log(Status.PASS, "TestCase Passed");
        logger.log(Status.INFO, "Choosing Start Date");
    }
	
}

