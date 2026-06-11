package Chap4_quiz;
import java.util.Locale;
public class MemoryEater{
    public static void main(String[] args){
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        if("ja".equals(language)){
            System.out.println("メモリをしょうひしています");
        }else{
            System.out.println("eating memory");
        }
        long[] l = new long[1280000];
    }
}
