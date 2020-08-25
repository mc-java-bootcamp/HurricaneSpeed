import java.util.Scanner;

public class HurricaneSpeed {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the speed: ");
        int speed = input.nextInt();

        if (speed >= 157) {
            System.out.println("Category: 5");
        } else if (speed >= 130) {
            System.out.println("Category: 4");
        } else if (speed >= 111) {
            System.out.println("Category: 3");
        } else if (speed >=96) {
            System.out.println("Category: 2");
        } else {
            System.out.println("Category: 1");
        }

    }
}
