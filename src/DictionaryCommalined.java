import java.lang.String;
import java.util.ArrayList;

public class DictionaryCommalined {

    public void ShowAllWords(){
          int n=DictionaryManagement.words.size();
          System.out.printf("%s\n","No","|English","Vietnamese");
          for(int i = 0;i < n; i++){
               System.out.printf("%s\n",i + 1,"|"+DictionaryManagement.words.get(i).getWord_target()+"|"+
                       DictionaryManagement.words.get(i).getWord_explain());
          }

    }
    public void DictionaryAdvanced(){

    }
}
