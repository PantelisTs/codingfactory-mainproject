package gr.aueb.cf.cf9.ch15.schoolapp;

public class Main {

    public static void main(String[] args) {
        // 1. Create the Service
        // We use the Interface as the variable type (Polymorphism)
        ITeacherService teacherService = new TeacherServiceImpl();

        System.out.println("--- 1. Testing ADD ---");
        // Create a new teacher to add
        Teacher alice = new Teacher(10L, "Alice", "Wonderland");
        teacherService.addTeacher(alice);
        // Output: Prints the success message defined in your Impl class


        System.out.println("\n--- 2. Testing UPDATE ---");
        // Update the same teacher
        teacherService.updateTeacher(alice);
        // Output: "Teacher updated successfully!"


        System.out.println("\n--- 3. Testing REMOVE ---");
        teacherService.removeTeacher(10L);
        // Output: "Teacher removed successfully."


        System.out.println("\n--- 4. Testing GET BY ID ---");
        // Even though we ask for ID 999, your hardcoded Impl always returns "Athanasios"
        Teacher foundTeacher = teacherService.getTeacherById(999L);
        System.out.println("Found: " + foundTeacher);
        // Output: id=1, firstname=Athanasios, lastname=Androutsos


        System.out.println("\n--- 5. Testing GET ALL ---");
        // Your Impl returns a hardcoded array of 4 teachers
        Teacher[] allTeachers = teacherService.getAllTeachers();

        for (Teacher t : allTeachers) {
            System.out.println(t);
        }
        // Output: Will list Athanasios, Kostantinos, Vlospa, and Pantelis
    }
}