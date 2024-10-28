public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Бим");
        Cat cat1 = new Cat("Люси");
        Cat cat2 = new Cat("Молли");
        Cat cat3 = new Cat("Дэйзи");
        System.out.println("Количество животных: " + Animal.getAnimalCount());
        dog.run(250);
        dog.swim(9);
        cat1.run(150);
        cat1.swim(10);
        Cat[] cats = {cat1, cat2, cat3};
        Bowl bowl = new Bowl(30);
        for (Cat cat : cats) {
            cat.eat(bowl, 12);
            System.out.println(cat.getName() + " сыт: " + cat.isFull());
        }
        System.out.println("Остаток еды в миске: " + bowl.getFood() + " ед.");

        bowl.addFood(10);
        System.out.println("Добавили еды. Теперь в миске: " + bowl.getFood() + " ед.");

        for (Cat cat : cats) {
            if (!cat.isFull()) {
                cat.eat(bowl, 10);
                System.out.println(cat.getName() + " сыт: " + cat.isFull());
            }
        }
        System.out.println("Остаток еды : " + bowl.getFood() + " ед.");

    }
}
