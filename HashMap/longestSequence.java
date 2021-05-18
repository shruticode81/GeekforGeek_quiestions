//code to find longest consecutive subsequence in array
//using hashmap
//
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
public class longestSequence {
    public static ArrayList<Integer> findSequence(int arr[]){
        //insert element in hashmap
        HashMap<Integer,Boolean> map = new HashMap<>();
        ArrayList<Integer> maxlen = new ArrayList<>();
        for(int ele : arr){
            map.put(ele,false);
        }
        int start=0;
        int index=0;
        for(int e : map.keySet()){
            if(!map.get(e)){
                ArrayList<Integer> list = new ArrayList<>();
                list.add(e);
                map.put(e,true);
                for(int i=1;map.containsKey(e+i);i++){
                    list.add(e+i);
                    map.put(e+i , true);
                    start = e;

                }
                for(int j=1;map.containsKey(e-j);j++){
                    list.add(e-j);
                    map.put(e-j,true);
                    start = e-j;
                }
                if(maxlen.size()<list.size()){
                    maxlen = list;
                    index = start;
                }
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
        ArrayList<Integer> res= findSequence(arr);
        for(int i=0;i<res.size();i++){
            System.out.println(res.get(i));
        }
    }
}
