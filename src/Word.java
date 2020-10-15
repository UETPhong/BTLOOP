/*
** class Word chua tu moi,giai nghia
 */
public class Word {
    private String Word_target;
    private String Word_explain;
    public Word(){
        this.Word_explain = "";
        this.Word_target = "";
    }
    public Word(String Word_target,String Word_explain){
        this.Word_target = Word_target;
        this.Word_explain = Word_explain;
    }

    public void setWord_explain(String word_explain) {
        Word_explain = word_explain;
    }

    public void setWord_target(String word_target) {
        Word_target = word_target;
    }

    public String getWord_target() {
        return Word_target;
    }

    public String getWord_explain() {
        return Word_explain;
    }

}

