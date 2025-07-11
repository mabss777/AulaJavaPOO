import java.util.Scanner;

public class ProgramaAlunos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Alunos aluno1 = new Alunos();
        
        System.out.println("Digite o seu nome: ");
        aluno1.name = scanner.nextLine();
        
        System.out.println("Digite a nota do 1 trimestre: ");
        aluno1.grade1 = scanner.nextDouble();

        System.out.println("Digite a nota do 2 trimestre: ");
        aluno1.grade2 = scanner.nextDouble();

        System.out.println("Digite a nota do 3 trimestre: ");
        aluno1.grade3 = scanner.nextDouble();

       System.out.println(aluno1.passOrFailed());

       scanner.close();
        }
}
