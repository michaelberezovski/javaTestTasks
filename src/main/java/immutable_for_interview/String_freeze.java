package immutable_for_interview;

public class String_freeze {
    //данный код будет исполнятся более 500 минут, причина заключается в том,
    // что при таком количестве итераций начнёт орабатывать сборщик мусора
    //и каждый раз при запуске сборщика у нас фризится JVM
    public static void main(String[] args) {
        //чтобы поравить ситуацию надо использовать StringBuilder

        String str1 = "Hello";

        for (int i = 0; i < 100000000; i++) { //даже при числе итераций 5, если сразу миллион пользвателей обратится
            str1 = str1.concat("!");//сюда, то возникнут сложности
        }

        StringBuilder builder = new StringBuilder("Bonjour");
        for (int i = 0; i < 10000000; i++) {
            builder.append("!");
        }
    }
}
