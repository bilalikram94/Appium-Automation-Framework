package org.automation.pages.mobiletopup;

import lombok.var;
import org.automation.pages.BasePage;
import org.automation.pages.paycontact.payContactLocators;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class mobileTopUp extends BasePage {
    Logger logger = LoggerFactory.getLogger(mobileTopUp.class);
    public String element;

    public void clickMobileTopUp(){
        isDisplayed(mobileTopUpLocators.mobileTopUp,"Mobile Top-Up");
        click(mobileTopUpLocators.mobileTopUp,"Mobile Top-Up");
        isDisplayed(mobileTopUpLocators.packageType,"Package Type");
        isDisplayed(mobileTopUpLocators.bundles,"Bundles");
        isDisplayed(mobileTopUpLocators.savedNumbers,"Saved Numbers");
        isDisplayed(mobileTopUpLocators.Zong,"Zong");
        isDisplayed(mobileTopUpLocators.Jazz,"Jazz");
        isDisplayed(mobileTopUpLocators.Telenor,"Telenor");
        isDisplayed(mobileTopUpLocators.Ufone,"Ufone");
        isDisplayed(mobileTopUpLocators.buyAgain,"Buy Again");

    }

    public void scrollMobileTopUp(){
        isDisplayed(mobileTopUpLocators.monthlysms,"Monthly SMS");
        scrollDown(mobileTopUpLocators.bundleKey,"Weekly SMS",mobileTopUpLocators.monthlysms);
        staticwait(2000);
    }

    public void clickNewMobileTopUp(){
        click(mobileTopUpLocators.newMobileTopUp,"New Mobile Top Up");
        isDisplayed(mobileTopUpLocators.prepaid,"Prepaid");
        isDisplayed(mobileTopUpLocators.postpaid,"Postpaid");
    }

    public void clickPrepaid(){
        click(mobileTopUpLocators.prepaid,"Prepaid");
        isDisplayed(mobileTopUpLocators.countryCode,"Country Code");
        isDisplayed(mobileTopUpLocators.mobileNumber,"Mobile Number");
        isDisplayed(mobileTopUpLocators.serviceProvider,"Service Provider");
        isDisplayed(mobileTopUpLocators.checkSaveNumber,"Check Save Number");
        isDisplayed(mobileTopUpLocators.nextButton,"Next Button");
    }
    public void enterMobileNumber(String mobilenumber){
        sendKeys(mobileTopUpLocators.mobileNumber,mobilenumber,"Mobile Number");
        click(mobileTopUpLocators.nextButton,"Next Button");
        staticwait(2000);
        isDisplayed(mobileTopUpLocators.packageType,"Package Type");
        isDisplayed(mobileTopUpLocators.specifyAmount,"Specify Amount");
    }

    public void clickSpecifyAmount(){
        click(mobileTopUpLocators.specifyAmount,"Specify Amount");
        isDisplayed(mobileTopUpLocators.newWalletBallance,"New Wallet Balance");
       // isDisplayed(mobileTopUpLocators.enterAmount,"Enter Amount");

    }

    public void enterAmount(String amount){
        sendKeys(mobileTopUpLocators.enterAmount,amount,"Enter Amount");
        isDisplayed(mobileTopUpLocators.enterAmountNextButton,"Enter Amount Next Button");
    }

    public void checkWalletBalance(){
        var element1 =  getText(mobileTopUpLocators.newWalletBallance,"New Wallet Balance").trim();
        String[] element = element1.split("(:)");
        this.element = element[1].trim();
        logger.info("Converted String :: "+this.element);
    }

    public void clickEnterAmountNextButton(){
        click(mobileTopUpLocators.enterAmountNextButton,"Enter Amount Next Button");
        isDisplayed(mobileTopUpLocators.confirmationNext,"Confirmation Next");
        isDisplayed(mobileTopUpLocators.confirmationCancel,"Confirmation Cancel");
    }

    public void clickConfirmationNext(){
        click(mobileTopUpLocators.confirmationNext,"Confirmation Next Button");
        isDisplayed(mobileTopUpLocators.mpin,"Mpin");
        isDisplayed(mobileTopUpLocators.forgotMpin,"Forgot MPIN");
    }

    public void enterMPIN(String mpin){
        sendKeys(mobileTopUpLocators.mpin,mpin,"MPIN Entered");
        isDisplayed(mobileTopUpLocators.payButton,"Pay Button");
    }

    public void clickPayButton(){
        click(mobileTopUpLocators.payButton,"Pay Button");
        
    }
}
