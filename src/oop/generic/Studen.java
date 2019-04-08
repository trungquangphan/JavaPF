package oop.generic;

public class Studen {
    String name;
    int mark;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Studen studen = (Studen) o;

        if (mark != studen.mark)
            return false;
        return name != null ? name.equals(studen.name) : studen.name == null;
    }

    @Override public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + mark;
        return result;
    }
}
