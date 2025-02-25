import java.util.Scanner;

public class tictactoe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char[][] ttc = new char[3][3];
        char xo;
        int baris,kolom;
        boolean hasil=false;
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
                if (ttc[i][0]=='X' && ttc[i][1]=='X' && ttc[i][2]=='X' || ttc[0][i]=='X' && ttc[1][i]=='X' && ttc[2][i]=='X') {
                    hasil=true;
                    break;  
                }
                if (ttc[i][0]=='O' && ttc[i][1]=='O' && ttc[i][2]=='O' || ttc[0][i]=='O' && ttc[1][i]=='O' && ttc[2][i]=='O') {
                    hasil=true;
                    break;  
                }
                
            }

            if (hasil) {
                System.out.println("win");
                break;
            }

            do {
                do {
                    System.out.print("Masukan X/O: ");
                    xo = input.next().charAt(0);
                    if (Character.toUpperCase(xo)=='X' || Character.toUpperCase(xo)=='O') {
                       break; 
                    } else {
                        System.out.println("Harap masukan X/O");
                    }
                    
                } while (true);
                System.out.print("Pada baris ke: ");
                baris = input.nextInt();
                System.out.print("Pada kolom ke: ");
                kolom = input.nextInt();
                
                if (baris>ttc.length || kolom>ttc.length) {
                    System.out.println("input baris/kolom 1-3");
                    continue;
                }

                if (ttc[baris-1][kolom-1]=='-') {
                    ttc[baris-1][kolom-1] = Character.toUpperCase(xo);
                    break;    
                } else {
                    System.out.println("sudah terisi");
                }
            } while (true);
        } while (true);

    }
}
