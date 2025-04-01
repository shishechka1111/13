package com.example;

public class Main {
    public static void main(String[] args) {

        Tester tester1 = new Tester("Рома", "Кошаткин");
        Tester tester2 = new Tester("Кирилл", "Санюк", 2);
        Tester tester3 = new Tester("Боб", "Дилан", 5, "C1", 2500.0);

        System.out.println("--- Тестировщик 1 ---");
        tester1.printInfo();

        System.out.println("\n--- Тестировщик 2 ---");
        tester2.printInfo(true);

        System.out.println("\n--- Тестировщик 3 ---");
        tester3.printInfo(true, true);

        System.out.println("\n--- Уровень ---");
        System.out.println("1: " + Tester.getTesterRole(tester1.getExpirienceInYears()));
        System.out.println("2: " + Tester.getTesterRole(tester2.getExpirienceInYears()));
        System.out.println("3: " + Tester.getTesterRole(tester3.getExpirienceInYears()));
    }
}