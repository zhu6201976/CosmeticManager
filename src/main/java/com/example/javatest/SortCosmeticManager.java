package com.example.javatest;

import java.util.Arrays;

/**
 * SortCosmeticManager：可排序化妆品管理类
 * Created by My on 2018/1/16.
 */

public class SortCosmeticManager extends CosmeticManager {

    public SortCosmeticManager() {
    }

    public SortCosmeticManager(int size) {
        super(size);
    }

    // 复写父类printAll()方法
    @Override
    public void printAll() {
        Cosmetic[] temp = Arrays.copyOf(cosmetics, count);
        Cosmetic c;
        for (int i = 0; i < temp.length - 1; i++) {
            for (int j = 0; j < temp.length - 1 - i; j++) {
                if (temp[j].getPrice() > temp[j + 1].getPrice()) {
                    c = temp[j];
                    temp[j] = temp[j + 1];
                    temp[j + 1] = c;
                }
            }
        }
        for (int i = 0; i < temp.length; i++) {
            System.out.println(temp[i]);
        }
    }
}
