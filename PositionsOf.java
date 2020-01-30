import java.util.ArrayDeque;
import java.util.Scanner;

public class PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);

        int[][] matrix = new int[rows][cols];
        ArrayDeque<String> answers = new ArrayDeque<>();

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = scanner.nextInt();
            }
        }

        int number = scanner.nextInt();

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == number) {
                    String matchingPairs = row + " " + col;
                    answers.offer(matchingPairs);
                }
            }
        }

        if (answers.isEmpty()) {
            System.out.println("not found");
        }

        while (!answers.isEmpty()) {
            System.out.println(answers.poll() + " ");
        }
    }
}
