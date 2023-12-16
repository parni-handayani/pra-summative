public class Day5Task101 {
    public static void main(String[] args) {
        Matematika matematika = new Matematika();
        BahasaInggris bahasaInggris = new BahasaInggris();

        System.out.println("Mata pelajaran di hari senin:");
        System.out.println("1. " + matematika.MataPelajaran());
        System.out.println("2. " + bahasaInggris.MataPelajaran());
    }
}

class Matematika extends Day5Task102 {
    String pelajaran;
    public String MataPelajaran(){
        pelajaran = "Matematika";
        return pelajaran;
    }
}

class BahasaInggris extends Day5Task102{
    String pelajaran;
    public String MataPelajaran(){
        pelajaran = "Bahasa Inggris";
        return pelajaran;
    }
}

/* Output:
    Mata pelajaran di hari senin:
    1. Matematika
    2. Bahasa Inggris
 */

