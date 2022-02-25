package org.automation.pages.login;


import org.openqa.selenium.By;

public class loginPageLocators {

    public static By pageLogoImg = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ImageView");
    public static By notificationBell = By.id("com.nayapay.app.staging:id/imgBellIcon");
    public static By cartIcon = By.id("cart_bg_icon");
    public static By loginBtn = By.id("com.nayapay.app.staging:id/loginBtn");
    public static By nayaPayId = By.id("com.nayapay.app.staging:id/nayapayId");
    public static By nextBtn = By.id("com.nayapay.app.staging:id/buttonNext");
    public static By password = By.id("com.nayapay.app.staging:id/passwordEditText");
    public static By submitBtn = By.id("com.nayapay.app.staging:id/buttonNext");
    public static By otp = By.id("com.nayapay.app.staging:id/otpPinView");
    public static By otpnext = By.id("com.nayapay.app.staging:id/btnNext");
    public static By permissionStorage = By.id("com.android.permissioncontroller:id/permission_allow_button");
    public static By permissionLocation = By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button");
    public static By cancelButton = By.id("com.nayapay.app.staging:id/cancelButton");
    public static By forgotBtn = By.id("com.nayapay.app.staging:id/forgotIDButton");
    public static By terms = By.id("com.nayapay.app.staging:id/tvTermsAndConditions");
    public static By showPassword = By.id("com.nayapay.app.staging:id/text_input_end_icon");
    public static By withOutPassword = By.id("com.nayapay.app.staging:id/loginWithoutPassword");

}
