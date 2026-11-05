package academy.devdojo.maratonajava.javacore.Lclassesabstratas.test;

import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Desenvolvedor desenvolvedor = new Desenvolvedor("Zoro", 2000);
        System.out.println(desenvolvedor);

        Gerente gerente = new Gerente("Nami", 5000);
        System.out.println(gerente);

        desenvolvedor.imprime();
        gerente.imprime();
    }
}
