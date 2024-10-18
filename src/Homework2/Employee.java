package Homework2;

public class Employee {
    public static void main(String[] args) {
        Employee employee = new Employee("Попов", "Менеджер", "alex2.mail.ru", 357568, 4500, 45);
        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Ivanov Ivan", "Engineer", "Ivanov1@mail.ru", 459768, 40000, 28);
        persArray[1] = new Employee("Popov Andrey", "Senior Manager", "Popov@mail.ru", 537869, 70000, 38);
        persArray[2] = new Employee("Morozov Anton", "Operator", "Morozov@mail.ru", 739472, 45000, 25);
        persArray[3] = new Employee("Petrov Dmitry", "Middle Manager", "Petrov@mail.ru", 846399, 40000, 26);
        persArray[4] = new Employee("Andreev Aleksei", "Junior Manager", "Andreev@mail.ru", 874010, 30000, 22);
        employee.info();
    }

    private String name;
    private String position;
    private String email;
    private int phone;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, int phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }


    public void info() {
        System.out.println("Имя:" + name + "; Должность:" + position +
                "; Почтовый адрес:" + email + "; Телефон:" + phone + "; Зарплата:" + salary + "; Возраст:" + age);

    }


}

