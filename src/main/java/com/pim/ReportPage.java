package com.pim;

import java.util.logging.Logger;
import org.openqa.selenium.By;
import utils.PageBase;

public class ReportPage extends PageBase{
	
	private static final Logger LOGGER = Logger.getLogger(String.valueOf(ReportPage.class));
	private static By search = By.id("search_search");
	private static By searchbtn = By.name("_search");
	private static By resetbtn = By.name("_reset");
	private static By Clickpim = By.id("menu_pim_viewPimModule");
	private static By ClickReport = By.id("menu_core_viewDefinedPredefinedReports");
	
    public static void Clickpim() {
    	getDriver().findElement(Clickpim).click();
    }
    
    public static void ClickReport() {
    	getDriver().findElement(ClickReport).click();
    }
    
    public static void search(String Search) {
    	getDriver().findElement(search).sendKeys(Search);
    }
    
    public static void searchbtn() {
    	getDriver().findElement(searchbtn).click();
    }
    
    public static void resetbtn() {
    	getDriver().findElement(resetbtn).click();
    }

    public static boolean isHrmReportPageDisplayed() {
        return getDriver().findElement(ClickReport).isDisplayed();
	}

   
    
}
