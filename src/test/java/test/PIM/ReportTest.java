package test.PIM;

import com.pages.DashboardPage;
import com.pages.LoginPage;
import com.pim.ReportPage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


import utils.PageBase;




import utils.TestBase;

public class ReportTest extends TestBase {
    @Test
    public void PimTest(){
    	
    	softAssert = new SoftAssert();
    	softAssert.assertTrue(LoginPage.isHrmLoginPageDisplayed(), "Hrm Login Page is Not display");
    
    	 LoginPage.setUserName("Admin");
         LoginPage.setPass("admin123");
         LoginPage.ClickLogin();
     	softAssert.assertTrue(DashboardPage.isHrmDashboardPageDisplayed(), "Hrm Dashboard page is not display");
        
     	ReportPage.Clickpim();
     	
    	ReportPage.ClickReport();
     	softAssert.assertTrue(ReportPage.isHrmReportPageDisplayed(), "Hrm ReportPage is not display");
    	ReportPage.implicitWait(3);
    	ReportPage.search("Thusi");
    	ReportPage.searchbtn();
    	ReportPage.resetbtn();

    	
    	softAssert.assertAll();
    	
    }
}