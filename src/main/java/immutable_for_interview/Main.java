package immutable_for_interview;

public class Main {
    public static void main(String[] args) {
        User_mutable u1 = new User_mutable(1, new Group());
        u1.getGroup().setNum("two");
        System.out.println(u1.getGroup());
        //не смотря на то, что класс юзер private final - группа у остается мутабельно по ссылке getGroup

        //таким образом остается 2 варианта, либо следать иммутабельным Group, но если группа должна быть мутабельной
        //то мы возвращаем копию на нее смотри класс User_immutable getGroup()

        //то есть основной момент, что работа ведется с ссылками, и если даже поле final, то всё равно можно менять по ссылке

        User_immutable u2 = new User_immutable(2, new Group());
        u2.getGroup().setNum("one"); //getGroup не возвращает ссылку, только копию, что делает класс User иммутабельным
        System.out.println(u2.getGroup());
    }
}
