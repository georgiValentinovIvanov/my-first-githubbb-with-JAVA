public class Main {
    public static void main(String[] args) {
        printTrianglePerimeterInput();
    }
    public static void printTrianglePerimeterInput() {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter side a size");
        int a = myObj.nextInt();

        System.out.println("Enter side b size");
        int b = myObj.nextInt();

        System.out.println("Enter side c size");
        int c = myObj.nextInt();

        int perimeter = a + b + c;

        System.out.println("Triangle Perimeter is: " + perimeter);
    }
}