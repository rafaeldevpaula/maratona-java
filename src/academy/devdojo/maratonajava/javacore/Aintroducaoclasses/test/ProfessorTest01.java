package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "milkovich";
        professor.idade = 22;
        professor.sexo = 'F';

        System.out.print(professor.nome + " ");
        System.out.print(professor.sexo+ " ");
        System.out.print(professor.idade);
    }
}
