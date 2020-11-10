package lesson5;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Employee[] employeesArray = new Employee[5];
        employeesArray[0] = new Employee("Ivanov Ivan", "Engineer", "i vivan@mailbox.com", "+79231231217",
                30000, 46);
        employeesArray[1] = new Employee("Morozov Pavel", "Electrician", "p morozov@mailbox.com", "+796012312",
                30000, 43);
        employeesArray[2] = new Employee("Smirnov Zakhar", "Designer", "z smirnov@mailbox.com", "892312312",
                30000, 30);
        employeesArray[3] = new Employee("Sidorov Dmitriy", "Journalist", "d sidorov@mailbox.com", "892312312",
                30000, 42);
        employeesArray[4] = new Employee("Kuznetsov Feodor", "Programmer ", "f kuznetsov@mailbox.com", "892312312",
                30000, 38);

        for (int i = 0; i < employeesArray.length; i++) employeesArray[i].printEmployee();

        System.out.println();
        System.out.println("Сотрудники старше 40 лет");

        for (int i = 0; i < employeesArray.length; i++) {
            if (employeesArray[i].age > 40) {
                employeesArray[i].printEmployee();
            }
            ;
        }

    }

}
