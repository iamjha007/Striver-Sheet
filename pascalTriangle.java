  public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> pas=new ArrayList<>();
        List<Integer> row=new ArrayList<>();
        
        for(int i=0;i<numRows;i++){
            
            row=new ArrayList<Integer>();
            for(int j=0;j<=i;j++){
                if(j==0||j==i)
                    row.add(1);
                else
                    row.add(pas.get(i-1).get(j-1)+pas.get(i-1).get(j));
               
            }
             pas.add(row);
        }

        return pas;
    }