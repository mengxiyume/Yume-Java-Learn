package src.com.emansis.yume.worllineg.java.se.studuy.day03;

import java.util.Scanner;

public class JavaGreadGet {
    public static void main(String[] args) {
        System.out.println("请输入你的分数，区间为100 - 0");、
        Scanner sc = new Scanner(System.in);
        int greadValue = sc.nextInt();

        if(greadValue > 100 || greadValue < 0)
        {
            System.out.println("输入错误");
        }
        switch(greadValue / 10)
        {
            case 10:
            case 9:
                System.out.println("优");
                break;
            case 8:
                System.out.println("良");
                break;
            case 7:
            case 6:
                System.out.println("及格");
                break;
            default:
                System.out.println("差");
                break;
        }
    }
}
