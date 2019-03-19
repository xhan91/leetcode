public class QuickSorter implements Sorter {

    @Override
    public <T extends Comparable> void sort(T[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private <T extends Comparable> void quickSort(T[] array, int left, int right) {
        if (left >= right) return;
        int pivot = partition(array, left, right);
        quickSort(array, left, pivot - 1);
        quickSort(array, pivot + 1, right);
    }

    private <T extends Comparable> int partition(T[] array, int left, int right) {
        T pivot = array[right]; // use last one as pivot
        int i = left;
        for (int j = left; j < right; j++) {
            if (array[j].compareTo(pivot) < 0) {
                swap(array, i, j);
                i++;
            }
        }
        swap(array, i, right);
        return i;
    }

    private <T> void swap(T[] array, int i, int j) {
        T tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}
