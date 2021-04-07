package homework7.task4;

public abstract class TVDevice implements Device,Volume{
    String modelName;
    boolean isOn;

    public TVDevice(String modelName, boolean isOn) {
        this.modelName = modelName;
        this.isOn = isOn;
    }
}
