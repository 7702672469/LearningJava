import java.util.ArrayList;
import java.util.Collections;

public class BinarySearch {
    public static void main(String[] args) {
  int[] arr=new int[]{1,5,7,8,9,10,11,19,18,20,25,34};
  int start=0;
        int target=34;
        int end=arr.length;
     //   System.out.println(end);
         findTarget(arr, target,start,end);
    }

    public static void findTarget(int[] arr, int target,int start,int end) {
        int index;
        if(end%2==0) {
             index = (start + ((end - start) / 2)) + 1;
        }
        else {
             index = start + ((end - start) / 2);
        }
        // System.out.println(index);
        if(target>arr[index])
        {
            start=index+1;
           findTarget(arr, target, start, end);
        }

        if(arr[index]==target) {
            System.out.println(index +" "+arr[index]);
        }
        if(target<arr[index])
        {
            end=index-1;
            findTarget(arr, target, start, end);
        }

    }


}
