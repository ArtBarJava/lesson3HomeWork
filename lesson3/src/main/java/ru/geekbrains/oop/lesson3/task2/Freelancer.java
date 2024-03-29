package ru.geekbrains.oop.lesson3.task2;

/**
 * Фрилансер (работник с почасовой оплатой)
 * TODO: Доработать в рамках домашней работы
 */
public class Freelancer extends Employee{

    protected Freelancer(String surName, String name, int age, double salary) {
        super(surName, name, age, salary);
    }

    @Override
    public double calculateSalary() {
        return 20.8 * 8 * salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; ставка: %.2f руб.; возраст: %d заработная плата: %.2f руб.",
                surName, name,salary, age, salary, calculateSalary());
    }
}
