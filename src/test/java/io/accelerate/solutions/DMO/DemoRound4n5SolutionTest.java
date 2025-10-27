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
    void printFullOutputForGoldenMaster() {
        for (int i = 1; i <= 4; i++) {
            Waves.StringOutputSink outputSink = new Waves.StringOutputSink();
            int waves = i;
            Waves.InputProviderScalar inputProvider = () -> (float) waves;
            Waves.run(outputSink, inputProvider);
            String output = outputSink.content();
            System.out.println("=== OUTPUT FOR " + i + " WAVE(S) ===");
            System.out.println(output);
            System.out.println("=== END ===");
            System.out.println();
        }
    }
}
