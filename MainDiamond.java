package com.company;

import java.util.Arrays;

public class Main {
 static  int[] ron = {58,8,6,1,3,40,10,2};   ///{58,8,6,1,3,40,10,2}
    public static void main(String[] args) {
        int answer = y(ron);
        System.out.println(answer);
    }

    public static int y (int [] arr){
        int[] min = {100,100,100,100};
       int[] index = {100,100,100,100};


        for (int i = 0; i < 4; i++) {

            for (int j = 1; j < arr.length-1; j++) {///{58,8,6,1,3,40,10,2}
                if(i==0){
                    if(arr[j] <= min[i]){
                        index[i] = j;
                        min[i] = arr[j];
                    }
                }else{

                    if(arr[j]<=min[i]&&j!=index[0]&&j!=index[1]&&j!=index[2]&&j!=index[3]){
                        index[i] = j;
                        min[i] = arr[j];

                    }
                }
            }

        }
        System.out.println(Arrays.toString(min));
       System.out.println( Arrays.toString(index));
        int solution1 = min[0] + min[1];
        int solution2 = min[0] + min [2];
        int solution3 = min[1] + min [2];
        int solution4 = min[1]+ min[3];
        int solution5 = min[2]+ min[3];
      //  int[] solution = {solution1,solution2,solution3,solution4};
       // int[] finalArr = new int [4];

        if(index[0]-index[1]!=1&& index[1]-index[0]!=1){      ///{58,8,6,1,3,40,10,2}
            System.out.println("my final num 1 "+solution1);
        }else if( index[0]-index[2]!=1&& index[2]-index[0]!=1 ){
            System.out.println("my final num 2 "+solution2);
        }else if(index[1]-index[2]!=1&& index[2]-index[1]!=1){
            System.out.println("my final num 3 "+solution3);
        }else if(index[1]-index[3]!=1&& index[3]-index[1]!=1){
            System.out.println("my final num 4 "+solution4);
        }else{
            System.out.println("my final num 5 "+solution5);
        }


        return (1);
    }
}
