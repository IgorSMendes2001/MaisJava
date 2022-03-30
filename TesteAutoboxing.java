import java.util.ArrayList;

import java.util.List;
import java.util.ArrayList;
public class TesteAutoboxing {
    public static void main(String[] args) {
        int[]idades=new int[5];
        String[]nomes=new String[5];
        int idade=20;//Integer
        Integer idadeRef=Integer.valueOf(20);//Método da classe Integer  //new Integer(20);
        System.out.println(idadeRef.doubleValue());//Transforma de int para double;
        System.out.println(Integer.MAX_VALUE);//Valor máximo que um int pode ter;
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.SIZE);
        System.out.println(Integer.BYTES);
        int valor=idadeRef.intValue();//unboxing
        List<Integer> numeros=new ArrayList<Integer>();//Arrays do tipo List só deve guardar referências de objetos, no entanto os tipos primitivos int são implementados pois são criados objetos Integer,podendo guardar dentro do Array;
        numeros.add(idadeRef);
        numeros.add(12);//Autoboxing:Acontece uma transformação automática de tipos primitivos para referência(Objeto);
                        //Unboxing: processo contrário do autoboxing.
        String s="45"; 
        // Integer numero=Integer.valueOf(s);// Transforma um valor de String em int
        int numero=Integer.parseInt(s);//Transformação automática
        System.out.println(numero);
        
        }
}
