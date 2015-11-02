package ru.home;

import ru.home.sort.Selection;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Selection sort = new Selection(1);
        Integer[] arr =  {1,23,4,56,7};
        List<Integer> list = new ArrayList<Integer>( 100 );
	    System.out.println("Num:" + sort.getNum() );
        System.out.println("Num:" + list.size() );
        System.out.println("Num:" + Integer.valueOf(1) );
        System.out.println( Selection.valueOf(1) );
    }
}
