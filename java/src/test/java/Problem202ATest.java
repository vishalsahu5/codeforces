import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.PrintWriter;

public class Problem202ATest {

    @BeforeEach
    void init() {
        Problem202A.result = "";
    }

    @Test
    public void test1() {
        String s = "radar";
        String expected = "rr";

        Problem202A.solve(s.toCharArray(), 0, new StringBuilder());
        Assertions.assertEquals(expected, Problem202A.result);
    }

    @Test
    public void test2() {
        String s = "bowwowwow";
        String expected = "wwwww";

        Problem202A.solve(s.toCharArray(), 0, new StringBuilder());
        Assertions.assertEquals(expected, Problem202A.result);
    }

    @Test
    public void test3() {
        String s = "mississipp";
        String expected = "ssss";

        Problem202A.solve(s.toCharArray(), 0, new StringBuilder());
        Assertions.assertEquals(expected, Problem202A.result);
    }
}
