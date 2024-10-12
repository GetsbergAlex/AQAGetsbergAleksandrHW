package Homework2;

class Person {
    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "Ivanov1@mail.ru", "8933459768", 40000, 28);
        persArray[1] = new Person("Popov Andrey", "Senior Manager", "Popov@mail.ru", "89314537869", 70000, 38);
        persArray[2] = new Person("Morozov Anton", "Operator", "Morozov@mail.ru", "8216739472", 45000, 25);
        persArray[3] = new Person("Petrov Dmitry", "Middle Manager", "Petrov@mail.ru", "89312846399", 40000, 26);
        persArray[4] = new Person("Andreev Aleksei", "Junior Manager", "Andreev@mail.ru", "89289074010", 30000, 22);

    }
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Person(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

}

