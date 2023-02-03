package org.alan;


import java.util.List;
import java.util.Set;

public class Student {

    private String name;
    private String group;
    private String grade;
    private String secretNickName;
    private final static List<String> GRADE_ARRAY = List.of("F", "E", "D", "C", "B", "A");
    private final static int MAX_GRADE_INDEX = GRADE_ARRAY.size() - 1;
    private static final int MIN_GRADE_INDEX = 0;
    private static final Set<String> GROUP_NUM_SET = Set.of("1", "2", "3", "4", "5");
    
    public Student(String name, String group, String grade) {
        if (!GROUP_NUM_SET.contains(group)) {
            throw new IllegalArgumentException("Group must be between 1 and 5");
        }
        if (!GRADE_ARRAY.contains(grade)) {
            throw new IllegalArgumentException("Grade must be between A and F");
        }
        this.name = name;
        this.secretNickName = "mySecretNickname";
        this.grade = grade;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }

    public void increaseGrade() {
        var currentGradeIndex = GRADE_ARRAY.indexOf(grade);
        if (currentGradeIndex < MAX_GRADE_INDEX) {
            grade = GRADE_ARRAY.get(++currentGradeIndex);
        }
    }

    public void decreaseGrade() {
        var currentGradeIndex = GRADE_ARRAY.indexOf(grade);
        if (currentGradeIndex > MIN_GRADE_INDEX) {
            grade = GRADE_ARRAY.get(--currentGradeIndex);
        }
    }
}
