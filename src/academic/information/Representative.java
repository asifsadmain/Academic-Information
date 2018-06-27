/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academic.information;

import java.util.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author asif
 */
public class Representative implements IRepresentative {

    List<Observer> observerList = new ArrayList<Observer>();
    List<String> newsList = new ArrayList<String>();
    private String dateTime = "";
    int flag=0;
    Observer target=null;

    public void setNews(String news) {
        SimpleDateFormat formatter = new SimpleDateFormat();
        Date date = new Date();
        
        //System.out.print(formatter.format(date) + ":  ");
        dateTime = formatter.format(date) + ":  ";
        news = dateTime + news;
        newsList.add(news);
    }

    @Override
    public void register(Observer o) {
        observerList.add(o);
    }

    @Override
    public void unregister(String code) {
        for (Observer ob : observerList) {
                if (ob.getCode().equals(code)) {
                    target = ob;
                }
            }
        if(target!=null){
            observerList.remove(target);
        }
        target = null;
    }

    @Override
    public void notifyObservers(String code) {
        /*for(int i=0; i<observerList.size();i++){
            observerList.get(i).update();
        }*/
        if (observerList.size() == 0) {
            System.out.println("You have not registered yet!");
        } else {
            for (Observer ob : observerList) {
                if (ob.getCode().equals(code)) {
                    ob.update(newsList);
                    flag = 1;
                } 
            }
            if(flag==0)
                System.out.println("Either you have entered a wrong code or you haven't registered yet!!!");
        }
    }

}
