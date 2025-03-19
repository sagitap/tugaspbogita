class Hewan {
    void makan() { 
        System.out.println("Hewan sedang makan."); 
    }
}

class Kucing extends Hewan {
    void suara() { 
        System.out.println("Meow!"); 
    }

    void tidur() {
        System.out.println("Kucing sedang tidur.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Membuat objek kucing
        Kucing kucing = new Kucing();
        
        // Memanggil method-method yang dimiliki oleh Kucing
        kucing.makan();  // Metode diwarisi dari Hewan
        kucing.suara();  // Metode dari class Kucing
        kucing.tidur();  // Metode tambahan di class Kucing
    }
}