package homework7.task4;

public class RemoteController implements Volume, Device {
    private TVDevice tvDevice;


    public void connectDevice(TVDevice tvDevice) {
            this.tvDevice = tvDevice;
        System.out.println(tvDevice.modelName + " successfully connected!");
    }

    public void disconnectDevice() {
        System.out.println( tvDevice.modelName  + " disconnected!");
        this.tvDevice = null;
    }

    public void switchTheChannel(int channel) {
        if (checkIfDeviceIsConnected() && tvDevice.isOn) {
            tvDevice.setChannel(channel);
        }  else System.out.println("Connection error");
    }

    private boolean checkIfDeviceIsConnected() {
        if(tvDevice == null){
            return false;
        }
        return true;
    }

    @Override
    public void powerOn() {
        if (checkIfDeviceIsConnected() && !tvDevice.isOn) {
            System.out.println("Turning on ..." + tvDevice.modelName);
            tvDevice.powerOn();
        }
    }

    @Override
    public void powerOff() {
        if (checkIfDeviceIsConnected() && tvDevice.isOn) {
            System.out.println("Turning off ..." + tvDevice.modelName);
            tvDevice.powerOff();
        }  else System.out.println("Connection error");
    }

    @Override
    public void setChannel(int channel) {
        switchTheChannel(channel);
    }

    @Override
    public void currentChannel() {
        if (checkIfDeviceIsConnected() && tvDevice.isOn) {
            tvDevice.currentChannel();
        } else System.out.println("Connection error");
    }

    @Override
    public void upVolume() {
        if (checkIfDeviceIsConnected() && tvDevice.isOn) {
            tvDevice.upVolume();
        } else System.out.println("Connection error");
    }

    @Override
    public void downVolume() {
        if (checkIfDeviceIsConnected() && tvDevice.isOn){
            tvDevice.downVolume();}
        else System.out.println("Connection error");
    }

    @Override
    public void mute() {
        if (checkIfDeviceIsConnected() && tvDevice.isOn) {
            tvDevice.mute();
        } else System.out.println("Connection error");
    }
}
