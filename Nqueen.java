public class Nqueen {
    static int[] up=new int[9];
    static int[] ld=new int[17];
    static int[] rd=new int[17];
    public List<List<String>> solveNQueens(int n) {
        
        char[][] board=new char[n][n];
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                 board[i][j]='.';
        List<List<String>> ans=new ArrayList<>();
        
        solve(board,n,ans,0);
        return ans;
    }
    
    void solve(char[][] board,int n,List<List<String>> ans,int row){
        
        if(row==n){
            ans.add(construct(board));
        }
        
        for(int i=0;i<n;i++){
            
            if(up[i]==0 && ld[i+row]==0 && rd[n-1+i-row]==0){
                
                board[row][i]='Q';
                up[i]=1;
                ld[i+row]=1;
                rd[n-1+i-row]=1;
                solve(board,n,ans,row+1);
                 board[row][i]='.';
                up[i]=0;
                ld[i+row]=0;
                rd[n-1+i-row]=0;
            }
        }
    }
    List<String> construct(char[][] board){
        
        List<String> res=new ArrayList<>();
        
        for(int i=0;i<board.length;i++){
            String s=new String(board[i]);
            res.add(s);
        }
        return res;
    }
}
