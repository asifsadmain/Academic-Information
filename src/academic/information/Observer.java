/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academic.information;
import java.util.List;

/**
 *
 * @author asif
 */
public class Observer {
    String name;
    String code;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    
    public void update(List<String> newsList){
        //SimpleDateFormat formatter = new SimpleDateFormat();
        //Date date = new Date();
        
        //System.out.print(formatter.format(date) + ":  ");
        for(String news : newsList){
            System.out.println(news);
        }
    }
}
