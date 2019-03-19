public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] input = new int[7][];
        input[0] = new int[]{6,-7};
        input[1] = new int[]{-9,-3};
        input[2] = new int[]{10,6};
        input[3] = new int[]{-5,-8};
        input[4] = new int[]{-4,-10};
        input[5] = new int[]{-3,-10};
        input[6] = new int[]{2,-4};
        int[][] result = solution.kClosest(input, 6);
        for (int[] i : result ) {
            System.out.print('[');
            System.out.print(i[0]);
            System.out.print(", ");
            System.out.print(i[1]);
            System.out.print("], ");
        }
    }
}
