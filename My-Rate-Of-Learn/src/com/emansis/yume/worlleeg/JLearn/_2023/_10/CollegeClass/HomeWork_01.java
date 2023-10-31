package com.emansis.yume.worlleeg.JLearn._2023._10.CollegeClass;

import java.util.Scanner;

//输入四个正数，获取最大值并输出
public class HomeWork_01 {
    public static void main(String[] args) {
        int i = 0;
        int max = 0;

        Scanner sc = new Scanner(System.in);

        //在缓冲器中对比最大值
        for (i = 0; i < 4; i++) {
            int nCurNum = sc.nextInt();
            if (i == 0) {
                max = nCurNum;
                continue;
            }
            if (nCurNum > max) {
                max = nCurNum;
            }
        }
        System.out.println("Input Numbers The Max Number Is " + max);
    }
}
