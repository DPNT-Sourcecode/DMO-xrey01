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
        return "Dear Santa, I would like a puppy";
    }

    public int countLines(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }
        String[] lines = text.split("\r?\n|\r");
        return lines.length;
    }
}


