public class Day5Task14 {
    public static void main(String[] args) {
        Persegi persegi = new Persegi(5);
        persegi.hitungLuas();
        PersegiPanjang persegiPanjang = new PersegiPanjang(3,5);
        persegiPanjang.hitungLuas();
    }   
}

class BangunDatar {
    int luas;
    public void hitungLuas(){
        luas = 0;
    }

}

class Persegi extends BangunDatar{
    int sisi;
    public Persegi(int sisi){
        this.sisi = sisi;
    }

    @Override
    public void hitungLuas(){
        luas = sisi*sisi;
        System.out.println("Luas Persegi: " + luas);
    }
}

class PersegiPanjang extends BangunDatar{
    int panjang, lebar;
    public PersegiPanjang(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public void hitungLuas(){
        luas = panjang*lebar;
        System.out.println("Luas Persegi Panjang: " + luas);
    }
}


