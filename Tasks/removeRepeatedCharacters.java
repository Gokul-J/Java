import java.util.Scanner;
import java.util.HashMap;

class test {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char[] ch = sc.next().toCharArray();
    sc.close();
    HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
    for (int i = 0; i < ch.length; i++) {
      hm.put(ch[i], i);
    }
    for (int i = 0; i < ch.length; i++) {
      int pos = hm.get(ch[i]);
      if (i == pos) {
        System.out.print(ch[i]);
      }
    }
  }
}