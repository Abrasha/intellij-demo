package aabramov.intellij.debugging;

class Ticker {
    
    private int iteration = 0;
    
    // 1. Conditional iteration == 322
    // 2. Log without suspend
    public void execute(int limit, Runnable runnable) throws InterruptedException {
        while (iteration++ < limit) {
            runnable.run();
        }
    }
    
}

public class FieldBreakpoint {
    
    
    public static void main(String[] args) throws Exception {
        Ticker ticker = new Ticker();
        ticker.execute(1000, FieldBreakpoint::printSomething);
    }
    
    private static void printSomething() {
        System.out.println("debug information...");
    }
    
}
