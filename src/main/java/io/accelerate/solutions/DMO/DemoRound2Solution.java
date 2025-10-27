package io.accelerate.solutions.DMO;

import io.accelerate.runner.SolutionNotImplementedException;

import java.util.List;

public class DemoRound2Solution {
    public int arraySum(List<Integer> integerList) {
        int sum = 0;
        for (int i = 0; i < integerList.size(); i++) {
            sum += integerList.get(i);
        }
        return sum;
    }

    public List<Integer> intRange(int start, int end) {
        throw new SolutionNotImplementedException();
    }

    public List<Integer> filterPass(List<Integer> integerList, int threshold) {
        throw new SolutionNotImplementedException();
    }
}


