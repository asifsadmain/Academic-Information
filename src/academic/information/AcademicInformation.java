/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academic.information;

import java.util.Scanner;

/**
 *
 * @author asif
 */
public class AcademicInformation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        Scanner c = new Scanner(System.in);
        Scanner d = new Scanner(System.in);
        Representative rep1 = new Representative();
        String news;
        String password;
        String sPassword;
        int choice;
        
        while(true){
            System.out.println("You are: 1.Class Representative 2.Student      (Type 0 to exit)");
            choice = a.nextInt();
            if(choice==1){
                System.out.println("Enter the password please!");
                password = d.nextLine();
                while(!password.equals("admin")){
                    System.out.println("Wrong password.Enter the correct password please!!!");
                    password = b.nextLine();
                }
                
                System.out.println("Write the news here: ");
                news = c.nextLine();
                rep1.setNews(news);
            }
            else if(choice==2){
                System.out.println("1.Check Mail! 2.Subscribe 3.Unsubscribe");
                choice = b.nextInt();
                System.out.println("Please enter your security code here: ");
                sPassword = c.nextLine();
                if(choice==1){
                    rep1.notifyObservers(sPassword);
                }
                else if(choice==2){
                    Observer o1 = new Observer();
                    o1.setCode(sPassword);
                    rep1.register(o1);
                }
                else if(choice==3){
                    rep1.unregister(sPassword);
                }
            }
            else if(choice==0)
                break;
        }
        
        /*rep1.register(o1);
        rep1.setNews("There will be no CT tommorrow");
        
        rep1.setNews("Tommorrow is the final submission");
        rep1.unregister(o1);
        
        rep1.setNews("Die!");*/
    }
    
}
