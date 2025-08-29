package javacore.JavaStringPractices.Level1Practice;
import java.util.*;
class Ques4 {
    public static void generateException() {
        String text = null;
        System.out.println(text.length());
    }
    public static void handleException() {
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Handled: " + e);
        }
    }
    public static void main(String[] args) {
        try {
            generateException();
        } catch (Exception e) {
            System.out.println("Exception generated: " + e);
        }
        handleException();
    }
}