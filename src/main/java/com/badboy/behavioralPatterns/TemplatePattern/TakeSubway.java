package com.badboy.behavioralPatterns.TemplatePattern;

public class TakeSubway extends GoCompanyTemplete {
    protected void goToCompany() {
        System.out.println("take subway to company");
    }

    protected void backToHome() {
        System.out.println("take subway to home");
    }
}
