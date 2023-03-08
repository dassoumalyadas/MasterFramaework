package com.sd.pages;

import org.openqa.selenium.By;

import static com.sd.utils.PageActionsHelper.waitAndClick;
import static com.sd.utils.PageActionsHelper.waitAndSendKeys;

public class LoginPage {

    private static final By USERNAME_TEXT_BOX= By.name("username");
    private static final By PASSWORD_TEXT_BOX= By.name("password");
    private static final By LOGIN_BUTTON= By.xpath("//button[@type='submit']");

    private LoginPage setUserNameTextBox(String userName) {
        waitAndSendKeys(USERNAME_TEXT_BOX,userName);
        return this;
    }

    private LoginPage setPasswordTextBox(String password) {
        waitAndSendKeys(PASSWORD_TEXT_BOX,password);
        return this;
    }

    private LoginPage setLoginBtn() {
        waitAndClick(LOGIN_BUTTON);
        return this;
    }

    public HomePage loginToApplication(String UserName,String password){
        setUserNameTextBox(UserName).setPasswordTextBox(password).setLoginBtn();
        return new HomePage();
    }
}
