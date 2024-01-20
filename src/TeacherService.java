import java.util.ArrayList;
import java.util.List;

public class TeacherService implements IService<Teacher> {
    private List<Teacher> teachers = new ArrayList<>();

    @Override
    public void add(Teacher teacher) {
        teachers.add(teacher);
    }

    @Override
    public void edit(int id, Teacher newTeacher) {
        for (Teacher teacher : teachers) {
            if (teacher.getId() == id) {
                teacher.setName(newTeacher.getName());
                teacher.setSubject(newTeacher.getSubject());
                break;
            }
        }
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }
}