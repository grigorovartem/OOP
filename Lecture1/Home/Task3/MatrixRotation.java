package Lecture1.Home.Task3;

public class MatrixRotation {
    public static void main(String[] args) {

        int[][] matrix = new int[10][10];

        fllMatrix(matrix);

        printMatrix(matrix);

        printMatrix(rotateMatrix90(matrix));

        //printMatrix(rotateMatrix180(matrix));

        //printMatrix(rotateMatrix270(matrix));

    }

    private static int[][] rotateMatrix270(int[][] matrix) {
        rotateMatrix90(rotateMatrix90(rotateMatrix90(matrix)));
        return matrix;
    }

    private static int[][] rotateMatrix180(int[][] matrix) {
        rotateMatrix90(rotateMatrix90(matrix));
        return matrix;
    }

    private static void fllMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = i*matrix.length+j;
            }
        }
    }

    private static int[][] rotateMatrix90(int[][] matrix) {
        for (int i = 0; i < matrix.length/2; i++) {
            for (int j = i; j < matrix[i].length-1-i; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][matrix[i].length-1-i];//
                matrix[j][matrix[i].length-1-i] = matrix[matrix[i].length-1-i][matrix[j].length-1-j];
                matrix[matrix[i].length-1-i][matrix[j].length-1-j] = matrix[matrix[j].length-1-j][i];
                matrix[matrix[j].length-1-j][i] = tmp;
            }
        }
        return matrix;
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println("");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(" \t" + matrix[i][j]);
            }
        }
        System.out.println("");
    }
}
