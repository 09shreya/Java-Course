public class ThreeDimensionalArray {
    public static void main(String[] args) {
        int n[][][]=new int[3][4][5];
        for( int i=0;i< n.length;i++) {
            for (int j = 0; j < n[i].length; j++) {
                for (int k = 0; k < n[i][j].length; k++) {
                    n[i][j][k] = (int) (Math.random() * 100);
                }
            }
        }
        for( int i=0;i<n.length;i++) {
            for (int j = 0; j < n[i].length; j++) {
                for (int k = 0; k < n[i][j].length; k++) {
                    System.out.print(n[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
