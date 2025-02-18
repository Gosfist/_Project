import java.util.Scanner;

// menggunakan array dengan fungsi add dan remove judul buku

public class tokoBuku1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean keluar = true;
        String[][] dataLogin = {{"a"},{"a"}};
        int maxData = 100;
        int index = 0;
        String[][] addBuku = new String[maxData][maxData];
        // int[] hargaBuku = new int[maxData];

        System.out.println("==============================");
        System.out.println("Selamat Datang Di Toko Buku");
        System.out.println("==============================\n");
        System.out.println("Silakan Login terlebih dahulu");

        do {
            System.out.print("Username: ");
            String login = input.nextLine();
            System.out.print("Password: ");
            String pass = input.nextLine();
            if (login.equalsIgnoreCase(dataLogin[0][0]) && pass.equalsIgnoreCase(dataLogin[1][0])) {
                System.out.println("login Sukses\n");
                do {
                    System.out.println("Daftar menu admin");
                    System.out.println("1. Add buku");
                    System.out.println("2. list buku");
                    System.out.println("3. remove buku");
                    System.out.println("4. keluar");
                    System.out.print("Pilihan menu: ");
                    int Pilihan = input.nextInt(); 
                    input.nextLine();
                    if (Pilihan==1) {
                        System.out.print("Judul buku: ");
                        addBuku[index][0] = input.nextLine();
                        // System.out.print("Tahun rilis: ");
                        // addBuku[index][1] = input.nextLine();
                        // System.out.print("Harga buku: ");
                        // hargaBuku[index] = input.nextInt();
                        System.out.println("Buku berhasil di tambahkan\n");
                        index++;
                        continue;
                    } if (Pilihan==2) {
                        if (index==0) {
                            System.out.println("belum ada buku\n");
                            continue;
                        } else {
                            System.out.println("List buku");
                            for (int i = 0; i < index; i++) {
                                System.out.println((i+1)+". "+addBuku[i][0]);
                            }
                            System.out.println();
                            continue;
                        }

                    } if (Pilihan==3) {
                        do {
                            if (index==0) {
                                System.out.println("belum ada buku\n");
                                break;
                            } else {
                                System.out.println("List buku");
                                for (int i = 0; i < index; i++) {
                                    System.out.println((i+1)+". "+addBuku[i][0]);
                                }
                                System.out.print("Remove buku: ");
                                int removeBuku = input.nextInt() - 1;
                                input.nextLine(); 
                                if (removeBuku >= 0 && removeBuku<index) {
                                    for (int i = removeBuku; i < index; i++) {
                                        addBuku[i][0] = addBuku[i + 1][0];
                                        // addBuku[i][1] = addBuku[i + 1][1];
                                        // hargaBuku[i] = hargaBuku[i + 1];
                                    }    
                                    index--;
                                    System.out.println("Buku berhasil dihapus\n");
                                    break;
                                } else {
                                    System.out.println("Pilih nomer buku yang benar\n");
                                }
                            }
                        } while (true);
                    continue;
                    } if (Pilihan==4) {
                        keluar=false;
                        break;
                    } else {
                        System.out.println("Pilihan menu tidak valid");
                        continue;
                    }
                    } while (true);
                
            } else {
                System.out.println("Username / Password salah");
                continue;
            }
            
        } while (keluar);
        System.out.println("\nBy Wisnu");
    }
}