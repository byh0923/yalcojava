package sec02.chap02;

/**
 * 클래스의 이름과 파일 이름은 같아야한다.
 *
 * 주석 comment
 * 컴퓨터는 무시하는 텍스트
 * - 코드에 대한 설명
 * - 추후 진행해야 할 사항 등
 * - JavaDoc - 자동 문서화를 위한 주석(이후 배울 것)
 * - 주석처리 없이 자바 문법 외 텍스트 작성시 컴파일 오류
 *
 * 주석은 컴파일 과정에서 배제되기 떄문에 실행 속도에 영향을 주지 않음.
 * */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // 사뿐히 즈려밟고 가시옵소서
        // System.out.println("먼저 가, 난 틀렸어.");

        System.out.println("헬로 월드!");

            // command / => 전체 주석
//         주석은 이와 같이 여러 줄에 걸쳐
//         작성할 수도 있습니다.
//         장문의 주석을 달거나

    }
}
