package kr.co.himedia.dip;

public class Car {

    private SummerType summerType;

    public Car(SummerType summerType){
        this.summerType = summerType;
    }

    public SummerType getSummerType() {
        return summerType;
    }

    public void drive() {
        System.out.println("Driving with " + summerType.trueType());
    }
}
