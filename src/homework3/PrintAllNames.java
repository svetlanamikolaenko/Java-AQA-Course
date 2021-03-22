package homework3;

public class PrintAllNames {
    /*8. Given a string "Den, John, Will, Kate, Adam, Robin". Print all the names from the following string each from a new line.
    Example:
    Den
    John
    Will
    Kate
    ...
    */
    public static void main(String[] args) {
        String  allNames = "Den, John, Will, Kate, Adam, Robin";
        String[] names = allNames.split(", ");
        for (String name : names){
            System.out.println(name);
        }
    }
}
