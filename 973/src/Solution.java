class Solution {
    public int[][] kClosest(int[][] points, int K) {
        int l = points.length;
        int[][] result = new int[K][];
        helper(points, K, 0, l-1);
        for (int i = 0; i < K; i++) {
            result[i] = points[i];
        }
        return result;
    }

    private void helper(int[][] points, int K, int left, int right) {
        if (left >= right) return;
        int pivot = partition(points, left, right);
        if (pivot == K) return;
        if (pivot < K) helper(points, K,pivot + 1, right);
        if (pivot > K) helper(points, K, left, pivot - 1);
    }

    private int partition(int[][] points, int left, int right) {
        // choose last element as pivot
        int pivotDistance = getDistance(points[right]);
        int i = left;
        for (int j = left; j < right; j++) {
            if (getDistance(points[j]) < pivotDistance) {
                swap(points, i, j);
                i++;
            }
        }
        swap(points, i, right);
        return i;
    }

    private int getDistance(int[] point) {
        return point[0] * point[0] + point[1] * point[1];
    }

    private void swap(int[][] points, int i, int j) {
        int t0 = points[i][0], t1 = points[i][1];
        points[i][0] = points[j][0];
        points[i][1] = points[j][1];
        points[j][0] = t0;
        points[j][1] = t1;
    }
}