package entities;

import java.util.Objects;

public class Courses {

    private int StudentId;

    public Courses(int studentId) {
        StudentId = studentId;
    }

    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Courses courses = (Courses) o;
        return StudentId == courses.StudentId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(StudentId);
    }

    @Override
    public String toString() {
        return "Courses{" +
                "StudentId=" + StudentId +
                '}';
    }
}
