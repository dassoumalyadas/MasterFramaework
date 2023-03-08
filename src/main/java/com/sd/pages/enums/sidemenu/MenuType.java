package com.sd.pages.enums.sidemenu;

public enum MenuType {
    ADMIN("Admin"),
    PIM("PIM"),
    LEAVE("Leave"),
    TIME("Time"),
    RECRUITMENT("Recruitment");
    private final String name;

    public String getName(){
        return  name;
    }
    MenuType(String name) {
        this.name = name;
    }
}
