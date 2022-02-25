package org.automation.tests;

import org.automation.constants.GlobalVars;
import org.automation.dataproviders.DataProviders;
import org.automation.listeners.RetryFailedTests;
import org.automation.reports.ExtentLogger;
import org.automation.pages.discovermerchants.discoverMerchantsTest;
import org.testng.annotations.Test;


public class DiscoverMerchantsTest extends BaseSetup {
    discoverMerchantsTest discover = new discoverMerchantsTest();
    LoginTest login = new LoginTest();


    @Test(priority = 1,groups = {"Discover Merchant"},testName = "Successful wallet check",dataProvider = "ValidStgCreds", dataProviderClass = DataProviders.class, description = "Successful Wallet check", retryAnalyzer = RetryFailedTests.class)
    public void DiscoverMerchant_TC01(String username, String password){
        login.LoginPage_TC01(username,password);
        GlobalVars.wallet = discover.verifyDashboardWallet();
    }

    @Test(priority = 5,groups = {"Discover Merchant"},testName = "Successful Discover Merchant",dataProvider = "ValidStgCreds", dataProviderClass = DataProviders.class, description = "Successful Discover Merchant", retryAnalyzer = RetryFailedTests.class)
    public void DiscoverMerchant_TC02(String username, String password) {
        /*if (GlobalVars.wallet == null) {
            ExtentLogger.skip("Wallet Balance is Empty");
        }*/
        login.LoginPage_TC01(username, password);
        discover.verifyValidDiscoverMerchant();
    }


    @Test(priority = 2,groups = {"Discover Merchant"},testName = "Successful Call Us Button",dataProvider = "ValidStgCreds", dataProviderClass = DataProviders.class, description = "Successful Call Us Button", retryAnalyzer = RetryFailedTests.class)
    public void DiscoverMerchant_TC03(String username, String password) {
        /*if (GlobalVars.wallet == null) {
            ExtentLogger.skip("Wallet Balance is Empty");
        }*/

        login.LoginPage_TC01(username,password);
        discover.verifyCallusButton();
    }

    @Test(priority = 3,groups = {"Discover Merchant"},testName = "Successful Navigate Button",dataProvider = "ValidStgCreds", dataProviderClass = DataProviders.class, description = "Successful Navigate Button", retryAnalyzer = RetryFailedTests.class)
    public void DiscoverMerchant_TC04(String username, String password) {
        /*if (GlobalVars.wallet == null) {
            ExtentLogger.skip("Wallet Balance is Empty");
        }*/

        login.LoginPage_TC01(username,password);
        discover.verifyNavigateButton();
    }

    @Test(priority = 4,groups = {"Discover Merchant"},testName = "Successful Visit Website Button",dataProvider = "ValidStgCreds", dataProviderClass = DataProviders.class, description = "Successful Visit Website Button", retryAnalyzer = RetryFailedTests.class)
    public void DiscoverMerchant_TC05(String username, String password) {
        /*if (GlobalVars.wallet == null) {
            ExtentLogger.skip("Wallet Balance is Empty");
        }*/

        login.LoginPage_TC01(username,password);
        discover.verifyVisitWebsiteButton();
    }

}
