import java.util.*;

class Solution {
    public int cutOffTree(List<List<Integer>> forest) {
        int h = forest.size();
        int w = forest.get(0).size();
        Queue<int[]> treeQ = new PriorityQueue<>(h * w, Comparator.comparingInt(a -> forest.get(a[0]).get(a[1])));
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (forest.get(i).get(j) > 1) treeQ.add(new int[]{i, j});
            }
        }

        int result = 0;
        boolean reachable = true;
        int[] start = new int[]{0 ,0};
        int[] target = new int[2];
        while(!treeQ.isEmpty() && reachable) {
            int[] next = treeQ.poll();
            System.out.print(next[0]);
            System.out.println(next[1]);
            target[0] = next[0];
            target[1] = next[1];
            // bfs find steps
            Queue<int[]> searchQ = new LinkedList<>();
            searchQ.add(start);
            int steps = 0;
            int count = 0;
            int qSize = searchQ.size();
            while(!searchQ.isEmpty()) {
                boolean[][] visited = new boolean[h][w];
                // record the queue size for adding step
                int[] current = searchQ.poll();
                int y = current[0];
                int x = current[1];
                if (current[0] == target[0] && current[1] == target[1]) {
                    // find 1 tree, break
                    start[0] = target[0];
                    start[1] = target[1];
                    break;
                }
                // not find yet
                visited[y][x] = true;
                count++;
                if (count == qSize) {
                    count = 0;
                    steps++;
                    qSize = searchQ.size();
                }
                if (y > 0 && !visited[y - 1][x] && forest.get(y-1).get(x) != 0) searchQ.add(new int[]{y-1,x});
                if (y < h-1 && !visited[y + 1][x] && forest.get(y+1).get(x) != 0) searchQ.add(new int[]{y+1,x});
                if (x > 0 && !visited[y][x - 1] && forest.get(y).get(x-1) != 0) searchQ.add(new int[]{y,x-1});
                if (x < w-1 && !visited[y][x + 1] && forest.get(y).get(x+1) != 0) searchQ.add(new int[]{y,x+1});
            }
            if (start[0] != target[0] || start[1] != target[1]) {
                reachable = false;
            } else {
                result += steps;
            }
        }
        if (!reachable) return -1;
        return result;
    }
}