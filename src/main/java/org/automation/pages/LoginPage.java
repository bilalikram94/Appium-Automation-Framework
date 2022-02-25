package org.automation.pages;

import org.automation.constants.GlobalVars;
import org.openqa.selenium.By;

public final class LoginPage extends BasePage {

	private final By pageLogoImg = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ImageView");
	private final By notificationBell = By.id("com.nayapay.app.staging:id/imgBellIcon");
	private final By cartIcon = By.id("cart_bg_icon");
	private final By loginBtn = By.id("com.nayapay.app.staging:id/loginBtn");
	private final By nayaPayId = By.id("com.nayapay.app.staging:id/nayapayId");
	private final By nextBtn = By.id("com.nayapay.app.staging:id/buttonNext");
	private final By password = By.id("com.nayapay.app.staging:id/passwordEditText");
	private final By submitBtn = By.id("com.nayapay.app.staging:id/buttonNext");

	/*public boolean isPageLogoImgDisplayed() {
		return isDisplayed(pageLogoImg);
	}*/

	public void tapLogin(){
		click(loginBtn,"Login Button Clicked");
	}
	public void enterNayapayId(){
		sendKeys(nayaPayId, GlobalVars.getUserName(),"Nayapay ID entered");
	}

	public void tapNextBtn(){
		click(nextBtn,"Next Button Clicked");
	}

	public void enterPassword(){
		sendKeys(password, GlobalVars.getPassword(),"Password Entered");
	}
	public void tapSubmit(){
		click(submitBtn,"Submit Button Clicked");
	}
	public boolean isNotificationBellDisplayed(){
		return isDisplayed(notificationBell,"");
	}

}
