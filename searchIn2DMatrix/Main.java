import java.util.*;
class Main{

    public static boolean searchIn2D(int[][] a,int target){

        int n =a.length;
        int m = a[0].length;
        for(int i=0;i<n;i++){
            if(a[i][0]<=target && target <= a[i][m-1]){
                int l = 0, r = m-1;
                while(l<=r){
                    int mid = l + (r-l) / 2;
                    if(a[i][mid] == target){
                        return true;
                    }
                    else if(a[i][mid] < target){
                        l = mid + 1;
                    }
                    else{
                        r = mid - 1;
                    }

                }

            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner cs = new Scanner(System.in);
        int test = cs.nextInt();
        while(test-- > 0){
            int n = cs.nextInt();
            int m = cs.nextInt();
            int[][] a = new int[n][m];
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    a[i][j] = cs.nextInt();
                }
            }
            int target = cs.nextInt();
            System.out.println(searchIn2D(a,target));
        }
    }
}