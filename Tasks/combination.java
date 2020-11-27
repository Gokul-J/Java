public class combination {
  public static void main(String[] args) {
    permute("abcd");
  }

  public static void permute(String full) {
    if (full == null || full.length() == 0) {
      System.out.println("Enter a string of length > 0.");
      return;
    }

    permute("", full);
  }

  public static void permute(String c, String r) {
    if (c.length() == 3) {
      System.out.println(c);
      return;
    }

    if (r.length() == 0) {
      return;
    }

    for (int i = 0; i < r.length(); i++) {
      permute(c + r.charAt(i), r.substring(i + 1));
    }
  }
}