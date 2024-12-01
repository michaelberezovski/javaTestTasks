package immutable_for_interview;

//не смотря на то, что все поля у нас private final
public final class User_mutable {
    private final int id;

    private final Group group;

    public User_mutable(int id, Group group) {
        this.id = id;
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public Group getGroup() {
        return group;
    }
}
