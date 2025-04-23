import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DosenManager manager = new DosenManager();

        manager.tambahDosen(new Dosen("001", "Budi", "budi@polinema.ac.id", 2015, "Informatika"));
        manager.tambahDosen(new Dosen("002", "Siti", "siti@polinema.ac.id", 2010, "Sistem Informasi"));
        manager.tambahDosen(new Dosen("003", "Maimunah", "Maimunah@polinema.ac.id", 2016, "Sistem Informasi"));
        manager.tambahDosen(new Dosen("004", "Yono", "Yono@polinema.ac.id", 2017, "Teknik Mesin"));
        manager.tambahDosen(new Dosen("005", "Fatimah", "Fatimah@polinema.ac.id", 2018, "Teknik Elektro"));

        int pilihan;
        do {
            System.out.println("\n===== Menu Sistem Dosen =====");
            System.out.println("1. Tampilkan Data Dosen");
            System.out.println("2. Urutkan Berdasarkan NIDN");
            System.out.println("3. Cari Dosen Berdasarkan Nama");
            System.out.println("4. Urutkan Berdasarkan Masa Kerja (Bonus)");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 1:
                    manager.tampilkanSemua();
                    break;
                case 2:
                    manager.urutkanBerdasarkanNIDN();
                    System.out.println("Data telah diurutkan berdasarkan NIDN.");
                    manager.tampilkanSemua();
                    break;
                case 3:
                    System.out.print("Masukkan nama dosen yang dicari: ");
                    String namaCari = sc.nextLine();
                    manager.cariBerdasarkanNama(namaCari);
                    break;
                case 4:
                    manager.urutkanBerdasarkanMasaKerja();
                    manager.tampilkanSemua();
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);

        sc.close();
    }
}
