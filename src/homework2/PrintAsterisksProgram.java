package homework2;

public class PrintAsterisksProgram {
    public static void main(String[] args) {
        String asterisk = "*";
        String space = " ";

        //FIRST TASK
        String asterisks = "";
        for (int i = 0; i < 8; i++ ){
            asterisks += asterisk;
        }
        for (int i = 8; i > 0; i--){
            System.out.println(asterisks);
        }
        String asteriksSpases = "";
        for(int i = 0; i<6; i++){
            if(i == 0){
                asteriksSpases = asterisk;
            }
            asteriksSpases = asteriksSpases+space;
            if (i==5){
                asteriksSpases = asteriksSpases+asterisk;
            }
        }

        //SECOND TASK
        System.out.println("Second task");
        System.out.println(asterisks);
        for (int i = 0; i<3; i++){
            System.out.println(asteriksSpases);
        }
        System.out.println(asterisks);

        //THIRD TASK
        System.out.println("Third task");
        String ast = "";
        for (int i = 0; i<7; i++){
            System.out.println(ast += asterisk);
        }
    }
}
