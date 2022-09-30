import java.util.Random;

public class Cleric {
  String name;
  int hp = 50;
  final int MAX_HP = 50;
  int mp = 10;
  final int MAX_MP = 10;

  public void selfAid() {
    System.out.println(this.name + "はセルフエイドを唱えた！");
    this.hp = this.MAX_HP;
    this.mp -= 5;
    System.out.println("HPが最大まで回復した");
  }

  public int pray(int sec) {
    System.out.println(this.name + "は" + sec + "秒天に祈った！");
    int recover_sec = sec + new Random().nextInt(3);
    recover_sec = Math.min(recover_sec, this.MAX_MP - this.mp);
    this.mp += recover_sec;
    System.out.println("MPが" + recover_sec + "回復した");
    return recover_sec;
  }
}
