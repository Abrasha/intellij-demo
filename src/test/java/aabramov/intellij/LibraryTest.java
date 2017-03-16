package aabramov.intellij;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class LibraryTest {
    @Test
    public void testSomeLibraryMethod() {
        Playground classUnderTest = new Playground();
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }
}
