/* static 블록
 -클래스가 로딩 => 클래스 변수 준비 => static 블록 실행
 -클래스가 로딩된 후 클래스 변수를 초기화 하는 용도로 사용
 
 */
package java01e.test45;

public class ClassA {
  static int value = 100;
  
  static {
    System.out.println("ClassA의 static 블록 실행");
    value = 200;
  }
  
  static {
    System.out.println("스태틱 블록이 여러 개일 경우 순차적으로 실행.");
  }

}
