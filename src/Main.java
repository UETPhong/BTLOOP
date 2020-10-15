import javax.imageio.IIOException;
import java.util.Scanner;
import java.io.IOException;

public class Main {
    public void main(String[] args) throws IOException {
        Scanner sr =new Scanner(System.in);
        DictionaryManagement management = new DictionaryManagement();//nhap tu cmd
        DictionaryCommalined commalined = new DictionaryCommalined();//show tu
        /*
        **goi  cac phuong thuc tu cac doi tuong
         */
        management.insertFromCommalined();
        commalined.ShowAllWords();
        management.insertFromFile();
        management.Lookup();
    }

}
