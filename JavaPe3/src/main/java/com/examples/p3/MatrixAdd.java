package com.examples.p3;

import java.util.Scanner;

public class MatrixAdd {

    public int [][] matAdd(int mat1[][],int mat2[][],int row,int col,int sum[][]){


        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                sum[i][j]= mat1[i][j]+mat2[i][j];
            }

        }
       return sum;

    }


    public static void main(String args[]){
        MatrixAdd obj =new MatrixAdd();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter no of rows and columns");
        int row = scan.nextInt();
        int col = scan.nextInt();
        int mat1[][] = new int[row][col];
        int mat2[][] = new int[row][col];
        int sum[][] = new int[row][col];



        System.out.println("Enter the values of first matrix");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                mat1[i][j]= scan.nextInt();
            }

        }
        System.out.println("Enter the values of second matrix");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                mat2[i][j]= scan.nextInt();
            }

        }
        sum= obj.matAdd(mat1,mat2,row,col,sum);

        System.out.println("Sum of two matrix");

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();

        }
    }
}
