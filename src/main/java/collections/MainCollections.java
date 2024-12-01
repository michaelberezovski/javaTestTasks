package collections;

import hero_game.Hero;

import java.util.Collection;

public class MainCollections {
    public static void main(String[] args) {

    }

    //для гибкости кода можно в аргументы етода положить более верхнеуровневый интерфейс, чтобы в дальнейшем
    // при динамияеском связывании он уже сам определил куда положить входящий тип данных
    //например можно юзать List<> или Collection<>
    public static void example(Collection<Hero> collection) {
        //some code
    }
}