import java.util.Scanner;

public class SomaDoisNumeros {
    
    public static void main(String[] args) {
        //declaração de variaveis
        //sistema de tipos estatico(compilador)
        Scanner leitor = new Scanner(System.in);
        double primeiroOperando, segundoOperando;

        //entrada
        System.out.println("Digite o pirmeiro operando");
        primeiroOperando = leitor.nextDouble();
        System.out.println("Digite o segundo operando");
        segundoOperando = leitor.nextDouble();

        //processamento
       double resultado = primeiroOperando + segundoOperando;

       //saida
       System.out.println(resultado);
    }
}
