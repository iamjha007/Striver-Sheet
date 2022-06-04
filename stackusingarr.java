class stack{

    int arr[];
    int top;
    stack(){
        arr=new int[100];
        top=-1;
    }
    stack (int a){
        arr=new int[a];
        top=-1;
    }
  boolean isEmpty(){
      return top==-1;
  }
  int pop(){

    if(top==-1)
        {
            System.out.println("underflow");
            return -1;
        }
        else return arr[top--];
  }
  void push(int num){
      if(top+1>=arr.length)
        {
           System.out.println("Overflow");
           return;
        }
        arr[++top]=num;

  }
  int peek(){

    if(top==-1){
        System.out.println("No elemenet to peek in");
        return -1;
    }
    else return arr[top];
  }
}
public class stackusingarr {
    static stack stk=new stack(3);
    public static void main(String[] args) {
        
        stk.push(1);
        stk.push(2);
        System.out.println(stk.peek());
        stk.push(3);
        System.out.println(stk.peek());
        stk.push(23);
        System.out.println(stk.peek());
    
    }
    
}