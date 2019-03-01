import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        var solution = new Solution();
        var list1 = new LinkedList<String>();
        list1.add("leet");
        list1.add("code");
        System.out.println(solution.wordBreak("leetcode", list1));

        var list2 = new LinkedList<String>();
        list2.add("apple");
        list2.add("pen");
        System.out.println(solution.wordBreak("applepenapple", list2));

        var list3 = new LinkedList<String>();
        list3.add("cats");
        list3.add("dog");
        list3.add("sand");
        list3.add("and");
        list3.add("cat");
        System.out.println(solution.wordBreak("catsandog", list3));

        var list4 = new LinkedList<String>();
        list3.add("a");
        list3.add("aa");
        list3.add("aaa");
        list3.add("aaaa");
        list3.add("aaaaa");
        list3.add("aaaaaa");
        list3.add("aaaaaaa");
        list3.add("aaaaaaaa");
        list3.add("aaaaaaaaa");
        list3.add("aaaaaaaaaa");
        System.out.println(solution.wordBreak("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", list4));
    }
}
