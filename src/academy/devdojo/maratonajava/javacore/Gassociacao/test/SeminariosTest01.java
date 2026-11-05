package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class SeminariosTest01 {
    public static void main(String[] args) {
        Local local = new Local("Rua Montana");
        Aluno aluno = new Aluno("Romildo", 2);
        Professor professor = new Professor("milkovich", "tatuagem");
        Aluno[] alunosParaSeminarios = {aluno};
        Seminario seminario = new Seminario("Tatuar",alunosParaSeminarios, local);

        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);
        professor.imprime();
    }
}
