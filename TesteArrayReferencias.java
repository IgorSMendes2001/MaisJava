public class TesteArrayReferencias {
    public static void main(String[] args) {
        Object[] referencias=new Object [5];//cria um novo array com o nome referencias do tipo Object
        ContaCorrente cc1=new ContaCorrente(22,11); //cria um novo objeto a partir de uma referência cc1

        referencias[0]=cc1;
        ContaCorrente cc2=new ContaCorrente(33, 55);
        referencias[1]=cc2;
        ContaPoupanca cc3=new ContaPoupanca(44, 55);
        referencias[3]=cc3;
        Cliente cliente = new Cliente();
        referencias [2]=cliente;
        System.out.println(referencias[3]);
        System.out.println(cc2.getNumero());
        System.out.println(cc2.getAgencia());
        // System.out.println(referencias[1].getNumero);
        // int [] refs={1,4,5,7,8}; forma literal de arrays
        Conta[] contas2=new Conta[10];
        Conta cp=new ContaPoupanca(22,65);
        contas2[0]=cp;
        System.out.println(contas2[0]);
        ContaPoupanca ref=(ContaPoupanca)contas2[0];//TypeCasting (ContaPoupanca) serve para converter uma referência de tipos diferentes por exemplo de um tipo mais genérico para um tipo mais especifico
        System.out.println(ref.getNumero());
    }
}
