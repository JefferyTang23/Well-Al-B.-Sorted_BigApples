/*****************************************************
Big Apples (Weichen Liu + Blueface, Jeffery Tang + Mathias, Lior + Toothless)
APCS
L02 -- Well Al B. Sorted
2021-12-10
time spent:  0.5 hours
 *****************************************************/
import java.util.ArrayList;

public class ALTester {
  public ArrayList<Integer> kolf;
  
  public String toString() {
    return kolf.toString(); 
  }
  
  public ALTester {
    kolf = new ArrayList<Integer>(23); 
    for (int counter = 0; counter < 23; counter++){
      kolf.add((int)(Math.random() * 50));
    }
  }
  
  public boolean isSorted() {
    for (int i = 0; i < kolf.size(); i++) {
      if ((randle.get(i).compareTo(randle.get(i+1))) > 0){
        return false; 
      }
    }
    return true; 
  }
  
  public static void main (String[] args) {
    ALTester jeff = new ALTester(); 
    System.out.println(jeff.toString());
    System.out.println(jeff.isSorted());
    
    }

}