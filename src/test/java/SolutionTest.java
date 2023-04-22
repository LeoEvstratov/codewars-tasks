import main.Parser;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SolutionTest {

    @Test
    public void fixedTests() {
        assertEquals(1 , Parser.parseInt("one"));
        assertEquals(10 , Parser.parseInt("ten"));
        assertEquals(20 , Parser.parseInt("twenty"));
        assertEquals(40 , Parser.parseInt("forty"));
        assertEquals(46 , Parser.parseInt("forty-six"));
        assertEquals(246 , Parser.parseInt("two hundred forty-six"));
        assertEquals(186 , Parser.parseInt("one hundred eighty-six"));
        assertEquals(2247 , Parser.parseInt("two thousand two hundred forty-seven"));
        assertEquals(22546 , Parser.parseInt("twenty-two thousand five hundred forty-six"));
        assertEquals(483100 , Parser.parseInt("four hundred eighty-three thousand one hundred"));
        assertEquals(483100 , Parser.parseInt("four hundred eighty-three thousand and hundred"));
        assertEquals(783919 , Parser.parseInt("seven hundred eighty-three thousand nine hundred and nineteen"));
        assertEquals(1000000 , Parser.parseInt("million"));
        assertEquals(1000000 , Parser.parseInt("one million"));
    }
}