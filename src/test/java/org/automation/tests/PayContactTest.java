package org.automation.tests;

import org.automation.constants.GlobalVars;
import org.automation.dataproviders.DataProviders;
import org.automation.listeners.RetryFailedTests;
import org.automation.reports.ExtentLogger;
import org.testng.SkipException;
import org.automation.pages.paycontact.payContactTest;
import org.testng.annotations.Test;

public class PayContactTest extends BaseSetup {
    payContactTest pay = new payContactTest();
    LoginTest login = new LoginTest();
    public String flag;


    @Test(priority = 1,groups = {"Pay Contact"},testName = "Wallet Balance",dataProvider = "ValidLoginCreds", dataProviderClass = DataProviders.class, description = "Wallet Balance", retryAnalyzer = RetryFailedTests.class)
    public void PayContact_TC01(String username, String password){
            login.LoginPage_TC01(username,password);
//            flag = pay.verifyCurrentWalletBalance();
        GlobalVars.wallet = pay.verifyCurrentWalletBalance();
    }

    @Test(priority = 2,groups = {"Pay Contact"},testName = "Successful Pay Contact",dataProvider = "ValidLoginCreds", dataProviderClass = DataProviders.class, description = "Successful Pay Contact", retryAnalyzer = RetryFailedTests.class)
    public void PayContact_TC02(String username, String password) {
        if (GlobalVars.wallet == null) {
            ExtentLogger.skip("Wallet Balance is Empty");
        }
            login.LoginPage_TC01(username, password);
            pay.verifyValidPayContact();
            ExtentLogger.pass("Successful Pay Contact");
    }

    @Test(priority = 3,groups = {"Pay Contact"},testName = "Verify Excess Sent Amount",dataProvider = "ValidLoginCreds", dataProviderClass = DataProviders.class, description = "Verify Excess Sent Amount", retryAnalyzer = RetryFailedTests.class)
    public void PayContact_TC03(String username, String password){
        if (GlobalVars.wallet == null) {
            ExtentLogger.skip("Wallet Balance is Empty");
        }
        login.LoginPage_TC01(username,password);
        pay.verifyExcessSentAmount();

    }
    @Test(priority = 4,groups = {"Pay Contact"},testName = "Verify Empty Sent Amount",dataProvider = "ValidLoginCreds", dataProviderClass = DataProviders.class, description = "Verify Empty Sent Amount", retryAnalyzer = RetryFailedTests.class)
    public void PayContact_TC04(String username, String password){
        if (GlobalVars.wallet == null) {
            ExtentLogger.skip("Wallet Balance is Empty");
        }
        login.LoginPage_TC01(username,password);
        pay.verifyEmptyPayContact();
    }
    @Test(priority = 5,groups = {"Pay Contact"},testName = "Verify Block Contact",dataProvider = "ValidLoginCreds", dataProviderClass = DataProviders.class, description = "Verify Block Contact", retryAnalyzer = RetryFailedTests.class)
    public void PayContact_TC05(String username, String password){
        if (GlobalVars.wallet == null) {
            ExtentLogger.skip("Wallet Balance is Empty");
        }
        login.LoginPage_TC01(username,password);
        pay.verifyBlockContact();
    }
    @Test(priority = 6,groups = {"Pay Contact"},testName = "Verify Chat Message",dataProvider = "ValidLoginCreds", dataProviderClass = DataProviders.class, description = "Verify Chat Message", retryAnalyzer = RetryFailedTests.class)
    public void PayContact_TC06(String username, String password){
        if (GlobalVars.wallet == null) {
            ExtentLogger.skip("Wallet Balance is Empty");
        }
        login.LoginPage_TC01(username,password);
        pay.verifyChatWindow();
    }
}
