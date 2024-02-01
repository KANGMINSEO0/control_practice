package com.ohgiraffers.selftest.kys;

import java.util.Scanner;

public class ControlTest {

    public static void main(String[] args) {
        /*
         * 출력예시
         * 1. 상품등록 2. 프로그램 종료
         * 옵션을 선택하시오 : 1
         * 상품명을 입력하시오 : java
         * 상품 가격을 입력하시오 : 20000
         * 구매 수량을 입력하세오 : 3
         * 상품명:java 가격:20000 수량:3 합계:60000
         *
         * 1. 상품등록 2. 프로그램 종료
         * 옵션을 선택하시오 : 2
         * 프로그램을 종료합니다.
         *
         * 1. 상품등록 2. 프로그램 종료
         * 옵션을 선택하시오 : 3
         * 올바른 옵션을 선택하시오.
         * */
        Scanner sc = new Scanner(System.in);
        System.out.println("1. 상품등록 2. 프로그램 종료");
        System.out.print("옵션을 선택하시오 : " );
        int option = sc.nextInt();

        switch (option) {

            case 1 :
                sc.nextLine();      // 입력 해야하는게 두개 연속으로 나온다 -> 이걸 집어넣으면 된다.
                System.out.print("상품명을 입력하시오 : ");
                String name = sc.nextLine();

                System.out.print("상품 가격을 입력하시오 : ");
                long price = sc.nextLong();

                System.out.print("구매 수량을 입력하시오 : ");
                int num = sc.nextInt();

                long total = price * num;

                System.out.print("상품명: " + name + " 가격: " + price + " 수량: " + num + " 합계: " + total);
                break;

            case 2 :
                System.out.println("프로그램을 종료합니다.");
                break;

            default:
                System.out.println("올바른 옵션을 선택하시오.");
        }
    }
}
