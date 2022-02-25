package org.automation.tests;

import org.automation.dataproviders.DataProviders;
import org.automation.listeners.RetryFailedTests;
import org.automation.pages.logout.logoutTest;
import org.testng.annotations.Test;

public class LogoutTest extends BaseSetup {
    logoutTest logout = new logoutTest();
    LoginTest login = new LoginTest();

    @Test(groups = {"Logout"},testName = "Logout with clear data ",dataProvider = "ValidLoginCreds", dataProviderClass = DataProviders.class, description = "Verify Logout with clear data", retryAnalyzer = RetryFailedTests.class)
    public void Logout_TC01(String username, String password){
        login.LoginPage_TC01(username,password);
        logout.verifyLogoutClearData();
    }

    @Test(groups = {"Logout"},testName = "Logout without clear data ",dataProvider = "ValidLoginCreds", dataProviderClass = DataProviders.class, description = "Verify Logout without clear data", retryAnalyzer = RetryFailedTests.class)
    public void Logout_TC02(String username, String password){
        login.LoginPage_TC01(username,password);
        logout.verifyLogoutNoClearData();
    }

}
