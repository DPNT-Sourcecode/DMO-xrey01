package io.accelerate.solutions.DMO;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class DemoRoun1SolutionTest {
    private DemoRound1Solution round1Solution;

    @BeforeEach
    public void setUp() {
        round1Solution = new DemoRound1Solution();
    }


    @Test
    void incrementInt() {
        assertThat(round1Solution.increment(1), equalTo(2));
    }

    @Test
    void whenTextThenUppercase() {
        assertThat(round1Solution.toUppercase("hello"), equalTo("HELLO"));
    }
}


