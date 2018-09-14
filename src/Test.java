import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> nums = new ArrayList<>();
        List<String> nums2 = new ArrayList<>();
        nums2.add("1");
        nums.addAll(nums.size() -1, nums2);

    }
}
