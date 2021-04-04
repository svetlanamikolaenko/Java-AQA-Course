package homework7.task4;

public class Main {
    public static void main(String[] args) {
        Device tv = new TV("LG",true,10,3);

        Device remoteController = new RemoteController((TVDevice)tv);

        ((RemoteController) remoteController).disconnectDevice();
        remoteController.powerOn();

        remoteController.setChannel(25);
        remoteController.currentChannel();
        ((RemoteController) remoteController).switchTheChannel(36);
        remoteController.currentChannel();

        ((RemoteController) remoteController).downVolume();
        ((RemoteController) remoteController).mute();
        ((RemoteController) remoteController).downVolume();
        ((RemoteController) remoteController).upVolume();

        ((RemoteController) remoteController).checkIfDeviceIsConnected();




    }
}
