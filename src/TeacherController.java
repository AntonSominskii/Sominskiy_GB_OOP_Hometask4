public class TeacherController implements IController {
    private TeacherService teacherService;
    private TeacherView teacherView;

    public TeacherController(TeacherService teacherService, TeacherView teacherView) {
        this.teacherService = teacherService;
        this.teacherView = teacherView;
    }

    @Override
    public void add(Object item) {
        if (item instanceof Teacher) {
            teacherService.add((Teacher) item);
        }
    }

    @Override
    public void edit(int id, Object item) {
        if (item instanceof Teacher) {
            teacherService.edit(id, (Teacher) item);
        }
    }

    @Override
    public void displayAll() {
        teacherView.displayTeachers(teacherService.getAll());
    }
}