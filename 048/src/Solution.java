import java.util.stream.IntStream;

class Solution {
    public void rotate(int[][] matrix) {
        var width = matrix.length;
        var nM = new int[width][];
        IntStream.range(0,width).forEach(i -> nM[i] = new int[width]);
        IntStream.range(0,width).forEach(i -> {
            IntStream.range(0,width).forEach(j -> {
                // i for y, j for x
                nM[i][j] = matrix[i][j];
            });
        });
        IntStream.range(0,width).forEach(i -> {
            IntStream.range(0,width).forEach(j -> {
                // i for y, j for x
                matrix[j][width - i - 1] = nM[i][j];
            });
        });
    }
}

//0,0 -> 0,2
//0,1 -> 1,2
//0,2 -> 2,2
//1,0 -> 0,1
//1,1 -> 1,1
//1,2 -> 2,1