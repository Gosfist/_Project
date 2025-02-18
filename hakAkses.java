import java.util.Scanner;

public class hakAkses {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int data = 100;
        int maxAdmin = 10;
        int index = 0;
        String[] masterAdmin = {"master","master"};
        String[][] dataAdmin = new String[maxAdmin][maxAdmin];
        
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

            for (int i = 0; i < maxAdmin; i++) {
                if (dataAdmin[i][0] != null && login.equalsIgnoreCase(dataAdmin[i][0]) && password.equalsIgnoreCase(dataAdmin[i][1])) {
                    isAdmin = true;
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
                    int Pilih = input.nextInt();
                    input.nextLine();

                    if (Pilih==1) {
                        System.out.print("Username: ");
                        dataAdmin[index][0] = input.nextLine();
                        System.out.print("Password: ");
                        dataAdmin[index][1] = input.nextLine();
                        System.out.println("Admin berhasil ditambahkan");
                        index++;

                    } if (Pilih==2) {
                        System.out.println("List Admin");
                        for (int i = 0; i < maxAdmin; i++) {
                            if (dataAdmin[i][0] != null && dataAdmin[i][1] !=null) {
                                System.out.println((i+1)+". "+"User: "+dataAdmin[i][0]+" || "+"Pass: "+dataAdmin[i][1]);
                            }
                        }
                        System.out.print("Remove Admin: ");
                        int removeAdmin = input.nextInt() - 1;
                        for (int i = removeAdmin; i < maxAdmin-1; i++) {
                            dataAdmin[i][0] = dataAdmin[(i+1)][0];
                            dataAdmin[i][1] = dataAdmin[(i+1)][1];
                        }
                        System.out.println("Admin berhasil dihapus");

                    } if (Pilih==3) {
                        System.out.println("List Admin");
                        for (int i = 0; i < maxAdmin; i++) {
                            if (dataAdmin[i][0] != null && dataAdmin[i][1] != null) {
                                System.out.println((i+1)+". "+"User: "+dataAdmin[i][0]+" || "+"Pass: "+dataAdmin[i][1]);    
                            }
                        }
                    } if (Pilih==4) {
                        System.out.println();
                        break;
                    }
                } while (true);
                continue;
                
            } if (isAdmin) {
                System.out.println("\nselamat datang admin");
            } else {
                System.out.println("Username/Password Salah\n");
                break;
            }
        } while (true);
        
    }
}
