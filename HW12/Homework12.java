package HW12;

import java.util.*;
import java.io.*;

public class Homework12{
    final static private int bSize = 1_000;

    public static void main(String[] args) {
        int[] arrInt = new int[bSize];
        fillArrInt(arrInt);

        List<Integer> listSort = createList(arrInt);
        List<Integer> listBubbleSort = createList(arrInt);

        System.out.println("");
        System.out.println("Collections sort metod");
        System.out.println("First value: " + listSort.get(0));
        System.out.println("Last value: " + listSort.get(bSize-1));

        long startTimeCollectionSort = System.currentTimeMillis();
        Collections.sort(listSort);
        long endTimeCollectionSort = System.currentTimeMillis();
        System.out.println("TimeCollectionSort: " + (endTimeCollectionSort - startTimeCollectionSort) + " milliseconds");

        System.out.println("First value: " + listSort.get(0));
        System.out.println("Last value: " + listSort.get(bSize-1));

        System.out.println("");
        System.out.println("Own Bubble sort metod");
        System.out.println("First value: " + listBubbleSort.get(0));
        System.out.println("Last value: " + listBubbleSort.get(bSize-1));

        long startTimeOwnSort = System.currentTimeMillis();
        ownSortBubble(listBubbleSort);
        long endTimeOwnSort = System.currentTimeMillis();
        System.out.println("TimeOwnSort: " + (endTimeOwnSort - startTimeOwnSort) + " milliseconds");

        System.out.println("First value: " + listBubbleSort.get(0));
        System.out.println("Last value: " + listBubbleSort.get(bSize-1));
    }

   private static void fillArrInt(int[] arr){
      Random r = new Random();

      for(int i=0; i< arr.length; i++){
          arr[i] = r.nextInt();
      }
   }

   private static List<Integer> createList(int[] arr){
       ArrayList<Integer> list = new ArrayList<>();
       for(int a: arr){
           list.add(a);
       }
       return list;
    }

   private static void ownSortBubble(List<Integer>alist){
       int temp;
       for(int i=alist.size()-1; i>0; i--){
           for(int j=0; j<i; j++){
              if(alist.get(j)>alist.get(j+1)){
                  temp = alist.get(j);
                  alist.set(j, alist.get(j+1));
                  alist.set(j+1, temp);
              }
           }
       }
   }
}


