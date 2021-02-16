package org.example.one.day4;

import java.util.Scanner;

/**
 * @author zhao
 * @time 2021/2/16 20:56
 */
public class TestCaculator {
    public static void main(String[] args) {
        System.out.println("欢迎使用JAVA计算器");
        System.out.println("--------------------------------");
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入数字");
        double d1 = scanner.nextDouble();

        System.out.println("请输入运算符号");
        String type = scanner.next();

        System.out.println("请输入要计算的数字");
        double d2 = scanner.nextDouble();

        double res = 0;
        switch (type.charAt(0)) {
            case '+':
                res = d1 + d2;
                break;
            case '-':
                res = d1 - d2;
                break;
            case '*':
                res = d1 * d2;
                break;
            case '/':
                res = d1 / d2;
                break;
            default:
                System.out.println("运算符错误");
                main(null);
        }
        System.out.println("--------------------------------");
        System.out.println("计算结果：" + res);
        main(null);
    }
}
