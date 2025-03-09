package EstruturasDeRepetição;

public class EstruturaFor {
    public static void main(String[] args) {
        String alunos [] = {"Felipe", "Julia", "jonas", "Marcos"};

        //Controle de array sempre começa com zero
        for (int i = 0; i < alunos.length; i++) {
            System.out.println(" O aluno no índice " + i + " é: " +alunos[i]);
        }
    }
    
}
