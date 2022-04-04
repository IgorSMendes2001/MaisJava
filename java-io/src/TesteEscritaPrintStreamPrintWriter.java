import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.nio.Buffer;

public class TesteEscritaPrintStreamPrintWriter{
    public static void main(String[] args) throws IOException {
        //Fluxo de entrada com Arquivo
        // OutputStream fos =new FileOutputStream("teste2.txt");//Retorna os bits e bytes do arquivo utiliza polimorfismo
        // OutputStreamWriter osw=new OutputStreamWriter(fos);//Recebe os bits e bytes e retorna char.
        // BufferedWriter bw=new BufferedWriter(osw);//Recebe os char e retorna a linha 
       PrintStream ps=new PrintStream("teste2.txt");
       ps.println("Happy Birthday");
       ps.println("Eu sou o teste do pinguim");
        ps.println();
        ps.println("Opopopopde");
        // fw.write(System.lineSeparator());
    
        // fw.write(System.lineSeparator());
      PrintWriter pw=new PrintWriter("teste.txt");
      pw.println("Saudade da Silas e da Gabi");
      pw.close();
       
    }
}