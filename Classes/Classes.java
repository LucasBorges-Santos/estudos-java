// minha classe principal
public class Classes {
    // seus parametros
    //usamos final para dizer que esse valor não pode ser alterado
    final int x = 5;

    // este valor pode ser alterado
    int z = 3;

    // funcao main que sempre é executada
    // possue os parametros:
    // public = permite acesso a qualquer codigo externo da classe
    // static = teremos sempre uma referencia apenas e sempre sera o msm
    // void = não retorna valores
    public static void main(String[] args){

        // usamos para instanciar classes e criar objetos
        Classes meuObj = new Classes();
        System.out.println(meuObj.x);

        // usando funções de outras classes
        NomeRecebido nomeRecebido = new NomeRecebido();
        System.out.println(nomeRecebido.nomeRecebido("lucas"));

        // instanciando uma classe pessoa de outro arquibo
        Pessoa lucas = new Pessoa("Lucas", 19,"12345678910");

        System.out.println(lucas.nomePessoa);
        System.out.println(lucas.idadePessoa);
        System.out.println(lucas.cpfPessoa);
    }
}
