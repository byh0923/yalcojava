package sec05.chap01.ex01;

public class Main {
    public static void main(String[] args) {

        // 클래스로 선언한거는 자료형이 된다.
        // 클래스는 프랜차이즈 본사 : 인스턴스 : 매장

        Button button1 = new Button('1', 1, "DARK");
        Button buttonPlus = new Button('+', 3, "DARK");
        Button buttonClear = new Button('C', 2, "DARK");

        button1.place();
        buttonPlus.place();
        buttonClear.place();
    }
}
