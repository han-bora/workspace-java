public class SmartPhone implements call,Camera,Sms{
    @Override
    public void takePhoto() {
        System.out.println("take photo...");

    }

    @Override
    public void takeVideo() {
        System.out.println("take video...");

    }

    @Override
    public void sendText() {
        System.out.println("send text...");

    }

    @Override
    public void call() {
        System.out.println("calling...");

    }

    @Override
    public void dial() {
        System.out.println("dialing...");

    }
}
