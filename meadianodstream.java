public class meadianodstream {
    
    static PriorityQueue<Integer> max;
    static PriorityQueue<Integer> min;
    public MedianFinder() {
     max=new PriorityQueue<Integer>(Collections.reverseOrder());
     min =new PriorityQueue<Integer>();
    }
    
    public void addNum(int num) {
        
        if(max.isEmpty() || num<=max.peek()){
            max.add(num);
        }
        else
            min.add(num);
        if(max.size()>min.size()+1)
            min.add(max.poll());
        else if(max.size()<min.size())
            max.add(min.poll());
    }
    
    public double findMedian() {
        if(min.size()==max.size())
            return (min.peek()+max.peek())/2.0;
        else
            return max.peek();
    }
}
