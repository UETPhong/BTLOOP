
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import java.nio.file.Paths;

public class DictionaryManagement {
    public static ArrayList<Word> words = new ArrayList<Word>();
    public void insertFromCommalined(){
        Scanner sr = new Scanner(System.in);
        String tu_moi,giai_thich;
        tu_moi = sr.nextLine();
        giai_thich = sr.nextLine();
        Word arr = new Word(tu_moi,giai_thich);
        words.add(arr);//them tu moi,giai nghia bang commalined;
    }
    /*
    ** them tu moi,giai nghia bang cach lay tu file
     */
    public void insertFromFile() throws IOException{
        Scanner sf = new Scanner(Paths.get("Dictionary_1.txt"), "UTF-8");
        while (sf.hasNextLine()){
              String tu_moi;
              String giai_nghia;
              tu_moi = sf.nextLine();
              giai_nghia=sf.nextLine();
              Word arr = new Word(tu_moi,giai_nghia);
              words.add(arr);
        }
        sf.close();
    }
    /*
    **phuong thuc tra tu trong tu dien
     */
    public void Lookup(){
        Scanner sr =new Scanner(System.in);
        String tu_nhap;
        tu_nhap = sr.nextLine();
        boolean kiem_tra=false;
        for(int i=0;i<words.size();i++){
            if(words.get(i).getWord_target().equals(tu_nhap)){
                System.out.println(words.get(i).getWord_explain());
                kiem_tra=true;
                break;
            }
        }
        if(kiem_tra==false) System.out.println("khong tim thay tu can tra,vui long tim tu khac");
    }


}