import java.util.Arrays;
import java.util.Scanner;

class Queue{
    int arr[];
    int front;
    int rear;
    int size;

    Queue(){
        arr=new int[50];
        front=-1;
        rear=-1;
        size=50;
    }
    Queue(int n){
        arr=new int[n];
        front=-1;
        rear=-1;
        size=n;
    }
    void enQueue(int val){

        if(rear==front && rear==-1){
            front=0;
            rear=0;
            arr[0]=val;
        }
       else
        if((rear+1)%size==front){
            System.out.println("overflow");
            return;
        }
        else{
            arr[(rear+1)%size]=val;

            rear=(rear+1)%size;
        }
      
    }
    int deQueue(){
       
        if(front==-1){
            System.out.println("Underflow");
            return -1;
        }
        int val=arr[front];
        if(rear==front)
        {   
           
            rear=-1;
            front=rear; 
        }
        else 
            front=(front+1)%size;

       System.out.println(val);
       return val;
        
    }
    void print(){
      for (int i =0;i <arr.length; i++) {
        System.out.print(arr[i]+" ");  
      } 
      System.out.println();
    }
}
public class QueueUsingArr {
    static Queue que=new Queue(4);
    public static void main(String[] args) {
        
        que.enQueue(1);
        que.enQueue(2);
        que.enQueue(3);
        que.enQueue(4);

       que.print();
       que.enQueue(5);
       que.deQueue();
       que.print();
       que.enQueue(5);
       que.print();
       que.deQueue();
       que.deQueue();
       que.deQueue();
       que.deQueue();
       
       Scanner s=new Scanner(System.in);
        float rad=s.nextFloat();
        float area=3.14*rad*rad; 
      
        System.out.printf("%.3f",area);
       

       

      


    }
  
}




