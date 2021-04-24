import java.util.ArrayList;

public class Array{
    public static void main (String[] args){
        // ARRAY

        // só podemos adicionar strings a esse array
        String[] frutas = {"laranja", "maca", "banana"};

        // listando todos os valores de "frutas"
        for (int i = 0; i < frutas.length; i++){
            System.out.println(frutas[i]);
        }

        // Array com tamanho limitado
        String[] gatos = new String[3];
        gatos[0] = "mel";
        gatos[1] = "claudio";
        gatos[2] = "frida";

        // se tentarmos adicionar mais um valor recebemos erro
        // gatos[3] = "psicopata";

        for(int i = 0; i< gatos.length; i++){
            System.out.println(gatos[i]);
        }

        // MATRIZ

        String[][] alimentos = 
        {
            {"Chocolate ao leite", "Chocolate amargo", "Chocolate de amendoas"},
            {"Estojo", "Lapis", "Apontador"},
            {"Detergente", "Sabao", "Removedor"}
        };

        for (int i = 0; i < alimentos.length; i++){
            for (int z = 0; z < alimentos[i].length; z++){
                System.out.println(alimentos[i][z]);
            }
        }
        
        // USANDO A BIBLIOTECA ARRAYLIST

        // ArrayList = Podemos mudar seu tamanho e os elementos podem ser adicionados e removidos
        
        // dentro de <> determinamos a tipagem da lista, usamos as classes referentes a cada tipo, neste caso vamos usar String, mas temos como por exemplo, o Integer
        ArrayList<String> transporte = new ArrayList<String>();

        transporte.add("bicicleta"); // usamos add para adicionar elementos
        transporte.add("carro");
        transporte.add("skate");

        for (int h = 0; h < transporte.size() ;h++){ // usamos size para receber o tamanho do array
            System.out.println(transporte.get(h)); // usamos get para receber os elementos

            if (transporte.get(h) == "skate"){
                System.out.println("O index " + transporte.indexOf("skate") + " foi removido (" + transporte.get(h) + ").");
                transporte.remove(h); // remover elemento de uma lista
            }
        }

        transporte.clear(); // apagar todos os dados de uma lista

        // MATRIZ ARRAYLIST

        // riamos um array que o seu tipo é um array de strings
        ArrayList<ArrayList<String>> assistir = new ArrayList();

        ArrayList<String> filmes = new ArrayList();
        filmes.add("harry potter");
        filmes.add("interistelar");
        filmes.add("a chegada");

        ArrayList<String> animes = new ArrayList();
        animes.add("naruto");
        animes.add("hunterxhunter");
        animes.add("black cover");

        assistir.add(filmes);
        assistir.add(animes);

        System.out.println(assistir); // diferentemente do array padrao, neste podemos visualizar todos os itens dessa forma

        System.out.println(assistir.get(0).get(1)); // para recebermos "interistelar" (mesmo que [0][1]) 

        // FOREACH 
        // executar uma acão para cada elemento de um array

        ArrayList<Integer> numeros = new ArrayList();

        // criar uma lista com numeros de 1 a 10
        for (int n = 1; n <= 10;n++){
            numeros.add(n);
        }

        for (Integer i : numeros){
            numeros.set(numeros.indexOf(i), (i*i)); // mudar o valor de um elemento de acordo com seu indice (.set(indice, novoValor);)
            System.out.println(i*i);
        }
        System.out.println(numeros);
    } 
}