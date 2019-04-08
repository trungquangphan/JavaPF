package oop.interfacesss;

public interface MyComparable<T> {

    int compare(T cake, T cake2);
}

class Clothe implements MyComparable<Clothe> {

    @Override public int compare(Clothe cake, Clothe cake2) {
        return 0;
    }
}

class Laptop implements MyComparable<Laptop> {

    @Override public int compare(Laptop cake, Laptop cake2) {
        return 0;
    }

    public static void main(String[] args) {

    }
}