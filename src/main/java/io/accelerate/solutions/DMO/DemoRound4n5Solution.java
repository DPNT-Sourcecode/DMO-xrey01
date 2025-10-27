package io.accelerate.solutions.DMO;

import io.accelerate.runner.SolutionNotImplementedException;

public class DemoRound4n5Solution {
    
    public String waves(Integer numberOfWaves) {
        Waves.StringOutputSink outputSink = new Waves.StringOutputSink();
        Waves.InputProviderScalar inputProvider = numberOfWaves::floatValue;
        Waves.run(outputSink, inputProvider);

        String fullOutput = outputSink.content();
        String[] lines = fullOutput.split(System.lineSeparator());

        // The wave pattern is on the 4th line (index 3)
        // Line 0: "WAVES"
        // Line 1: "TYPE IN HOW MANY WAVES TO DRAW AS A NUMBER BETWEEN 1 AND 4?"
        // Line 2: empty (from input)
        // Line 3: the actual wave pattern
        if (lines.length > 3) {
            return lines[3];
        }

        return "";
    }

}



