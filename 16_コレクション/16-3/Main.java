import java.util.*;

public class Main {
    public static void main(String[] args) {
        Hero h1 = new Hero("斎藤");
        Hero h2 = new Hero("鈴木");
        Map<Hero, Integer> map = new HashMap<Hero, Integer>();
        map.put(h1, 3);
        map.put(h2, 7);
        for (Hero h : map.keySet()) {
            System.out.println(h.getName() + "が倒した敵＝" + map.get(h));
        }
    }
}
