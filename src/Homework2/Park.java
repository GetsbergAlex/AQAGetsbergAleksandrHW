package Homework2;

public class Park {
    public static void main(String args[]) {
        Park park = new Park("Диво-остров");
        Park.Attraction attraction =   new Park("Диво-остров").new Attraction(100, "10:00-19:00", "Ракета");
        Park.Attraction attraction2=   new Park("Диво-остров").new Attraction(135,"10:00-19:00","Карусель");
        attraction.printInfo();
        attraction2.printInfo();
        //park.printInfo();
    }
    private String name;

    public Park(String name) {
        this.name = name;
    }

    public class Attraction {
        private int cost;
        private String workTime;
        private String name;

        public Attraction(int cost, String workTime, String name) {
            this.cost = cost;
            this.workTime = workTime;
            this.name = name;
        }



        public   void printInfo() {
            //System.out.println("Название парка:"+ Park.this.name);
            System.out.println("Название Аттракциона:" + name+"; Стоимость:" + cost + "; Время работы:" + workTime );

        }

    }

}
