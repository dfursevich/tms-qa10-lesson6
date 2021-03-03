import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        while (true) {
            System.out.println("Input array size: ");
            size = scanner.nextInt();
            if (size % 2 == 1) {
                System.out.println("Wrong array size");
            } else {
                break;
            }
        }

        System.out.println("size = " + size);

        double d = 4.0 / 3.0;
        double b = 5.0 / 3.0;
        System.out.println("d = " + d);
        System.out.printf("Число d = %.2f, b=%.2f", d, b);
        System.out.println();

        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i] + " ");
        }
    }
}
