import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TesteCopia{
    public static void main(String[] args) throws IOException {
        //Fluxo de entrada com Arquivo
         InputStream fis = System.in;//new FileInputStream("teste.txt");//Retorna os bits e bytes do arquivo utiliza polimorfismo
        InputStreamReader isr=new InputStreamReader(fis);//Recebe os bits e bytes e retorna char.
        BufferedReader br=new BufferedReader(isr);//Recebe os char e retorna a linha 

        OutputStream fos = new FileOutputStream("teste2.txt"); ////Retorna os bits e bytes do arquivo utiliza polimorfismo
        OutputStreamWriter osw=new OutputStreamWriter(fos);//Recebe os bits e bytes e retorna char.
        BufferedWriter bw=new BufferedWriter(osw);//Recebe os char e retorna a linha 

        String linha=br.readLine();

        while(linha!=null&&!linha.isEmpty()){
           bw.write(linha);
           bw.newLine(); // Cria separação por linhas
           bw.flush();
           linha=br.readLine();
        }
      
        br.close();
        bw.close();
    }
}