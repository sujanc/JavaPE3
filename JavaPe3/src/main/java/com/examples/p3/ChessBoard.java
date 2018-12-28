package com.examples.p3;

public class ChessBoard {

    public void chess(){

        boolean flag = false;
        String borad[][] =new String[8][8];
        String white="WW|";
        String black="BB|";
        for(int i=0;i<8;i++)
        {
            flag = !flag;
            for(int j=0;j<8;j++)
            {
                flag =!flag;
                if(flag)
                borad[i][j]=black;
                else
                    borad[i][j]=white;
            }
        }
for(int i=0;i<8;i++)
{
    for(int j=0;j<8;j++)
        System.out.print(borad[i][j]);
    System.out.println();
}

    }





    public static void main(String args[]){
        ChessBoard obj =new ChessBoard();
        obj.chess();
    }
}
