package aabramov.intellij.completion.enums;

public class GenderPrinter {
    
    public static void main(String[] args){
        // without namespace
        printGender(null);
    }
    
    private static void printGender(Gender gender) {
        System.out.println(gender);
    }
    
}