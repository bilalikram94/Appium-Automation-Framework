package org.automation.pages.login;


public class loginPageTest{
    loginPage login = new loginPage();
    public void verifyLoginValidUserValidPass_npaap_499(String username, String password){
        login.loginUsername(username);
        login.loginPassword(password);
        login.enterOTP();
       // login.grantPermission();
    }
    public void verifyLoginButton_npaap_1(){
        login.loginBtn();
    }
    public void verifyCancelButton_npaap_355(){
        login.cancelBtn();
    }

    public void  verifyCancelButton_npaap_479(String username){login.cancelButton2(username);}

    public void verifyShowPassword_npaap_360(){login.passwordShowButton();}

    public void verifyLoginValidUserValidPass_npaap_500(String username, String password){
        login.loginUsername(username);
        login.loginPassword(password);

        // login.grantPermission();
    }

}
