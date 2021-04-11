package homework8.task7;
/*
7. In the Example class, implement a couple of equals / hashCode methods in accordance with the rules for implementing
these methods (check details with your favorite search engine).
Both the first and last strings should participate in the comparison using the equals method and the hashcode calculation.
 */

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Example {
    private final String first, last;

    public Example(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public String getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (o == this) return true;
        if( !(o instanceof Example)) return false;
        Example example = (Example) o;
        return this.first == example.getFirst() && this.last == example.getLast();
    }

    @Override
    public int hashCode() {
        return 13 * Objects.hashCode(first)
                + 21 * Objects.hashCode(last);
    }

    public static void main(String[] args) {
        Set<Example> s = new HashSet<>();
        s.add(new Example("Donald", "Duck"));
        System.out.println(s.contains(new Example("Donald", "Duck")));


    }
}
