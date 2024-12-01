package immutable_for_interview;

public class Group {
    String num;

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Group{" +
                "num='" + num + '\'' +
                '}';
    }
}
