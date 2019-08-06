/**
 * @author epochong
 * @date 2019/7/28 14:24
 * @email epochong@163.com
 * @blog epochong.github.io
 * @describe 贪心
 */
public class 左右最值最大差 {
    public int findMaxGap(int[] A, int n) {
        // write code here
        int max=A[0];
        for(int i=0;i<n;i++){
            max=Math.max(max,A[i]);
        }
        int min= Math.min(A[0],A[n-1]);
        return max-min;
    }
}
