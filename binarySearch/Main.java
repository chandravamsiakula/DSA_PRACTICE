import java.util.*;
class Main{

    public static int binarySearch(int[] a,int target){
        int n = a.length;
        int l=0,r=n-1;
        while(l<=r){
            int mid = l + (r-l) / 2;
            if(a[mid] == target){
                return mid;
            }
            else if(a[mid] < target){
                l = mid + 1;
            }
            else{
                r = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int tests = cs.nextInt();
        while(tests-- > 0){
            int n = cs.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                a[i] = cs.nextInt();
            }
            int target = cs.nextInt();
            System.out.println(binarySearch(a,target));
        }
    }
}