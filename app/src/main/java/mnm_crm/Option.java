package mnm_crm;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author meghnasawhney
 * these are all the features that the menu can do
 */
public class Option {
    public List<Option> options;
    
    public Option(){
        options=new ArrayList();
        
    }
    
    public void add(Option option){
        options.add(option);
    }
    
    public String printOption(){
        return options.toString();
        
    }
    
    
}
