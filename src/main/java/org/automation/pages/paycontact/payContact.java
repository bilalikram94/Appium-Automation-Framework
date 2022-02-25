package org.automation.pages.paycontact;

import lombok.var;
import org.automation.pages.BasePage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class payContact extends BasePage {
    Logger logger = LoggerFactory.getLogger(payContact.class);
    public String element;

    public void clickPayContact(){
        isDisplayed(payContactLocators.paycontact,"Pay Contact");
        click(payContactLocators.paycontact,"Pay Contact");
        isDisplayed(payContactLocators.searchbar, "Search Bar");
    }

    public void searchNayapayContact(String contact){
        isDisplayed(payContactLocators.searchbar, "Search Bar");
        sendKeys(payContactLocators.searchbar, contact,"Contact Search");
        isDisplayed(payContactLocators.moreoptions,"More Options");
    }

    public void clickNayapayContact(){
        isDisplayed(payContactLocators.searchbar,"Search Bar");
        isDisplayed(payContactLocators.moreoptions,"More Options");
        click(payContactLocators.profileBadge,"Nayapay Contact");
    }

    public void enterAmount(String amount){
        wait(payContactLocators.enteramountlabel,2000);
        isDisplayed(payContactLocators.enteramount,"Enter Amount Label");
        sendKeys(payContactLocators.enteramountlabel,amount,"Enter Amount");
    }
    public void checkWalletBalance(){
        var element1 =  getText(payContactLocators.newWalletbalance,"Wallet balance").trim();
        String[] element = element1.split("(:)");
        this.element = element[1].trim();
        logger.info("Converted String :: "+this.element);
    }

    public void clickNextButton(){
        isDisplayed(payContactLocators.enteramountlabel,"Enter Amount Label");
        click(payContactLocators.nextButton,"Next Button");
    }

    public void enterMessage(String msg){
        isDisplayed(payContactLocators.enterMessage, "Enter Message");
        sendKeys(payContactLocators.enterMessage,msg,"Enter Message");
    }

    public void clickPaymentNextButton(){
        isDisplayed(payContactLocators.paymentNextButton,"Payment Next Button");
        click(payContactLocators.paymentNextButton,"Payment Next Button");
    }

    public void clickConfirmNextButton(){
        isDisplayed(payContactLocators.confirmNextButton,"Confirm Next Button");
        isDisplayed(payContactLocators.confirmCancelButton,"Confirm Cancel Button");
        click(payContactLocators.confirmNextButton,"Confirm Next Button");
    }

    public void enterMpin(String mpin){
        isDisplayed(payContactLocators.enterMpin, "Enter Mpin");
        sendKeys(payContactLocators.enterMpin,mpin,"MPIN");
        click(payContactLocators.sendMoney,"Send Money Button");
    }

    public void clickDoneButton(){
        isDisplayed(payContactLocators.viewReceipt,"View receipt");
        click(payContactLocators.doneButton,"Done Button");

    }

    public void checkDashboardWalletBalance(){
        wait(payContactLocators.walletBalance,5000);
        validateText(payContactLocators.walletBalance,element,"Check Wallet Balance");
    }

    public void blockContact(){
        click(payContactLocators.moreoptions,"More Options");
        click(payContactLocators.blockContact,"Block Contact");
        wait(payContactLocators.blockOkButton,2000);
        validateText(payContactLocators.blockContactTitle,"Contact Blocked","Block Title Message");
        click(payContactLocators.blockOkButton,"Block OK Button");
    }

    public void chatContact(){
        click(payContactLocators.moreoptions,"More Options");
        click(payContactLocators.chat,"Chat");
    }

    public String currentWalletBalance(){
       return getText(payContactLocators.walletBalance,"Current Wallet Balance");

    }

    public void unblockContact(){
        click(payContactLocators.backnavigate,"");
        click(payContactLocators.chattab,"Chat Tab");
        click(payContactLocators.manageChatContact,"Manage Contact");
        click(payContactLocators.contactoptions,"Contact Options");
        click(payContactLocators.blockedContact,"Blocked Contacts");
        click(payContactLocators.unblockContact,"Unblock Contact Button");

    }



}
