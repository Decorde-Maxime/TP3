package fr.univamu.iut.partie1;

/**
 * Created by d16013755 on 08/11/17.
 */
public interface Traducteur {
    void visit(NoeudInterne o);
    void traduire(NoeudInterne o);

}
