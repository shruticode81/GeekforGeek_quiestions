//code to find longest subset of an array which sum to 0
// code using hashMap approach
//1st approach will be to find all possible subsets of an array
// then find sum of all subsets which sum to 0 
//and find longest among them
import java.util.Scanner;
import java.util.HashMap;

public class longestSubset {
    public static int findSubset(int arr[]){
        HashMap<Integer,Integer> map = new HashMap<>();
        int maxlen=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            if(map.containsKey(sum)){
                int v = map.get(sum);
                int len = i-v;
                if(maxlen<len){
                    maxlen=len;
                }
            }else{
                map.put(sum,i);
            }
        }
        return maxlen;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        findSubset(arr);
    }
}
