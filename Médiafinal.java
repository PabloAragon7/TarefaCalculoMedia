/**
 * @author pablo
 */

public class Médiafinal {
    public static void main(String args[]){

        mediaFinal4();

    }

    private static void mediaFinal4() {
        System.out.println("*** notas do aluno Beta ***");
        double nota1 = 7.5;
        System.out.println(nota1);
        double nota2 = 4.5;
        System.out.println(nota2);
        double nota3 = 8.5;
        System.out.println(nota3);
        double nota4 = 6.0;
        System.out.println(nota4);
        System.out.println("*** Media Final ***");
        double notafinal= (nota1+nota2+nota3+nota4)/4;
        System.out.println(notafinal);
        if (notafinal >=6) {
            System.out.println("Aprovado");}
        else {
            System.out.println("Reprovado");
        }
    }


}
