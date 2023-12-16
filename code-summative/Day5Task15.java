public class Day5Task15 {
    public static void main(String[] args) {
        StudentLoker student = new StudentLoker();
        student.showInfo();
    }
}

class Student {
    String name = "Parni Handayai";
    int nim = 20000519;
}

class StudentLoker extends Student{
    int numLoker = 17;

    public void showInfo(){
        System.out.println("Nama: " + super.name);
        System.out.println("Nim: " + super.nim);
        System.out.println("Nomor Loker: " + numLoker);
    }
}