package homework7.task2;

public class Test {
    public static void main(String[] args) {
        Converter fahrenheitConverter = new FahrenheitConverter();
        System.out.println(fahrenheitConverter.convert(12));

        Converter kelvinConverter = new KelvinConverter();
        System.out.println(kelvinConverter.convert(20.0));
    }
}
