import java.util.ArrayList;

public class TesteUtil {
    public static void main(String[] args) {
        ArrayList <Conta> lista = new ArrayList<Conta>();//lista de array com generics <> podendo especificar quais tipos de referências podem ser guardadas no ArrayList
        
        Conta cc=new ContaCorrente(22, 11);
        lista.add(cc); //adiciona valores na lista
        Conta cc2=new ContaCorrente(22, 22);
        lista.add(cc2);
        System.out.println("Tamanho: " + lista.size());
        Conta ref= lista.get(0);//puxa o valor da lista e exibe
        System.out.println(ref.getNumero());
        lista.remove(0); //Assim como o nome indica remove um elemento
        System.out.println("Tamanho: " + lista.size());
        Conta cc3 = new ContaCorrente(33, 311);
        lista.add(cc3);

        Conta cc4 = new ContaCorrente(33, 322);
        lista.add(cc4);

        for(int i = 0; i < lista.size(); i++) {
            Object oRef = lista.get(i);
            System.out.println(oRef);
        }

        for(Conta conta : lista) {// O mesmo for só que feito de maneira resumida
            System.out.println(conta);
        }
        ArrayList <Cliente> clientes=new ArrayList<Cliente>();
        Cliente cliente=new Cliente();
        cliente.setNome("Igor");
        clientes.add(cliente);
        System.out.println("Tamanho: " + clientes.size());
        Cliente ref1=clientes.get(0);
        System.out.println(ref1.getNome());

        ArrayList <String> strings=new ArrayList<String>();
        String nome="Igor";
        strings.add(nome);
        System.out.println("Seu nome é: " + nome);
        String nome1=strings.get(0);
        System.out.println(nome1);
        strings.add("João");
        String nomes2=strings.get(1);
        System.out.println(nomes2);
        System.out.println(strings.size());
        strings.remove(1);
        System.out.println(strings.size());
    }

}
