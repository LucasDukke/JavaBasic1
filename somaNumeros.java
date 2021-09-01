import java.util.Scanner;
public class SomaNumeros {
    public static void main(String[] args) {
            System.out.println("### Programa que soma números ###");
            
            Scanner input = new Scanner(System.in);

            System.out.println("Por obiséquio, digite um número");
            int numero1 = input.nextInt(); //cria a variável "Número" que o usuário digitou

            System.out.println("Por obiséquio, digite um número (The Sequel)");
            int numero2 = input.nextInt(); //cria a variável "Número" que o usuário digitou

            int soma = numero1 + numero2;

            System.out.println("A soma dos numeros é: " + soma);

            input.close();
    }
}