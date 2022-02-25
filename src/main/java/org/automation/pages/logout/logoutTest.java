package org.automation.pages.logout;

import org.automation.pages.BasePage;

public class logoutTest extends BasePage {
    logout log = new logout();

    public void verifyLogoutClearData(){
        log.clearDataLogout();
    }

    public void verifyLogoutNoClearData(){
        log.noClearDataLogout();
    }
}
