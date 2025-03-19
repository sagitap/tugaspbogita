class Hewan {
    String nama;

    // Konstruktor kelas Hewan
    Hewan(String nama) {
        this.nama = nama;
    }

    // Method untuk menampilkan informasi hewan
    void info() {
        System.out.println("Nama: " + nama);
    }

    // Method untuk makan
    void makan() {
        System.out.println(nama + " sedang makan.");
    }
}

class Kucing extends Hewan {
    // Konstruktor kelas Kucing
    Kucing(String nama) {
        super(nama); // Memanggil konstruktor superclass (Hewan)
    }

    // Method khusus untuk Kucing
    void suara() {
        System.out.println(nama + " berkata: Meow!");
    }

    void tidur() {
        System.out.println(nama + " sedang tidur.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Membuat objek Kucing
        Kucing kucing = new Kucing("Kitty");

        // Memanggil method-method yang dimiliki oleh Kucing
        kucing.info();   // Dari superclass Hewan
        kucing.makan();  // Dari superclass Hewan
        kucing.suara();  // Dari subclass Kucing
        kucing.tidur();  // Dari subclass Kucing
    }
}