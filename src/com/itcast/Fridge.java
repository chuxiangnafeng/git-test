package com.itcast;

/**
 * 3. 定义冰箱类Fridge，实现接口Freez，继承Freezer，包含满参、空参构造
 * <p>
 * 重写freezing(String str)，在方法内判断str是否等于"生鲜食品"，如果是就调用lengDong()方法，如果不是就调用lengCang()方法
 * <p>
 * 重写show()方法，输出"我是XXX牌子的冰箱，我的价格是：YYY”,xxx为brand的   值，yyy为price的值
 */
public class Fridge extends Freezer implements Freez {
    public Fridge() {
    }

    public Fridge(String brand, int price) {
        super(brand, price);
    }

    @Override
    public void freezing(String str) {
        if ("生鲜食品".equals(str)) {
            this.LengDong();
        } else {
            this.LengCang();
        }
    }

    @Override
    public void show() {
        System.out.println("我是" + this.getBrand() + "牌子的冰箱，我的价格是：" + this.getPrice());
    }
}
