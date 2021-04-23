// importar biblioteca de data 
import java.util.Date;

// Scanner para receber dados do usuario
import java.util.Scanner;

public class Basico{
    public static void main (String[] args){
        //ver as informações sobre o dia de hoje

        // definindo relocio como uma variavel do tipo de data
        Date relogio = new Date();
        System.out.println("As informações sobre a data de hoje sao: ");

        // imprimindo variavel relogio
        System.out.print(relogio.toString());

        // imprimir aspas
        System.out.print("\n\"ola\"");

        // VARIAVEIS

        /*
        Data types       size      primit / refer               value

        boolean          1 bit       primitivo         True or False
        byte             1 byte      primitivo         -128 até 127
        short            2 bytes     primitivo         -32768 até 32767
        int              4 bytes     primitivo         -2 bi até 2 bi
        long             8 bytes     primitivo         -9 E15 até 9 E15

        float            4 bytes     primitivo         entre 6 e 7 digitos dps da virgula
        double           8 bytes     primitivo         15 digitos dps da virgula

        char             2 bytes     primitivo         um caracter/letra/ASCII value
        String           varia       referencia        uma sequencia de caracteres
        */
        
        // EXEMPLOS
        
        int x = 10;
        boolean login = true;
        byte centena = 100;
        char letra = 100; // representa uma letra
        String nome = "Lucas Borges Santos";
        float y = 3.14f; // precisa do "f no final para representar uma string"
        double z = (double)2/3; // (double) para converter uma função matematica para o tipo de variavel definido
        
        // ou
        
        z = 3.14;
        

        // IDENTAÇÂO DE STRINGS
        String X = "x", Y = "y";
        System.out.print("\nx : " + X +"\ny : " + Y);
        

        // INPUT / SCANNER

        Scanner  scanner = new Scanner(System.in);

        System.out.print("\nQual o seu nome?");
        String name = scanner.nextLine();

        System.out.print("\nQual a sua idade?");
        int idade = scanner.nextInt();


        System.out.println("\nOla " + name +"\nVoce tem " + idade + " anos.");
        // Sysout para escrever "System.out.println();" de forma rapida
        
        scanner.close(); // não é necessario.
    }
}
