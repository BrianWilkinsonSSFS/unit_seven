import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    static Student s1;
    static Student s2;

    @BeforeClass
    public static void setUp() {
        s1 = new Student("Mary");
        s2 = new Student("Max");
        s1.inputGrades();
        s2.inputGrades();
    }


    @Test
    public void getAverage() {
        assertEquals(88.0, s1.getAverage(), 0.0);
        assertEquals(62.5, s2.getAverage(), 0.0);
    }

    @Test
    public void getName() {
        assertEquals("Mary", s1.getName());
        assertEquals("Max", s2.getName());
    }

    @Test
    public void toString1() {
        assertEquals("Name: Mary Test1: 85.0 Test2: 91.0", s1.toString());
        assertEquals("Name: Max Test1: 75.0 Test2: 50.0", s2.toString());
    }
}