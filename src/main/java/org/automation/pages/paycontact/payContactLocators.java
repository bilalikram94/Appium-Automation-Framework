package org.automation.pages.paycontact;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class payContactLocators {
    public static By paycontact = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.LinearLayout");
    public static By searchbar = By.id("com.nayapay.app.staging:id/select_contacts_search_edittext");
    public static By nayapaycontact = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ViewSwitcher/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.RelativeLayout");
    public static By moreoptions = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ViewSwitcher/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.ImageView");
    public static By enteramountlabel = By.id("com.nayapay.app.staging:id/amountEditText");
    public static By enteramount = By.id("com.nayapay.app.staging:id/txtAmountLabel");
    public static By newWalletbalance = By.id("com.nayapay.app.staging:id/tvRemainingBalance");
    public static By walletBalance = By.id("com.nayapay.app.staging:id/txtWgtWalletBalance");
    public static By nextButton = By.id("com.nayapay.app.staging:id/nextButton");
    public static By enterMessage = By.id("com.nayapay.app.staging:id/messageText");
    public static By paymentNextButton = By.id("com.nayapay.app.staging:id/paymentNote_nextButton");
    public static By confirmNextButton = By.id("com.nayapay.app.staging:id/loadUnload_confirmation_nextButton");
    public static By confirmCancelButton = By.id("com.nayapay.app.staging:id/loadUnload_confirmation_cancelButton");
    public static By enterMpin = By.id("com.nayapay.app.staging:id/pinView");
    public static By profileBadge = By.id("com.nayapay.app.staging:id/lytProfileBadge");
    public static By viewReceipt = By.id("com.nayapay.app.staging:id/goToTransactionDetails");
    public static By doneButton = By.id("com.nayapay.app.staging:id/pay_nextButton");
    public static By sendMoney = By.id("com.nayapay.app.staging:id/btnSingleAction");
    public static By errorMsg = By.id("com.nayapay.app.staging:id/tvError");
    public static By chat = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout");
    public static By blockContact = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.LinearLayout");
    public static By blockContactTitle = By.id("com.nayapay.app.staging:id/textViewTitle");
    public static By blockOkButton = By.id("com.nayapay.app.staging:id/buttonOk");
    public static By sendMessage = new MobileBy.ByAccessibilityId("send message");

    public static By managecontacts = By.id("com.nayapay.app.staging:id/menu_manage_contacts");
    public static By contactoptions = By.id("com.nayapay.app.staging:id/menu_contact_options");
    public static By blockedcontacts = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[4]/android.widget.LinearLayout");
    public static By unblockButton = By.id("com.nayapay.app.staging:id/btnUnblock");
    public static By backnavigate = By.id("com.nayapay.app.staging:id/btnNav");
    public static By chattab = By.id("com.nayapay.app.staging:id/item_chat");
    public static By manageChatContact = new MobileBy.ByAccessibilityId("Manage Contacts");
    public static By blockedContact = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[4]/android.widget.LinearLayout");
    public static By unblockContact = By.id("com.nayapay.app.staging:id/btnUnblock");




}
