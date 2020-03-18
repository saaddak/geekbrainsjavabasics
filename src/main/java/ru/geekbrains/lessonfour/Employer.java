package ru.geekbrains.lessonfour;

public class Employer {
    public static void main(String[] args) {
        final int EXPENDABLES_AGE = 40;
        final int DECAY_AGE = 45;
        Employee[] dreamTeam = new Employee[5];
        dreamTeam[0] = new Employee();
        dreamTeam[1] = new Employee("Анжела Бесполезняк", "главный бухгалтер", "bezzzpoleznyak@company.name", "8(800)111-22-33", 82000, 23);
        dreamTeam[2] = new Employee("Эльвира Большеротова", "секретарь руководителя", "lollypop@company.name", "8(800)222-33-44", 96000, 21);
        dreamTeam[3] = new Employee("Федя Мордоворотов", "охранник", "thug@company.name", "8(800)666-66-66", 31000, 35);
        dreamTeam[4] = new Employee("Васисуалий Лоханкин", "генеральный директор", "intelligentsia@company.name", "8(800)777-77-77", 320000, 46);

        System.out.println("Вывод фамилии и должности сотрудника:");
        System.out.println(dreamTeam[0].getName() + ", " + dreamTeam[0].getPosition() + "\n");

        int averageSalary = 0;
        for(int i = 0; i < dreamTeam.length; i++) {

            if(dreamTeam[i].getAge() >= EXPENDABLES_AGE) {
                System.out.println("Сотрудники старше 40 лет:");
                dreamTeam[i].EmployeeInfo();
            }
            if(dreamTeam[i].getAge() >= DECAY_AGE) {
                System.out.println("Сотрудники старше 45 лет до повышения зарплаты на 5000:");
                dreamTeam[i].EmployeeInfo();
                coffinMoney(dreamTeam[i]);
                System.out.println("Сотрудники старше 45 лет после повышения зарплаты на 5000:");
                dreamTeam[i].EmployeeInfo();
            }
            averageSalary += dreamTeam[i].getSalary();
        }
        averageSalary /= dreamTeam.length;
        System.out.println("Среднеарифметическое значение зарплаты сотрудников равно: " + averageSalary);
    }

    private static void coffinMoney(Employee soonDeceased) {
        int currentSalary = soonDeceased.getSalary();
        soonDeceased.setSalary(currentSalary + 5000);
    }
}
