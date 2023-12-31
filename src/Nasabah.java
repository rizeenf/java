import java.util.ArrayList;
import java.util.Scanner;

public class Nasabah {
    static Scanner scanner = new Scanner(System.in);

    String nama;
    String userId;
    String alamat;
    String nomorRekening;

    Tabungan tabungan; 

    public Nasabah(String nama, String userId, String alamat) {
        this.nama = nama;
        this.userId = userId;
        this.alamat = alamat;
        this.nomorRekening = generateNomorRekening();
        this.tabungan = new Tabungan(0, 0); 
    }

    public Tabungan getTabungan() {
        return tabungan;
    }

    private static String generateNomorRekening() {
        return "BANK" + System.currentTimeMillis();
    }

    public static Nasabah tambahNasabah(Scanner scanner) {
        System.out.print("Nama: ");
        String nama = scanner.nextLine();

        System.out.print("User ID: ");
        String userId = scanner.nextLine();

        System.out.print("Alamat: ");
        String alamat = scanner.nextLine();
     
        Nasabah nasabah = new Nasabah(nama, userId, alamat);

        System.out.println("Nasabah berhasil ditambahkan.");

        return nasabah;
    }



    public static void infoNasabah(ArrayList<Nasabah> nasabahList) {

        if (nasabahList.isEmpty()) {
            System.out.println("Belum ada nasabah yang terdaftar.");
        } else {
            System.out.println("\n\n=================================================================");
            System.out.printf("%-15s %-15s %-15s %-25s \n", "USERID",
                    "NAMA", "ALAMAT", "NOREK");
            for (Nasabah nasabah : nasabahList) {
                    System.out.printf("%-15s %-15s %-15s %-25s \n",
                        nasabah.userId, nasabah.nama, nasabah.alamat,
                        nasabah.nomorRekening
                    );
            }
            System.out.println("=================================================================");

            System.out.print("Masukkan User ID nasabah : ");
            String userId = scanner.nextLine();

            Nasabah nasabah = findNasabah(userId, nasabahList);
            if (nasabah != null) {
                Tabungan tabungan = nasabah.getTabungan();

                int choice;
                do {
                    System.out.println("NASABAH \t : " + nasabah.nama);
                    System.out.println("SALDO \t \t : " + tabungan.getSaldo());
                    System.out.println("PINJAMAN \t : " + tabungan.getPinjaman());
                    System.out.println("==================MENU NASABAH===================\n1. Tambah Simpanan\n2. Tarik Simpanan\n3. Tambah Pinjaman\n4. Bayar Pinjaman\n5. Kembali\n========================================================================");
                    System.out.print("Pilih menu (1-5): ");
                    choice = scanner.nextInt();
                    scanner.nextLine();
        
                    switch (choice) {
                        case 1:
                            tabungan.tambahSaldo(Tabungan.addSaldo().getSaldo());

                            break;
                        case 2:
                            tabungan.tarikSaldo(Tabungan.addSaldo().getSaldo());

                            break;
                        case 3:
                            tabungan.tambahPinjaman(Tabungan.addPinjaman(tabungan.saldo).getPinjaman());

                            break;
                        case 4:
                            tabungan.bayarPinjaman(Tabungan.addPinjaman(tabungan.saldo).getPinjaman());

                            break;

                        case 5:
                            Nasabah.infoNasabah(nasabahList);

                            break;
                      
                        default:
                            System.out.println("Pilihan tidak valid.");
                    }
                    scanner.nextLine();  
                } while (choice != 5);

            } else {
                System.out.println("Nasabah dengan User ID " + userId +
                        " tidak ditemukan.");
            }

        }
    }

    public static void hapusNasabah(ArrayList<Nasabah> nasabahList, Scanner scanner) {
        System.out.print("Masukkan User ID nasabah yang akan dihapus: ");
        String userId = scanner.nextLine();

        Nasabah nasabah = findNasabah(userId, nasabahList);
        if (nasabah != null) {
            nasabahList.remove(nasabah);
            System.out.println("Nasabah dengan User ID " + userId +
                    " berhasil dihapus.");
        } else {
            System.out.println("Nasabah dengan User ID " + userId +
                    " tidak ditemukan.");
        }
    }

    public static Nasabah findNasabah(String userId, ArrayList<Nasabah> nasabahList) {
        for (Nasabah nasabah : nasabahList) {
            if (nasabah.userId.equals(userId)) {
                return nasabah;
            }
        }
        return null;
    }
}
