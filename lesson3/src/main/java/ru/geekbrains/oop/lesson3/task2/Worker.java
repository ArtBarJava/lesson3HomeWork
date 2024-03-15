package ru.geekbrains.oop.lesson3.task2;


/**
 * Рабочий (работает с 9 до 18,
 * получает фиксированную заработную плату)
 */
public class Worker extends Employee {
    protected Worker(String surName, String name, int age, double salary) {
        super(surName, name, age, salary);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; ставка: %.2f руб.; возраст: %d заработная плата: %.2f руб.",
                surName, name,salary, age, salary, calculateSalary());
    }
}
