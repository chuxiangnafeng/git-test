package com.itcast;

import java.util.Scanner;

/**
 * 5. 定义测试类
 * <p>
 * 提示用户输入要存储的重量并接收
 * <p>
 * 提示用户输入要存储的东西并接收 ，如果用户输入的不是“生鲜食品”或者“普通食品”，则重复提示并接收输入，直到输入的值符合条件
 * <p>
 * 如果用户输入的重量大于等于10，就创建DeepFreezer 对象并赋值，调用show（）方法和freezing(str)方法
 * <p>
 * 如果用户输入的重量小于10，就创建Fridge对象并赋值，调用show（）方法和freezing(str)方法
 */
public class Test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你想存储的重量");
        int weight = sc.nextInt();
        String thing = "";
        while (true) {
            System.out.println("请输入你想存储的东西");
            thing = sc.next();
            if ("生鲜食品".equals(thing) || "普通食品".equals(thing))
                break;
        }
        if (weight >= 10) {
            DeepFreezer df = new DeepFreezer("美的", 7999);
            df.show();
            df.freezing(thing);
        } else if (weight < 10 && weight > 0) {
            Fridge f = new Fridge("美的", 4999);
            f.show();
            f.freezing(thing);
        }else{
            System.out.println("数据不合法");
        }
    }
}
