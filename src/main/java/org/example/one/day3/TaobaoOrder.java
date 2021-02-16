package org.example.one.day3;

/**
 * @author zhao
 * @time 2021/2/15 23:09
 */
public class TaobaoOrder extends Order {
    /**
     * 买家
     */
    public String seller;
    /**
     * 卖家
     */
    public String buyer;
    /**
     * 买家电话
     */
    public String mobile;
    /**
     * 商品价格数组
     */
    public double[] priceList;

    /**
     * 行为拓展 价格求和
     *
     * @param
     * @return {@link double}
     * @author zhao
     * @time 2021/2/15 23:12
     */
    @Override
    public void print() {
        for (int i = 0; i < priceList.length; i++) {
            price += priceList[i];
        }
        System.out.println(price);
    }


    /**
     * 多态，方法重载
     * 行为拓展2 某个商品的 价格
     *
     * @param
     * @return
     * @author zhao
     * @time 2021/2/15 23:23
     */
    public void print(int i) {
        if (i > priceList.length || i < priceList.length) {
            System.out.println("没找到对应的商品");
        }

        System.out.println(buyer + "的第 " + i + " 个商品价格：" + priceList[i - 1]);
    }
}
