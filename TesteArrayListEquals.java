import java.util.ArrayList;

public class TesteArrayListEquals {
    public static void main(String[] args) {
        ArrayList <Conta> lista = new ArrayList<Conta>();//lista de array com generics <> podendo especificar quais tipos de referências podem ser guardadas no ArrayList
        
        Conta cc=new ContaCorrente(22, 11);
        lista.add(cc); //adiciona valores na lista
        Conta cc2=new ContaCorrente(22, 22);
        lista.add(cc2);
    
        Conta cc3=new ContaCorrente(22, 23);
        lista.add(cc3);
        boolean existe=lista.contains(cc3);//boolean que devolve se existe ou não na lista utiliza do método equals para retornar o boolean
        System.out.println("Já Existe? " + existe);

        for(Conta conta : lista) {
            if(conta.equals(cc3)) { //nossa versão do método equals pois ele serve para ser sobrescrito
              System.out.println("Já tenho essa conta!");
          }else{
              System.out.println("Não tenho essa conta!");
          }
       }
            
        for(Conta conta : lista) {// O mesmo for só que feito de maneira resumida
            System.out.println(conta);
        }
    }
}
