class Hewan {
    void makan() { 
        System.out.println("Hewan sedang makan."); 
    }
}

class Kucing extends Hewan {
    void suara() { 
        System.out.println("Meow!"); 
    }
}

class Anjing extends Hewan {
    void suara() { 
        System.out.println("Guk Guk!"); 
    }
}

public class Main {
    public static void main(String[] args) {
        Kucing kucing = new Kucing();
        Anjing anjing = new Anjing();

        kucing.makan(); // Memanggil metode dari superclass
        kucing.suara(); // Memanggil metode dari subclass

        anjing.makan(); // Memanggil metode dari superclass
        anjing.suara(); // Memanggil metode dari subclass
    }
}