package com.sd.pages.pagecomponent.adduserspage;

import org.openqa.selenium.By;

import static com.sd.utils.PageActionsHelper.waitAndClick;

public class AddUsersComponent {
    public AddUsersComponent setAddBtn() {
        waitAndClick(ADD_BTN);
        return this;
    }

    private static final By ADD_BTN= By.xpath("//button[normalize-space()='Add']");

}
