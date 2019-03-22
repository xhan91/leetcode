class Solution {
  public int cutOffTree(List<List<Integer>> forest) {
      int h = forest.size();
      int w = forest.get(0).size();
      Queue<int[]> treeQ = new PriorityQueue<>(h * w, (a, b) forest.get(b[0]).get(b[1]) - forest.get(a[0]).get(a[1]));
      for (int i = 0; i < h; i++) {
          for (int j = 0; j < w; j++) {
              if (forest.get(i).get(j) > 1) treeQ.add(new int[]{i, j});
          }
      }
      
      int result = 0;
      boolean reachable = true;
      int[] start = new int[]{0 ,0};
      while(!treeQ.isEmpty() && reachable) {
          int[] target = treeQ.poll();
          // bfs find steps
          boolean[][] visited = new boolean[h][w];
          Queue<int[]> searchQ = new LinkedList<>();
          searchQ.add(start);
          int steps = 0;
          int count = 0;
          int qSize = q.size();
          while(!searchQ.isEmpty()) {
              // record the queue size for adding step
              int[] current = q.poll();
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
              if (y > 1 && visites[y - 1][x] == false) searchQ.add(new int[]{});
              if (y < h-1 && visites[y + 1][x] == false) searchQ.add(new int[]{});
              if (x > 1 && visites[y][x - 1] == false) searchQ.add(new int[]{});
              if (x < w-1 && visites[y][x + 1] == false) searchQ.add(new int[]{});
              
          }
      }
  }
}