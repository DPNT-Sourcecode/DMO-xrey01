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
        assertThat(result, equalTo("____....~~~~''''~~~~....___"));
    }
}

