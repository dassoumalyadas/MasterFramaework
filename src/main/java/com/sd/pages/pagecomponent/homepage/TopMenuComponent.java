package com.sd.pages.pagecomponent.homepage;

import com.sd.pages.enums.sidemenu.MenuType;
import com.sd.pages.enums.sidemenu.SubMenuType;
import org.openqa.selenium.By;

import static com.sd.utils.PageActionsHelper.waitAndClick;

public class TopMenuComponent {

    private final static String menu_xpath="//span[text()='%s']/parent::a";
    private final static String sub_menu_xpath="//a[text()='%s']";

    public TopMenuComponent clickMenuItem(MenuType menuType){
        String xpath=String.format(menu_xpath,menuType.getName());
        waitAndClick(By.xpath(xpath));
        return this;
    }
    public TopMenuComponent clickSubMenuItem(SubMenuType subMenuType){
        String xpath=String.format(sub_menu_xpath,subMenuType.getName());
        waitAndClick(By.xpath(xpath));
        return this;
    }
}
