/*클래스 로딩
 - 1) new 연산자를 사용하여 인스턴스를 만들 때
 - 2) Class.forName("클래스이름")을 호출하여 임의로 클래스 로딩.
 - 3) 클래스 로딩은 단 한번만 수행된다. => static 블록도 단 한번만 실행된다.
 */
package java01e.test45;

public class Test45 {
 public static void main(String[] args) {
  // 참조 변수를 선언할 떄는 클래스가 로딩되지 않는다.
  ClassA obj1;
  
  // 인스턴스 생성할 때 클래스 로딩 됨
  obj1 = new ClassA();
  
  System.out.println(ClassA.value);
}
}
