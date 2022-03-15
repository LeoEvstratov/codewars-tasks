import main.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void testSomething() {
        final User user = new User();
        assertEquals(-8, user.rank);
        assertEquals(0, user.progress);
        assertEquals(-8, user.rank);
        user.incProgress(-7);
        assertEquals(10, user.progress);
        user.incProgress(-5);
        assertEquals(0, user.progress);
        assertEquals(-7, user.rank);
    }

    @Test
    void testSomeLevelsUp() {
        final User user = new User();
        user.incProgress(1);
        assertEquals(-2, user.rank);
    }

    @Test
    void testNearNullValues() {
        final User user = new User();
        user.rank = 7;
        user.progress = 99;
        user.incProgress(8);
        assertEquals(0, user.progress);
    }
}
