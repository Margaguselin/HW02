import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("enter the length of the rectangle: ");
    double length = scanner.nextDouble();

    System.out.print("enter the width of the rectangle: ");
    double width = scanner.nextDouble();

    double perimeter = 2 * (length + width);
    double area = length * width;

    System.out.print("Rectangle perimeter: " + perimeter);
    System.out.print("Rectangle area: " + area);

 }
}