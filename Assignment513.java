import java.util.*;
import java.util.stream.*;

public class Assignment513 {
    public static ArrayList<String> a3(List<String> input){
        Stream<String> res=input.stream().filter(s->s.charAt(0)=='a').filter(s->s.length()==3);
        ArrayList<String> resList=new ArrayList<String>(res.collect(Collectors.toList()));
        return resList;
    }
    public static void main(String args[]) {
     ArrayList<String> list= new ArrayList<String>();
     list.add("alpha");
      list.add("sam");
           list.add("aba");
      list.add("bravo");
      list.add("delta");
      list.add("aaa");
      list.add("aab");
      list.add("wololo");
      list.add("moose");
      list.add("llama");
      ArrayList<String>processedList=a3(list);
      for (String s:processedList) System.out.println(s);
    }
}