package ru.home.sort;

/**
 * Created by markin on 02.11.2015.
 */
public class Selection implements Sort {

    static int _const = 500;
    int num;

    public Selection ( ) {
        this.num = 0 ;
    }

    public Selection ( int num) {
        this.num = num;
    }

    public int getNum () {
        return num;
    }

    public static Selection valueOf (int value) {
        return new Selection(value + _const);
    }

    public String toString () {
        return String.format("%d", num);
    }

    @Override
    public Object sort() {
        return null;
    }
}
