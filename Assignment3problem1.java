import java.util.*;

public class Assignment3problem1 {
    public static int countnumberof7inmatrix(int matrix[][]) {
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 7) {
                    count++;
                }
            }
        }
        System.out.print(count);
        return count;
    }
     public static void main(String args[]) {
        int matrix[][]={{4,7,8},
                    {8,8,7}};
                    countnumberof7inmatrix(matrix);      
    }
}