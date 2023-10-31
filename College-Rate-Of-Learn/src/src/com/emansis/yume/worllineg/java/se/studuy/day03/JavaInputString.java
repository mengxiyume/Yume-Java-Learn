package src.com.emansis.yume.worllineg.java.se.studuy.day03;

import java.util.Scanner;

public class JavaInputString {
    public static void main(String[] args) {
        //输出
        System.out.print("请输入姓名：");
        //输入
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        //输出
        System.out.println("\n" + name + "，欢迎光临！");
    }
}
