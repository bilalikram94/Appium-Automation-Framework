package org.automation.tests;

import org.automation.constants.GlobalVars;
import org.automation.dataproviders.DataProviders;
import org.automation.listeners.RetryFailedTests;
import org.testng.annotations.Test;
import org.automation.pages.mobiletopup.mobileTopUpTest;



public class MobileTopUpTest extends BaseSetup{

    mobileTopUpTest top = new mobileTopUpTest();
    LoginTest login = new LoginTest();

    @Test(priority = 1,groups = {"Mobile TopUp"},testName = "Mobile TopUp",dataProvider = "ValidStgCreds", dataProviderClass = DataProviders.class, description = "Mobile TopUp", retryAnalyzer = RetryFailedTests.class)
    public void MobileTopUp_TC01(String username, String password){
        login.LoginPage_TC01(username,password);
        top.verifyValidPrepaidMobileTopUp("03332100061","50",GlobalVars.getMpin());

    }

}
