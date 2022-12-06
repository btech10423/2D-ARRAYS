import java.util.*;

public class Assignment3problem3 {
    public static void transposeofmatrix(int matrix[][]) {
        int Transposematrix[][] = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                Transposematrix[i][j]=matrix[j][i];
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            System.out.println();
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(Transposematrix[i][j]+" ");
            }
        } 
    }

    public static void main(String args[]) {
        int matrix[][] = { { 1, 4, 9 },
                { 11, 4, 3 },
                { 2, 2, 3 } };
        transposeofmatrix(matrix);
    }
}
