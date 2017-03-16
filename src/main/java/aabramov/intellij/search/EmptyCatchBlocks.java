package aabramov.intellij.search;

public class EmptyCatchBlocks {
    
    // empty catch regex
    // \s*
    
    public void goodCatchBlock(){
        try {
            throw new IllegalArgumentException("Random");
        } catch (Exception e) {
            System.out.println(e);
            throw new RuntimeException(e);
        }
    }
    
    public void badCatchBlock(){
        try {
            throw new IllegalArgumentException("Random");
        } catch (Exception e) {
        }
    }
    
}
