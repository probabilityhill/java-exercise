public class Main {
    public static void main(String[] args) {
        try {
            String s = null;
            System.out.println(s.length());
        } catch(NullPointerException e) {
            System.out.println("NullPointerException 例外を catch しました");
            System.out.println("－－スタックトレース（ここから）－－");
            e.printStackTrace();
            System.out.println("－－スタックトレース（ここまで）－－");
        }
    }
}
