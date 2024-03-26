//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//
package org.example;

public class Tester {
    private String name;
    private String surname;
    private int experienceInYears;
    private String englishLevel;
    private double salary;

    public Tester(String name, String surname) {
        this(name, surname, 0, "Beginner", 0.0);
    }

    public Tester(String name, String surname, int experienceInYears) {
        this(name, surname, experienceInYears, "Intermediate", 0.0);
    }

    public Tester(String name, String surname, int experienceInYears, String englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.experienceInYears = experienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }

    public void introduce() {
        System.out.println("Hello, I'm " + this.name + " " + this.surname);
    }

    public void introduce(String greeting) {
        System.out.println(greeting + ", I'm " + this.name + " " + this.surname);
    }

    public void introduce(String greeting, String position) {
        System.out.println(greeting + ", I'm " + this.name + " " + this.surname + ", " + position);
    }

    public static void staticMethodExample() {
        Tester tester1 = new Tester("Anton", "Smolik");
        Tester tester2 = new Tester("Andrey", "Alesenko", 5);
        Tester tester3 = new Tester("Saveliy", "Pesik", 3, "Advanced", 5000.0);
        System.out.println("Тестер 1:");
        tester1.introduce();
        System.out.println();
        System.out.println("Тестер 2:");
        tester2.introduce();
        System.out.println();
        System.out.println("Тестер 3:");
        tester3.introduce();
        System.out.println("Это статический метод.");
    }
}
