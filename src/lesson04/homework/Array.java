package src.lesson04.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Array {
    public static void main(String[] args) {

    ArrayList <String> color = new ArrayList<String> ();
    color.add ("Red");
    color.add ("Blue");
    color.add ("Green");
    color.add ("Orange");
    color.add ("Pink");
    System.out.println ("List:"+color);
    color.remove (2);
    if (color.contains ("Green"))
    {
    System.out.println ("Contains Green");}
    else
        {System.out.println ("No Green");};

    Collections.sort (color);
    System.out.println ("Sorted list:"+color);

    Iterator<String> iter = color.iterator ();
    while (iter.hasNext ()){
        System.out.println (iter.next ());
    }

}
}

