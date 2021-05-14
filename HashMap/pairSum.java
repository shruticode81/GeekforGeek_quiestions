//code to find the count of pairs in an array which sum to 0
//input: [2,1,-2,3,2]
//output : 2 ie (2,-2)(2,-2)
import java.util.Scanner;
import java.util.HashMap;
public class pairSum{
    public static int SumZero(int arr[]){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                int v = map.get(arr[i]);
                v=v+1;
                map.put(arr[i],v);
            }else{
                map.put(arr[i],1);
            }
        }
        //main logic of finding the pair
        int count =0;
        for(int i:arr){
            if(map.containsKey(-1*i)){
                int v1 = map.get(i);
                int v2=map.get(-1*i);
                count=count+(v1*v2);
                map.put(i,0);
                map.put((-1*i),0);
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();

        }
       System.out.println(SumZero(arr));
    }
}