package kr.co.himedia.dip2;

public class Mani {
    public static void main(String[] args) {
        Car car1 = new Car(new SnowTyre());
        car1.drive();

        Car car2 = new Car(new SnowTyre());
        car2.drive();

        Car car3 = new Car(new SeasonTyre());
        car3.drive();
    }
}
