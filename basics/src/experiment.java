import java.util.*;
public class experiment {
    public static void main(String[] args) {
        String s="Hello this is just practise Hello this";
        String w[]=s.split(" ");
        Set<String> k = new HashSet<>();
        HashMap<String,Integer> mo=new HashMap<>();
        for(String word:w)
        {
            k.add(word);
        }
        for(int i=0;i<k.size();i++)
        {
            int count=0;
           for(int j=0;j<s.length();j++)
           {
               if(k.charAt(i)==s[j])
               {
                   count++;
               }
           }
        }
      for(String wk:k)
      {
          System.out.println(wk);
      }
    }
}
