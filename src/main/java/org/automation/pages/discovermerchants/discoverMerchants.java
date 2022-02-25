package org.automation.pages.discovermerchants;

import lombok.var;
import org.automation.constants.GlobalVars;
import org.automation.pages.BasePage;
import org.automation.pages.paycontact.payContact;
import org.automation.pages.paycontact.payContactLocators;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class discoverMerchants extends BasePage {
    Logger logger = LoggerFactory.getLogger(discoverMerchants.class);
    public String element;

    public void clickDiscoverMerchants(){
        isDisplayed(discoverMerchantLocators.discoverMerchants,"Discover Merchants");
        click(discoverMerchantLocators.discoverMerchants,"Discover Merchants");
        isDisplayed(discoverMerchantLocators.allTab,"All tab");
        isDisplayed(discoverMerchantLocators.newTab,"New tab");
        isDisplayed(discoverMerchantLocators.followingTab,"Following tab");
        isDisplayed(discoverMerchantLocators.searchIcon,"Search Icon");
    }

    public void searchDiscoverMerchants(String merchant){
        isDisplayed(discoverMerchantLocators.searchIcon,"Search Icon");
        click(discoverMerchantLocators.searchIcon,"Search Icon");
        wait(discoverMerchantLocators.searchbar,2000);
        sendKeys(discoverMerchantLocators.searchbar,merchant,"Search Merchant");
    }

    public void clickMerchants(){
        isDisplayed(discoverMerchantLocators.allTab,"All tab");
        isDisplayed(discoverMerchantLocators.newTab,"New tab");
        isDisplayed(discoverMerchantLocators.followingTab,"Following tab");
        click(discoverMerchantLocators.selectMerchant,"Select Merchant");
    }

    public void clickNextButton(){
        isDisplayed(discoverMerchantLocators.visitWebsiteButton,"Visit Website Button");
        isDisplayed(discoverMerchantLocators.navigateButton,"Navigate Button");
        isDisplayed(discoverMerchantLocators.callusButton,"Call Us Button");
        click(discoverMerchantLocators.nextButton,"Next Button");
    }

    public void clickCallUsButton(){
        isDisplayed(discoverMerchantLocators.visitWebsiteButton,"Visit Website Button");
        isDisplayed(discoverMerchantLocators.navigateButton,"Navigate Button");
        isDisplayed(discoverMerchantLocators.nextButton,"Next Button");
        click(discoverMerchantLocators.callusButton,"Call Us Button");
    }

    public void clickVisitWebsiteButton(){
        isDisplayed(discoverMerchantLocators.callusButton,"Call Us Button");
        isDisplayed(discoverMerchantLocators.navigateButton,"Navigate Button");
        isDisplayed(discoverMerchantLocators.nextButton,"Next Button");
        click(discoverMerchantLocators.visitWebsiteButton,"Visit Website Button");
    }

    public void clickNavigateButton(){
        isDisplayed(discoverMerchantLocators.callusButton,"Call Us Button");
        isDisplayed(discoverMerchantLocators.visitWebsiteButton,"Visit Website Button");
        isDisplayed(discoverMerchantLocators.nextButton,"Next Button");
        click(discoverMerchantLocators.navigateButton,"Navigate Button");
    }

    public void clickPayBillTab() {
        isDisplayed(discoverMerchantLocators.payBillTab,"Pay Bill Tab");
        isDisplayed(discoverMerchantLocators.infoTab,"Info Tab");
        click(discoverMerchantLocators.payBillTab,"Pay Bill Tab");
    }

    public void enterVoucherNumber(String voucher){
        isDisplayed(discoverMerchantLocators.voucherNumberNext, "Voucher Number Next Button");
        isDisplayed(discoverMerchantLocators.voucherNumberCancel,"Voucher Number Cancel Button");
        sendKeys(discoverMerchantLocators.voucherNumber,voucher,"Voucher Number");
        click(discoverMerchantLocators.voucherNumberNext,"Voucher Number Next Button");
    }

    public void payBill(){
        isDisplayed(discoverMerchantLocators.payButton,"Pay Button");
        isDisplayed(discoverMerchantLocators.expandBill,"Expand bill");
        click(discoverMerchantLocators.expandBill,"Expand Bill");
        click(discoverMerchantLocators.payButton,"Pay Button");
    }

    public void checkNewWalletBalance(){
        var element1 =  getText(discoverMerchantLocators.newWalletBalance,"New Wallet Balance").trim();
        String[] element = element1.split("(:)");
        this.element = element[1].trim();
        logger.info("Converted String :: "+this.element);
    }

    public void clickPayBillNextButton(){
        isDisplayed(discoverMerchantLocators.newWalletBalance,"New Wallet Balance");
        click(discoverMerchantLocators.payNextButton,"Pay Bill Next Button");
    }

    public void enterMPin(){
        isDisplayed(discoverMerchantLocators.mpin,"MPin");
        isDisplayed(discoverMerchantLocators.cancelMPin,"Cancel MPin Button");
        isDisplayed(discoverMerchantLocators.forgetMPin,"Forget MPin");
        sendKeys(discoverMerchantLocators.mpin, GlobalVars.getMpin(),"MPin Entered");
        click(discoverMerchantLocators.okMPin,"Ok MPin");
    }

    public void clickSuccessDoneButton(){
        isDisplayed(discoverMerchantLocators.viewReceipt,"View Receipt");
        click(discoverMerchantLocators.successDoneButton,"Success Done Button");
    }

    public void checkDashboardWalletBalance(){
        wait(discoverMerchantLocators.dashboardWallet,5000);
        validateText(discoverMerchantLocators.dashboardWallet,element,"Check Wallet Balance");
    }

    public String currentWallet(){
        return getText(discoverMerchantLocators.dashboardWallet,"Dashboard wallet");

    }

}
