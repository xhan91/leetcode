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
            int steps = 0;
            int count = 0;
            int qSize = 0;
            Queue<int[]> searchQ = new LinkedList<>();
            searchQ.add(start);
            while(!searchQ.isEmpty()) {
                // record the queue size for adding step
                qSize = q.size();
                int[] current = q.size()
            }
        }
    }
}
