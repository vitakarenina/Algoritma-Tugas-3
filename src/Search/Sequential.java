package Search;

import java.util.Scanner;

public class Sequential {
    public static void main (String[] args){
        System.out.println("\t" + "***** SEQUENTIAL SEARCH *****" +"\n");
        String data[] = {"Galileo", "Archimedes", "Alkhawarizmi", "Aljabar", "Vita", "Tesla"};
        String key;
        
        System.out.println("Isi Data Adalah : ");
            for (int i = 0; i<data.length; i++){
                System.out.print(data[i] + " ");
            }
            
        System.out.println("");
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Data Yang Akan Dicari : ");
        key = input.nextLine();
        
        System.out.println("");
        System.out.println("");
        for (int i = 0; i<data.length; i++){
            if (key.equalsIgnoreCase(data[i])){
                System.out.print("Data " + key + " Berada di Indeks ke-" +i);
                break;
            }
        }
        System.out.println("\n");
        System.out.println("Vita Karenina");
    }
    
}
