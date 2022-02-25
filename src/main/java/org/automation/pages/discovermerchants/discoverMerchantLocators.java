package org.automation.pages.discovermerchants;

import org.openqa.selenium.By;

public class discoverMerchantLocators {

    public static By discoverMerchants = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[3]/android.widget.LinearLayout/android.widget.TextView");
    public static By searchIcon = By.id("com.nayapay.app.staging:id/menu_search");
    public static By allTab = By.xpath("//android.widget.LinearLayout[@content-desc=\"All\"]/android.widget.TextView");
    public static By newTab = By.xpath("//android.widget.LinearLayout[@content-desc=\"New\"]/android.widget.TextView");
    public static By followingTab = By.xpath("//android.widget.LinearLayout[@content-desc=\"Following\"]/android.widget.TextView");
    public static By searchbar = By.id("com.nayapay.app.staging:id/edtSearch");
    public static By selectMerchant = By.id("com.nayapay.app.staging:id/root");
    public static By nextButton = By.id("com.nayapay.app.staging:id/btnNext");
    public static By callusButton = By.id("com.nayapay.app.staging:id/btnCallUs");
    public static By visitWebsiteButton = By.id("com.nayapay.app.staging:id/btnVisitWebsite");

    public static By navigateButton = By.id("com.nayapay.app.staging:id/btnDirection");
    public static By payButton = By.id("com.nayapay.app.staging:id/btnInteractionAction");
    public static By newWalletBalance = By.id("com.nayapay.app.staging:id/tvRemainingBalance");
    public static By payNextButton = By.id("com.nayapay.app.staging:id/nextButton");
    public static By unloadCancelButton = By.id("com.nayapay.app.staging:id/loadUnload_confirmation_cancelButton");
    public static By unloadNextButton = By.id("com.nayapay.app.staging:id/loadUnload_confirmation_nextButton");
    public static By mpin = By.id("com.nayapay.app.staging:id/pinView");
    public static By cancelMPin = By.id("com.nayapay.app.staging:id/btnCancel");
    public static By okMPin = By.id("com.nayapay.app.staging:id/btnOK");
    public static By forgetMPin = By.id("com.nayapay.app.staging:id/btnForgotMpin");

    public static By payBill = By.id("com.nayapay.app.staging:id/btnSingleAction");
    public static By dashboardWallet = By.id("com.nayapay.app.staging:id/txtWgtWalletBalance");
    public static By payBillTab = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ViewSwitcher/android.widget.LinearLayout/android.widget.Button");
    public static By voucherNumber = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText");
    public static By voucherNumberNext = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[2]");
    public static By voucherNumberCancel = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[1]");
    public static By infoTab = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ViewSwitcher/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.Button");
    public static By expandBill = By.id("com.nayapay.app.staging:id/item_expandable_header_image");
    public static By subscribeMerchant = By.id("com.nayapay.app.staging:id/btnUpdateBillSubscription");
    public static By consumerNumber = By.id("com.nayapay.app.staging:id/txtBillConsumerNumber");
    public static By consumerName = By.id("com.nayapay.app.staging:id/txtBillConsumerName");
    public static By amountDue = By.id("com.nayapay.app.staging:id/txtBillAmount");
    public static By successDoneButton = By.id("com.nayapay.app.staging:id/pay_nextButton");
    public static By viewReceipt = By.id("com.nayapay.app.staging:id/goToTransactionDetails");


}
