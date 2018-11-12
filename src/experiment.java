import java.lang.reflect.Array;
import java.util.Arrays;

public class experiment {

    public static void main(String[] args) {

        String one = new String("lala");
        String two = new String("lala");

        String three = "lala";
        String four = "lala";

        if(three == four){
            System.out.println("Tak");
        }else{
            System.out.println("Nie");
        }

    }

    public String altPairs(String str) {
        String str2 = "";
        for (int i = 0; i < str.length() - 4; i++) {
            str2 += str.substring(i, i + 2);
            i = i + 2;
        }return str2;

    }
}


