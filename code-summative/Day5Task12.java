public class Day5Task12 {
    public static void main(String[] args) {
        Akar tumbuhan = new Akar();
        tumbuhan.air();
        tumbuhan.tanah();
        tumbuhan.akar();
    }
}


class Tumbuhan {
    void air(){
        System.out.println("Tumbuhan memerlukan air untuk tumbuh");
    }
}

class Pohon extends Tumbuhan {
    void tanah(){
        System.out.println("Pohon memerlukan tanah");
    }
}

class Akar extends Pohon {
    void akar(){
        System.out.println("Akar diperlukan pohon untuk menyerap air");
    }
}
