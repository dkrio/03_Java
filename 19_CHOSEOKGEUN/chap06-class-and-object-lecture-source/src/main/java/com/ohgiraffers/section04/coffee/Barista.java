package com.ohgiraffers.section04.coffee;

public class Barista {
    // 주문(Order에 따라 커피를 만들어라)
    private int coffeeStock = 5000; // 5000g 커피 보유

    public Coffee[] makeCoffees(Order order) {

        // 재고 차감 처리 - 커피 한잔에 20g 사용
        // 커피 생성
        Coffee[] coffees = new Coffee[order.getCount()];
        for (int i = 0; i < coffees.length; i++) {
            coffees[i] = new Coffee(order.getName(), order.getOption());
        }

        return coffees;
    }
}
