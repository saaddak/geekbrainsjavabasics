package ru.geekbrains.lessonfour;

import java.util.UUID;

class Employee {
    private String ID;
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    Employee() {
        ID = UUID.randomUUID().toString();
        name = "Вася Пупкин";
        position = "инженер-программист";
        email = "vasya@pupkin.bd";
        phone = "+880(521)12-34-567";
        salary = 13500;
        age = 42;
    }

    Employee(String _name, String _email, String _phone, int _age) {
        ID = UUID.randomUUID().toString();
        name = _name;
        position = "расходный материал";
        email = _email;
        phone = _phone;
        salary = 0;
        age = _age;
    }

    Employee(String _name, String _position, String _email, String _phone, int _salary, int _age) {
        ID = UUID.randomUUID().toString();
        name = _name;
        position = _position;
        email = _email;
        phone = _phone;
        salary = _salary;
        age = _age;
    }

    void EmployeeInfo() {
        System.out.println("Данные о сотруднике");
        System.out.println("Идентификатор: " + ID);
        System.out.println("ФИО: " + name);
        System.out.println("Должность: " + position);
        System.out.println("Электронная почта: " + email);
        System.out.println("Номер телефона: " + phone);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
        System.out.println();
    }

    void setName(String _name) {
        name = _name;
    }
    String getName(){
        return name;
    }

    void setPosition(String _position) {
        position = _position;
    }
    String getPosition(){
        return position;
    }

    void setEmail(String _email) {
        email = _email;
    }
    String getEmail(){
        return email;
    }

    void setPhone(String _phone) {
        phone = _phone;
    }
    String getPhone(){
        return phone;
    }

    void setSalary(int _salary) {
        salary = _salary;
    }
    int getSalary(){
        return salary;
    }

    void setAge(int _age) {
        age = _age;
    }
    int getAge(){
        return age;
    }
}
