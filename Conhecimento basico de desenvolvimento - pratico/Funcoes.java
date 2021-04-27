import java.util.*;

// METHOOD
public class Funcoes{
    static void minhaFuncao(){
        System.out.println("Funcao executada");
    }

    // usamos o static para dizer que sempre será a mesma
    // usamos void para dizer que ela n retorna valores
    static void ola(String nome){
        System.out.println("Ola " + nome);
    }

    // para retornarmos um valor, ao invez de void, utilizamos o return e o tipo de retorno
    // neste caso, temos uma função que retorna um numero inteiro
    static int aoQuadrado(int x){
        return x * x;
    }

    static void pessoa(String nome, int idade){
        System.out.println("Nome: " + nome + ", " + "Idade: " + idade);
    }

    // função com if e else
    static void checarIdade(int idade){
        if(idade >= 18){
            System.out.println("Acesso permitido.");
        } else{
            System.out.println("Acesso negado.");
        }
    }

    // criar uma String com array
    static String stringNomes(ArrayList<String> arrayNome){
        String resultado = ""; 
        for(int i = 0; i < arrayNome.size() ;i++)
            if(i == arrayNome.size() - 1){
                resultado = resultado + arrayNome.get(i);
            } else{
                resultado = resultado + arrayNome.get(i) + ", ";
            }
           

        return resultado;
    }

    public static void main(String[] args){
        // executar função
        minhaFuncao();

        // PARAMETROS

        // executando função com String
        ola("Lucas");

        // retornando valores
        // executando função com int
        System.out.println(aoQuadrado(5));

        // varios parametros
        pessoa("Lucas", 19);

        // if/else
        checarIdade(17);
        checarIdade(19);

        // com ArrayList
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Lucas");
        nomes.add("Luma");
        nomes.add("Mel");

        String resultado = stringNomes(nomes);

        System.out.println(resultado);
    }
}
