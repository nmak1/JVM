public class JvmComprehension {
    public static void main(String[] args) {
        int i = 1;                      // 1 записывается в стек в кадр метода main
        Object o = new Object();        // 2  в куче выделяется память для new Object() в кадре main создается ссылка на эту область памяти
        Integer ii = 2;                 // 3  в куче выделяется память для Integer ii в кадре main создается ссылка на эту область памяти
        printAll(o, i, ii);             // 4 создается кадр для метода передадутся ссылки для o, ii
        System.out.println("finished"); // 7 создастся обект в куче "finished" создастся новый кадр в стеке куда передастся ссылка на "finished"
    }

    private static void printAll(Object o, int i, Integer ii) {
        Integer uselessVar = 700;                   // 5  создастся обект в куче uselessVar ссылка на него будет в кадре printAll
        System.out.println(o.toString() + i + ii);  // 6 создастся новый кадр toString()  куда передастся ссылка на о
//                                                       создастся новый кадр в стеке куда передастся ссылка на  ii
    }
}
