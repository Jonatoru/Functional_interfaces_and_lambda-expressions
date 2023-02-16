import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        System.out.println("");
        System.out.println("Через анонимный класс");

        Predicate<Integer> checkNumberPositive = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if (integer >= 0){
                    return true;
                }
                return false;
            }
        };
        System.out.println(checkNumberPositive.test(1));
        System.out.println(checkNumberPositive.test(-1));
        System.out.println("");
        System.out.println("Через лямбда-выраженние");

        Predicate<Integer> checkNumberPositive1 = (integer -> integer >=0);
        System.out.println(checkNumberPositive1.test(1));
        System.out.println(checkNumberPositive1.test(-1));
        System.out.println("");

        System.out.println("Задача 2");
        System.out.println("");

        System.out.println("Через анонимный класс");
        Consumer<String> name = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("Привет "+ s +"!");
            }
        };
        name.accept("Игорь");
        System.out.println("");

        System.out.println("Через лямбда-выраженние");

        Consumer<String> name1 = (s -> System.out.println("Привет " + s + "!"));
        name1.accept("Дмитрий");
        System.out.println("");

        System.out.println("Задача 3");
        System.out.println("");

        System.out.println("Через анонимный класс");
        Function<Double , Long > rounding = new Function<Double, Long>() {
            @Override
            public Long apply(Double aDouble) {
                return aDouble.longValue();
            }
        };

        System.out.println(rounding.apply(3.9));
        System.out.println("");

        System.out.println("Через лямбда-выраженние");

        Function<Double, Long> rounding1 = (aDouble -> aDouble.longValue());
        System.out.println(rounding1.apply(4.5));
        System.out.println("");

        System.out.println("Задача 4");
        System.out.println("");

        System.out.println("Через анонимный класс");
        Supplier<Integer> randomNumber = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return (int) (Math.random() * 100);
            }
        };
        System.out.println(randomNumber.get());
        System.out.println("");

        System.out.println("Через лямбда-выраженние");

        Supplier<Integer> randomNumber1 = ( () -> (int) (Math.random() * 100));
        System.out.println(randomNumber1.get());
    }
}