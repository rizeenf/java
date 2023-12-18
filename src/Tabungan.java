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
        System.out.print("Masukkan nominal : ");
        double saldoAwal = scanner.nextDouble();

        System.out.print("Masukkan nominal : ");
        double pinjaman = scanner.nextDouble();

        Tabungan tabungan = new Tabungan(saldoAwal, pinjaman);

        return tabungan;
    }
    
    public static Tabungan addSaldo() {
        System.out.print("Masukkan nominal : ");
        double saldoAwal = scanner.nextDouble();

        double pinjaman = 0;

        Tabungan tabungan = new Tabungan(saldoAwal, pinjaman);

        return tabungan;
    }

    public static Tabungan addPinjaman(double saldo) {

        System.out.print("Masukkan nominal : ");
        double pinjaman = scanner.nextDouble();

        Tabungan tabungan = new Tabungan(saldo, pinjaman);

        return tabungan;
    }

    public double getSaldo(){
        return saldo;
    }
    
    public double getPinjaman(){
        return pinjaman;
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
        
        if (this.saldo < jumlah) {
            System.out.println("Saldo anda kurang, transaksi dibatalkan");
        }else{
            this.saldo -= jumlah;
            System.out.println("Saldo berhasil ditarik.");
        }
    }

    public void bayarPinjaman(double jumlah) {

        if(this.pinjaman < jumlah){
            System.out.println("Pembayaran pinjaman lebih, transaksi dibatalkan");
        }else{
            this.pinjaman -= jumlah;
            System.out.println("Pinjaman berhasil dibayar.");
        }
    }

}