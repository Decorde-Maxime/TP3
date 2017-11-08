package fr.univamu.iut.partie2;

import java.time.LocalDate;

/**
 * Created by d16013755 on 08/11/17.
 */
public class CalculDate {

    public static LocalDate ajouter(int nbJours) {
       return LocalDate.now().plusDays(nbJours);
    }
}
