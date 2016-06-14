package Comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TesteComparators {

  public static void main(String[] args) {
    
    
    //Implemenação de Comparator do Java 7
    List<String> palavras = Arrays.asList("Fábio", "Alve", "Gomesss");
    System.out.println(palavras);
    Comparator<String> comparator = new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        return Integer.compare(o1.length(), o2.length());
      }
    };
    Collections.sort(palavras, comparator);
    
    System.out.println(palavras);
    
    
  //Implemenação de Comparator do Java 8
    //TODO
    
  }
  
  

}
