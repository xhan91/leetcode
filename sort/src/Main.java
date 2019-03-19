public class Main {

    public static void main(String[] args) {

//        Sorter sorter = new QuickSorter();
        Integer[] array = new Integer[]{13, 7, 6, 102, 21, 45, 21, 9, 101, 102};
        sorter.sort(array);

        for (Integer i : array) {
            System.out.print(i);
            System.out.print(' ');
        }
    }
}
