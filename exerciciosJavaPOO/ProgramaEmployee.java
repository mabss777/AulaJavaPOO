import java.util.Scanner;

public class ProgramaEmployee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee funcionario = new Employee();

        System.out.println("Name: ");
        funcionario.name = scanner.nextLine();
        System.out.println("Gross Salary: ");
        funcionario.grossSalary = scanner.nextDouble();
        System.out.println("Tax: ");
        funcionario.tax = scanner.nextDouble();
        
        System.out.println("\nFuncionario: "+funcionario.name);
        System.out.println("Digite o percentual de aumento: ");
        double percentual = scanner.nextDouble();
        funcionario.increaseSalary(percentual);

        System.out.println("\nDados Atualizados: "+funcionario);
        scanner.close();
    }
    
}
