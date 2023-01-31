import org.alan.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StudentTest {

    @Test
    public void whenStudentHasZGrade_thenThrowIllegalArgumentException() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            Student test = new Student("John", "2", "Z");
        }, "IllegalArgumentException was expected");
        assertEquals("Grade must be between A and F", thrown.getMessage());
    }

    @Test
    public void whenStudentHasGGrade_thenThrowIllegalArgumentException() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            Student test = new Student("John", "2", "G");
        }, "IllegalArgumentException was expected");
        assertEquals("Grade must be between A and F", thrown.getMessage());
    }

    @Test
    public void whenStudentHasGroup0_thenThrowIllegalArgumentException() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            Student test = new Student("John", "0", "B");
        }, "IllegalArgumentException was expected");
        assertEquals("Group must be between 1 and 5", thrown.getMessage());
    }

    @Test
    public void whenStudentHasGroup6_thenThrowIllegalArgumentException() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            Student test = new Student("John", "6", "B");
        }, "IllegalArgumentException was expected");
        assertEquals("Group must be between 1 and 5", thrown.getMessage());
    }

    @Test
    public void whenStudentIsJohnAndHasAGradeAndGroup1ThenReturnJohnWithGroup1AndGradeA() {
        Student test = new Student("John", "1", "A");
        assertEquals("John", test.getName());
        assertEquals("A", test.getGrade() );
        assertEquals("1", test.getGroup());
    }

    @Test
    public void whenStudentHasBGrade_whenIncreaseGradeIsCalledThenGradeReturnedIsA() {
        Student test = new Student("james", "1", "B");
        test.increaseGrade();
        assertEquals("A", test.getGrade());
    }

    @Test
    public void whenStudentHasCGrade_whenDecreaseGradeGradeIsCalledThenGradeReturnedIsD() {
        Student test = new Student("james", "1", "C");
        test.decreaseGrade();
        assertEquals("D", test.getGrade());
    }

    @Test
    public void whenStudentHasAGrade_whenIncreaseGradeIsCalledThenGradeReturnedIsSame() {
        Student test = new Student("james", "1", "A");
        test.increaseGrade();
        assertEquals("A", test.getGrade());
    }

    @Test
    public void whenStudentHasFGrade_whenDecreaseGradeIsCalledThenGradeReturnedIsSame() {
        Student test = new Student("james", "1", "F");
        test.decreaseGrade();
        assertEquals("F", test.getGrade());
    }
}
