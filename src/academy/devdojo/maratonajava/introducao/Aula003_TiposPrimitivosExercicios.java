package academy.devdojo.maratonajava.introducao;

/*
Pratica
Crie Váriaveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salário de <salário>, na data <>
 */

public class Aula003_TiposPrimitivosExercicios {
    public static void main(String[] args) {
        String nome = "Gustavo";
        String endereco = "Rio de Janiero";
        double salario = 5000.00;
        String data = "05/01/2025";

        System.out.println("Eu "+nome+" morando no endereço "+endereco+
                " confirmo que recebi o salário de R$"+salario+" na data "+data);
    }
}
