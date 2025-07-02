public class A1H5 {
    public static void main(String[] args) {
        
        int[][] matrix = new int[4][4];

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                matrix[i][j] = (int)(Math.round(Math.random())) ;
            }
        }

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
