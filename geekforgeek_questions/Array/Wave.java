// java code to print wave pattern
//input : [1,2,3,4,5]--> sorted input array
//output ; [2,1,4,3,5]

import java.util.*;
import java.util.Scanner;
public class Wave{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        wavePattern(arr,n);
        for(int element : arr){
            System.out.print(element+" ");
        }
    }
    public static void wavePattern(int arr[],int n){
        for(int i=0;i<n-1;i+=2){
            int temp = arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
    }
}