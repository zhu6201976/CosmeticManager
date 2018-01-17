package com.example.javatest;


import java.util.Arrays;

/**
 * CosmeticManager：化妆品管理类
 * Created by My on 2018/1/15.
 */

public class CosmeticManager {
    // 为了让子类能继承到以下两个属性，用protected修饰符
    protected Cosmetic[] cosmetics;
    protected int count;

    // 保留默认构造方法
    public CosmeticManager() {
    }

    // 数组长度外部决定，默认3
    public CosmeticManager(int size) {
        if (size > 0) {
            cosmetics = new Cosmetic[size];
        } else {
            cosmetics = new Cosmetic[3];
        }
    }

    // 进货
    public void add(Cosmetic cosmetic) {
        if (count >= cosmetics.length) {
            // 这次用直接扩充2倍的算法
            int newLen = cosmetics.length * 2;
            cosmetics = Arrays.copyOf(cosmetics, newLen);
        }
        cosmetics[count] = cosmetic;
        count++;
    }

    // 打印所有化妆品信息
    public void printAll() {
        for (int i = 0; i < count; i++) {
            System.out.println(cosmetics[i]);
        }
    }
}
