package com.hackerrank.chaitanya;

public class RotateImage {

    public static void main(String... args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        rotateImage(mat);
    }

    private static void rotateImage(int[][] mat) {
        for (int i=0; i< mat.length; i++) {
            for (int j=0; j < i; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        for (int i =0; i < mat.length; i++) {
            for (int j= 0; j < mat.length / 2; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[i][mat.length - j-1];
                mat[i][mat.length - j - 1] = temp;
            }
        }

        for (int i = 0; i< mat.length; i++) {
            for (int j = 0; j< mat.length; j++) {
                System.out.print(mat[i][j]);
            }
            System.out.println();
        }
    }
}
