import java.util.Scanner;

public class Nasabah {
    static Scanner scanner = new Scanner(System.in);

    String nama;
    String userId;
    String alamat;
    String nomorRekening;


    public Nasabah(String nama, String userId, String alamat) {
      this.nama = nama;
      this.userId = userId;
      this.alamat = alamat;
      this.nomorRekening = generateNomorRekening();
    }

    private static String generateNomorRekening() {
      return "BANK" + System.currentTimeMillis();
    }

    public static Nasabah tambahNasabah() {
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

  



}
