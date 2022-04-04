import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;

public class TesteEscritaFileWriter{
    public static void main(String[] args) throws IOException {
        //Fluxo de entrada com Arquivo
        // OutputStream fos =new FileOutputStream("teste2.txt");//Retorna os bits e bytes do arquivo utiliza polimorfismo
        // OutputStreamWriter osw=new OutputStreamWriter(fos);//Recebe os bits e bytes e retorna char.
        // BufferedWriter bw=new BufferedWriter(osw);//Recebe os char e retorna a linha 
        FileWriter fw=new FileWriter("teste2.txt");
        BufferedWriter bw=new BufferedWriter(new FileWriter("teste2.txt"));
        bw.write("Happy Birthday");
        bw.newLine();
        // fw.write(System.lineSeparator());
        bw.write("Eu sou o teste da onça");
        bw.newLine();
        // fw.write(System.lineSeparator());
        bw.write("O papa é poop");
       
        bw.close();
    }
}