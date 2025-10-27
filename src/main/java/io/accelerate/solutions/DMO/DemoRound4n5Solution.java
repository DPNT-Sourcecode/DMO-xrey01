package io.accelerate.solutions.DMO;

import io.accelerate.runner.SolutionNotImplementedException;

public class DemoRound4n5Solution {
    
    public String waves(Integer numberOfWaves) {
        Waves.StringOutputSink outputSink = new Waves.StringOutputSink();
        Waves.InputProviderScalar inputProvider = numberOfWaves::floatValue;
        Waves.run(outputSink, inputProvider);
        return outputSink.content();
    }

}


