package org.example.one.day3;

/**
 * @author zhao
 * @time 2021/2/15 23:01
 */
public class TestOrder {
    public static void main(String[] args) {
        // 测试面向对象
        Order order = new Order();
        order.title = "IPhone 12";
        order.price = 8888;
        order.address = "阿里巴巴杭州";
        // 调用行为，功能
        order.print();


        // 测试 TaobaoOrder
        TaobaoOrder taobaoOrder = new TaobaoOrder();
        taobaoOrder.title = "某富豪的订单";
        taobaoOrder.address = "上海";
        taobaoOrder.mobile = "18888888888";
        taobaoOrder.seller = "天猫旗舰店";
        taobaoOrder.buyer = "某富豪";
        taobaoOrder.priceList = new double[] {100.11, 88, 245, 67.22};
        // 调用行为，多态，同样的行为不同的实现
        taobaoOrder.print();
        taobaoOrder.print(1);
        taobaoOrder.print(2);
    }
}
