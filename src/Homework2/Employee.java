package Homework2;

public class Employee {
    public static void main(String[] args) {
        Employee employee = new Employee("Попов", "Менеджер", "alex2.mail.ru", 357568, 4500, 45);
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


    public void info(){
        System.out.println("Имя:" + name + "; Должность:" + position +
                "; Почтовый адрес:" + email + "; Телефон:" + phone + "; Зарплата:" + salary + "; Возраст:" + age);

    }




}
