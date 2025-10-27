package io.accelerate.solutions.DMO;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class DemoRound4n5SolutionTest
{
    private DemoRound4n5Solution solution;

    @BeforeEach
    public void setUp() {
        solution = new DemoRound4n5Solution();
    }

    @Test
    void whenWavesWithFourWaves() {
        String result = solution.waves(4);
        assertThat(result, equalTo("_.~'~.__.~'~.__.~'~.__.~'~._"));
    }

    @Test
    void whenWavesWithZeroWaves() {
        String result = solution.waves(0);
        assertThat(result, equalTo(""));
    }

    @Test
    void whenWavesWithOneWaves() {
        String result = solution.waves(1);
        assertThat(result, equalTo("____....~~~~''''~~~~....____"));
    }

    @Test
    void whenWavesWithTwoWaves() {
        String result = solution.waves(2);
        assertThat(result, equalTo("__..~~''~~..____..~~''~~..__"));
    }

    @Test
    void whenWavesWithThreeWaves() {
        String result = solution.waves(3);
        assertThat(result, equalTo("_.~'~.__.~'~.__.~'~._"));
    }

    @Test
    void whenWavesOriginalOutput() {
        String result = solution.originalWaves(3);
        assertThat(result, equalTo("WAVES\nTYPE IN HOW MANY WAVES TO DRAW AS A NUMBER BETWEEN 1 AND 4?\n\n_.~'~.__.~'~.__.~'~._\n"));
    }
}



