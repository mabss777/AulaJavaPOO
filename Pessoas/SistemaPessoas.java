import java.util.Scanner;

public class SistemaPessoas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    Pessoas pessoa1 = new Pessoas();
    Pessoas pessoa2 = new Pessoas();
    Pessoas pessoa3 = new Pessoas();
    Aluno aluno1 = new Aluno();
    Professor professor1 = new Professor();

        System.out.println("============== pessoa 1==============");

        System.out.println("Digite seu nome:");
        pessoa1.setNome(scanner.nextLine());

        System.out.println("Qual sua nacionalidade?");
        pessoa1.setNacionalidade(scanner.nextLine());

        System.out.println("Qual sua altura?");
        pessoa1.setAltura(scanner.nextDouble());

        System.out.println("Qual sua idade?");
        pessoa1.setIdade(scanner.nextInt());
        scanner.nextLine(); 

        System.out.println("Qual seu genero?");
        pessoa1.setGenero(scanner.nextLine());

        pessoa1.exibirInformacoes();

        System.out.println("============== pessoa 2 ==============");

        System.out.println("Digite seu nome:");
        pessoa2.setNome(scanner.nextLine());

        System.out.println("Qual sua nacionalidade?");
        pessoa2.setNacionalidade(scanner.nextLine());

        System.out.println("Qual sua altura?");
        pessoa2.setAltura(scanner.nextDouble());

        System.out.println("Qual sua idade?");
        pessoa2.setIdade(scanner.nextInt());
        scanner.nextLine(); 

        System.out.println("Qual seu genero?");
        pessoa2.setGenero(scanner.nextLine());

        pessoa2.exibirInformacoes();

        System.out.println("============== pessoa 3 ==============");

        System.out.println("Digite seu nome:");
        pessoa3.setNome(scanner.nextLine());

        System.out.println("Qual sua nacionalidade?");
        pessoa3.setNacionalidade(scanner.nextLine());

        System.out.println("Qual sua altura?");
        pessoa3.setAltura(scanner.nextDouble());

        System.out.println("Qual sua idade?");
        pessoa3.setIdade(scanner.nextInt());
        scanner.nextLine(); 

        System.out.println("Qual seu genero?");
        pessoa3.setGenero(scanner.nextLine());

        pessoa3.exibirInformacoes();

        System.out.println("============== aluno ==============");

        System.out.println("Digite seu nome:");
        aluno1.setNome(scanner.nextLine());

        System.out.println("Qual sua nacionalidade?");
        aluno1.setNacionalidade(scanner.nextLine());

        System.out.println("Qual sua altura?");
        aluno1.setAltura(scanner.nextDouble());

        System.out.println("Qual sua idade?");
        aluno1.setIdade(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Qual seu genero?");
        aluno1.setGenero(scanner.nextLine());

        System.out.println("Qual sua nota final?");
        aluno1.setNotaFinal(scanner.nextDouble());
        scanner.nextLine(); 

        System.out.println("Qual sua turma?");
        aluno1.setTurma(scanner.nextLine());

        System.out.println("Quem é seu regente?");
        aluno1.setRegente(scanner.nextLine());

     
        aluno1.exibirInformacoes();


        System.out.println("============== Professor ==============");

        System.out.println("Digite seu nome:");
        professor1.setNome(scanner.nextLine());

        System.out.println("Qual sua nacionalidade?");
        professor1.setNacionalidade(scanner.nextLine());

        System.out.println("Qual sua altura?");
        professor1.setAltura(scanner.nextDouble());

        System.out.println("Qual sua idade?");
        professor1.setIdade(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Qual seu genero?");
        professor1.setGenero(scanner.nextLine());

        System.out.println("Quantos anos de experiencia?");
        professor1.setAnosExperiencia(scanner.nextInt());

        System.out.println("Qual a carga horaria semanal?");
        professor1.setCargaHorariaSemanal(scanner.nextInt());

        System.out.print("Eh concursado? (sim ou nao): ");
        String resposta = scanner.next().toLowerCase();

        if (resposta.equals("sim")) {
         professor1.setConcursado(true);
        } else {
        professor1.setConcursado(false);
        }

        scanner.close();

        professor1.exibirInformacoes();

    }
}
