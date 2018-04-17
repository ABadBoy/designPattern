package com.badboy.creational.patterns.singletonPattern;

public class Client {

    public static void main(String[] args) {
        HungarySingleton hungarySingleton1 = HungarySingleton.getInstance();
        HungarySingleton hungarySingleton2 = HungarySingleton.getInstance();

        System.out.println(hungarySingleton1 == hungarySingleton2);

        LazySingleton lazySingleton1 = LazySingleton.getInstance();
        LazySingleton lazySingleton2 = LazySingleton.getInstance();

        System.out.println(lazySingleton1 == lazySingleton2);

        DoubleCheckSingleton doubleCheckSingleton1 = DoubleCheckSingleton.getInstance();
        DoubleCheckSingleton doubleCheckSingleton2 = DoubleCheckSingleton.getInstance();

        System.out.println(doubleCheckSingleton1 == doubleCheckSingleton2);


        StaticNestedSingleton staticNestedSingleton1 = StaticNestedSingleton.getInstance();
        StaticNestedSingleton staticNestedSingleton2 = StaticNestedSingleton.getInstance();

        System.out.println(staticNestedSingleton1 == staticNestedSingleton2);

        System.out.println(EnumSingleton.INSTANCE == EnumSingleton.INSTANCE);
    }
}
