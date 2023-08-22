public class Main {
    public static void main(String[] args) {
        call basicPhone = new FeaturePhone();
        basicPhone.call();

        SmartPhone smartPhone = new SmartPhone();
        smartPhone.call();
        smartPhone.sendText();

        System.out.println();


        call smartPhone2 = new SmartPhone();
        if(smartPhone2 instanceof  SmartPhone){
            SmartPhone smartPhone1=(SmartPhone) smartPhone2;    //다운캐스팅
            smartPhone1.call();
            smartPhone1.takePhoto();
            smartPhone1.sendText();
        }

    }
}
