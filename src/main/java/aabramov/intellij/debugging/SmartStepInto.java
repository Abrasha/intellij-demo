package aabramov.intellij.debugging;

import java.io.PrintStream;
import java.time.LocalDateTime;

public class SmartStepInto {
    
    
    public static void main(String[] args) throws Exception {
        
        printMessage(getPrintStream(), getMessage(getCurrentDateTime()));
        
    }
    
    private static PrintStream getPrintStream() {
        return null;
    }
    
    private static void printMessage(PrintStream printStream, String message) {
        printStream.println(message);
    }
    
    private static String getMessage(LocalDateTime dateTime) {
        return "Current date & time: " + dateTime;
    }
    
    private static LocalDateTime getCurrentDateTime() {
        return LocalDateTime.now();
    }
    
    private static void printSomething() {
        System.out.println("debug information...");
    }
    
}
