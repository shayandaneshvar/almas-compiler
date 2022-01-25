package ir.ac.kntu;

import java.util.Scanner;

public class FILE_NAME {
    private static final Scanner scanner = new Scanner(System.in);

    public static String stringCast(double value) {
        return String.valueOf(value);
    }

    public static String stringCast(String value) {
        return value;
    }

    public static String stringCast(boolean value) {
        if (value) return "yes";
        return "no";
    }

    public static String input(String message) {
        System.out.println(message);
        return scanner.nextLine();
    }

    public static double decimalCast(double value) {
        return value;
    }

    public static double decimalCast(String value) {
        return Double.parseDouble(value);
    }

    public static double decimalCast(boolean value) {
        if (value) return 1.0;
        return 0.0;
    }

    public static boolean booleanCast(double value) {
        return !(value < 1) || !(value > -1);
    }

    public static boolean booleanCast(String value) {
        return value.equals("yes") || value.equals("1");
    }

    public static boolean booleanCast(boolean value) {
        return value;
    }


    public static void main(String[] args) {
        //CODES
        double x = 2;
        String z = "";

        scanner.close();
    }

    // FUNCTION_DEFS
}


//import java.util.Scanner;
//public class FILE_NAME {
//  private static final Scanner scanner = new Scanner(System.in);
//    public static double decimalCast(double value) {
//        return value;
//    }
//
//    public static String input(String message) {
//        System.out.println(message);
//        return scanner.nextLine();
//    }
//
//    public static double decimalCast(String value) {
//        return Double.parseDouble(value);
//    }
//
//    public static double decimalCast(boolean value) {
//        if (value) return 1.0;
//        return 0.0;
//    }
//
//    public static boolean booleanCast(double value) {
//        return !(value < 1) || !(value > -1);
//    }
//
//    public static boolean booleanCast(String value) {
//        return value.equals("yes") || value.equals("1");
//    }
//
//    public static boolean booleanCast(boolean value) {
//        return value;
//    }
//    public static String stringCast(double value) {
//        return String.valueOf(value);
//    }
//
//    public static String stringCast(String value) {
//        return value;
//    }
//
//    public static String stringCast(boolean value) {
//        if (value) return "yes";
//        return "no";
//    }
//    public static void main(String[] args) {
//      CODES
//
//        scanner.close();
//    }
//
//    FUNCTIONS
//
// }

