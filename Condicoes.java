import java.util.Scanner;

public class Condicoes{
    public static void main (String[] args){
        // && = AND 
        // || = OR
        // !  = NOT
        // ESTRUTURAS DE CONDIÇÔES

        int x = 22;

        // estrutura if/else if/ else
        if (x != 22){
            System.out.println("X != 20");
        } else if (x == 23){
            System.out.println("X = 23");
        } else{
            System.out.println("Caso nao se encaixe em nenhuma das condicoes.");
        }

        // estrutura Switch
        String dia = "segunda";

        switch(dia){
            case "segunda": System.out.println("segunda");
            break;

            case "terça": System.out.println("terça");
            break;

            case "quarta": System.out.println("quarta");
            break;

            case "quinta": System.out.println("quinta");
            break;

            case "sexta": System.out.println("sexta");;
            break;

            default: System.out.println("Isso não é um dia");
        }

        // estrutura while
        int numero = 1;
        Scanner scanner = new Scanner(System.in);

        /*while(numero != 0){
            System.out.println("Informe um numero(zero para sair do loop)");
            numero = scanner.nextInt();            
        }*/

        // ou

        do {
            System.out.println("Informe um numero (zero para sair do loop)");
            numero = scanner.nextInt();
        } while(numero != 0);

        System.out.println("Voce saiu do while");

        scanner.close();

        // estrutura for

        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        // contando de tras para frente

        for (int i = 10; i>=0; i--){
            System.out.println(i);
        }
    }
}