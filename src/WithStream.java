import java.util.Arrays;
import java.util.List;

public class WithStream {
    public static void main(String[] args) {
        List<String> nameList = Arrays.asList("Nancy", "Bob", "Craig", "David",
                "Evan", "Fray", "George", "Henry", "Ivory", "Jessica", "Kyle",
                "Lawrence", "Mike", "Alice");

        int cnt = (int) nameList.stream().filter(x -> x.contains("a")).count();

        System.out.println("count : " + cnt);

    }


}
