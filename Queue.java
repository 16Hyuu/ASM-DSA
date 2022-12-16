
package Message;

import java.util.Scanner;

public class Queue {
    int first, last, size;
    int length;
    Message messages[];
    
    public Queue(int length){
      this.length = length;
      first = this.size=0;
      last = length-1;
      messages = new Message[length];
    }
    public boolean isEmpty(Queue queue){
        return (queue.size==0);
    }
    public boolean isFull(Queue queue){
        return (queue.size==queue.length);
    }
    public void enQueue(Message item){
      if(isEmpty(this)) {
             this.last=(this.last + 1) % this.length;
             this.messages[this.last]=item; 
             this.size=this.size+1;           
             System.out.println("Add Succesfully"); 
         } else{
             System.out.println("The stack is full");
         }
    }

    public Message deQueue(){
        if (isEmpty(this)) {
            System.out.println("The Queue is empty!");
            return null;
        }
        Message item = this.messages[this.first];
        this.first=(this.first+1) % this.length;
        this.size = this.size - 1;
        System.out.println("Dequeue Successfully!");
        return item;
    }
    public void display(){
         int i = 0;
         if(isEmpty(this)){
             System.out.println("The queue is empty");
         }
         else{
           System.out.println("City : " + messages[i].getCountry());               
           System.out.println("Here is your Message: " + messages[i].getMessage());
         }
    }
    public void feedback(){
        System.out.println("After When I used your System , I feel very Comfortable and Smoothy. So, I hope You will be improved the system even more");
        System.out.println("-------------------------------------------------------Thank You So Much------------------------------------------------------------");
    }
}
