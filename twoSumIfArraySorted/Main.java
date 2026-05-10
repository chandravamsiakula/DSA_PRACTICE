import java.util.*;
class Main {
    public static boolean twoSum(int[] arr, int target) {
        int n = arr.length;
        int l = 0, r = n - 1;
        while (l < r) {
            int s = arr[l] + arr[r];
            if (s < target) {
                l++;
            } else if (s > target) {
                r--;
            } else {
                return true;
            }
        }
        return false;
   }
    public static void main(String[] args) {
        Scanner cs1 = new Scanner(System.in);
        int n = cs1.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = cs1.nextInt();
        }
        Arrays.sort(a);
        int target = cs1.nextInt();
        if (twoSum(a, target))
            System.out.println("True");
        else
            System.out.println("False");
        cs1.close();
    }
}