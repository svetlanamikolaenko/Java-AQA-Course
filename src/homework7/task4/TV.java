package homework7.task4;

public class TV extends TVDevice{
    private int volumeLevel;
    private int channelNumber;

    public TV(String modelName, boolean isOn, int volumeLevel, int channelNumber) {
        super(modelName, isOn);
        this.volumeLevel = volumeLevel;
        this.channelNumber = channelNumber;
    }


    @Override
    public void powerOn() {
        isOn = true;
    }

    @Override
    public void powerOff() {
        isOn = false;
    }

    @Override
    public void setChannel(int channel) {
        channelNumber = channel;
    }

    @Override
    public void currentChannel() {
        System.out.println("Current channel " + channelNumber);
    }

    @Override
    public void upVolume() {
        if(volumeLevel < 100) volumeLevel++;
        System.out.println("Volume level " + volumeLevel);
    }

    @Override
    public void downVolume() {
        if(volumeLevel > 0) volumeLevel--;
        System.out.println("Volume level " + volumeLevel);

    }

    @Override
    public void mute() {
        volumeLevel = 0;
        System.out.println("Volume level " + volumeLevel);
    }
}
