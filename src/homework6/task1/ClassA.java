package homework6.task1;

public class ClassA {
    private ClassB classB;
    private ClassC classC = new ClassC();
    private  String stringA;
    private int numberA;


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

    @Override
    public String toString(){
        return " Class A has stringA: " + stringA +";\n"
                + " Composition with class B: " + classB + ";\n"
                + " Composition: " + classC + ";\n";
    }
}
