package com.badboy.behavioralPatterns.TemplatePattern;

public abstract class GoCompanyTemplete {

    public void getUp() {
        System.out.println("GET UP");
    }

    protected  abstract void goToCompany();

    protected abstract void backToHome();

    public void goToBed() {
        System.out.println("GO TO BED");
    }

    public final void process() {
        getUp();
        goToCompany();
        backToHome();
        goToBed();
    }
}
