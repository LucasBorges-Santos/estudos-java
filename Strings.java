public class Strings {
    public static void main(String[] args){
        String nome = "Lucas";

        // se essa string for igual a "Lucas" retorna True
        boolean resultado = nome.equals("Lucas");
        System.out.println(resultado); // retorna true

        // recebendo cada caracter de uma String  
        // length = ler a quantidade de caracteres de uma String
        // charAt = receber o caracter de acordo com o index     
        for(int i = 0 ; i < nome.length() ; i++){
            System.out.println(nome.charAt(i));
        }

        // ver qual o index de uma letra em expecifico
        int indexLetra = nome.indexOf("u");
        System.out.println(indexLetra); // index 0

        // ver se uma variavel esta vazia
        boolean vazio = nome.isEmpty();
        System.out.println(vazio); // false

        // deixar Todas as letras em maiusculo
        String nomeUpper = nome.toUpperCase();
        System.out.println(nomeUpper);

        // Transformando uma string em array
        char[] todasLetras = nome.toCharArray(); 

        for (int x = 0; x < todasLetras.length; x++){
            System.out.println(todasLetras[x]);
        }

        // temos outras funções se digitarmos a string e ".", assim podemos ver outras funções
        // neste caso, "nome."
    }
}
