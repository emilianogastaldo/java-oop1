package javabank;

import java.util.Random;

public class Conto {
//    ATTRIBUTI
    private int numConto;
    private String nomeProprietario;
    private double saldo;

//    COSTRUTTORI
    Conto(String nome){
        Random rand = new Random();
        numConto = rand.nextInt(1000);
        saldo = 0;
        nomeProprietario = nome;
    }
//    METODI
// Getter e setter
    public int getNumConto() {
        return numConto;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNomeProprietario() {
        return nomeProprietario;
    }

    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }

//    Metodi per variare il saldo
    public void addMoney(double money){
        saldo += money;
    }

    public void takeMoney(double money){
        saldo -= money;
    }
}
