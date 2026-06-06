package Chap1_quiz;

import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

        Book book1 = new Book("Java　入門",sdf.parse("2011/12/03"),"スッキリわかる");
        Book book2 = new Book("Python 入門",sdf.parse("2019/04/22"),"カレーが食べたくなる");
        Book book3 =new Book("C　言語入門",sdf.parse("2018/03/31"),"ポインタも自由自在");

        List<Book> bookList = new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);

        Collections.sort(bookList,new TitleComparator());

        System.out.println("[書名順に表示します]");
        for(Book b : bookList){
            System.out.println("書名："+b.getTitle()+"| コメント:"+b.getComment());
        }
    }
}
