package aabramov.intellij.refactoring;

import java.time.LocalDateTime;

public class Extract {
    
    // extract variable
    // extract method
    public void wrapIntoRuntimeException(Throwable e){
        throw new RuntimeException("Got exception: " + e.toString() + " at " + LocalDateTime.now());
    }
    
}
