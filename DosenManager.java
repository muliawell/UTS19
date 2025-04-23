import java.util.*;

class DosenManager {
    ArrayList<Dosen> daftarDosen = new ArrayList<>();

    public void tambahDosen(Dosen dosen) {
        daftarDosen.add(dosen);
    }

    public void tampilkanSemua() {
        for (Dosen d : daftarDosen) {
            d.tampilkanData();
        }
    }

    // Bubble Sort berdasarkan NIDN (ascending)
    public void urutkanBerdasarkanNIDN() {
        for (int i = 0; i < daftarDosen.size() - 1; i++) {
            for (int j = 0; j < daftarDosen.size() - i - 1; j++) {
                if (daftarDosen.get(j).nidn.compareTo(daftarDosen.get(j + 1).nidn) > 0) {
                    Dosen temp = daftarDosen.get(j);
                    daftarDosen.set(j, daftarDosen.get(j + 1));
                    daftarDosen.set(j + 1, temp);
                }
            }
        }
    }

    public void cariBerdasarkanNama(String namaCari) {
        boolean ditemukan = false;
        for (Dosen d : daftarDosen) {
            if (d.nama.equalsIgnoreCase(namaCari)) {
                d.tampilkanData();
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Dosen dengan nama " + namaCari + " tidak ditemukan.");
        }
    }

    public void urutkanBerdasarkanMasaKerja() {
        for (int i = 0; i < daftarDosen.size() - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < daftarDosen.size(); j++) {
                if (daftarDosen.get(j).getMasaKerja() > daftarDosen.get(maxIdx).getMasaKerja()) {
                    maxIdx = j;
                }
            }
            Collections.swap(daftarDosen, i, maxIdx);
        }
        System.out.println("Data dosen berhasil diurutkan berdasarkan masa kerja.");
    }
}
