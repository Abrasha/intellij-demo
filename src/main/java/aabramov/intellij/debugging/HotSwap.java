package aabramov.intellij.debugging;

public class HotSwap {
    
    public static final int SLEEP_TIME = 1000;
    
    public static void main(String[] args) throws Exception {
        while (true) {
            printSomething();
            getSomeSleep();
        }
    }
    
    private static void getSomeSleep() throws InterruptedException {
        Thread.sleep(SLEEP_TIME);
    }
    
    private static void printSomething() {
        System.out.println("debug information...");
    }
    
}
