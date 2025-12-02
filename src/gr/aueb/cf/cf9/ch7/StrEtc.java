package gr.aueb.cf.cf9.ch7;

public class StrEtc {
    public static void main(String[] args) {

        // Traverse as array
        String s = "Coding Factory";

        for (char ch : s.toCharArray()) {
            System.out.print(ch + " ");
        }
        System.out.println("\u2764");


        // Replace
        String firstname = "Maria-Helen";
        String simpleName = firstname.replace("-", " ");

        System.out.println(firstname);
        System.out.println(simpleName);


        // Concat
        String lastname = "Smith";
        String fullName1 = firstname + " " + lastname;
        String fullName2 = simpleName.concat(" ").concat(lastname);

        System.out.println(lastname);
        System.out.println(fullName1);
        System.out.println(fullName2);
    }


}
