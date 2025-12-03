package gr.aueb.cf.cf9.ch11;

public class Main {

    public static void main(String[] args) {

        Product milk = new Product(1L, "Milk A", "Light Milk", 1.5, 2, true);
        System.out.println(milk.getDescription());

        User user = new User();
        User andreas22 = new User(1L, "Andreas", "Papadopoulos", "andrew", "12345", true);

        System.out.println(andreas22.getUsername());
        System.out.println(andreas22.isActive());

        Student student = new Student();
        Student alice = new Student();
        Student bob = new Student();

        Student student2 = new Student(4, "Makis", "Kapetis");
        student2.setFirstname("Xrisostomos");

//        alice.id = 1;
//        bob.id = 2;
//        student.firstname = "George";

        alice.setId(1);
        alice.setFirstname("Alice");
        alice.setLastname("Wonderland");

        bob.setId(2);
        bob.setFirstname("Bob");
        bob.setLastname("Dylan");

        student.setId(3);
        student.setFirstname("Anna");
        student.setLastname("Karenina");

        System.out.println(alice.getId());
        System.out.println(alice.getFirstname());
        System.out.println(alice.getLastname());

        System.out.printf("Id: %d, Firstname: %s, Lastname: %s%n", bob.getId(), bob.getFirstname(), bob.getLastname());

        System.out.printf("Id: %d, Firstname: %s, Lastname: %s%n", student.getId(), student.getFirstname(), student.getLastname());

        System.out.println(Student.getStudentsCount());

    }

}
