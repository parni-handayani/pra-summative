import java.util.HashMap;

public class Day5Task9 {
    public static void main(String[] args) {
        HashMap<Integer, String> handphone = new HashMap<Integer, String>();
        handphone.put(1, "Xiaomi");
        handphone.put(2, "Oppo");
        handphone.put(3, "Vivo");
        handphone.put(4, "Samsung");
        handphone.put(5, "Realme");

        for (String i : handphone.values()){
            System.out.println(i);
        }

        int result = 0;
        for (int i : handphone.keySet()){
            result += i;
        }
        System.out.println(result);
    }  
}

/*  Output:
    Xiaomi
    Oppo
    Vivo
    Samsung
    Realme
    15
 */
