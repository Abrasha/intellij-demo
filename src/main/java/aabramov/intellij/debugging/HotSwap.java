package aabramov.intellij.debugging;

public class HotSwap {
    
    
    public static void main(String[] args) throws Exception {
    
        while (true) {
            printSomething();
            Sleeper.getSomeSleep();
        }
        
    }
    
    private static void printSomething() {
        System.out.println("debug information...");
    }
    
}
