package sec02.chap02;

public class Ex01 {
    public static void main(String[] args) {

        double a = 0.1, b = 0.2;

        //  ⚠️ 오차가 생김
        double c = a + b;
        System.out.println(c);

        // 오차가 생기는 이유 디지털 기호라 정확한 계산이 안된다라고 알고 있음
        /**
         0.1이랑 0.2는 사실 0.1과 0.2가 아님
         이진법으로 정확하게 표현할 수 없음
         int : 32bit
         float 부동소수점
         떠서 움직인다.
         123.456
         첫 bit 양수 구분
         고정소수점 : 큰 자리 수 나타내지 못하, 소수 자리수를 많이 나타낼 수 없다.
         부동소수점 : 8비트로 몇칸 움직일지 나타낸다. 나머지 23bit를 숫자 표현에 사용
         * */
    }
}
