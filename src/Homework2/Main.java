package Homework2;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Попов", "Менеджер", "alex2.mail.ru", 357568, 4500, 45);
        Park park = new Park("Диво-остров");
        Park.Attraction attraction = park.new Attraction(100, "10:00-19:00", "Ракета");
        Park.Attraction attraction2 = park.new Attraction(135, "10:00-19:00", "Карусель");
        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Ivanov Ivan", "Engineer", "Ivanov1@mail.ru", 459768, 40000, 28);
        persArray[1] = new Employee("Popov Andrey", "Senior Manager", "Popov@mail.ru", 537869, 70000, 38);
        persArray[2] = new Employee("Morozov Anton", "Operator", "Morozov@mail.ru", 739472, 45000, 25);
        persArray[3] = new Employee("Petrov Dmitry", "Middle Manager", "Petrov@mail.ru", 846399, 40000, 26);
        persArray[4] = new Employee("Andreev Aleksei", "Junior Manager", "Andreev@mail.ru", 874010, 30000, 22);
        employee.info();
        attraction.printInfo();
        attraction2.printInfo();

    }

}
