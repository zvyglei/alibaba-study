package org.example.one.day3;

/**
 * @author zhao
 * @time 2021/2/15 23:01
 */
public class Order {
    // 1 数据

    /**
     * 标题
     */
    String title;
    /**
     * 价格
     */
    double price;
    /**
     * 地址
     */
    String address;

    // 2 行为

    public void print() {
        System.out.println(title + "：" + price);
    }
}
