package com.ohgiraffers.selftest.kms;

import java.util.Scanner;

public class LoopingTest {

    public static void main(String[] args) {

        /* 임의의 정수를 입력받아 3의 배수이면서 5의 배수이면 출력하는 프로그램을 만드세요.
         *  단, 3의 배수이면서 5의 배수인 경우 프로그램이 종료되어야 한다.
         * -------- 출력예시 ------
         * 숫자를 입력하세요 : 15
         * 입력하신 숫자는 3의 배수이면서 5의 배수입니다.
         * 프로그램을 종료합니다.
         *
         * 숫자를 입력하세요 : 9
         * 입력하신 숫자는 3의 배수이지만 5의 배수가 아닙니다.
         *
         * 숫자를 입력하세요 : 10
         * 입력하신 숫자는 5의 배수이지만 3의 배수가 아닙니다.
         *
         * 숫자를 입력하세요 : -5
         * 양의 정수를 입력해야 합니다.
         * */

        Scanner sc = new Scanner(System.in);
        int input = 0;

        do {
            System.out.print("숫자를 입력하세요 : ");
            input = sc.nextInt();
            if (input > 0) {

                if (input % 3 != 0 || input % 5 != 0) {
                    if (input % 3 == 0) {
                        System.out.println("입력하신 " + input + "은(는) 3의 배수이지만 5의 배수가 아닙니다.");

                    } else if (input % 5 == 0) {
                        System.out.println("입력하신 " + input + "은(는) 5의 배수이지만 3의 배수가 아닙니다.");

                    } else {
                        System.out.println("입력하신 " + input + "은(는) 3의 배수도 5의 배수도 아닙니다.");

                    }
                }
            } else {
                System.out.println("양의 정수를 입력해야 합니다.");
            }
        } while (!(input % 3 == 0 && input % 5 == 0));

        System.out.println("입력하신 " + input + "은(는) 3의 배수이면서 5의 배수 입니다.");
        System.out.println("프로그램을 종료합니다.");

    }
}
