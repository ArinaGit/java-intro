package src.Lesson2.Test1;

public class Stroki {

    eachNth(String st, int m) {
        char[] stArray = st.toCharArray ( );
        int len = st.length ( );
        int i = 0;
        do {
            System.out.print (stArray[i]);
            i = i + m;
        }
        while (i < len);

        System.out.println ( );

    }
}