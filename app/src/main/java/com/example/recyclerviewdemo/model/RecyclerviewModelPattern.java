package com.example.recyclerviewdemo.model;

import java.util.ArrayList;

public class RecyclerviewModelPattern {
    String itemPattern;
    ArrayList<String> no;

    public ArrayList<String> getNo() {
        return no;
    }

    public void setNo(ArrayList<String> no) {
        this.no = no;
    }



    public String getItemPattern() {
        return itemPattern;
    }

    public void setItemPattern(String itemPattern) {
        this.itemPattern = itemPattern;
    }
}
