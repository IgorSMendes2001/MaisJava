import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class TesteEscrita{
    public static void main(String[] args) throws IOException {
        //Fluxo de entrada com Arquivo
        OutputStream fos =new FileOutputStream("teste2.txt");//Retorna os bits e bytes do arquivo utiliza polimorfismo
        OutputStreamWriter osw=new OutputStreamWriter(fos);//Recebe os bits e bytes e retorna char.
        BufferedWriter bw=new BufferedWriter(osw);//Recebe os char e retorna a linha 

        bw.write("Eu sou o teste da onça");
       bw.newLine();
       bw.newLine();
       bw.write("O papa é poop");
       
        bw.close();
    }
}