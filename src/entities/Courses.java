package entities;

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
    public String toString() {
        return "Courses{" +
                "StudentId=" + StudentId +
                '}';
    }
}
