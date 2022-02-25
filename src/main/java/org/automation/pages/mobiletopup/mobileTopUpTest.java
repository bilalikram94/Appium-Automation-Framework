package org.automation.pages.mobiletopup;

import org.automation.constants.GlobalVars;
import org.automation.pages.BasePage;
import org.automation.pages.mobiletopup.mobileTopUp;

public class mobileTopUpTest extends BasePage {
    mobileTopUp top = new mobileTopUp();

    public void verifyValidPrepaidMobileTopUp(String mobilenumber, String amount, String mpin){
        top.clickMobileTopUp();
        top.scrollMobileTopUp();
        top.clickNewMobileTopUp();
        top.clickPrepaid();
        top.enterMobileNumber(mobilenumber);
        top.clickSpecifyAmount();
        top.enterAmount(amount);
        top.checkWalletBalance();
        top.clickEnterAmountNextButton();
        top.clickConfirmationNext();
        top.enterMPIN(mpin);
        top.clickPayButton();
    }

    public void verifyInvalidMobileNumberPrepaidMobileTopUp(String mobilenumber){
        top.clickMobileTopUp();
        top.scrollMobileTopUp();
        top.clickNewMobileTopUp();
        top.clickPrepaid();
        top.enterMobileNumber(mobilenumber);
    }

    public void verifyInvalidAmountPrepaidMobileTopUp(String mobilenumber,String amount){
        top.clickMobileTopUp();
        top.scrollMobileTopUp();
        top.clickNewMobileTopUp();
        top.clickPrepaid();
        top.enterMobileNumber(mobilenumber);
        top.clickSpecifyAmount();
        top.enterAmount(amount);
        top.clickEnterAmountNextButton();
    }

    public void verifyInvalidMPINPrepaidMobileTopUp(String mobilenumber, String amount, String mpin){
        top.clickMobileTopUp();
        top.scrollMobileTopUp();
        top.clickNewMobileTopUp();
        top.clickPrepaid();
        top.enterMobileNumber(mobilenumber);
        top.clickSpecifyAmount();
        top.enterAmount(amount);
        top.checkWalletBalance();
        top.clickEnterAmountNextButton();
        top.clickConfirmationNext();
        top.enterMPIN(mpin);
        top.clickPayButton();
    }
}
