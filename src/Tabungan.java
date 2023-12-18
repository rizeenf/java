// import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class Tabungan {
    static Scanner scanner = new Scanner(System.in);

    
    double saldo;
    double pinjaman;

    public Tabungan() {
        
    }


    public Tabungan( double saldo, double pinjaman) {
        this.saldo = saldo;
        this.pinjaman = pinjaman;
    }

    public static Tabungan TambahTabungan() {
        System.out.print("Saldo Awal: ");
        double saldoAwal = scanner.nextDouble();

        double pinjaman = 0;

        Tabungan tabungan = new Tabungan(saldoAwal, pinjaman);

        return tabungan;
    }

    public double getSaldo(){
        return saldo;
    }
    
    public double getPinjaman(){
        return pinjaman;
    }


    public static void infoTabungan(ArrayList<Tabungan> tabunganList) {
        if (tabunganList.isEmpty()) {
            System.out.println("Belum ada nasabah yang terdaftar.");
        } else {
            System.out.println("\n\n=================================================================");
            System.out.printf("%-15s %-15s %-15s %-25s %-15s %-10s\n", "USERID",
                    "NAMA", "ALAMAT", "NOREK", "SALDO", "PINJAMAN");
            for (Tabungan tabungan : tabunganList) {
                System.out.printf("%-15s %-15s \n",
                        tabungan.saldo, tabungan.pinjaman
                        // , tabungan.alamat,
                        // tabungan.nomorRekening
                        // ,   %-15.2f %-10.2f
                        // nasabah.saldo,nasabah.pinjaman
                        
                        );
            }
            System.out.println("=================================================================");
        }
    }


    public void tambahSaldo(double jumlah) {
        this.saldo += jumlah;
        System.out.println("Saldo berhasil ditambahkan.");
    }

    public void tambahPinjaman(double jumlah) {
        this.pinjaman += jumlah;
        System.out.println("Pinjaman berhasil ditambahkan.");
    }

    public void tarikSaldo(double jumlah) {
        this.saldo -= jumlah;
        System.out.println("Saldo berhasil ditarik.");
    }

    public void bayarPinjaman(double jumlah) {
        this.pinjaman -= jumlah;
        System.out.println("Pinjaman berhasil dibayar.");
    }


}
