package fr.univamu.iut.partie1;

public class Client {
    public static void main(String[] args) {
        public static void main (String[]args){
            Expression expression1 = new Nombre(5);
            Expression expression2 = new Nombre(6);

            Expression expression3 = new Nombre(2);
            Expression expression4 = new Nombre(7);

            Expression expression5 = new NoeudInterne('*', expression1, expression2);
            Expression expression6 = new NoeudInterne('+', expression3, expression4);

            Expression expression7 = new NoeudInterne('-', expression5, expression6);

            Traducteur TradFr = new TradFr();
            System.out.println(expression7.traduire(TradFr));
        }
    }
}