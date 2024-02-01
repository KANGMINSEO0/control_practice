package com.ohgiraffers.selftest.kms;

import java.util.Scanner;

public class ControlTest {

    public void contolTestByMS() {
        /* 임의의 정수를 입력받아 5의배수, 7의배수를 출력하는 프로그램을 만드세요.

         * --------------- 출력 예시 ---------------
         * 숫자를 입력하세요 :
         * 예1) 입력하신 숫자는 5의 배수입니다.
         * 예2) 입력하신 숫자는 5의 배수이면서 7의 배수입니다.
         * */

        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 : ");
        int num = sc.nextInt();

        if (num % 5 == 0) {
            if (num % 7 == 0) {
                System.out.println("입력하신 " + num + "은(는) 5의 배수이면서 7의 배수 입니다.");
            } else {
                System.out.println("입력하신 " + num + "은(는) 5의 배수 입니다.");

            }

        } else if (num % 7 == 0) {
            System.out.println("입력하신 " + num + "은(는) 7의 배수 입니다.");

        } else {
            System.out.println("입력하신 " + num + "은(는) 5의 배수도 7의 배수 아닙니다.");

        }

    }
}
