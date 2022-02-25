package org.automation.pages.login;
import org.automation.factories.BrowserAlertFactory;
import org.automation.factories.ExplicitWaitFactory;
import org.automation.pages.BasePage;
import org.automation.constants.GlobalVars;
import org.automation.reports.ExtentLogger;

public class loginPage extends BasePage {

    public void loginUsername(String username) {
        isDisplayed(loginPageLocators.pageLogoImg,"Nayapay Logo");
        click(loginPageLocators.loginBtn,"Login Button Clicked");

        if(GlobalVars.getUserName() != null){
            sendKeys(loginPageLocators.nayaPayId,username,"Nayapay ID");
        }
        click(loginPageLocators.nextBtn,"Next Button Clicked");

    }

    public void loginPassword(String password){
        if(GlobalVars.getPassword() !=null){
            sendKeys(loginPageLocators.password,password,"Password");
            click(loginPageLocators.submitBtn,"Submit Button Clicked");
        }
        else {
            ExtentLogger.fail("Test Failed"+ BrowserAlertFactory.getAlertText());
        }



    }
    public  void enterOTP(){
        if (isDisplayed(loginPageLocators.otp,"OTP")){
            sendKeys(loginPageLocators.otp,GlobalVars.getOtp(),"OTP Entered");
            click(loginPageLocators.otpnext,"OTP Next Button");
            isDisplayed(loginPageLocators.notificationBell,"Notification Bell");

        }
        else {
            ExtentLogger.fail("Element Not Found");
        }
    }

    public void grantPermission(){
        if (isDisplayed(loginPageLocators.permissionStorage,"Permission Window")){

            click(loginPageLocators.permissionStorage,"Storage Permission Granted");
            click(loginPageLocators.permissionLocation,"Location Permission Granted");

    }
        else {
            ExtentLogger.fail("Element Not Found");
        }
    }
    public void loginBtn(){

        isDisplayed(loginPageLocators.pageLogoImg,"Nayapay Logo");
        click(loginPageLocators.loginBtn,"Login Button Clicked");
      //  isDisplayed(loginPageLocators.nayaPayId,"Nayapay ID");
        wait(loginPageLocators.nayaPayId,5000);
        isEnabled(loginPageLocators.nextBtn,"Next Button");


    }
    public void cancelBtn(){
       // isDisplayed(loginPageLocators.pageLogoImg,"Nayapay Logo");
      //  click(loginPageLocators.loginBtn,"Login Button Clicked");
        wait(loginPageLocators.nayaPayId,5000);
        isDisplayed(loginPageLocators.cancelButton,"Cancel Button");
    }
    public void cancelButton2(String username){
        loginUsername(username);
        isDisplayed(loginPageLocators.cancelButton,"Cancel Button");
        click(loginPageLocators.cancelButton,"");
        isDisplayed(loginPageLocators.pageLogoImg,"Nayapay logo");
        }
    public void passwordShowButton(){
        click(loginPageLocators.loginBtn,"Login Button");
        sendKeys(loginPageLocators.nayaPayId,GlobalVars.getUserName(),"Nayapay ID");
        click(loginPageLocators.nextBtn,"Next Button");
        isDisplayed(loginPageLocators.showPassword,"Show Password");
        sendKeys(loginPageLocators.password,GlobalVars.getPassword(),"Password");
        getText(loginPageLocators.password,"Password");
        click(loginPageLocators.showPassword,"Password Visible");
        getText(loginPageLocators.password,"Password");
    }

    public boolean isNotificationBelldisplayed(){
        return isDisplayed(loginPageLocators.notificationBell,"Notification Bell");
    }

    }


