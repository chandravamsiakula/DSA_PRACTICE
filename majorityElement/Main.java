import java.util.*;
class Main{
    public static int majorityElement(int[] arr){
        int n = arr.length;
        Arrays.sort(arr);
        int element = arr[0],cnt = 1;
        for(int i=1;i<n;i++){
            if(arr[i] == element){
                cnt++;
                if(cnt > n/2){
                    return element;
                }
            }
            else{
                cnt = 1;
                element = arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner cs = new Scanner(System.in);
        int t = cs.nextInt();
        while(t-- > 0){
            int n = cs.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = cs.nextInt();
            }
            System.out.println(majorityElement(arr));
        }
    }
    
}