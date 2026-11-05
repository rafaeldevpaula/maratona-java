package academy.devdojo.maratonajava.introducao;
/*
Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salário de <salario>, na data <data>
 */
public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Rafael";
        String endereco = "Jardim florida";
        String data = "11/08/2026";
        double salario = 2000;
        String relatorio = "Eu "+nome+" morando no endereço "+endereco+", confirmo que recebi o salário de "+salario+", na data "+ data;
        System.out.println(relatorio);
    }
}
