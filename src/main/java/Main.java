import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Ola! Digite sua senha");

    int senha = sc.nextInt();

    while (senha != 2022){
      System.out.println("Senha incorreta");
      System.out.println("Por favor digite novamente");
      senha = sc.nextInt();
    }

    if(senha == 2022){
      System.out.println("Acesso permitido");
    }
    
  
   sc.close();
  }

 
}