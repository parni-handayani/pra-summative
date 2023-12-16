public class Day5Task171 implements Day5Task172, Day5Task173 {
    private Integer sizeCelana;
    private Integer sizeRok;

    public String SIZE_BAJU = "m";
    public String SIZE_ROMPI = "m";

    @Override
    public void sizeCelana(Integer size){
        this.sizeCelana = size;
    }

    @Override
    public void sizeRok(Integer size){
        this.sizeRok = size;
    }

    public Integer getSizeCelana(){
        return sizeCelana;
    }

    public Integer getSizeRok(){
        return sizeRok;
    }

    public static void main(String[] args) {
        Day5Task171 obj = new Day5Task171();
        System.out.println("Tinggi/Berat Badan (150-155cm/38-42kg): ");
        System.out.println("=== Siswa Laki-laki ===");
        System.out.println("Ukuran Baju: " + obj.SIZE_BAJU);
        System.out.println("Ukuran Rompi: " + obj.SIZE_ROMPI);
        obj.sizeCelana(100); 
        System.out.println("Ukuran celana: " + obj.getSizeCelana());

        System.out.println("=== Siswa Perempuan ===");
        System.out.println("Ukuran Baju: " + obj.SIZE_BAJU);
        System.out.println("Ukuran Rompi: " + obj.SIZE_ROMPI);
        obj.sizeCelana(85); 
        System.out.println("Ukuran celana: " + obj.getSizeCelana());
    }
}


