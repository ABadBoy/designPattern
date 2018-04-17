package com.badboy.behavioralPatterns.TemplatePattern;

public class Client {

    public static void main(String[] args) {
        GoCompanyTemplete walk = new Walk();
        GoCompanyTemplete subway = new TakeSubway();

        walk.process();
        subway.process();
    }
}
