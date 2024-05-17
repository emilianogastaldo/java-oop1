package javashop;

public class Main {
    public static void main(String[] args) {
        Prodotto prod1 = new Prodotto("Palla", "Palla di cuoio grande", 10.99, 10);
        System.out.println("--- Prodotto prima dell'utilizzo dei metodi set ---");
        System.out.println("Nome: " + prod1.getNome());
        System.out.println("Codice: " + prod1.getCodice());
        System.out.println("Nome completo: " + prod1.fullName());
        System.out.println("Descrizione: " + prod1.getDescrizione());
        System.out.println("Prezzo: " + prod1.getPrezzo() + "€");
        System.out.println("Prezzo più iva: " + String.format("%.2f", prod1.getPrezzoIva()) + "€");

        prod1.setNome("Palla di cuoio");
        prod1.setDescrizione("Palla di cuoio rossa grande");
        prod1.setIva(22);
        prod1.setPrezzo(25.49);

        System.out.println("--- Prodotto dopo dell'utilizzo dei metodi set ---");
        System.out.println("Nome: " + prod1.getNome());
        System.out.println("Codice: " + prod1.getCodice());
        System.out.println("Nome completo: " + prod1.fullName());
        System.out.println("Descrizione: " + prod1.getDescrizione());
        System.out.println("Prezzo: " + prod1.getPrezzo() + "€");
        System.out.println("Prezzo più iva: " + String.format("%.2f", prod1.getPrezzoIva()) + "€");
    }
}
