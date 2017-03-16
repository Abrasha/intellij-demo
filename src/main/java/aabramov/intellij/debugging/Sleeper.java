package aabramov.intellij.debugging;

public class Sleeper {
    public static final int SLEEP_TIME = 1000;
    
    public static void getSomeSleep() throws InterruptedException {
        getSomeSleep(SLEEP_TIME);
    }
    
    public static void getSomeSleep(int millis) throws InterruptedException {
        Thread.sleep(millis);
    }
    
}
