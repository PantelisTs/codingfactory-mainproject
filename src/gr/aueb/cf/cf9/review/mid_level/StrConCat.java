package gr.aueb.cf.cf9.review.mid_level;

public class StrConCat {
    public static void main(String[] args) {
        String name = "Alice";
        int age = 40;
        String message = Message(name, age);
        System.out.println(message);


    }

    public static String Message (String name, int age) {
        String message = "";
        message = "Hello, my name is " + name + " and I am " + age + " years old.";


        return message;
    }
}
