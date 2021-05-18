//code to print common elements in two given array
//Approach:1
import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;
public class Intersection {
    public static ArrayList<Integer> intersection(int arr1[],int arr2[]){
        HashMap<Integer,Boolean> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        //sort array with smaller size
        if(arr1.length>arr2.length){
            //sort arr2
            Arrays.sort(arr2);
        }else{
            Arrays.sort(arr1);
        }
        //adding to hashmap
        for(int i=0;i<arr1.length;i++){
            map.put(arr1[i],false);
        }
        //now check if element are common or not
        for(int i:arr2){
            if(map.containsKey(i) && map.get(i)==false){
                //add to arraylist
                list.add(i);
                map.put(i,true);
            }
        }
        return list;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for(int i=0;i<t;i++){
            int n=s.nextInt();
            int arr1[] = new int[n];
            for(int x=0;x<n;x++){
                arr1[x]=s.nextInt();
            }
            int m = s.nextInt();
            int arr2[] = new int[m];
            for(int y=0;y<m;y++){
                arr2[y]=s.nextInt();
            }
            ArrayList<Integer> result = intersection(arr1,arr2);
            for(int j=0;j<result.size();j++){
                System.out.print(result.get(j)+" ");
            }
        }
    }
}
