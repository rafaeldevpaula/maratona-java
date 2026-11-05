package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        /**
         * Dado um determinado salario anual eu quero saber qual o valor que eu tenho que pagar
         */
        double salarioAnual = 70000;
        double primeiraFaixa = 0.097;
        double segundaFaixa = 0.3735;
        double terceiraFaixa = 0.4950;
        Double taxaPagar = salarioAnual <= 34.712
                ? salarioAnual*primeiraFaixa
                : salarioAnual >= 34.813 && salarioAnual <= 68.507
                ? salarioAnual *segundaFaixa
                : salarioAnual *terceiraFaixa;
        System.out.println(taxaPagar);
    }
}
