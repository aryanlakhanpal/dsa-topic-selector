import java.util.ArrayList;
import java.util.List;

public class TopicSelection {
    public static int generatingRandom(List<String> l, int min, int max) {
        return (int) (Math.random() * (max - min) + min);
    }

    public static void main(String[] args) {

        List<String> all = List.of("Array + Arraylist", "String + StringBuilder", "Stack + Queue + Dequeue", "Bit Manipulation", "2D Array"
                , "HashMap + HashSet +Hashing", "LinkedHashMap +LinkedHashSet ", "TreeMap + TreeSet", "Java Oops", "Searching", "Sorting",
                "CollectionsClass + ArrayClass ", "Graphs", "Linked List", "Tree", "BST", "Heap", "Priority Queue", "GreedyAlgo + Comparable",
                "Backtracking+Recursion", "DynamicProgramming");

        List<String> rem = List.of("Array + Arraylist", "String + StringBuilder", "Stack + Queue + Dequeue", "Bit Manipulation", "2D Array"
                , "HashMap + HashSet +Hashing", "LinkedHashMap +LinkedHashSet ", "TreeMap + TreeSet", "Java Oops", "Searching", "Sorting",
                "CollectionsClass + ArrayClass ", "Graphs", "Linked List", "Tree", "BST", "Heap", "Priority Queue", "GreedyAlgo + Comparable",
                "Backtracking+Recursion", "DynamicProgramming");

        List<String> done = List.of();

        List<String> toDo = List.of("GreedyAlgo + Comparable", "Searching");

        int num = generatingRandom(rem, 0, all.size());

        System.out.println(rem.get(num));
        System.out.println(all.size());
    }
}
