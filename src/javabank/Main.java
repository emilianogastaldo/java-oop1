package javabank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("A che nome intestiamo il conto in banca?");
        String nome = scanner.nextLine();
        Conto conto = new Conto(nome);

        while(true){
            System.out.println("Vuoi depositare, ritare denaro oppure uscire? [D/R/U]");
            String input = scanner.nextLine().trim().toUpperCase();
            if(input.equals("D")){
                System.out.println("Quanto vuoi depositare?");
                double money = Double.parseDouble(scanner.nextLine());
                if (money > 0){
                conto.addMoney(money);
                System.out.println("Ora il tuo conto ha: "+conto.getSaldo()+"€.");
                } else {
                    System.out.println("Mi dispiace, non può depositare cifre inferiori o uguali a 0.");
                }
                System.out.println("Il credito attuale di "+conto.getNomeProprietario()+" è di: "+conto.getSaldo()+"€.");
            } else if(input.equals("R")){
                System.out.println("Quanto vuoi ritirare?");
                double money = Double.parseDouble(scanner.nextLine());
                if(money > 0){
                    if(money > conto.getSaldo()){
                        System.out.println("Mi dispiace, non hai abbastanza credito per ritirare " + money + "€.");
                    } else{
                        conto.takeMoney(money);
                    }
                } else {
                    System.out.println("Mi dispiace, non può depositare cifre inferiori o uguali a 0.");
                }
                System.out.println("Il credito attuale di "+conto.getNomeProprietario()+" è di: "+conto.getSaldo()+"€.");
            } else if (input.equals("U")){
                System.out.println("Grazie e arrivederci.");
                break;
            } else{
                System.out.println("Perfavore scrivi D se vuoi depositare, R se vuoi ritirare o U per uscire.");
            }
        }


    }
}
