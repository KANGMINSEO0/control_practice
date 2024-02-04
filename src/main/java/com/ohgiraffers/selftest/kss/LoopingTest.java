package com.ohgiraffers.selftest.kss;

public class LoopingTest {

    public static void main(String[] args) {
        /* 1부터 45까지의 정수 중 임의의 서로 다른 숫자 6개가 출력되도록 코드를 작성하세요

                       출력 예시
        생성된 숫자는 12, 9, 23, 33, 19, 24입니다.
         */

        LoopingTest loopT = new LoopingTest();


        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        int num5 = 0;
        int num6 = 0;



//        int num1 = (int) (Math.random() * 45) + 1;
        do {
            num1 = loopT.randN();
            num2 = loopT.randN();
        } while (!(num1 != num2));

        do {
            num3 = loopT.randN();
        } while (!(num1 != num3 && num2 != num3));
        do {
            num4 = loopT.randN();
        } while (!(num1 != num4 && num2 != num4 && num3 != num4));
        do {
            num5 = loopT.randN();
        } while (!(num1 != num5 && num2 != num5 && num3 != num5 && num4 != num5));
        do {
            num6 = loopT.randN();
        } while (!(num1 != num6 && num2 != num6 && num3 != num6 && num4 != num6 && num5 != num6));
        System.out.println("생성된 숫자는 " + num1 + ", " + num2 + ", " +num3 + ", " + num4 + ", " + num5 + ", " + num6 + "입니다.");
    }


    public int randN () {

        int num = (int) (Math.random() * 45) + 1;

        return num;

    }
}
