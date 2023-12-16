public class Day5Task6 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++){
            if (i == 6){
                System.out.println("Skip iterasi");
                continue;
            }
            System.out.println("Tampil angka ke-" + i);
        }
    }
}
