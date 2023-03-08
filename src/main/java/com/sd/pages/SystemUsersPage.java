package com.sd.pages;

import com.sd.pages.pagecomponent.adduserspage.AddUsersComponent;
import com.sd.pages.pagecomponent.adduserspage.SearchComponent;

public class SystemUsersPage {

    private final SearchComponent searchComponent;
    private final AddUsersComponent addUsersComponent;

    public SystemUsersPage() {
        this.addUsersComponent=new AddUsersComponent();
        this.searchComponent=new SearchComponent();
    }

    public AddUsersComponent getAddUsersComponent() {
        return addUsersComponent;
    }
}
