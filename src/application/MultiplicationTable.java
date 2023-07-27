package application;

import java.util.Scanner;

/*
Multiplication table like this
1	2	3	4	5	6	7
2	4	6	8	10	12	14
3	6	9	12	15	18	21
4	8	12	16	20	24	28
5	10	15	20	25	30	35
6	12	18	24	30	36	42
7	14	21	28	35	42	49
*/

public class MultiplicationTable {
    public static void main(String[] args){
        int[][] table = new int[15][15];

//        Type:1

        for(int i=0; i< table.length;i++){
            int[] row = table[i];
            for(int j=0; j<row.length;j++){
                table[i][j]=(i+1)*(j+1);
                System.out.printf("%s\t",table[i][j]);
            }
            System.out.println();

        }
//        Type:2
        for(int i=0; i< table.length;i++){
            int[] row = table[i];
            for(int j=0; j<row.length;j++){
                table[i][j]=(i+1)*(j+1);
                System.out.printf("%s\t",(i+1)*(j+1));
            }
            System.out.println();
        }
//        Type:3
        for(int i=0; i< table.length;i++){
            int[] row = table[i];
            for(int j=0; j<row.length;j++){
                row[j]=(i+1)*(j+1);
                System.out.printf("%s\t",row[j]);
            }
            System.out.println();
        }

//        Type:4
        for(int i=0; i< table.length;i++){
            int[] row = table[i];
            for(int j=0; j<row.length;j++){
                row[j]=(i+1)*(j+1);
            }
        }
        for(int[] row: table){
            for(int value:row){
                System.out.printf("%4d",value);
            }
            System.out.println();
        }
    }
}
