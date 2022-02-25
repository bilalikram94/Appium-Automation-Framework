package org.automation.pages.paycontact;

import org.automation.constants.GlobalVars;
import org.automation.pages.BasePage;

public class payContactTest extends BasePage {
    payContact pay = new payContact();

    public void verifyValidPayContact(){

        pay.clickPayContact();
        pay.searchNayapayContact("sabah");
        pay.clickNayapayContact();
        pay.enterAmount("10");
        pay.checkWalletBalance();
        pay.clickNextButton();
        pay.enterMessage("Auto Test");
        pay.clickPaymentNextButton();
        pay.clickConfirmNextButton();
        pay.enterMpin(GlobalVars.getMpin());
        pay.clickDoneButton();
        pay.checkDashboardWalletBalance();

    }
    public  void verifyEmptyPayContact(){
        pay.clickPayContact();
        pay.searchNayapayContact("sabah");
        pay.clickNayapayContact();
        pay.clickNextButton();
        wait(payContactLocators.errorMsg,2000);
        validateText(payContactLocators.errorMsg,"Enter a valid amount first","Error Message");
    }

    public  void verifyExcessSentAmount(){
        pay.clickPayContact();
        pay.searchNayapayContact("sabah");
        pay.clickNayapayContact();
        pay.checkWalletBalance();
        pay.enterAmount("20000");
        pay.clickNextButton();
        wait(payContactLocators.errorMsg,2000);
        validateText(payContactLocators.errorMsg,"You have insufficient funds in your NayaPay wallet. Please enter an amount less than "+pay.element,"Error Message");

    }

    public void verifyBlockContact(){
        pay.clickPayContact();
        pay.searchNayapayContact("sania saleem");
        pay.blockContact();
        pay.unblockContact();

    }

    public void verifyChatWindow(){
        pay.clickPayContact();
        pay.searchNayapayContact("sabah");
        pay.chatContact();
        isDisplayed(payContactLocators.sendMessage,"Send Message");
    }

    public String verifyCurrentWalletBalance(){
       return pay.currentWalletBalance();

    }
}
