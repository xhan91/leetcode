import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<List<Integer>> input = new LinkedList<>();
        input.add(Arrays.asList(54581641,64080174,24346381,69107959));
        input.add(Arrays.asList(86374198,61363882,68783324,79706116));
        input.add(Arrays.asList(668150,92178815,89819108,94701471));
        input.add(Arrays.asList(83920491,22724204,46281641,47531096));
        input.add(Arrays.asList(89078499,18904913,25462145,60813308));

        Solution solution = new Solution();
        System.out.println(solution.cutOffTree(input));
    }
}
