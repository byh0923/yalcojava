package sec02.chap09;

/**
 * 타입추론
 * java10에서 도입됨
 * */
public class Ex01 {
    public static void main(String[] args) {

        var intNum = 1;
        var doubleNum = 3.14;
        var charLet = 'A';
        var StringWord = "안녕하세요";

        //  ⚠️ 아래와 같이는 사용 불가
        //  컴파일러가 타입을 추론할 수 없는 상황
        //var notInit; // 초기화가 안 됨
        //var nullVar = null; // null로 초기화

    }
}
