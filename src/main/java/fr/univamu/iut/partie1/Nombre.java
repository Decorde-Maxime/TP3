package fr.univamu.iut.partie1;

/**
 * Created by d16013755 on 08/11/17.
 */
public class Nombre extends Expression {
    private int valeur;

    public Nombre(int valeur) {
        this.valeur = valeur;
    }

    public int getValeur(){
        return valeur;
    }

    @Override
    public double calculerValeur() {
        return valeur;
    }

    @Override
    public void accept(Traducteur traducteur) {
        traducteur.visit(= this);
    }
}
