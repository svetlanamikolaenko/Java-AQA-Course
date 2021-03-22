package homework2;

public class PrintAsterisksProgram {
    public static void main(String[] args) {
        String asterisk = "*";
        String space = " ";

        //    ********
        //    ********
        //    ********
        //    ********
        //    ********
        //    ********
        //    ********
        //    ********

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(asterisk);
            }
            System.out.print("\n");
        }
        System.out.print("\n");


        //********
        //*      *
        //*      *
        //*      *
        //*      *
        //*      *
        //*      *
        //********

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i > 0 && i < 7 && j > 0 && j < 7) {
                    System.out.print(space);
                } else {
                    System.out.print(asterisk);
                }
            }
            System.out.print("\n");
        }
        System.out.print("\n");


        //*
        //**
        //***
        //****
        //*****
        //******
        //*******
        //********

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i + 1 < j + 1) {
                    System.out.print(space);
                } else {
                    System.out.print(asterisk);
                }
            }
            System.out.print("\n");
        }
        System.out.print("\n");

        //    *
        //   ***
        //  *****
        // *******
        //*********
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = rows-i; j >= 1; j--) {
                    System.out.print(space);
                }
            for (int k = 1; k<=(i*2)-1; k++){
                System.out.print(asterisk);
            }
            System.out.print("\n");
        }
    }
}
