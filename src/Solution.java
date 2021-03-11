import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String key;

        while (!(key = reader.readLine()).equals("")) {
            Cat cat = CatFactory.getCatByKey(key);
            System.out.println(cat.toString());
        }
    }
}