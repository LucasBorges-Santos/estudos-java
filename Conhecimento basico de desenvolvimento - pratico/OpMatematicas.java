import java.util.Scanner;

// numero aleatorio
import java.util.Random;

public class OpMatematicas{
    public static void main(String[] args){
        // EXPRESSOES MATEMATICAS

        // expression = operands & operators
        // operands = values, variables, numbers, quantity
        // operators = + - * / %

        boolean visualizar = true;
        boolean exemplo = false;

        if(visualizar){
            int amigos = 10;
            amigos = amigos + 2;

            System.out.println(amigos);
            
            amigos = 10;
            amigos = amigos / 3;
            System.out.println(amigos);

            // podemos ver que ele não apresenta o valor correto, porem
            // podemos converter este numero para "FLOAT" e veremos o resultado real

            amigos = 10;
            double amigosTerco = (double) amigos/3;

            System.out.println(amigosTerco);

            double x = 3.14;
            double y = -10;
            double z = 25;

            // raiz quadrada de um numero
            System.out.println(Math.sqrt(z));

            // valor minimo entre dois numeros
            System.out.println(Math.min(x, y));

            // valor maximo etre dois numeros
            System.out.println(Math.max(x, y));

            // valor de pi
            System.out.println(Math.PI);

            // numero aleatorio entre 0 e 1
            System.out.println(Math.random());

            // USANDO BIBLIOTECA RANDOM DO JAVA
            // instanciando o construtor de um valor aleatorio
            Random random = new Random();

            // definindo um valor atealotio
            int aleatorio = random.nextInt(6); // valor aleatorio de 0 a 5

            // visualizando
            System.out.println(aleatorio);
        }
        // EXEMPLO
        // calcular a hipotenusa de um triangulo retangulo
        if (exemplo){
            double num1;
            double num2;
            double num3;

            Scanner scanner = new Scanner(System.in);

            System.out.println("Informe o cateto oposto");
            num1 = scanner.nextDouble();

            System.out.println("Informe o cateto adjacente");
            num2 = scanner.nextDouble();

            // pow é uma função exponencial (sendo 2, se eleva o valor num ao quadrado)
            num3 = Math.sqrt((Math.pow(num1, 2)) + (Math.pow(num2, 2)));    
            System.out.println(num3);

            scanner.close();
        }
    }
}