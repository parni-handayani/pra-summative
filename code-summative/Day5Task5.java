public class Day5Task5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++){
            System.out.println("Tampil angka ke-" + i);
            if (i == 6){
                System.out.println("Keluar dari loop");
                break;
            }
        }
    }
}
