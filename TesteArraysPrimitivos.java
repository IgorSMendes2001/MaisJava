public class TesteArraysPrimitivos{
    public static void main(String[] args) {
        //Array [] são objetos
        int [] idades = new int [5]; //inicializa o array com 0
        for (int i=0;i<idades.length;i++){
            idades[i]=i*i;
            System.out.println("Idades:" + idades[i]);

        }
        // for (int i= 0;i<idades.length;i++){
        //     System.out.println(idades[i]);
        // }
       
    }
}