import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ResultTest {


    @BeforeAll
    static void init() {
        System.out.println();

    }

    @BeforeEach
    void SetUp() {

    }

    @DisplayName("#1 Basic logic")
    @Test
    void testGradingStudents_basicLogic() {
        List<Integer> grades = Arrays.asList(4, 73, 67, 38, 33);

        List<Integer> actual = Result.gradingStudents(grades);
        List<Integer> expected = Arrays.asList(75, 67, 40, 33);

        assertEquals(expected, actual);

    }

    @DisplayName("#2 Size of first parameter too high")
    @Test
    void testGradingStudents_sizeOfFirstParameterTooHigh() {
        List<Integer> grades = Arrays.asList(65, 73, 67, 38, 33);

        List<Integer> actual = Result.gradingStudents(grades);

        List<Integer> expected = new ArrayList<>();

        assertEquals(expected, actual);

    }

    @DisplayName("#3 Size of first parameter too low")
    @Test
    void testGradingStudents_sizeOfFirstParameterTooLow() {
        List<Integer> grades = Arrays.asList(-1, 73, 67, 38, 33);

        List<Integer> actual = Result.gradingStudents(grades);

        List<Integer> expected = new ArrayList<>();

        assertEquals(expected, actual);

    }

    @DisplayName("#4 Size of grade too low")
    @Test
    void testGradingStudents_() {
        List<Integer> grades = Arrays.asList(4, -5, 67, 38, 33);

        List<Integer> actual = Result.gradingStudents(grades);

        List<Integer> expected = Arrays.asList(null, 67, 40, 33);

        assertEquals(expected, actual);

    }


}
