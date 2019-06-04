package com.itcast;

/**
 * 2. 定义接口Freez ，包含以下抽象方法和默认方法
 * <p>
 * 抽象方法freezing(String str)
 * <p>
 * 默认方法lengCang()，输出"普通食品，需要放入冷藏层"
 * <p>
 * 默认方法lengDong()，输出"生鲜食品，放入冷冻层"
 */
public interface Freez {
    public abstract void freezing(String str);

    public default void LengCang() {
        System.out.println("普通食品，需要放入冷藏层");
    }

    public default void LengDong() {
        System.out.println("生鲜食品，放入冷冻层");
    }
}
