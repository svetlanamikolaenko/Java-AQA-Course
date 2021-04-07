package homework7.task4;

public class Main {
    public static void main(String[] args) {
        Device tv = new TV("LG",true,10,3);

        RemoteController remoteController = new RemoteController();
        remoteController.connectDevice((TVDevice) tv);
        //remoteController.disconnectDevice();
        remoteController.powerOn();
        remoteController.currentChannel();
        remoteController.setChannel(25);
        remoteController.currentChannel();
        remoteController.switchTheChannel(36);
        remoteController.currentChannel();

        remoteController.downVolume();
        remoteController.mute();
        remoteController.downVolume();
        remoteController.upVolume();
        remoteController.powerOff();

        remoteController.disconnectDevice();
    }
}
