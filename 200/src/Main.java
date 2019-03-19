public class Main {

    public static void main(String[] args) {
        char[][] input = new char[4][];
        input[0] = new char[]{'1','1','1','1','0'};
        input[1] = new char[]{'1','1','0','1','0'};
        input[2] = new char[]{'1','1','0','0','0'};
        input[3] = new char[]{'0','0','0','0','0'};

        Solution solution = new Solution();
        System.out.println(solution.numIslands(input));
    }
}
