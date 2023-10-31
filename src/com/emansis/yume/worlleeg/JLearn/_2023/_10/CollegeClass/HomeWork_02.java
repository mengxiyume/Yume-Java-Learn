package com.emansis.yume.worlleeg.JLearn._2023._10.CollegeClass;

import java.util.Scanner;

//输入薪水，打印个税
/*
    3500以下不收
    3501~5000 3%税收 处于区间再扣除0
    5001~8000 10%税收 处于区间再扣除105
    8001~12500 20%税收 处于区间再扣除555
    12501~38500 25%税收 处于区间再扣除1005
    38501~58500 30%税收 处于区间再扣除2755
    58501~83500 35%税收 处于区间再扣除5505
    83500以上 45%税收 处于区间再扣除13505
 */
public class HomeWork_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int money = sc.nextInt();

        int taxation = 0;

        if (money > 3500 && money <= 5000) {
            taxation += (int)((money - 3500) * 0.03f) - 0;
        } else if (money <= 8000) {
            taxation += (int)((money - 3500) * 0.1f) - 105;
        } else if (money <= 12500) {
            taxation += (int)((money - 3500) * 0.2f) - 555;
        } else if (money <= 38500) {
            taxation += (int)((money - 3500) * 0.25f) - 1005;
        } else if (money <= 58500) {
            taxation += (int)((money - 3500) * 0.3f) - 2755;
        } else if (money <= 83500) {
            taxation += (int)((money - 3500) * 0.35f) - 5505;
        } else {
            taxation += (int)((money - 3500) * 0.45f) - 13505;
        }
        System.out.println("taxation sum = " + taxation);
    }
}
