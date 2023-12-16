import java.util.ArrayList;

public class Day5Task8 {
    public static void main(String[] args) {
        ArrayList<String> hewan = new ArrayList<String>();
        hewan.add("kucing");
        hewan.add("ayam");
        hewan.add("ikan");
        hewan.add("kutu");
        hewan.add("rayap");

        String result = String.join(", ", hewan);
        System.out.println(result);
    }
}

// Output: kucing, ayam, ikan, kutu, rayap