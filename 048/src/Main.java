public class Main {

    public static void main(String[] args) {
        int[][] testA = {{1,2,3}, {4,5,6},{7,8,9}};
        int[][] testB = {{5,1,9,11}, {2,4,8,10},{13, 3, 6, 7},{15,14,12,16}};
        Solution solution = new Solution();
        printMatrix(testA);
        solution.rotate(testA);
        printMatrix(testA);

        printMatrix(testB);
        solution.rotate(testB);
        printMatrix(testB);
    }

    public static void printMatrix(int[][] matrix) {
        for (var line : matrix) {
            for (var a : line) {
                System.out.print(a);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
