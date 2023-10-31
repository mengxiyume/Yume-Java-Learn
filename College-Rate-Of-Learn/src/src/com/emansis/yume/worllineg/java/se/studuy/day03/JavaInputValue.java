package src.com.emansis.yume.worllineg.java.se.studuy.day03;

import java.util.Scanner;

public class JavaInputValue {
    public static void main(String[] args) {
        //定义一个扫描器
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;

        System.out.println("请输入两个数值,我们将计算它们的大小");
        //两次输入
        a = sc.nextInt();
        b = sc.nextInt();
        //输出比较结果
        System.out.println(a + (a > b ? " > " : " < ") + b);
    }
}
