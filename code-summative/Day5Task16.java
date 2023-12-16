class Persegi {
    int keliling;

    public Persegi() {
        keliling = 0;
    }

    public void hitungKeliling(){
        keliling = 0;
    }
}

class SegiEmpat extends Persegi{
    int sisi;

    public SegiEmpat(int sisi){
        this.sisi = sisi;
    }

    @Override
    public void hitungKeliling(){
        keliling = 4*sisi;
        System.out.println("keliling Persegi: " + keliling);
    }
}

class SegiPanjang extends Persegi{
    int panjang, lebar;
    public SegiPanjang(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public void hitungKeliling(){
        keliling = 2 * (panjang + lebar);
        System.out.println("Keliling Persegi Panjang: " + keliling);
    }
}


public class Day5Task16 {
    public static void main(String[] args) {
        Persegi persegi = new SegiEmpat(10);
        persegi.hitungKeliling();
        Persegi persegiPanjang = new SegiPanjang(2,5);
        persegiPanjang.hitungKeliling();
    }   
}





