package src.lesson02;

public class Stroki {

   public static void eachNth(String st, int m) {
        char[] stArray = st.toCharArray ( );
        int len = st.length ( );
        int i = 0;
        do {
            System.out.print (stArray[i]);
            i = i + m;

        }
        while (i < len);

        System.out.println ( );
     //  return (stArray[i]);
    }

    public static void main(String[] args) {
        //Ex2

        eachNth ("String", 2);
        eachNth ("abcdefg", 2);
        eachNth ("abcdefg", 3);
    }
}