package academy.devdojo.maratonajava.introducao;

public class Aula002_TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int idade = (int) 100000000000L; // forçando a entrada
        long numeroGrande = 100000L;
        double salarioDouble = 2000.0D;
        float salarioFloat = (float) 2500.0D;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0047';

        String nome = "Gustavo";

        System.out.println("A idade é " + idade);
        System.out.println(verdadeiro);
        System.out.println("char " + caractere);
        System.out.println("Meu nome é "+nome);
    }
}
