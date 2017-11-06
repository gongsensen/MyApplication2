package com.example.lenovo.textdemo;

/**
 * Created by lenovo on 2017/11/6.
 */

public class Utils {
    private final ShowText showText;

    public Utils(ShowText showText) {
        this.showText = showText;
    }

    public String whirteText(String text) {
        text = showText.whriteText(text);
        return text;
    }

    public void failed(String error) {
        showText.failed(error);
    }
}
