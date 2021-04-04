package homework7.task4;

public class RemoteController implements Volume, Device {
    private TVDevice tvDevice;

    public RemoteController(TVDevice tvDevice) {
        this.tvDevice = tvDevice;
    }

    public void connectDevice(TVDevice tvDevice) {
        tvDevice.powerOn();
    }

    public void disconnectDevice() {
        powerOff();
    }

    public void switchTheChannel(int channel) {
        if (tvDevice.isOn) {
            tvDevice.setChannel(channel);
            ;
        }
    }

    public boolean checkIfDeviceIsConnected() {
        System.out.println(tvDevice.isOn);
        return tvDevice.isOn;
    }


    @Override
    public void powerOn() {
        if (!tvDevice.isOn) {
            System.out.println("Connecting ..." + tvDevice.modelName);
            tvDevice.powerOn();
        }
    }

    @Override
    public void powerOff() {
        if (tvDevice.isOn) {
            System.out.println("Disconnecting ..." + tvDevice.modelName);
            tvDevice.powerOff();
        }
    }

    @Override
    public void setChannel(int channel) {
        switchTheChannel(channel);
    }

    @Override
    public void currentChannel() {
        if (tvDevice.isOn) {
            tvDevice.currentChannel();
        } else System.out.println(tvDevice.modelName + " device is disconnected");
    }

    @Override
    public void upVolume() {
        if (tvDevice.isOn) {
            tvDevice.upVolume();
        }
    }

    @Override
    public void downVolume() {
        if (tvDevice.isOn)
            tvDevice.downVolume();
    }

    @Override
    public void mute() {
        if (tvDevice.isOn)
            tvDevice.mute();
    }
}
