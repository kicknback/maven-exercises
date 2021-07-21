import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class MyFirstTest {

    @Test
    public void isCodeup() {
        String expected = "Codeup";
        String actual = "CodeUp";

        assertNotEquals(expected, actual);
    }

    @Test
    public void isSameArray() {
        List<String> languages = new ArrayList<>();
        List<String> moreLanguages = new ArrayList<>();


    }

}
