package homework6.task1;

public class B {

    private String stringB;
    private int b;

    public B(String stringB, int b){
        this.stringB = stringB;
        this.b = b;
    }

    public String getStringB() {
        return stringB;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString(){
        return "stringB = " + stringB + ", b = " + b;
    }
}
