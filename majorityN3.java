 public List<Integer> majorityElement(int[] a) {
         int num1=Integer.MIN_VALUE;
        int num2=Integer.MIN_VALUE;
        int cnt1=0;
        int cnt2=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==num1)
               cnt1++;
            else if(a[i]==num2)
              cnt2++;
            else if(cnt1==0)
              {  num1=a[i]; cnt1=1;        }
            else if(cnt2==0)
            { num2=a[i]; cnt2=1; }
            else
               {
                   cnt1--;
                   cnt2--;
               }
        }
        cnt1=0; cnt2=0;
        for(int i=0;i<a.length;i++){
           if(a[i]==num1)
               cnt1++;
            else if(a[i]==num2)
              cnt2++;
        }
        
       List<Integer> list=new ArrayList<>();
        if(cnt1>a.length/3)
            list.add(num1);
         if(cnt2>a.length/3)
           list.add(num2);
     return list;
    }