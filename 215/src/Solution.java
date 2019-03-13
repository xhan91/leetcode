import java.util.ArrayList;
import java.util.List;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        int size = nums.length;
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        int pivot = nums[0];
        int pivotCount = 0;
        for (int i = 0; i < size; i++) {
            if (nums[i] < pivot) {
                left.add(nums[i]);
            }
            if (nums[i] > pivot) {
                right.add(nums[i]);
            }
            if (nums[i] == pivot) {
                pivotCount++;
            }
        }
        if (right.size() == k - 1) {
            return pivot;
        }
        if (right.size() < k - 1 && right.size() + pivotCount > k - 1) {
            return pivot;
        }

        if (right.size() < k - 1) {
            return findKthLargest(listToArray(left), k - right.size() - pivotCount);
        }
        return findKthLargest(listToArray(right), k);
    }

    private int[] listToArray(List<Integer> a) {
        int size = a.size();
        int[] result = new int[size];
        Integer[] temp = a.toArray(new Integer[size]);
        for (int i = 0; i < size; i++) {
            result[i] = temp[i];
        }
        return result;
    }
}