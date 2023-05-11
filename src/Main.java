public class Main {
    public static void main(String[] args) {
        printName();
    }
    public static void printName() {
        String firstName = "Dimitar";
        String middleName = "Nikolaev";
        String lastName = "Tarkalanov";

        String fullName = firstName + " " + middleName + " " + lastName;

        System.out.println(fullName);
    }
}