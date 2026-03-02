import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {
    public static void main(String[] args) {
        long start = System.nanoTime();
        Map<String,Integer> map1 = new HashMap<>();
        map1.put("8",2);
        map1.put("5",4);
        map1.put("2",9);
        map1.put("6",10);
        map1.put("7",12);
        map1.put("3",7);
        long end = System.nanoTime();

        long time1 = end - start;
        System.out.println("Hashmap : " + time1 + " ns");
        System.out.println(map1);

        start = System.nanoTime();
        Map<String,Integer> map2 = new TreeMap<>();
        map1.put("8",2);
        map1.put("5",4);
        map1.put("2",9);
        map1.put("6",10);
        map1.put("7",12);
        map1.put("3",7);
        end = System.nanoTime();
        long time2 = end - start;
        System.out.println("Treemap : " + time2 + " ns");
        System.out.println(map2);
    }
}