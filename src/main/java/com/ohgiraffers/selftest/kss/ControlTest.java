package com.ohgiraffers.selftest.kss;

public class ControlTest {

    public static void main(String[] args) {

        /*
        0부터 9까지의 임의의 정수 3개를 생성하고
        1. 생성된 숫자들이 모두 다르다면 오름차순으로 정렬해서 출력,
        2. 생성된 숫자들 중 중복되는 숫자가 있다면 다시 실행하라고 출력하는 코드를 만드세요.

        ----- 출력 예시 -----
        예 1) 생성된 숫자들은 1, 3, 5 입니다.
        예 2) 중복되는 숫자가 생성되었습니다. 다시 시도해 주십시오
         */

        int randN1 = (int) (Math.random() * 10);
        int randN2 = (int) (Math.random() * 10);
        int randN3 = (int) (Math.random() * 10);

        // 내림차순
        System.out.println("--------내림차순 정렬---------");
        if (randN1 == randN2 || randN2 == randN3 || randN3 == randN1) {
            System.out.println("중복되는 숫자가 생성되었습니다. 다시 시도해 주십시오.");

        } else if (randN1 > randN2 ){
            if (randN1 > randN3) {
                if (randN2 > randN3) {
                    System.out.println("생성된 숫자들은 : " + randN1 + "," + randN2 + "," + randN3);
                } else {
                    System.out.println("생성된 숫자들은 : " + randN1 + "," + randN3 + "," + randN2);
                }
            } else {
                System.out.println("생성된 숫자들은 : " + randN3 + "," + randN1 + "," + randN2);
            }

        } else if (randN2 > randN3) {
            if (randN1 > randN3) {
                System.out.println("생성된 숫자들은 : " + randN2 + "," + randN1 + "," + randN3);
            } else {
                System.out.println("생성된 숫자들은 : " + randN2 + "," + randN3 + "," + randN1);
            }
        } else {
            System.out.println("생성된 숫자들은 : " + randN3 + "," + randN2 + "," + randN1);

        }

        // 오름차순
        System.out.println("--------오름차순 정렬---------");
        if (randN1 == randN2 || randN2 == randN3 || randN3 == randN1) {
            System.out.println("중복되는 숫자가 생성되었습니다. 다시 시도해 주십시오.");

        } else if (randN1 < randN2 ){
            if (randN1 < randN3) {
                if (randN2 < randN3) {
                    System.out.println("생성된 숫자들은 : " + randN1 + "," + randN2 + "," + randN3);
                } else {
                    System.out.println("생성된 숫자들은 : " + randN1 + "," + randN3 + "," + randN2);
                }
            } else {
                System.out.println("생성된 숫자들은 : " + randN3 + "," + randN1 + "," + randN2);
            }

        } else if (randN2 < randN3) {
            if (randN1 < randN3) {
                System.out.println("생성된 숫자들은 : " + randN2 + "," + randN1 + "," + randN3);
            } else {
                System.out.println("생성된 숫자들은 : " + randN2 + "," + randN3 + "," + randN1);
            }
        } else {
            System.out.println("생성된 숫자들은 : " + randN3 + "," + randN2 + "," + randN1);

        }




    }
}
