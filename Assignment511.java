import java.util.*;

public class Assignment51 {
    
    public static int eSorter(String s1,String s2){
         if (s1.contains("e")) {
        return -1;
      } else if (s2.contains("e")){
        return 1;
      }
      else return 0;
    }
    
    public static void main(String args[]) {
      ArrayList<String> list=new ArrayList<String>();
      list.add("alpha");
      list.add("sam");
      list.add("bravo");
      list.add("delta");
      list.add("charlie");
      list.add("egg");
      list.add("tupperware");
      list.add("echo");
      list.add("wololo");
      list.add("moose");
      list.add("llama");
      
      //part 1: sort by length shortest first
      Collections.sort(list,(s1,s2)->(s1.length()-(s2.length())));
      for (String s:list) System.out.println(s);
      
      System.out.println();
      //part 2 sort by length longest first
        Collections.sort(list,(s1,s2)->(s2.length()-(s1.length())));
        for (String s:list) System.out.println(s);
        
        System.out.println();
        
        //part 3 sort by first character only
        list.add("lamp");
        list.add("lag");
        Collections.sort(list,(s1,s2)->(s1.charAt(0)-(s2.charAt(0))));
        for (String s:list) System.out.println(s);
        
        System.out.println();
        
        //part 4 sort by 'e' first
        list.add("ephemeral");
        Collections.sort(list, (s1, s2) -> {
      if (s1.contains("e")) {
        return -1;
      } else if (s2.contains("e")){
        return 1;
      }
      else return 0;
    });
    for (String s:list) System.out.println(s);
     System.out.println();
    
    Collections.shuffle(list);
    for (String s:list) System.out.println(s);
    System.out.println();
    //part 5: part 4, but in a method 
    Collections.sort(list, (s1,s2)->eSorter(s1,s2));
    for (String s:list) System.out.println(s);
    }
   
}