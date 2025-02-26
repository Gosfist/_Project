import java.util.Scanner;

public class tes {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int maxBuku = 100;
        int maxAdmin = 10;

        int indexBuku = 0;
        int pilihMenu;
        String[][] dataAdmin = new String[maxAdmin][maxAdmin];
        String[][] dataBuku = new String[maxBuku][maxBuku];
        dataAdmin[9][0] = "1";
        dataAdmin[9][1] = "1";
        
                do {
                    System.out.println("\nselamat datang admin");
                    System.out.println("1. Add buku");
                    System.out.println("2. Remove buku");
                    System.out.println("3. List buku");
                    System.out.print("Pilih menu: ");
                    pilihMenu = input.nextInt();
                    input.nextLine();    

                    if (pilihMenu>4) {
                        System.out.println("Menu tidak valid, Coba lagi");
                        continue;
                    }

                    if (pilihMenu==1) {
                        System.out.print("Nama buku: ");
                        dataBuku[indexBuku][0] = input.nextLine();
                        System.out.println("Buku berhasil ditambahkan");
                        indexBuku++;
                    
                    } if (pilihMenu==2) {
                        System.out.println("List buku");
                        for (int i = 0; i < maxBuku; i++) {
                            if (dataBuku[i][0] != null) {
                                System.out.println((i+1)+". "+dataBuku[i][0]);
                            }
                        }
                        System.out.print("Hapus buku: ");
                        int removeBuku = input.nextInt()-1;
                        for (int i = removeBuku; i < indexBuku; i++) {
                            dataBuku[i][0] = dataBuku[i+1][0];
                        }
                        System.out.println("Buku berhasil dihapus");
                        indexBuku--;
                    } if (pilihMenu==3) {
                        System.out.println("List buku");
                        for (int i = 0; i < maxBuku; i++) {
                            if (dataBuku[i][0]!= null) {
                                System.out.println((i+1)+". "+dataBuku[i][0]);
                            }
                            
                        }
                    } 
                } while (true);
            
        
    }
}
