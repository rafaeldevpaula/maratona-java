package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("123456789");
        Pessoa pessoa = new Pessoa("Romildo");
        pessoa.setCpf("1234567890");
        pessoa.setEndereco(endereco);

        pessoa.imprime();
        Funcionario funcionario = new Funcionario("ruggine");
        funcionario.setCpf("30214234304");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(4500);

        funcionario.imprime();
    }
}
