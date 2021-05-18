//code to find al the pairs in an array these difference is k .k is given integer

import java.util.Scanner;
import java.util.HashMap;

public class PairDifference {
    public static int findPairs(int arr[],int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele : arr){
            if(map.containsKey(ele)){
                int v = map.get(ele);
                v=v+1;
                map.put(ele,v);
            }else{
                map.put(ele,1);
            }

        }
        //main logic to find pairs
        int count=0;
        for(int i:arr){
            if(map.containsKey(i+k)){
                int v1 = map.get(i+k);
                int v2 = map.get(i);
                count=count+(v1*v2);
            }
            if(map.containsKey(i-k)){
                int v1 = map.get(i-k);
                int v2 = map.get(i);
                count = count+(v1*v2);
            }
            map.put(i,0);
        }
        return count;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k=s.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int result = findPairs(arr,k);
        System.out.println(result);
    }
}
