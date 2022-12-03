import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) { 
        // 現在の日時を取得
        LocalDate now = LocalDate.now();
        // 100
        LocalDate d = now.plusDays(100);
        // DateTimeFormatter用いてDateインスタンスの内容を表示
        DateTimeFormatter f = DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
        String s = f.format(d);
        System.out.println(s);
    }
}
