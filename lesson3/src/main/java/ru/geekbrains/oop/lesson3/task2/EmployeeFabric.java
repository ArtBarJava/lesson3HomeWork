package ru.geekbrains.oop.lesson3.task2;

import java.util.Random;

public class EmployeeFabric {

    private static Random random = new Random();

    public static Employee generateEmployee() {
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };
        int age = random.nextInt(40) + 20;
        int salary = random.nextInt(60000, 120001);
        boolean isFreelancer = random.nextBoolean(); // случайно выбираем, будет ли сотрудник фрилансером

        if (isFreelancer) {
            return new Freelancer(surnames[random.nextInt(surnames.length)], names[random.nextInt(names.length)], age, salary);
        } else {
            return new Worker(surnames[random.nextInt(surnames.length)], names[random.nextInt(names.length)], age, salary);
        }
    }
    /**
     * TODO: Переработать метод generateEmployees, метод должен генерировать рабочих
     *  разных типов (Worker, Freelancer) в рамках домашней работы
     * @param count
     * @return
     */
    public static Employee[] generateEmployees(int count) {
        Employee[] employees = new Employee[count];
        for (int i = 0; i < count; i++) {
            employees[i] = generateEmployee();
        }
        return employees;
    }
}
