public class Day5Task13 {
    public static void main(String[] args) {
        System.out.println(sum(5,9,7));
        System.out.println(sum(4,7));
        System.out.println(sum("parni", "handayani"));
    }

    static int sum (int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    static int sum (int num1, int num2){
        return num1 + num2;
    }

    static String sum (String kata1, String kata2){
        return kata1 + " " + kata2;
    }
}

/*Output:
    21
    11
    parni handayani
 */
