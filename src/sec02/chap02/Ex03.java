package sec02.chap02;

public class Ex03 {
    public static void main(String[] args) {
        //  float은 뒤에 f 또는 F를 붙여 표현
        float flt1 = 3.14f;
        double dbl1 = 3.14;

        //  ⚠️ float에는 double을 담을 수 없음
        float flt2 = (float)dbl1;
        //  반대는 가능
        double dbl2 = flt1;
    }
}
