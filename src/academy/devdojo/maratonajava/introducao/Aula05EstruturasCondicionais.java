package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        int maioridade = 18;
        int idade = 15;

        if (idade >= maioridade){
            System.out.println("Liberado a comprar bebida alcoolica");
        }
        if (idade < maioridade){
            System.out.println("Nao esta liberado a comprar bebida alooolica");
        }
    }
}
