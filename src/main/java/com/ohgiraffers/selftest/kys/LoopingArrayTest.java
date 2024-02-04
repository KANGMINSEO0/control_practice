package com.ohgiraffers.selftest.kys;

import java.util.Scanner;

public class LoopingArrayTest {

    public static void main(String[] args) {
        /* ------- 예시 ----------
         *  입력하실 정수의 갯수를 적으시오
         *  n개의 정수를 입력하세요 :
         *  1
         *  .
         *  .
         *  .
         *  n
         *  입력한 정수를 역순으로 출력 :
         *  n . . . 1 */

        Scanner sc = new Scanner(System.in);
        System.out.print("입력하실 정수의 갯수를 적으시오 : ");
        int count = sc.nextInt();
        int[] num = new int[count];

        System.out.println("n개의 정수를 입력하세요 : ");
        for(int i = 0; i < count; i++) {
            num[i] = sc.nextInt();
        }
        System.out.println("입력한 정수를 역순으로 출력 : ");
        for (int i = count - 1; i >= 0; i--) {
            System.out.print(num[i] + " ");
        }

        System.out.println("프로그램을 종료합니다.");

    }
}
