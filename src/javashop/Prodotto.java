package javashop;

import java.util.Random;

public class Prodotto {
//    ATTRIBUTI
    private int codice;
    private String nome;
    private String descrizione;
    private double prezzo;
    private int iva;
//    COSTRUTTORI
    Prodotto(String nome, String descrizione, double prezzo, int iva){
        Random rand = new Random();
        codice = rand.nextInt(1000000);
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }
//    METODI
//  Getter e Setter:
//  Iva
    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }
//  Prezzo
    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }
//  Descrizione
    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }
//  Nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
//  Codice
    public String getCodice() {
        return String.format("%06d", iva);
    }
//  Metodo per il prezzo più iva:
    public double getPrezzoIva(){
        return prezzo + (prezzo * iva / 100);
    }

    public String fullName(){
        return codice + " " + nome;
    }
}
