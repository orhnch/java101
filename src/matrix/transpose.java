package matrix;

public class transpose {
    public static void main(String[] args) {
        int[][] original;
        original = new int[][]{{1,2,3},{4,5,6}};
        int[][] tranpose = new int[original[0].length][original.length];

        for (int i = 0; i < original.length; i++) {
            for (int j = 0; j < original[0].length; j++) {
                System.out.print(original[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("=================");
        System.out.println("Transponse of original matrix");

        for (int i = 0; i < tranpose.length; i++) {
            for (int j = 0; j < tranpose[0].length; j++) {
                tranpose[i][j]=original[j][i];
                System.out.print(tranpose[i][j]+" ");
            }
            System.out.println();
        }
    }
}
