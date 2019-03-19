import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int numIslands(char[][] grid) {
        if (grid == null) return 0;
        int height = grid.length;
        if (height == 0) return 0;
        int width = grid[0].length;
        if (width == 0) return 0;

        int count = 0;
        boolean[][] visited = new boolean[height][width];
        Queue<int[]> q = new LinkedList<>();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (grid[i][j] == '1' && !visited[i][j]) {
                    count++;
                    visited[i][j] = true;
                    q.add(new int[]{i,j});
                    while(!q.isEmpty()) {
                        // check up down left right, if '1' add to queue
                        int[] current = q.poll();
                        int[] ys = new int[]{current[0] - 1, current[0] + 1};
                        int[] xs = new int[]{current[1] - 1, current[1] + 1};
                        for (int y : ys) {
                            int x = current[1];
                            helper(grid, height, width, visited, q, x, y);
                        }
                        for (int x : xs) {
                            int y = current[0];
                            helper(grid, height, width, visited, q, x, y);
                        }
                    }
                }
            }
        }
        return count;
    }

    private void helper(char[][] grid, int height, int width, boolean[][] visited, Queue<int[]> q, int x, int y) {
        if (y >= 0 && y < height && x >= 0 && x < width && !visited[y][x] ) {
            visited[y][x] = true;
            if (grid[y][x] == '1') q.add(new int[]{y,x});
        }
    }
}