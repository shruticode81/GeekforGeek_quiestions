//code to print common elements within two arrays usinh hashmap
//Approach:2
import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
public class CommonElements {
    public static ArrayList<Integer> CommonIntersection(int arr1[],int arr2[]){
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<arr1.length;i++){
            if(map.containsKey(arr1[i])){
                int val = map.get(arr1[i]);
                val=val+1;
                map.put(arr1[i],val);
            }else{
                map.put(arr1[i],1);
            }
        }
        //main logic to find common intersection 
        for(int ele: arr2){
            if(map.containsKey(ele)){
                list.add(ele);
                //decrease the value count 
                int v = map.get(ele);
                v=v-1;
                map.put(ele,v);

            }
            if(map.get(ele)==0){
                map.remove(ele);
            }
        }
         return list;
        
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
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
        ArrayList<Integer> common = CommonIntersection(arr1,arr2);
        for(int i=0;i<common.size();i++){
            System.out.print(common.get(i)+" ");
        }
    }
}
