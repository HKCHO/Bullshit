package java01e.test44;

public class test44_1 {
  public static void main(String[] args) {
    
   // Unit u1 = new Unit();  <= 추상화 된 Class는 인스턴스를 만들 수 없다.
    
   Tank t1 = new Tank();
   t1.move(Mover.NORTH);
   
   Vulture v1 = new Vulture();
   v1.move(Mover.SOUTH);
   
   Soldier s1 = new Soldier();
   s1.move(Mover.EAST);
   
   
  }
}
