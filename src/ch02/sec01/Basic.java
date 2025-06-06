package ch02.sec01;

public class Basic {
  /*
  컴퓨터 메모리 = RAM(Random Access Memory):휘발성, 데이터를 저장, 일기, 삭제하는 공간
  변수 = 하나의 값을 저장할 수 있는 메모리 번지에 붙여진 이름
  하나의 변수는 다양한 타입의 값을 저장할 수 없음
  즉, 정수형 변수에는 정수값만 저장 가능! 정수형 변수로 선언 후 다른 형의 변수로 변경 불가능
      실수형 변수에는 실수값만 저장 가능! 마찬가지로  중간에 저장할 수 있는 타입을 바꿀 수 없음

  변수를 사용하려면 변수를 선언해야 함 변수 선언할 때 저장할 값의 타입과 이름(변수명)을 정함
  변수 선언할 때 저장할 값의 타입과 이름(변수명)을 정함
  같은 스코프(블럭)안에서는 같은 이름의 변수 선언은 최초 한번만 함
  int num;
  float num2;

  로컬(지역)변수 : 메소드 안에서 선언된 변수

  변수명 규칙
  - 문자로 시작해야 함(숫자로 시작X)
  - 특수 기호 중 _ $는 변수명으로 사용 가능(문자로 인식)
  - 예약어 사용 불가능
  - 대소문자를 가림
  - 카멜 스타일로 작성

  변수명 센스
  - 의미가 있는 이름을 사용하는 게 좋음. 최악 : a, b, c 등등
  - 너무 길지 않도록 description: desc , name: nm, class: cls 등등
   */
  public static void main(String[] args){
    int a;
    { int b; }
    { int b; } // 다른 스코프여서 같은 이름의 변수 선언 가능

    int _a;
    // int int; // 예약어 X
    int abc, aBc, abC; // 대소문자 가림
  }
}
