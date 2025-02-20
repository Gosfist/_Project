import java.util.Scanner;

public class hakAkses {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int maxBuku = 100;
        int dataMaster = 10;
        int indexMaster = 0;
        int indexBuku = 0;
        int adminIndex = -1;
        int pilihMenu;
        String[] masterAdmin = {"master","master"};
        String[][] dataAdmin = new String[dataMaster][dataMaster];
        String[][] dataBuku = new String[maxBuku][maxBuku];
        dataAdmin[9][0] = "1";
        dataAdmin[9][1] = "1";
        
        do {
            System.out.println("=========================");
            System.out.println("          Login");
            System.out.println("=========================");
            System.out.print("Username: ");
            String login = input.nextLine();
            System.out.print("Password: ");
            String password = input.nextLine();
            
            boolean isMasterAdmin = login.equalsIgnoreCase(masterAdmin[0]) && password.equalsIgnoreCase(masterAdmin[1]);
            boolean isAdmin = false;

            for (int i = 0; i < dataMaster; i++) {
                if (dataAdmin[i][0] != null && login.equalsIgnoreCase(dataAdmin[i][0]) && password.equalsIgnoreCase(dataAdmin[i][1])) {
                    isAdmin = true;
                    adminIndex = i;
                    break;
                }
            }

            if (isMasterAdmin) {
                do {
                    System.out.println("\nselamat datang MASTER");
                    System.out.println("1. Add Admin");
                    System.out.println("2. Remove Admin");
                    System.out.println("3. list Admin");
                    System.out.println("4. keluar");
                    System.out.print("Pilihan: ");
                    pilihMenu = input.nextInt();
                    input.nextLine();
 
                    if (pilihMenu==1) {
                        System.out.print("Username: ");
                        dataAdmin[indexMaster][0] = input.nextLine();
                        System.out.print("Password: ");
                        dataAdmin[indexMaster][1] = input.nextLine();
                        System.out.println("Admin berhasil ditambahkan");
                        indexMaster++;

                    } if (pilihMenu==2) {
                        System.out.println("List Admin");
                        for (int i = 0; i < dataMaster; i++) {
                            if (dataAdmin[i][0] != null && dataAdmin[i][1] !=null) {
                                System.out.println((i+1)+". "+"User: "+dataAdmin[i][0]+" || "+"Pass: "+dataAdmin[i][1]);
                            }
                        }
                        System.out.print("Remove Admin: ");
                        int removeAdmin = input.nextInt() - 1;
                        for (int i = removeAdmin; i < dataMaster-1; i++) {
                            dataAdmin[i][0] = dataAdmin[(i+1)][0];
                            dataAdmin[i][1] = dataAdmin[(i+1)][1];
                        }
                        System.out.println("Admin berhasil dihapus");
                        dataMaster--;
                    } if (pilihMenu==3) {
                        System.out.println("List Admin");
                        for (int i = 0; i < dataMaster; i++) {
                            if (dataAdmin[i][0] != null && dataAdmin[i][1] != null) {
                                System.out.println((i+1)+". "+"User: "+dataAdmin[i][0]+" || "+"Pass: "+dataAdmin[i][1]);    
                            }
                        }
                    } if (pilihMenu==4) {
                        System.out.println();
                        break;
                    }
                } while (true);
                continue;
                
            } if (isAdmin) {
                do {
                    System.out.println("\nselamat datang admin "+dataAdmin[adminIndex][0]);
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
                        if (indexBuku==0) {
                            System.out.println("Belum ada buku");
                            continue;
                        }
                        System.out.println("List buku");
                        for (int i = 0; i < maxBuku; i++) {
                            if (dataBuku[i][0] != null) {
                                System.out.println((i+1)+". "+dataBuku[i][0]);
                            }
                        }
                        System.out.print("Hapus buku: ");
                        int removeBuku = input.nextInt()-1;
                        for (int i = removeBuku; i < indexBuku; i++) {
                            dataBuku[i][0] = dataBuku[(i+1)][0];
                        }
                        System.out.println("Buku berhasil dihapus");
                        indexBuku--;
                    } if (pilihMenu==3) {
                        if (indexBuku==0) {
                            System.out.println("Belum ada buku");
                            continue;
                        }
                        System.out.println("List buku");
                        for (int i = 0; i < maxBuku; i++) {
                            if (dataBuku[i][0]!= null) {
                                System.out.println((i+1)+". "+dataBuku[i][0]);
                            }
                            
                        }
                    } 
                } while (true);
            } else {
                System.out.println("Username/Password Salah\n");
                break;
            }
        } while (true);
        
    }
}
