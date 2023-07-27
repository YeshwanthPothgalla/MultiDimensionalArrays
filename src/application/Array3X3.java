package application;

public class Array3X3 {
    public static void main(String[] args){
        int[][] matrix = {
                {1, 2, 3},
                {1,2,3},
                {1,2,3}
        };
        System.out.println(matrix[1][2]);
        System.out.println(matrix[1][1]);
        int sum = 0;

        for(int i=0; i<3; i++){
            System.out.print(matrix[i][i]);
            sum = sum + matrix[i][i];
        }
        System.out.println( );
        System.out.print(sum);
//        for(int[] lines:matrix){
//            for(int num:lines){
//                System.out.printf( "%s\t",num);
//            }
//            System.out.println();
//        }
//        for (int i=0; i< matrix.length; i++){
//            for(int j=0; j<matrix[i].length; j++){
//                System.out.printf( "%s\t",matrix[i][j]);
//            }
//            System.out.println();
//        }
    }
}
