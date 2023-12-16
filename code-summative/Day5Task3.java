public class Day5Task3 {
    public static void main(String[] args) {
       String hari = "senin";

       switch (hari) {
        case "senin":
        case "selasa":
            System.out.println("Menggunakan seragam merah putih");    
            break;
        case "rabu":
        case "kamis":
            System.out.println("Menggunakan seragam batik");
            break;
        case "jum'at":
            System.out.println("Menggunakan seragam olahraga");
            break;
        case "sabtu":
            System.out.println("Menggunakan seragam pramuka");
            break;
        case "minggu":
            System.out.println("Sekolahnya libur");
            break;
        default:
            System.out.println("Masukkan nama harinya dengan benar");
            break;
       }
    }
}
