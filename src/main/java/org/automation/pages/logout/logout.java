package org.automation.pages.logout;

import org.automation.pages.BasePage;

public class logout extends BasePage {

    public void clearDataLogout(){
        click(logoutLocators.sideMenu,"Hamburger Menu");
        click(logoutLocators.logout,"Logout Button");
        click(logoutLocators.cleardata,"Clear Data");
        click(logoutLocators.yesButton,"Logged Out");
    }

    public void noClearDataLogout(){
        click(logoutLocators.sideMenu,"Hamburger Menu");
        click(logoutLocators.logout,"Logout Button");
        click(logoutLocators.yesButton,"Logged Out");
    }
}
