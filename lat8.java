// Interface Kendaraan
interface Kendaraan {
    void berjalan();
}

// Implementasi pertama: Mobil
class Mobil implements Kendaraan {
    @Override
    public void berjalan() {
        System.out.println("Mobil berjalan dengan roda 4.");
    }
}

// Implementasi kedua: Motor
class Motor implements Kendaraan {
    @Override
    public void berjalan() {
        System.out.println("Motor berjalan dengan roda 2.");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Kendaraan kendaraan1 = new Mobil();
        Kendaraan kendaraan2 = new Motor();

        kendaraan1.berjalan(); // Memanggil metode berjalan() dari Mobil
        kendaraan2.berjalan(); // Memanggil metode berjalan() dari Motor
    }
}