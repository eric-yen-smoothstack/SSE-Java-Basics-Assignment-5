import java.util.*;

public class Assignment512 {
    public static String stringChanger(List<Integer> inte){
       String res="";
       for (int i:inte){
           if (i%2==0) res+="e"+String.valueOf(i)+",";
           else res+="o"+String.valueOf(i)+",";
       }
       return res;
    }
  public static void main(String[] args) {
   List<Integer> list=new ArrayList<Integer>();
   list.add(1);
   list.add(44);
   list.add(3);
   list.add(98);
   System.out.println(stringChanger(list));
  }
}