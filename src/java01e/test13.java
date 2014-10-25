/*배열
  -같은 종류의 데이터를 여러 개 저장할 수 있도록 메모리를 여러 개 생성하는 방법
  - new 데이터형[개수];
  - new 데이터형[]{값,값,값,...}
  
 */
package java01e;

public class test13 {
    public static void main(String[] args) {
      //예전 방식
      int kor, eng, math, sci, soc;
      kor = 63;
      eng = 63;
      math = 63;
      sci = 63;
      soc = 63;  //c방식
      
      
      //배열 생성: 4바이트 메모리를 연속해서 준비한다.
      //준비된 메모리의 첫 바이트 주소를 변수에 저장해야한다.
      //이렇게 주소를 저장하는 변수 => reference (참조변수)
      //C에서는 pointer라 한다.
      
     
        
      // int scores[] = new int[5]; //c방식도 허용!
      
      int[] scores = new int[5];// 신규 배열 5개의 생성 및 주소 할당  
      scores = new int[3]; //신규 배열 3개 생성 및 주소 할당
      scores[0] = 100;
      scores[1] = 90;
      scores[2] = 80;
     //scores[3] = 70; //Runtime Exception: 실행중에 발생하는 에러
      
      //배열 생성: 값을 초기화
      // 초기화를 수행할 떄는 배열의 개수를 지정하지 않는다.
      scores = new int[]{100,90,80};
      for(int i=0; i < scores.length; i++){
        System.out.println(scores[i]);
      }
      
      
      // 특수 배열 객체 생성
      System.out.println("------------------------------------------");
      java.util.ArrayList arr = new java.util.ArrayList();
      //arr[0] = "홍길동";
      arr.add("홍길동");
      arr.add(100);
      arr.add(90);
      arr.add(80);
      arr.add(new java.util.Date());
      
      for(int i = 0; i < arr.size(); i++){
        System.out.println(arr.get(i));
      }
    }
}
