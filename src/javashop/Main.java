package javashop;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BigDecimal prezzo = new BigDecimal("10.99");
        BigDecimal iva = new BigDecimal("22");
        Prodotto prod1 = new Prodotto("Palla", "Palla di cuoio grande", prezzo, iva);
        System.out.println("--- Prodotto prima dell'utilizzo dei metodi set ---");
        System.out.println("Nome: " + prod1.getNome());
        System.out.println("Codice: " + prod1.getCodice());
        System.out.println("Nome completo: " + prod1.getFullName());
        System.out.println("Descrizione: " + prod1.getDescrizione());
        System.out.println("Prezzo: " + prod1.getPrezzo() + "€");
        System.out.println("Prezzo più iva: " + prod1.getFullPrice() + "€");

        prod1.setNome("Palla di cuoio");
        prod1.setDescrizione("Palla di cuoio rossa grande");
        prod1.setIva(new BigDecimal("10"));
        prod1.setPrezzo(new BigDecimal("25.88"));

        System.out.println("--- Prodotto dopo dell'utilizzo dei metodi set ---");
        System.out.println("Nome: " + prod1.getNome());
        System.out.println("Codice: " + prod1.getCodice());
        System.out.println("Nome completo: " + prod1.getFullName());
        System.out.println("Descrizione: " + prod1.getDescrizione());
        System.out.println("Prezzo: " + prod1.getPrezzo() + "€");
//        System.out.println("Prezzo più iva: " + String.format("%.2f", prod1.getFullPrice()) + "€");
        System.out.println("Prezzo più iva: " + prod1.getFullPrice() + "€");
    }
}
