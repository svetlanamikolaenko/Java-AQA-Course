package homework6.task1;

public class ClassC {
    private String stringC;
    private int numberC;

    public ClassC(String stringC, int numberC) {
        this.stringC = stringC;
        this.numberC = numberC;
    }

    public ClassC() {
        stringC = "Empty constructor of C";
    }

    public String getStringC() {
        return stringC;
    }

    public int getNumberC() {
        return numberC;
    }

    public void setStringC(String stringC) {
        this.stringC = stringC;
    }
    @Override
    public String toString(){
        if (stringC!=null && numberC != 0){
            return "stringC = " + stringC + ", numberC = " + numberC;
        }
        return stringC;
    }
}
