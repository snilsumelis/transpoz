public class Main {
    public static void main(String[] args) {
        int[][] matris = new int[][]{{1, 2, 3}, {4, 5, 6,}};

        System.out.println("The 2D array is: ");
        printarray(matris);
        System.out.println("The convert array is: ");
        printarray(transpoz(matris));
    }

    static void printarray(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int[][] transpoz(int[][] array){

        int row = array[0].length;
        int col = array.length;
        int[][] transpoz_matris = new int[row][col];

        for (int i = 0; i<array.length; i++){
            for (int j =0;j< array[0].length;j++ ){
                transpoz_matris[j][i] = array[i][j];
            }
        }
        return transpoz_matris;
    }
}