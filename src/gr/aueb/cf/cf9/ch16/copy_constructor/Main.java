package gr.aueb.cf.cf9.ch16.copy_constructor;

public class Main {
    public static void main(String[] args) {

        // 1. Δημιουργούμε την Αθήνα
        City athens = new City("Athens");

        // 2. Δημιουργούμε τον Νίκο που μένει στην Αθήνα
        Student nikos = new Student("Nikos", athens);

        // 3. Δημιουργούμε τον Πέτρο ΑΝΤΙΓΡΑΦΟΝΤΑΣ τον Νίκο (Copy Constructor)
        Student petros = new Student(nikos);

        // Τώρα έχουμε δύο φοιτητές.
        // Λόγω του Deep Copy, ο Πέτρος έχει ΔΙΚΗ ΤΟΥ "Αθήνα", όχι την ίδια με τον Νίκο.

        // 4. Ας αλλάξουμε την πόλη του Πέτρου (μέσω του city object)
        // Προσοχή: Επειδή έχουμε defensive copy στο getCity,
        // πρέπει να πάρουμε το αντίγραφο, να το αλλάξουμε και να το ξαναβάλουμε.
        City petrosCity = petros.getCity();
        petrosCity.setDescription("London");
        petros.setCity(petrosCity);

        System.out.println("Nikos City: " + nikos.getCity().getDescription());
        System.out.println("Petros City: " + petros.getCity().getDescription());
    }
}
