import java.util.*;

// Class untuk menyimpan data dosen
class Dosen {
    String nidn, nama, email, prodi;
    int tahunMasuk;

    public Dosen(String nidn, String nama, String email, int tahunMasuk, String prodi) {
        this.nidn = nidn;
        this.nama = nama;
        this.email = email;
        this.tahunMasuk = tahunMasuk;
        this.prodi = prodi;
    }

    public int getMasaKerja() {
        int tahunSekarang = Calendar.getInstance().get(Calendar.YEAR);
        return tahunSekarang - tahunMasuk;
    }

    public void tampilkanData() {
        System.out.println("NIDN       : " + nidn);
        System.out.println("Nama       : " + nama);
        System.out.println("Email      : " + email);
        System.out.println("Program Studi : " + prodi);
        System.out.println("Masa Kerja : " + getMasaKerja() + " tahun");
        System.out.println("-----------------------------------");
    }
}