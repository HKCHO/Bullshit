
//역할 : 계산기 역할을 수행한다.

package java01e.test29;

public class Calculator {
  //클래스 멤버만 접근 가능하도록 제한한다.
  private static int result;
  
  //단, 결과를 알 수 있도록 메서드(Method)제공
  //내부 변수의 값을 리턴하는 함수는 get이라는 접두어를 붙인다.
  // => getter 메서드
  //        v v v v v v 
  static int getResult() {
    return result;
  }
  
  static void plus(int value){
    result += value;
  }
  
  static void minus(int value){
    result -= value;
  }
  
  static void multiple(int value){
    result *= value;
  }
  
  static void divide(int value){
    result /= value;
  }
}
