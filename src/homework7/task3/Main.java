package homework7.task3;

public class Main {
    public static void main(String[] args) {
        MyDevice myDevice = new MyDevice(true);
        myDevice.off();
        myDevice.changeVolume(30);
        System.out.println(myDevice.currentVolume);
        myDevice.on();
        myDevice.changeVolume(25);
        System.out.println(myDevice.currentVolume);
        myDevice.changeVolume(101);
        System.out.println(myDevice.currentVolume);
    }
}
