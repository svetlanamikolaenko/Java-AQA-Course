package homework6.task1;

public class ClassA {
    private ClassB classB;
    private ClassC classC = new ClassC();
    private  String stringA;
    public int numberA;


    public ClassA(ClassB classB) {
        this.classB = classB;
    }

    public ClassA(String stringA) {
        this.stringA = stringA;
    }

    public ClassA(ClassC classC) {
        this.classC = classC;
    }

    public ClassA(ClassB classB, String stringA) {
        this(classB);
        this.stringA = stringA;
    }

    public ClassA(ClassB classB, String stringA, ClassC classC) {
        this(classB, stringA);
        this.classC = classC;
    }

    public ClassA(ClassB classB, String stringA , ClassC classC, int numberA){
        this(classB, stringA, classC);
        this.numberA = numberA;
    }

    public ClassA() {
    }

    public String getStringB(){
         return classB.getStringB();
    }

    public String getStringC(){
        return classC.getStringC();
    }

    public int getNumberC() {
        return classC.getNumberC();
    }

    public void setNumberB(int numberB){
        classB.setNumberB(numberB);
    }

    public int getNumberB() {
        return classB.getNumberB();
    }

    @Override
    public String toString(){
        return " Class A has stringA: " + stringA +";\n"
                + " Composition with class B: " + classB + ";\n"
                + " Composition: " + classC + ";\n";
    }
}
