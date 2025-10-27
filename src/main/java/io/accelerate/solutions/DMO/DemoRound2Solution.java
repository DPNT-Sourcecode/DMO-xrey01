package io.accelerate.solutions.DMO;

import io.accelerate.runner.SolutionNotImplementedException;

import java.util.ArrayList;
import java.util.List;

public class DemoRound2Solution {
    public int arraySum(List<Integer> integerList) {
        int sum = 0;
        for (Integer integer : integerList) {
            sum += integer;
        }
        return sum;
    }

    public List<Integer> intRange(int start, int end) {
        List<Integer> result = new ArrayList<>();
        for (int i = start; i < end; i++) {
            result.add(i);
        }
        return result;
    }

    public List<Integer> filterPass(List<Integer> integerList, int threshold) {
        List<Integer> result = new ArrayList<>();
        for (Integer value : integerList) {
            if (value >= threshold) {
                result.add(value);
            }
        }
        return result;
    }
}
