package com.example;

public class Tester {
    private String name;
    private String surname;
    private int expirienceInYears;
    private String englishLevel;
    private double salary;

    public Tester(String name, String surname) {
        this(name, surname, 0, "A1", 0.0);
    }

    public Tester(String name, String surname, int expirienceInYears) {
        this(name, surname, expirienceInYears, "B1", 1000.0);
    }

    public Tester(String name, String surname, int expirienceInYears, String englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.expirienceInYears = expirienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }

    public void printInfo() {
        System.out.println("Имя: " + name + ", Фамилия: " + surname);
    }

    public void printInfo(boolean includeDetails) {
        printInfo();
        if (includeDetails) {
            System.out.println("Стаж: " + expirienceInYears + " лет");
            System.out.println("Уровень английского: " + englishLevel);
        }
    }

    @Override
    public  String toString() {
        return "Имя" + name;
    }
    public void printInfo(boolean includeDetails, boolean includeSalary) {
        printInfo(includeDetails);
        if (includeSalary) {
            System.out.println("Зарплата: $" + salary);
        }
    }

    public static String getTesterRole(int expirience) {
        if (expirience < 1) {
            return "Junior Тестировщик";
        } else if (expirience < 3) {
            return "Middle Тестировщик";
        } else {
            return "Senior Тестировщик";
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getExpirienceInYears() {
        return expirienceInYears;
    }

    public void setExpirienceInYears(int expirienceInYears) {
        this.expirienceInYears = expirienceInYears;
    }

    public String getEnglishLevel() {
        return englishLevel;
    }

    public void setEnglishLevel(String englishLevel) {
        this.englishLevel = englishLevel;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
