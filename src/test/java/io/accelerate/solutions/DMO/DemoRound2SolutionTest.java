package io.accelerate.solutions.DMO;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class DemoRound2SolutionTest
{
    private DemoRound2Solution solution;

    @BeforeEach
    public void setUp() {
        solution = new DemoRound2Solution();
    }

    @Test
    void whenArraySumWithPositiveNumbers() {
        assertThat(solution.arraySum(List.of(1, 2, 3, 4, 5)), equalTo(15));
    }

    @Test
    void whenArraySumWithNegativeNumbers() {
        assertThat(solution.arraySum(List.of(-1, -2, -3)), equalTo(-6));
    }

    @Test
    void whenArraySumWithEmptyList() {
        assertThat(solution.arraySum(List.of()), equalTo(0));
    }

    @Test
    void whenIntRangeWithPositiveRange() {
        assertThat(solution.intRange(1, 5), equalTo(List.of(1, 2, 3, 4)));
    }

    @Test
    void whenIntRangeWithZeroStart() {
        assertThat(solution.intRange(0, 3), equalTo(List.of(0, 1, 2)));
    }

    @Test
    void whenIntRangeWithSingleElement() {
        assertThat(solution.intRange(5, 6), equalTo(List.of(5)));
    }

    @Test
    void whenIntRangeWithNegativeStart() {
        assertThat(solution.intRange(-3, 2), equalTo(List.of(-3, -2, -1, 0, 1)));
    }

    @Test
    void whenIntRangeWithEqualStartAndEnd() {
        assertThat(solution.intRange(5, 5), equalTo(List.of()));
    }

    @Test
    void whenIntRangeWithLargeRange() {
        List<Integer> result = solution.intRange(1, 11);
        assertThat(result, hasSize(10));
        assertThat(result.get(0), equalTo(1));
        assertThat(result.get(9), equalTo(10));
    }
//
//    // Filter Pass Tests
//    @Test
//    void whenFilterPassWithThreshold() {
//        assertThat(solution.filterPass(List.of(1, 5, 10, 3, 7), 5),
//                   equalTo(List.of(5, 10, 7)));
//    }
//
//    @Test
//    void whenFilterPassWithAllPassing() {
//        assertThat(solution.filterPass(List.of(10, 20, 30), 5),
//                   equalTo(List.of(10, 20, 30)));
//    }
//
//    @Test
//    void whenFilterPassWithNonePassing() {
//        assertThat(solution.filterPass(List.of(1, 2, 3), 10),
//                   equalTo(List.of()));
//    }
//
//    @Test
//    void whenFilterPassWithNegativeNumbers() {
//        assertThat(solution.filterPass(List.of(-5, 0, 5, -10, 10), 0),
//                   equalTo(List.of(0, 5, 10)));
//    }
//
//    @Test
//    void whenFilterPassWithEmptyList() {
//        assertThat(solution.filterPass(List.of(), 5), equalTo(List.of()));
//    }
//
//    @Test
//    void whenFilterPassWithExactThreshold() {
//        assertThat(solution.filterPass(List.of(5, 5, 5), 5),
//                   equalTo(List.of(5, 5, 5)));
//    }
//
//    @Test
//    void whenFilterPassPreservesOrder() {
//        assertThat(solution.filterPass(List.of(3, 9, 2, 8, 1, 7), 5),
//                   equalTo(List.of(9, 8, 7)));
//    }
}

