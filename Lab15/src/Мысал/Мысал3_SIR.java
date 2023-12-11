package Мысал;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class Мысал3_SIR {
    public static void main(String[] args){
        ArrayList<Мысал2_Item> p = new ArrayList<Мысал2_Item>(){
            {
                add(new Мысал2_Item(55231,12.f,"T-Shirt"));
                add(new Мысал2_Item(42338,9.3f,"Dress"));
                add(new Мысал2_Item(94864,42.98f,"Jeans"));

                add(new Мысал2_Item(60482,60.2f,"Gloves"));
                add(new Мысал2_Item(50381,51f,"Shirt"));
                add(new Мысал2_Item(35950,14.2f,"Tie"));
            }
        };
        Comparator <Мысал2_Item> comp = new Comparator<Мысал2_Item>() {
            @Override
            public int compare(Мысал2_Item one, Мысал2_Item two) {
                return Double.compare(two.getPrice(),one.getPrice());
            }
        };
        Collections.sort(p,comp);
        System.out.println(p);
    }
}
