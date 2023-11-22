class Mobil {
    // Atribut
    String jenis;
    String warna;
    int kecepatan;

    public Mobil(String jenis, String warna, int kecepatan) {
        this.jenis = jenis;
        this.warna = warna;
        this.kecepatan = kecepatan;
    }

    // Metode untuk menyalakan mobil
    public void nyala() {
        System.out.println("Mobil dinyalakan.");
    }

    // Metode untuk mempercepat mobil
    public void percepat(int tambahKecepatan) {
        this.kecepatan += tambahKecepatan;
        System.out.println("Mobil dipercepat menjadi " + this.kecepatan + " km/jam.");
    }
}

public class Contoh_UTS {
    public static void main(String[] args) {
        // Membuat objek "mobil1" dari kelas "Mobil"
        Mobil mobil1 = new Mobil("Sedan", "Merah", 0);

        // Menampilkan informasi awal mobil1
        System.out.println("Informasi Mobil 1:");
        System.out.println("Jenis: " + mobil1.jenis);
        System.out.println("Warna: " + mobil1.warna);
        System.out.println("Kecepatan: " + mobil1.kecepatan + " km/jam");
        System.out.println("");

        // Memanggil metode untuk menyalakan dan mempercepat mobil1
        mobil1.nyala();
        mobil1.percepat(20);

        // Menampilkan informasi setelah mobil1 dinyalakan dan dipercepat
        System.out.println("");
        System.out.println("Mobil 1 setelah dinyalakan dan dipercepat:");
        System.out.println("Kecepatan: " + mobil1.kecepatan + " km/jam");
    }
}