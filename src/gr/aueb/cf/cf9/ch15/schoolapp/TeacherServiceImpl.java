package gr.aueb.cf.cf9.ch15.schoolapp;

public class TeacherServiceImpl implements ITeacherService{

    @Override
    public void addTeacher(Teacher teacher) {
        System.out.println("Teacher: " + teacher.getFirstname() + " " + teacher.getLastname() + " added successfully!");
    }

    @Override
    public void updateTeacher(Teacher teacher) {
        System.out.println("Teacher updated successfully!");
    }

    @Override
    public void removeTeacher(long id) {
        System.out.println("Teacher removed successfully.");
    }

    @Override
    public Teacher getTeacherById(long id) {
        return new Teacher(1L, "Athanasios", "Androutsos");
    }

    @Override
    public Teacher[] getAllTeachers() {
        return new Teacher[] {
                new Teacher(1L, "Athanasios", "Androutsos"),
                new Teacher(2L, "Kostantinos", "Koutsopoulos"),
                new Teacher(3L, "Vlospa", "Pavlos"),
                new Teacher(4L, "Pantelis", "Siletnap")
        };
    }
}
