import java.util.Scanner;

public class gametictactoe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int data=3;
        char[][] ttc = new char[data][data];
        char xo;
        int baris,kolom,ttcslot;
        String hasil="error";
        boolean keluar=false;
        boolean gantiPemain = true;
        String pemain1,pemain2;
        ttcslot=data*data;

        System.out.print("Nama Pemain X: ");
        pemain1 = input.nextLine();
        System.out.print("Nama Pemain O: ");
        pemain2 = input.nextLine();

        for (int i = 0; i < ttc.length; i++) {
            for (int j = 0; j < ttc.length; j++) {
                ttc[i][j] = '-';
            }
        }

        do {

            System.out.println("Papan saat ini: ");
            for (int i = 0; i < ttc.length; i++) {
                for (int j = 0; j < ttc.length; j++) {
                    System.out.print(ttc[i][j]+" ");
                }
                System.out.println();
            }

            for (int i = 0; i < ttc.length; i++) {
                if (ttc[i][0]=='X' && ttc[i][1]=='X' && ttc[i][2]=='X' || ttc[0][i]=='X' && ttc[1][i]=='X' && ttc[2][i]=='X' || ttc[0][0]=='X' && ttc[1][1]=='X' && ttc[2][2]=='X'|| ttc[0][2]=='X' && ttc[1][1]=='X' && ttc[2][0]=='X') {
                    keluar=true;
                    hasil="Win X";
                    break;  
                }
                if (ttc[i][0]=='O' && ttc[i][1]=='O' && ttc[i][2]=='O' || ttc[0][i]=='O' && ttc[1][i]=='O' && ttc[2][i]=='O' || ttc[0][0]=='O' && ttc[1][1]=='O' && ttc[2][2]=='O' || ttc[0][2]=='O' && ttc[1][1]=='O' && ttc[2][0]=='O') {
                    keluar=true;
                    hasil="Win O";
                    break;  
                }
                if (ttcslot==0) {
                    keluar=true;
                    hasil="Imbang";
                    break;
                }        
            }

            if (keluar) {
                break;
            }

            do {
                if (gantiPemain) {
                    xo = 'X';
                    System.out.println("Giliran "+pemain1);
                } else {
                    xo = 'O';
                    System.out.println("Giliran "+pemain2);
                }        
                System.out.print("Pada baris ke: ");
                baris = input.nextInt();
                System.out.print("Pada kolom ke: ");
                kolom = input.nextInt();
                
                if (baris>ttc.length || kolom>ttc.length) {
                    System.out.println("input baris/kolom 1-3");
                    continue;
                }


                if (ttc[baris-1][kolom-1]=='-') {
                    ttc[baris-1][kolom-1] = xo;
                    ttcslot--;
                    gantiPemain = !gantiPemain;
                    break;    
                } else {
                    System.out.println("sudah terisi");
                }
            } while (true);
        } while (true);

        System.out.println("hasil: "+hasil);
    }
}
