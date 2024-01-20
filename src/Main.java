
public class Main {
    public static void main(String[] args) {
        // Создание сервиса и представления
        TeacherService teacherService = new TeacherService();
        TeacherView teacherView = new TeacherView();

        // Создание контроллера
        TeacherController teacherController = new TeacherController(teacherService, teacherView);

        // Добавление учителей
        teacherController.add(new Teacher(1, "Иванов Иван", "Математика"));
        teacherController.add(new Teacher(2, "Петрова Мария", "Литература"));
        teacherController.add(new Teacher(3, "Сидоров Алексей", "Физика"));

        // Отображение всех учителей
        System.out.println("Список учителей:");
        teacherController.displayAll();

        // Редактирование учителя
        teacherController.edit(1, new Teacher(1, "Иванов Иван Иванович", "Математика и информатика"));

        // Отображение всех учителей после редактирования
        System.out.println("\nСписок учителей после редактирования:");
        teacherController.displayAll();
    }
}