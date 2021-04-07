package homework7.task2;

public class FahrenheitConverter implements Converter{
    @Override
    public double convert(double celsius) {
        return celsius * 1.8000+ 32.00;
    }
}
