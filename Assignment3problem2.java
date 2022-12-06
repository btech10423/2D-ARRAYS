import java.util.*;

public class Assignment3problem2 {
    public static int sumof2ndrowinmatrix(int matrix[][]) {
        int sum = 0;

        for (int j = 0; j < matrix[0].length; j++) {
            sum += matrix[1][j];

        }
        System.out.print(sum);
        return sum;
    }

    public static void main(String args[]) {
        int matrix[][] = { { 1, 4, 9 },
                { 11, 4, 3 },
                { 2, 2, 3 } };
        sumof2ndrowinmatrix(matrix);
    }
}