import java.util.Random;
import java.util.Scanner;

public class gbk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        
        String[] data = {"Gunting","Batu","Kertas"};
        String kamu;
        String hasil="";

        

        do {
            int indexRandom = random.nextInt(data.length);
            String bot = data[indexRandom];
            System.out.print("Ketik Gunting/Batu/Kertas: ");
            kamu = input.nextLine();
    
            if (kamu.equalsIgnoreCase("Gunting") && bot.equals("Kertas") || 
                kamu.equalsIgnoreCase("Batu") && bot.equals("Gunting") ||
                kamu.equalsIgnoreCase("Kertas") && bot.equals("Batu")) {
                hasil = "Kamu Menang";
            } else if (kamu.equalsIgnoreCase("Gunting") && bot.equals("Batu") ||
                       kamu.equalsIgnoreCase("Batu") && bot.equals("Kertas") ||
                       kamu.equalsIgnoreCase("Kertas") && bot.equals("Gunting")) {
                hasil = "Njir kalah sama bot goblok";     
            } else if (kamu.equalsIgnoreCase(bot)) {
                hasil = "Seri";
            }
    
            System.out.println("Kamu: "+kamu);
            System.out.println("Bot: "+bot);
            System.out.println("Hasil: "+hasil);
        } while (true);

    }
}
