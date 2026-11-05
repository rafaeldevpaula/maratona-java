package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Romildo");
        funcionario.setIdade(2);
        funcionario.setSalarios(new double[]{1200, 2000, 3000});
        funcionario.imprimir();
        System.out.println(funcionario.getMedia());
    }
}
