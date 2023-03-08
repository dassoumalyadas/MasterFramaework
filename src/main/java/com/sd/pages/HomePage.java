package com.sd.pages;

import com.sd.pages.enums.sidemenu.MenuType;
import com.sd.pages.enums.sidemenu.SubMenuType;
import com.sd.pages.pagecomponent.homepage.TopMenuComponent;

public class HomePage {
    private TopMenuComponent topMenuComponent;

    public TopMenuComponent getTopMenuComponent() {
        return topMenuComponent;
    }


    public HomePage() {
        this.topMenuComponent = new TopMenuComponent();
    }

    public SystemUsersPage navigateToUsers() {
        topMenuComponent.clickMenuItem(MenuType.ADMIN)
                .clickSubMenuItem(SubMenuType.USER_MANAGEMENT)
                .clickSubMenuItem(SubMenuType.USERS);
        return new SystemUsersPage();
    }


}
