import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;
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

    @Test void testGrade() {
        List<Integer> grades = new ArrayList<>();
        grades.add(4);
        grades.add(73);
        grades.add(67);
        grades.add(38);
        grades.add(33);

        List<Integer> calculations = new ArrayList<>();
        calculations = Result.gradingStudents(grades);

        List<Integer> expected = new ArrayList<>();
        expected.add(75);
        expected.add(67);
        expected.add(40);
        expected.add(33);

        assertEquals(expected, calculations);

        }






}
