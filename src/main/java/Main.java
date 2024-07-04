import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
    System.out.println("Digite seu nome:");
    String nome = sc.nextLine();
    System.out.println("Digite seu sobrenome:");
    String sobrenome = sc.nextLine();
    System.out.println("Digite sua idade:");
    int idade = sc.nextInt();
    System.out.println("Digite sua altura:");
    double altura = sc.nextDouble();
    System.out.println("Digite seu sexo:");
    String sexo = sc.nextLine();

    System.out.println("Olá " + nome   +   sobrenome +",fizemos uma breve analise das informações passadas e temos as seguintes informações a repassar");
    
    if (sexo.equals("masculino") ){
      double pesoIdeal = (72.7 * altura);
      System.out.println("O seu peso ideal é: " + pesoIdeal);
    }
     if (sexo.equals("feminino")){
       double pesoIdeal = (62.1 * altura);
       System.out.println("O seu peso ideal é:" + pesoIdeal);
     }
    sc.close();

  }

}