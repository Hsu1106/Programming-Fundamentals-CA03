import java.util.Scanner;


public class FunctionLib {
    public static int getIntegerRange(String prompt, int min, int max) {
        Scanner scanner = new Scanner(System.in); // 使用本地變數
        int value;


        while (true) {
            System.out.print(prompt);
            try {
                value = Integer.parseInt(scanner.nextLine());
                if (value >= min && value <= max) {
                    return value;
                } else {
                    System.out.println("Sorry, please re-enter within range (" + min + ", " + max + ")");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }
    }
}
