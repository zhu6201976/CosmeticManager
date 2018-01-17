package com.example.javatest;

/**
 * 实现一个化妆品商城中的化妆品管理
 * 1、定义一个化妆品类（Cosmetic）name,type,price
 * 2、定义一个化妆品管理类（CosmeticManager）
 * （1）实现进货功能
 * （2）可以输出所有化妆品信息功能
 * 3、使用继承实现一个可按单价排序输出所有化妆品的功能
 * 4、使用继承实现一个只输出进口化妆品的功能
 */
public class Test {

    public static void main(String[] args) {

        //cosmeticManager();
        //sortCosmeticManager();
        inputCosmeticManager();

    }

    public static void cosmeticManager(){
        CosmeticManager cm = new CosmeticManager(3);
        cm.add(new Cosmetic("雅诗兰黛","进口",5000));
        cm.add(new Cosmetic("香奈儿","进口",8000));
        cm.add(new Cosmetic("大宝","国产",10));
        cm.add(new Cosmetic("珀莱雅","国产",500));
        cm.printAll();
    }
    public static void sortCosmeticManager(){
        SortCosmeticManager cm = new SortCosmeticManager(3);
        cm.add(new Cosmetic("雅诗兰黛","进口",5000));
        cm.add(new Cosmetic("香奈儿","进口",8000));
        cm.add(new Cosmetic("大宝","国产",10));
        cm.add(new Cosmetic("珀莱雅","国产",500));
        cm.printAll();
    }
    public static void inputCosmeticManager(){
        InputCosmeticManager cm = new InputCosmeticManager(3);
        cm.add(new Cosmetic("雅诗兰黛","进口",5000));
        cm.add(new Cosmetic("香奈儿","进口",8000));
        cm.add(new Cosmetic("大宝","国产",10));
        cm.add(new Cosmetic("珀莱雅","国产",500));
        cm.printAll();
    }


}
