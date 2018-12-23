import java.util.Arrays;
import java.util.List;

public class WithoutStream {

    public static void main(String[] args) {

        List<String> nameList = Arrays.asList("Nancy", "Bob", "Craig", "David",
                "Evan", "Fray", "George", "Henry", "Ivory", "Jessica", "Kyle",
                "Lawrence", "Mike", "Alice");

        int cnt = 0;
        for(String name : nameList) {
            if(name.contains("a")) {
                cnt ++;
            }
        }

        System.out.println("count : " + cnt);

    }
}
