import java.util.*;

public class Searchinsortedmatrix {
    public static boolean staircasesearch(int matrix[][], int key) {
        int row = 0, col = matrix.length - 1;
        while (row < matrix.length && col >= 0) {
            if (key == matrix[row][col]) {
                System.out.print("found at" + "(" + row + "," + col + ")");
                return true;
            } else if (key < matrix[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        System.out.print("not found");
        return false;

    }

    public static void main(String args[]) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        staircasesearch(matrix, 10);
    }
}
