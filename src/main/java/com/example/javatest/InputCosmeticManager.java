package com.example.javatest;

/**
 * InputCosmeticManager：进口化妆品管理类
 * Created by My on 2018/1/16.
 */

public class InputCosmeticManager extends CosmeticManager {

    public InputCosmeticManager() {
    }

    public InputCosmeticManager(int size) {
        super(size);
    }

    // 复写父类printAll()方法
    @Override
    public void printAll() {
        for (int i = 0; i < count; i++) {
            if ("进口".equals(cosmetics[i].getType())) {
                System.out.println(cosmetics[i]);
            }
        }
    }
}
