package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        // Dado um valor de um carro, descubra em quantas vezes ele pode ser parcelado
        // Condicao valorParcela >= 1000

        int valorMinParcela = 1000;
        int valorCarro = 30000;
        int totalParcelas = 0;
        double valorParcela;

        for (int i = 1; ; i++) {
            valorParcela = (double) valorCarro / i;

            if (valorParcela < valorMinParcela) {
                break;
            }

            totalParcelas += 1;

            System.out.println("A parcela " + totalParcelas +
                    " será de R$ " + valorParcela);
        }

        System.out.println("Total de parcelas: " + totalParcelas);
    }
}
