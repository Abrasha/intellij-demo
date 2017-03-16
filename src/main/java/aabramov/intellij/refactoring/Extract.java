package aabramov.intellij.refactoring;

import java.time.LocalDateTime;

public class Extract {
    
    // extract variable
    public void wrapIntoRuntimeException(Throwable e){
        String message = computeMessage(e);
    
        Exception x = new RuntimeException();
        x.setStackTrace(null);
        
        throw new RuntimeException(message);
    }
    
    private String computeMessage(Throwable e) {
        return "Got exception: " + e.toString() + " at " + LocalDateTime.now();
    }
    
}
