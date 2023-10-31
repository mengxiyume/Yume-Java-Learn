package src.com.emansis.yume.worllineg.java.se.studuy.day03;

import java.util.Scanner;

public class JavaSingleDoubleGet {
    public static void main(String[] args) {
        //定义一个扫描器
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数，我们将判断这个数值的奇偶性");

        int value = sc.nextInt();

        System.out.println(value + "为" + (value % 2 == 0 ? "偶数" : "奇数"));
    }
}
