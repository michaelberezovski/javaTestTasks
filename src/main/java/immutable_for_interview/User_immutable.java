package immutable_for_interview;

//
public final class User_immutable {
    private final int id;

    private final Group group;

    public User_immutable(int id, Group group) {
        this.id = id;
        this.group = group;
    }

    public int getId() {
        return id;
    }

    //для создания иммутабельного класса, при это сохряняя возможность видоизменять состояние класса Group
    //поскольку если сделать Group иммутабельным, то получится неизменяемая конструкця
    //для этих целей создаем копию группы, с возможностью изменения состояния копии
    public Group getGroup() {
        Group copy = new Group();
        copy.setNum(group.getNum());
        return copy;
    }
}

