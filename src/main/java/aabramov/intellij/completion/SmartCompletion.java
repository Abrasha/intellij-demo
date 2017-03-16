package aabramov.intellij.completion;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;

class CloseableProvider {
    public Closeable getCloseable() {
        return new ByteArrayOutputStream();
    }
}

public class SmartCompletion {
    
    public static void main(String[] args) throws Exception {
        
        CloseableProvider provider = new CloseableProvider();
        // close with instance completion
    }
    
    private static void close(Closeable stream) throws IOException {
        stream.close();
    }
    
}
