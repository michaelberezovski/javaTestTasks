package immutable_for_interview;

//почему строка иммутабельна поскльку при содании строки она попадает в пул строк
//если строка будет мутабельна, то любой ссылающийся на неё объект попадет на измененное состояние, что вызовет проблемы

public class String_is_immutable {
    public static void main(String[] args) {
        String str1 = "Helllo";
        str1.toUpperCase(); //поскольку строка иммутабельна, то этот метот не сработает подобным образом
        //если зайти в метод, то мы увидим, что он возвращает новую строку

        String str2 = str1.toUpperCase(); // но сработает через ссылку
        System.out.println(str1);
        System.out.println(str2);

        str1 = str1.toUpperCase(); //либо изменять подобным образом
        System.out.println(str1);
    }
}
