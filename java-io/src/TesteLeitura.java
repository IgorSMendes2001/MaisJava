import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TesteLeitura{
    public static void main(String[] args) throws IOException {
        //Fluxo de entrada com Arquivo
        InputStream fis =new FileInputStream("teste.txt");//Retorna os bits e bytes do arquivo utiliza polimorfismo
        InputStreamReader isr=new InputStreamReader(fis);//Recebe os bits e bytes e retorna char.
        BufferedReader br=new BufferedReader(isr);//Recebe os char e retorna a linha 

        String linha=br.readLine();

        while(linha!=null){
            System.out.println(linha);
            linha=br.readLine();
        }
      
        br.close();
    }
}