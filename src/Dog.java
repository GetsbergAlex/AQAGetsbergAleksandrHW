class Dog extends Animal {
    private   int maxdist = 500;
    private   int maxswimdist = 10;
    public Dog(String name) {
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
        if (distance <= maxswimdist) {
            System.out.println(name + " проплыл " + distance + " м.");
        } else {
            System.out.println(name + " не может проплыть " + distance + " м.");
        }
    }

}
