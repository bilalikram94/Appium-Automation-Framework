package org.automation.pages.discovermerchants;

import org.automation.pages.BasePage;

public class discoverMerchantsTest extends BasePage {
    discoverMerchants merchant = new discoverMerchants();

    public void verifyValidDiscoverMerchant(){
        merchant.clickDiscoverMerchants();
        merchant.searchDiscoverMerchants("lums");
        merchant.clickMerchants();
        merchant.clickNextButton();
        merchant.clickPayBillTab();
        merchant.enterVoucherNumber("1052019000010");
        merchant.payBill();
        merchant.checkNewWalletBalance();
        merchant.clickPayBillNextButton();
        merchant.enterMPin();
        merchant.clickSuccessDoneButton();
        merchant.checkDashboardWalletBalance();
    }
    public String verifyDashboardWallet(){
        return merchant.currentWallet();
    }

    public void verifyCallusButton(){
        merchant.clickDiscoverMerchants();
        merchant.searchDiscoverMerchants("lums");
        merchant.clickMerchants();
        merchant.clickCallUsButton();
        staticwait(2000);
    }

    public void verifyVisitWebsiteButton(){
        merchant.clickDiscoverMerchants();
        merchant.searchDiscoverMerchants("lums");
        merchant.clickMerchants();
        merchant.clickVisitWebsiteButton();
        staticwait(2000);
    }

    public void verifyNavigateButton(){
        merchant.clickDiscoverMerchants();
        merchant.searchDiscoverMerchants("lums");
        merchant.clickMerchants();
        merchant.clickNavigateButton();
        staticwait(2000);
    }
}
