package com.ohgiraffers.section01.array;

import java.util.Random;

public class Application5 {

    public static void main(String[] args) {

        String[] shape = {"SPADE", "CLOVER", "HEART", "DIAMOND"};
        String[] cardNumber = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        int randomShapeIndex = (int) (Math.random() * shape.length); // 0 ~ 3
        int randomCardNumberIndex = (int) (Math.random() * cardNumber.length); // 0 ~ 12

        System.out.println("당신이 뽑은 카드는 " + shape [randomShapeIndex] + " " + cardNumber[randomCardNumberIndex] + " 카드입니다.");

    }
}
