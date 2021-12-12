package com.company;
import java.util.Arrays;
public class Diamond {

    int[] ron = {58,7,3,1,2,40,10,2};   ///{58,7,6,1,3,40,10,2}
        int max =findMax(ron);
      // System.out.println("max");
    int answer = z(ron);
       // System.out.println(answer);





    public  int z (int [] arr){
        int max =  findMax(arr);
        int min = max;
        int min1 = max;
        int min2 = max;
        int min3 = max;
        int min4 = max;
        int index1 = 0;
        int index2 = 0;
        int index3 = 0;
        int index4 = 0;


        int total1 = max;
        int total2 = max;
        for (int i = 1; i < arr.length-1; i++) {
            if(arr[i]<min){
                min = arr[i];
                index1 = i;
                min1 = arr[i];
            }
        }
        min = findMax(arr);

        for (int i = 1; i < arr.length-1; i++) {
            if(arr[i]<min&&arr[i]!=arr[index1]&&arr[i]!=arr[index1-1]&&arr[i]!=arr[index1+1]){
                min = arr[i];
                index2 = i;
                min2 = arr[i];
            }
        }
        System.out.println("min1=" + min1 +" index of min1=" +  index1);
        System.out.println("min2=" + min2 +" index of min2=" +  index2);
        total1 = min1+min2;
        min = findMax(arr);
        for (int i = 1; i < arr.length-1; i++) {
            if(arr[i]<min&&arr[i]!=arr[index1]){
                min = arr[i];
                index3 = i;
                min3 = arr[i];
            }
        }
        min = findMax(arr);
        for (int i = 1; i < arr.length-1; i++) {
            if(arr[i]<min&&arr[i]!=arr[index3]&&arr[i]!=arr[index3-1]&&arr[i]!=arr[index3+1]){
                min = arr[i];
                index4 = i;
                min4 = arr[i];
            }
        }
        System.out.println("min3=" + min3 +" index of min3=" +  index3);
        System.out.println("min4=" + min4 +" index of min4=" +  index4);
        total2 = min3+min4;
        System.out.println("total 1=" + total1 +" total 2=" +  total2);
        if(total1<total2){
            return total1;
        }
        return total2;
    }

    public  int findMax(int [] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
