package homework7.task3;
/*
3) Create two interfaces Volume and State:
interface Volume {
    void changeVolume(double value);
}

interface State {
   void on();
   void off();
}

Create a new class "MyDevice" which implements both interfaces. Provide your implementations of methods.
 */

public class MyDevice  implements Volume,State{
    boolean isOn;
    double currentVolume;
    double maxVolume;

    public MyDevice(boolean isOn) {
        this.isOn = isOn;
        this.currentVolume = 0;
        this.maxVolume = 100;
    }

    @Override
    public void on() {
        isOn = true;
    }

    @Override
    public void off() {
        isOn = false;
    }

    @Override
    public void changeVolume(double value) {
        if (value <= maxVolume && isOn){
            currentVolume = value;
        } else if (value>maxVolume && isOn){
            currentVolume = maxVolume;
        } else currentVolume = 0;
    }
}
