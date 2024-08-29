import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] nums1 = { 9, 3, 9, 3, 9, 7, 9 };
        int[] nums2 = { 1, 2, 9, 2, 1};

        int num = solution(nums1);
        System.out.println(num);
    }

    public static int solution(int[] nums) {
        LinkedHashMap<Object, Integer> map = new LinkedHashMap<Object, Integer>();
        for (int n : nums) {
            if (map.containsKey(n)) {
                map.put(n, map.get(n) + 1);
            } else {
                map.put(n, 1);
            }
        }
        System.out.println(map);

        List<Integer> l = new ArrayList<Integer>();
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(entry -> {
            if (entry.getValue() == 1) {
                l.add(Integer.valueOf(entry.getKey().toString()));
            }
        });
        return l.get(0);
    }
}
