package homework6.task1;

public class C {
    private String stringC;
    private int c;

    public C (String stringC, int c) {
        this.stringC = stringC;
        this.c = c;
    }

    public C() {
        stringC = "Empty constructor of C";
    }

    public String getStringC() {
        return stringC;
    }

    public int getC() {
        return c;
    }

    public void setStringC(String stringC) {
        this.stringC = stringC;
    }
    @Override
    public String toString(){
        return stringC;
    }
}
