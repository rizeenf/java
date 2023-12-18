import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n\n\n=============================== MENU ==================================\n1. Tambah nasabah\n2. Info nasabah\n3. Hapus nasabah\n4. Exit\n========================================================================");
            System.out.print("Pilih menu (1-4): ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    
                    break;
                case 2:

                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
            System.out.print("Tekan Enter untuk kembali ke menu utama...");
            scanner.nextLine();  
        } while (choice != 4);
    }}
