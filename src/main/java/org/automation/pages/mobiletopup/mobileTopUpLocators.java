package org.automation.pages.mobiletopup;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class mobileTopUpLocators {

    public static By mobileTopUp = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[8]/android.widget.LinearLayout/android.widget.TextView");
    public static By bundles = new MobileBy.ByAccessibilityId("BUNDLES");
    public static By savedNumbers = new MobileBy.ByAccessibilityId("SAVED NUMBERS");
    public static By newTopUp = new MobileBy.ByAccessibilityId("Notifications");
    public static By prepaid = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.TextView");
    public static By postpaid = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.TextView");
    public static By countryCode = By.id("com.nayapay.app.staging:id/coutryCodeEditText");
    public static By mobileNumber = By.id("com.nayapay.app.staging:id/mobileNumber");
    public static By serviceProvider = By.id("com.nayapay.app.staging:id/serviceProvider");
    public static By checkSaveNumber = By.id("com.nayapay.app.staging:id/favouriteCheck");
    public static By nextButton = By.id("com.nayapay.app.staging:id/btnNext");
    public static By packageType = By.id("com.nayapay.app.staging:id/btnSettings");

    public static By specifyAmount = By.id("com.nayapay.app.staging:id/btnSpecifyAmount");
    public static By enterAmount = By.id("com.nayapay.app.staging:id/amountEditText");
    public static By enterAmountNextButton = By.id("com.nayapay.app.staging:id/nextButton");
    public static By confirmationNext = By.id("com.nayapay.app.staging:id/loadUnload_confirmation_nextButton");
    public static By confirmationCancel = By.id("com.nayapay.app.staging:id/loadUnload_confirmation_cancelButton");
    public static By newWalletBallance = By.id("com.nayapay.app.staging:id/tvRemainingBalance");
    public static By mpin = By.id("com.nayapay.app.staging:id/pinView");
    public static By payButton = By.id("com.nayapay.app.staging:id/btnSingleAction");
    public static By forgotMpin = By.id("com.nayapay.app.staging:id/btnForgotMpin");
    public static By buyAgain = By.id("com.nayapay.app.staging:id/btnBuyAgain");
    public static By allRadioButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.RadioButton");
    public static By internetRadioButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.RadioButton");
    public static By HybridRadioButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.RadioButton");
    public static By callRadioButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.RadioButton");

    public static By selectButton = By.id("com.nayapay.app.staging:id/btnSelect");
    public static By closeButton = By.id("com.nayapay.app.staging:id/btnClose");
    public static By newMobileTopUp = By.id("com.nayapay.app.staging:id/btnNewMobileTopUp");
    public static By Zong = new MobileBy.ByAccessibilityId("ZONG");
    public static By Jazz = new MobileBy.ByAccessibilityId("JAZZ");
    public static By Ufone = new MobileBy.ByAccessibilityId("UFONE");
    public static By Telenor = new MobileBy.ByAccessibilityId("TELENOR");
    public static By bundleKey = By.id("com.nayapay.app.staging:id/bundlekey");
    public static By monthlysms = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ScrollView/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.LinearLayout");
    public static By monthlysmsButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ScrollView/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[3]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.Button");
    public static By payModalSubTitle = By.id("com.nayapay.app.staging:id/txtBadgeSubTitle");




}
