package homework6.task1;

public class A {
    private B b;
    private  C c = new C();
    private  String stringA;

    public A (B b, String stringA) {
        this.b = b;
        this.stringA = stringA;
    }

    public A() {
    }

    public A(C c) {
        this.c = c;
    }

    @Override
    public String toString(){
        return " Class A has stringA: " + stringA +";\n"
                + " Composition with class B: " + b + ";\n"
                + " Composition: " + c + ";\n";
    }
}
