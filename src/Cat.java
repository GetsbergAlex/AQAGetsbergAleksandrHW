class Cat extends Animal {
    private int maxdist = 200;
    private boolean isFull;


    public Cat(String name) {
        super(name);
    }

    public void run(int distance) {
        if (distance <= maxdist) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать " + distance + " м.");
        }

    }
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать");
    }
    public void eat(Bowl bowl, int amount) {
        if (bowl.decreaseFood(amount)) {
            this.isFull = true;
            System.out.println(name + " поел и сыт");
        } else {
            System.out.println(name + " не смог поесть. Нет еды");
        }
    }

    public boolean isFull() {
        return isFull;
    }



}
