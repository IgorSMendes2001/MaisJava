import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2{
    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(new File("teste2.txt"));//É necessário digitar o new file para incluir no scanner
       while(scanner.hasNextLine()){ // Lê todas as linhas do arquivo e mostra no console
        String linha=scanner.nextLine();
        System.out.println(linha);
        Scanner linhaScanner= new Scanner(linha);
        linhaScanner.useLocale(Locale.US);
        linhaScanner.useDelimiter(",");
        String valor1=linhaScanner.next();
        System.out.println(valor1);
        linhaScanner.close();
        // String [] valores=linha.split(",");//serve para separar as frases em arrays diferentes
        // System.out.println(Arrays.toString(valores));
       }
        scanner.close();
    }
}