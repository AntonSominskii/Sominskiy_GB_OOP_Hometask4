import java.util.List;

public class TeacherView {
    public void displayTeacherInfo(Teacher teacher) {
        System.out.println("Teacher ID: " + teacher.getId() + ", Name: " + teacher.getName() + ", Subject: " + teacher.getSubject());
    }

    public void displayTeachers(List<Teacher> teachers) {
        for (Teacher teacher : teachers) {
            displayTeacherInfo(teacher);
        }
    }
}