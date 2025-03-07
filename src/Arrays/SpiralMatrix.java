package Arrays;

import java.util.*;

public class SpiralMatrix {
    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
        System.out.println();
    }

    static void printSpiralorder(int[][] matrix, int r, int c) {
        int toprow = 0, bottomrow = r - 1, leftcol = 0, rightcol = c - 1;
        int totalelements = 0;

        while (totalelements < r * c) {
            //toprow -> leftcol to rightcol
            for (int j = leftcol; j <= rightcol && totalelements < r * c; j++) {
                System.out.print(matrix[toprow][j] + " ");
                totalelements++;
            }
            toprow++;

            //rightcol -> toprow to bottomrow
            for (int i = toprow; i <= bottomrow && totalelements < r * c; i++) {
                System.out.print(matrix[i][rightcol] + " ");
                totalelements++;
            }
            rightcol--;

            //bottomrow ->rightcol to leftcol
            for (int j = rightcol; j >= leftcol && totalelements < r * c; j--) {
                System.out.print(matrix[bottomrow][j] + " ");
                totalelements++;
            }
            bottomrow--;

            //leftcol ->bottomrow to toprow
            for (int i = bottomrow; i >= toprow && totalelements < r * c; i--) {
                System.out.print(matrix[i][leftcol] + " ");
                totalelements++;
            }
            leftcol++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Rows : ");
        int r = sc.nextInt();

        System.out.print("Enter the number of Columns : ");
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];
        int total = r * c;

        System.out.println("Enter " + total + " Values : ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Input Matrix");
        printMatrix(matrix);

        System.out.println("Spiral Order");
        printSpiralorder(matrix, r, c);
    }
}
