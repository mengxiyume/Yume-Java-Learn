package src.com.emansis.yume.worllineg.java.se.studuy.day04;

import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = sc.nextInt();

        //输入合法性测试
        if (score > 100 || score < 0)
        {
            System.out.println("输入分数不合理");
            return;
        }

        //分数评价分支
        switch (score / 10) {
            case 10:
            case 9:
                System.out.println("优");
                break;
            case 8:
                System.out.println("良");
                break;
            case 7:
                System.out.println("中");
                break;
            case 6:
                System.out.println("及格");
                break;
            default:
                System.out.println("不及格");
            break;
        }

    }
}
