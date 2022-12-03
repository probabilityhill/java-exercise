import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) { 
        // 現在の日時を取得
        Date now = new Date();
        // 取得した日時をCalendarにセット
        Calendar c = Calendar.getInstance();
        c.setTime(now);
        // Calendarから「日」の数値を取得
        int day = c.get(Calendar.DAY_OF_MONTH);
        // 100足した値をセットする
        c.set(Calendar.DAY_OF_MONTH, day + 100);
        // Calendarの日時情報をDate型に変換
        Date d = c.getTime();
        // SimpleDateFormatを用いてDateインスタンスの内容を表示
        SimpleDateFormat f = new SimpleDateFormat("西暦yyyy年MM月dd日");
        String s = f.format(d);
        System.out.println(s);
    }
}
