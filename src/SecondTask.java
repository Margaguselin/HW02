import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter weight: ");
        double weight = scanner.nextDouble();
        System.out.print("enter height: ");
        double height = scanner.nextDouble();

        double BMI = weight / (height * height);

        System.out.print("BMI: " + BMI);

    }
}
