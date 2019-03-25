package mnm_crm;

import java.util.ArrayList;
import java.util.List;

public class frequentlyOrdered {
    public List<String> freqOrderedList;

    public frequentlyOrdered(){
        freqOrderedList = new ArrayList<>();
    }

    public List<String> getFreqOrderedList() {
        return freqOrderedList;
    }

    public void add (String item){
        freqOrderedList.add(item);
    }
}
