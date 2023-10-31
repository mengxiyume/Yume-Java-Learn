package com.emansis.yume.worlleeg.JLearn._2023._10.CollegeClass;

import java.util.Scanner;

//Upload Test

/*
    出租车计费方式由等候时间数和里程数相加得出
        里程数前3公里10元
        超过3~15公里每公里2元
        15公里以上每公里3元
        等候时间每两分半1元不足部分不要钱
    输入公里数和等候秒数，输出车费
 */
public class HomeWork_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int distance = sc.nextInt();    //距离 km

        int time = sc.nextInt();        //时间 s
        
        int nWaitBaseTime = (int)(60 * 2.5);//等候时间2.5分钟
        
        int money = 0;                  //路费总和
        
        //里程数
        money += 10;                //3公里及以下
        if (distance > 3) {         //2~15公里
            money += ((distance > 15 ? 15 : distance) - 3) * 2;
            if (distance > 15) {    //15公里以上
                money += (distance - 15) * 3;
            }
        }
        
        //等候时间
        money += time / nWaitBaseTime;

        System.out.println(money);
    }
}