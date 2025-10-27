package io.accelerate.solutions.DMO;

import io.accelerate.runner.SolutionNotImplementedException;

import java.util.Locale;

public class DemoRound1Solution {
    public int increment(int x) {
        return ++x;
    }

    public String toUppercase(String text) {
        return text.toUpperCase(Locale.ROOT);
    }

    public String letterToSanta() {
        throw new SolutionNotImplementedException();
    }

    public int countLines(String text) {
        throw new SolutionNotImplementedException();
    }
}


