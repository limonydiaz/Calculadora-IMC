import java.util.Scanner;

public class CalculadoraIMC {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
System.out.print("Introduce tu peso en kg: ");
double peso = teclado.nextDouble();

System.out.print("Introduce tu altura en metros: ");
double altura = teclado.nextDouble();

double imc = peso / (altura * altura);

System.out.printf("Tu IMC es: %.2f%n", imc);



    }

}
