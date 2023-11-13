package sec09.chap01;

public class Main {
    public static void main(String[] args) {

        Printer printer1 = new Printer() {
            @Override
            public void print() {
                System.out.println("람다식이 없었을 때 방식");
            }
        };

        Printer printer2 = () -> {
            System.out.println("인자도 반환값도 없는 람다식");
        };

        Printer printer3 = () -> System.out.println("반환값 없을 시 {} 생략");
        Printer printer4 = () -> {
            System.out.println("코드가 여러 줄일 때는");
            System.out.println("{} 필요");
        };
        for (var p : new Printer[] {printer1, printer2, printer3, printer4}) {
            p.print();
        }

        Returner re1 = () -> {return 1;};
        Returner re2 =() -> {
            System.out.println("Hello");
            return "반환 코드만 있을 시 {}와 return 생략 가능";
        };

        SingleParam square = (i) -> i*i;
        SingleParam cube = i -> i * i * i;

        var _3_squared = square.func(3);
        var _3_cubed = cube.func(3);

        DoubleParam add = (a, b) -> a*b;
        DoubleParam multiAndPrint =(a,b) -> {
            var result = a*b;
            System.out.println("a * b " + result);
            return result;
        };
        var added = add.func(2,3);
        var multiplied = multiAndPrint.func(2,3);
    }
}
