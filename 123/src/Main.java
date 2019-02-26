public class Main {
    public static void main(String[] args) {
        var solution = new Solution();
        var input1 = new int[]{3,3,5,0,0,3,1,4};
        System.out.println(solution.maxProfit(input1));
        var input2 = new int[]{1,2,3,4,5};
        System.out.println(solution.maxProfit(input2));
        var input3 = new int[]{7,6,4,3,1};
        System.out.println(solution.maxProfit(input3));
    }
}
