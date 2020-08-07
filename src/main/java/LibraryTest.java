import org.junit.Test;
import static org.junit.Assert.*;
public class LibraryTest {
    @Test
    public void testIsInSelections() {
        Libraryy classUnderTest = new Libraryy("test library");
        assertTrue("Science should be in library's selection",
                classUnderTest.isInSelection("Science"));
        assertTrue("Children should be in library's selection",
                classUnderTest.isInSelection("Children"));
        assertFalse("Drama should not be in library's selection",
                classUnderTest.isInSelection("Drama"));     } }