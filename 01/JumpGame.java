//from 0...n-1
//n-1-i<=ai
//f[j]=OR  0<=i<j  (f[i] AND i+a[i]>=j)
public class JumpGame {
    /*
     * @param A: A list of integers
     * @return: A boolean
     */
    public boolean canJump(int[] A) {
        // write your code here
        if(A==null||A.length==0){
            return false;
        }
        
        int n=A.length;
        boolean[] f = new boolean[n];
        f[0]=true;
        for(int j =1;j<n;++j){
            for(int i=0;i<j;i++){
                if(f[i]&&i+A[i]>=j){
                    f[j]=true;
                    break;
                }
            }
        }
        return f[n-1];
    }
}
