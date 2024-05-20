package javashop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Prodotto {
//    ATTRIBUTI
    private int codice;
    private String nome;
    private String descrizione;
//    private double prezzo;
//    private int iva;
    private BigDecimal prezzo;
    private BigDecimal iva;
//    COSTRUTTORI
    Prodotto(String nome, String descrizione, BigDecimal prezzo, BigDecimal iva){
        this.codice = generateCode();
        this.nome = valueOrDefault(nome);
        this.descrizione = valueOrDefault(descrizione);
        this.prezzo = valueOrDefault(prezzo);
        this.iva = valueOrDefault(prezzo);
    }
//    METODI
//    Metodo per generare il code
    private int generateCode(){
        Random rand = new Random();
        return rand.nextInt(1,1000);
    }
// Metodi privati per controllare i valori che inserisco nel costruttore e nei metodi set
    private String valueOrDefault (String value){
        if(value == null || value.isEmpty()){
            return "N.D.";
        }
        return value;
    }
//    esempio di overload
    private BigDecimal valueOrDefault(BigDecimal value){
        if(value == null || value.compareTo(BigDecimal.ZERO) < 0){
            return BigDecimal.ZERO;
        }
        return value;
    }
//  Getter e Setter:
//  Iva
    public BigDecimal getIva() {
        return iva;
    }

    public void setIva(BigDecimal iva) {
        this.iva = valueOrDefault(iva);
    }
//  Prezzo
    public BigDecimal getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(BigDecimal prezzo) {
        this.prezzo = valueOrDefault(prezzo);
    }
//  Descrizione
    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = valueOrDefault(descrizione);
    }
//  Nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = valueOrDefault(nome);
    }
//  Codice
    public String getCodice() {
        return String.format("%06d", codice);
    }
//  Metodo per il prezzo più iva:
//    public double getPrezzoIva(){
//        return prezzo + (prezzo * iva / 100);
//    }
//Metodo per il prezzo pieno fatto con i BigDecimal
    public BigDecimal getFullPrice(){
        return prezzo.multiply(iva).add(prezzo).setScale(2, RoundingMode.HALF_EVEN);
    }
// Metodo per il nome esteso
    public String getFullName(){
        return String.format("%06d", codice)+ " " + nome;
    }
}
