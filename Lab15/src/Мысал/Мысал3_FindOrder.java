package Мысал;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
public class Мысал3_FindOrder {
    public List<Мысал2_Order> findBiggerAmountOrder(float bigAmount, List<Мысал2_Order> orders) {
        ArrayList<Мысал2_Order> bigPrices = new ArrayList<Мысал2_Order>();
        Iterator<Мысал2_Order> it = orders.iterator();
        while (it.hasNext()) {
            Мысал2_Order current = it.next();
            if (current.getAmount() >= bigAmount) {
                bigPrices.add(current);
            }
        }
        return bigPrices;
    }


}
