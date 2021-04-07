package homework6.task1;

public class ClassB {

    private String stringB;
    private int numberB;

    public ClassB(String stringB, int numberB){
        this.stringB = stringB;
        this.numberB = numberB;
    }

    public String getStringB() {
        return stringB;
    }

    public int getNumberB() {
        return numberB;
    }

    public void setNumberB(int numberB) {
        this.numberB = numberB;
    }

    @Override
    public String toString(){
        return "stringB = " + stringB + ", classB = " + numberB;
    }


}
