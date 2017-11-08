package fr.univamu.iut.partie2;

import java.time.LocalDate;

/**
 * Created by d16013755 on 08/11/17.
 */
public abstract class Document {
    private String titre;
    private LocalDate dateRetour = null;

    public Document(String titre) {
        this.titre = titre;
        dateRetour = null;
    }

    public String getTitre() {
        return titre;
    }

    public LocalDate getDateRetour() {
        return dateRetour;
    }

    public void setDateRetour(LocalDate dateRetour) {
        this.dateRetour = dateRetour;
    }

    public abstract void accepter();
}
