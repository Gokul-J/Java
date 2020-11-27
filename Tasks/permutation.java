public class permutation {
    public static void main(String[] args) {
        permute("abc");
    }

    public static void permute(String full){
      if(full == null || full.length() == 0){
        System.out.println("Enter a string of length > 0.");
        return;
      }

      permute("", full);
    }

    public static void permute(String c, String r){
        if(r.length() == 0){
            System.out.println(c);
            return;
        }

        for(int i=0; i<r.length(); i++){
            permute(c+r.charAt(i), r.substring(0, i) + r.substring(i+1));
        }
    }
}