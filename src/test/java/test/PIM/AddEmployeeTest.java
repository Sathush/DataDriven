package test.PIM;

import com.pages.DashboardPage;
import com.pages.LoginPage;
import org.testng.annotations.Test;

import com.pim.AddEmployee;
import org.testng.asserts.SoftAssert;
import utils.PageBase;
import utils.TestBase;

public class AddEmployeeTest extends TestBase{

	   @Test(priority = 1)
	    public void PimTest(){

		   softAssert = new SoftAssert();
		   softAssert.assertTrue(LoginPage.isHrmLoginPageDisplayed(),"Hrm login not disply");
		   LoginPage.setUserName("Admin");
		   LoginPage.setPass("admin123");
		   LoginPage.ClickLogin();


		   AddEmployee.clickMenuPim();

		   AddEmployee.clickAddemployee();
		   /*AddEmployee.setFirstName("Nive");
		   AddEmployee.setMiddleName("Ruby");
		   AddEmployee.setLastName("Nive");
		   AddEmployee.setEmployeeId("0054");
		   AddEmployee.setPhotofile("");
		   AddEmployee.setClickLogin();
		   AddEmployee.setUsername("sathu");
		   AddEmployee.setPass("sathu");
		   AddEmployee.setConfirmPass("sathush");
		   AddEmployee.setBtnStatus();
		   AddEmployee.setClickSave();*/
		   softAssert.assertAll();


	    }

	    @Test(priority = 2, dataProviderClass =AddEmployeeData.class,dataProvider = "AddEmpTest")
	public void AddEmpTest(String firstName, String middleName, String lastName){
	   //	SoftAssert softAssert = new SoftAssert();
	   	//softAssert.assertTrue(AddEmployee.isHrmUserPageDisplayed(), "HrmDashboard Page Not Display");
			AddEmployee.setFirstName(firstName);
			AddEmployee.setMiddleName(middleName);
			AddEmployee.setLastName(lastName);

			//softAssert.assertTrue(DashboardPage.isHrmDashboardPageDisplayed(),"Hrm Page is Not Display");
			//softAssert.assertAll();
		}

}
