package com.sd.tests;

import com.sd.pages.LoginPage;
import com.sd.tests.web.WebBase;
import org.testng.annotations.Test;

public class AddUserTest extends WebBase {
    @Test
    public void testLogin() {
        new LoginPage().loginToApplication("Admin", "admin123").navigateToUsers().getAddUsersComponent().setAddBtn();
    }
}
