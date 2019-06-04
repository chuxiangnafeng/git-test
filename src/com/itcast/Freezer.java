package com.itcast;

/**
 * 1. 定义冷冻箱类Freezer，包含满参、空参构造和以下成员变量及get、set方法
 * <p>
 * 品牌 brand （String类型）
 * <p>
 * 价格 price  （int 类型）
 * <p>
 * 成员方法 void show（）
 */
public class Freezer {
    private String brand;
    private int price;

    public void show() {
    }

    public Freezer() {
    }

    public Freezer(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
