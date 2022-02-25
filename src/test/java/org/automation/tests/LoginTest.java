package org.automation.tests;
import org.automation.dataproviders.DataProviders;
import org.automation.listeners.RetryFailedTests;

import org.testng.annotations.Test;
import org.automation.pages.login.loginPageTest;
import org.automation.pages.login.loginPage;

import org.automation.pages.paycontact.payContactTest;



public class LoginTest extends BaseSetup {
    loginPageTest login = new loginPageTest();




    @Test(groups = {"Login"},testName = "Login with valid user ",dataProvider = "ValidLoginCreds", dataProviderClass = DataProviders.class, description = "Verify if user is logged in successfully", retryAnalyzer = RetryFailedTests.class)
    public void LoginPage_TC01(String username, String password){
            login.verifyLoginValidUserValidPass_npaap_499(username,password);

    }


    @Test(groups = {"Login"},testName = "Element Verification Page 1 ", description = "Element Verification Page 1", retryAnalyzer = RetryFailedTests.class)
    public void LoginPage_Element_Verification(){
        login.verifyLoginButton_npaap_1();
        login.verifyCancelButton_npaap_355();
    }

    @Test(groups = {"Login"},testName = "Element Verification Page 2",dataProvider = "ValidLoginCreds", dataProviderClass = DataProviders.class, description = "Element Verification Page 2", retryAnalyzer = RetryFailedTests.class)
    public void LoginPage_Element_VerificationPageTwo(String username, String password){
        login.verifyCancelButton_npaap_479(username);
        login.verifyShowPassword_npaap_360();
    }
    @Test(groups = {"Login"},testName = "Login with Invalid user ",dataProvider = "InValidLoginCreds", dataProviderClass = DataProviders.class, description = "Verify if user is not logged in successfully", retryAnalyzer = RetryFailedTests.class)
    public void LoginPage_TC02(String username, String password){
        login.verifyLoginValidUserValidPass_npaap_499(username,password);

    }



}
