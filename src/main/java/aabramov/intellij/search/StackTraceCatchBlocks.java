package aabramov.intellij.search;

public class StackTraceCatchBlocks {
    
    // printStackTrace catch regex
    // \s*.*\.printStackTrace\(\)\s*
    
    public void goodStackTraceBlock(){
        try {
            throw new IllegalArgumentException("Random");
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
    
    public void badStackTraceBlock(){
        try {
            throw new IllegalArgumentException("Random");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
