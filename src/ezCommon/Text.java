/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ezCommon;

import java.io.Serializable;
import java.util.ArrayList;


/**
 *
 * @author Andrei
 */
public class Text implements IData, Serializable {
    String myText;
    
    public Text(){
    myText=null;
    }
    @Override
    public ArrayList<String> getStrings() {
      ArrayList<String> los=new ArrayList<>();
      los.add(myText);
      return los;
    }

    @Override
    public void create(String s) {
        myText= new String();
        myText=s;
        
    }
    
}
