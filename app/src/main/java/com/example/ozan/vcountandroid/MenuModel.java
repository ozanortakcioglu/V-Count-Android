package com.example.ozan.vcountandroid;

import android.app.Fragment;

public class MenuModel {

    public String menuName, url;
    public boolean hasChildren, isGroup;

    public MenuModel(String menuName, boolean isGroup, boolean hasChildren) {

        this.menuName = menuName;
        this.isGroup = isGroup;
        this.hasChildren = hasChildren;
    }
}