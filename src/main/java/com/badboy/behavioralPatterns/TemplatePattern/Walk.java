package com.badboy.behavioralPatterns.TemplatePattern;

public class Walk extends GoCompanyTemplete {
    protected void goToCompany() {
        System.out.println("walk to home");
    }

    protected void backToHome() {
        System.out.println("walk to home");
    }
}
