
package Message;

import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static Queue mesque = new Queue(100);
     public static void menu(){
        System.out.println("____________________________________");
        System.out.println("||1. Input Message    ");
        System.out.println("||2. Display");
        System.out.println("||3. Delete Message");
        System.out.println("||4. Feedback ");
        System.out.println("||5. Exit ");
        System.out.println("||___________________________________");
        
    }
    public static boolean isLimit(String arr){
        char[] charArr = arr.toCharArray();
        if(charArr.length <=250){
            return true;
        }else{
            return false;
        }
    }
    public static int Select(){
        boolean check=true;
         int tmp =0;
         do {            
             System.out.println("Enter Your Select: ");
             try {
                 tmp = sc.nextInt();
                 check=false;
             } catch (InputMismatchException e) {
                 System.out.println(e);
                 System.out.println("You can only enter Number, Please Try Again !");
                 sc.next();
             }
        } while (check);
         return tmp;
    }
    public static void main(String[] args){
        int choice=0;       
            do{
                menu();
                //System.out.print("Please Enter Number = ");
                choice=Select();
                sc.nextLine();
                switch(choice){
                    case 1:

                        System.out.println("Input Country : ");
                        String country = sc.nextLine();                          
                        System.out.println("Input Your Message : ");
                        String message = sc.nextLine();
                        while(!isLimit(message)){
                            System.out.println("Sorry, Your Message Character limit is 250 , PLease Try Again!");
                            System.out.println("Enter Your Message: ");
                            message = sc.nextLine();
                        }
                        Message mes1 = new Message(message, country);
                        mes1.setMessage(message);
                        mesque.enQueue(mes1);
                        break;
                    case 2:
                        mesque.display();
                        break;
                    case 3:
                        mesque.deQueue();
                        break;
                    case 4:
                        mesque.feedback();
                        break;
                    case 5:
                        System.exit(0);
                        break;
                     default:
                         System.out.println("Please Enter Try Again number : ");
                         break;                    
                }             
            } while(choice!=4);
    }
   
}
