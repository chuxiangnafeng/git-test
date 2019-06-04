package com.itheima;

import java.util.ArrayList;

/**
定义一个无返回值，参数为String[] 数组的方法，实现以下功能：

1)  把数组中的元素存入到一个ArrayList集合中，删除集合中包含0-9数字的字符串(只要字符串中包含0-9中的任意一个数字就需要删除此整个字符串)。

2)  遍历该集合打印剩余元素。

在main方法中，定义一个字符串数组String arr[]={“0af3s2sf”,”s6ds1”,”jjww”,”lailai”}，并将这个字符串数组传入上述方法中，进行测试。

示例如下：
 */
public class Test01 {

    public static void main(String[] args) {
        String arr[] = {"0af3s2sf", "s6ds1", "jjww", "lailai"};
        System.out.println("删除有数字的字符串之后的j集合元素有：");
        method(arr);
    }

    public static void method(String[] arr) {
        ArrayList<String> list = new ArrayList<>();
      //  int index = 0;
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            char[] chs = s.toCharArray();
            boolean flag = true;
            for (int j = 0; j < chs.length; j++) {
                if (chs[j] >= '0' && chs[j] <= '9') {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                list.add(s);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

}